package source;

import java.util.concurrent.Executors;

import java.util.concurrent.ExecutorService;

public class ExecutorCashedTest {

    public static void main(String[] args) {
        //這種方式的特點是：可根據需要創建新線程的線程池，但是在以前構造的線程可用時將重用它們。
        ExecutorService pool = Executors.newCachedThreadPool(); 

        // 創建線程
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
        // 關閉線程池
        pool.shutdown();
    }
}
