package p08_Lambda訪問介面的default方法;

import java.util.stream.Stream;

public class Test1009_distinct {

    public static void main(String[] args) {
        // distinct1();
    }

    public static void distinct1() {
        Stream.of(1, 2, 3, 4, 2, 3, 1)
                .distinct()
                .forEach(System.out::println); //1,2,3,4
    }
}
