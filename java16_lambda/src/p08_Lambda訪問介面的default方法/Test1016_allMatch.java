package p08_Lambda訪問介面的default方法;

import java.util.stream.Stream;

public class Test1016_allMatch {

    public static void main(String[] args) {
        allMatch1();
    }

    public static void allMatch1() {
        System.out.println(Stream.of(1, 2, 3).allMatch(t -> t > 2)); //false     
        System.out.println(Stream.of(1, 2, 3).allMatch(t -> t > 0)); //true
    }
}
