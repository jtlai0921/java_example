package source;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableApp {
//submit有返回值，而execute没有
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService pool = Executors.newSingleThreadExecutor();
        System.out.println("計算 10 階乘");
        Future result10 = pool.submit(new FactorialCalculator(10));
        Object factorialof10 = result10.get();
        System.out.println("計算 15 階乘");
        Future result15 = pool.submit(new FactorialCalculator(15));
        Object factorialof15 = result15.get();
        System.out.println("計算 20 階乘");
        Future result20 = pool.submit(new FactorialCalculator(20));
        Object factorialof20 = result20.get();

        System.out.println("5 階乘結果 : " + factorialof10);
        System.out.println("15 階乘結果 : " + factorialof15);
        System.out.println("20 階乘結果 : " + factorialof20);
        pool.shutdown();
    }
}
class FactorialCalculator implements Callable<Long> {
    private int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }
    @Override
    public Long call() throws Exception {
        return factorial(number);
    }
    private long factorial(int n) {
        long total = 1L;
        for (int i = n; i >= 1; i--) {
            total = total * i;
        }
        return total;
    }
}
