package source;

import java.util.concurrent.Executors;

import java.util.concurrent.ExecutorService;

public class ExecutorSingleTest {

    public static void main(String[] args) {
        //可以看出，每次調用execute方法，其實最後都是調用了thread-1的run方法。
        ExecutorService pool = Executors.newSingleThreadExecutor();

        // 創建執行緒
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();

        // 將執行緒放入池中進行執行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        // 關閉執行緒池
        pool.shutdown();
    }
}
