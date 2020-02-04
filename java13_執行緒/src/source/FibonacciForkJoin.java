package source;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

//class SumArray extends RecursiveTask<T>{
//    @Override
//    protected <T> compute() {
//        
//        if(...<=THRESHOLD) {//門檻值        
//            進行商業邏輯作業
//        }
//        else{
//            任務過大要切割子任務...
//        }
//    }      
//}

public class FibonacciForkJoin extends RecursiveTask<Integer> {

    private int num = 0;
    private int result = 0;

    public FibonacciForkJoin(int num) {
        this.num = num;
    }
    public int getResult() {
        return result;
    }
 // Fork/Join   
    @Override
    protected Integer compute() {

        if (num < 45) { //門檻值
            result = fibonacci(num);
        } else {
            FibonacciForkJoin task1 = new FibonacciForkJoin(num - 1); 
            FibonacciForkJoin task2 = new FibonacciForkJoin(num - 2);
            task1.fork();
            task2.fork();
            result = task1.join() + task2.join();
        }
        return result;
    }
// 遞迴
    public int fibonacci(int num) {
        
        if (num == 0 || num == 1) {
            return num;
        } else {
            return (fibonacci(num - 1) + fibonacci(num - 2));
        }
    }

    public static void main(String[] args) {
        int num = 45;

        //ForkJoin
        long t3 = new Date().getTime();
        //取得本機 CPU 核心數==>會影響執行效率
        int processors = Runtime.getRuntime().availableProcessors();
        //建立 FibonacciForkJoin 物件
        FibonacciForkJoin task = new FibonacciForkJoin(num);
        //執行緒池實例 , 並設定執行的 CPU 核心數量
        ForkJoinPool pool = new ForkJoinPool(processors);
        //開始透過 Fork/Join 分派任務
        pool.invoke(task);
        //取出最後的結果
        System.out.println(task.getResult() + ".");
        long t4 = new Date().getTime();
        System.out.println("花費時間 :" + (t4 - t3));
        System.out.println("Processors :" + processors);        
    }
}
