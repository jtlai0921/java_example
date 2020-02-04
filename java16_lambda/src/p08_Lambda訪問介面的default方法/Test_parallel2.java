package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class Test_parallel2 {

    public static void main(String[] args) {
        List<Integer> randomNumbers = getRandomNumbers();
        sequential(randomNumbers);
        parallel(randomNumbers);
    }

    private static List<Integer> getRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        IntStream.range(0, 1000000)
                .forEach(n -> {
                    int rnd = (int) (Math.random() * 10000);
                    randomNumbers.add(rnd);
                });
        return randomNumbers;
    }
    
//循序運算
    private static void sequential(List<Integer> randomNumbers) {
        long start = System.nanoTime();
        List<Integer> sorted = randomNumbers.stream()
                .sequential()
                .sorted()
                .collect(toList());
        long end = System.nanoTime();
        long duration = TimeUnit.NANOSECONDS.toMillis(end - start);
        System.out.println("sequntial duration: " + duration + "(ms)");
        //sequntial duration: 757(ms)
    }
//並行運算
    private static void parallel(List<Integer> randomNumbers) {
        long start = System.nanoTime();
        List<Integer> sorted = randomNumbers.stream()
                .parallel()
                .sorted()
                .collect(toList());
        long end = System.nanoTime();
        long duration = TimeUnit.NANOSECONDS.toMillis(end - start);
        System.out.println("parallel duration: " + duration + "(ms)");
        //parallel duration: 535(ms)
    }
}
