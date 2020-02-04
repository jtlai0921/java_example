package source;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorFixTest {

    public static void main(String[] args) {

        // 創建一個可重用固定執行緒數的執行緒池
        //ExecutorService pool = Executors.newFixedThreadPool(5);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //從以上结果可以看出，newFixedThreadPool的參數指定了可以運行的執行緒的最大數目
        //，超過這個數目的執行緒加進去以後，不會運行。
        //其次，加入執行緒池的執行緒數於托管狀態，執行緒的運行不受加入順序的影響
        // 創建執行緒
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();

        // 將線程放入池中進行執行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        // 關閉執行緒池
        pool.shutdown();
    }
}

