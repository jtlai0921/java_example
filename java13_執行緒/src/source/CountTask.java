package source;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {
    public static final int THRESHOLD = 2;
    private int start;
    private int end;
    int sum = 0;
    
    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int getResult() {
        return sum;
    }
    @Override
    protected Integer compute() {

        //如果任務足夠小 , 就計算任務
        boolean canComputer = (end - start) < THRESHOLD;

        if (canComputer) { //門檻值

            for (int i = start; i <= end; i++) {
                sum += i;
            }              
        } else {            
            //如果任務大於門檻值 , 就分列成兩個子任務計算
            int middle = (start + end) / 2;
            CountTask leftTask = new CountTask(start, middle);
            CountTask rightTask = new CountTask(middle + 1, end);            
            leftTask.fork(); //分配一條執行緒來執行此任務
            rightTask.fork(); //分配一條執行緒來執行此任務      
            sum = leftTask.join() + rightTask.join();            
        }
        return sum;
    }
    public static void main(String[] args) {

        CountTask task = new CountTask(1, 100);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
        System.out.println(task.getResult());
    }
}
