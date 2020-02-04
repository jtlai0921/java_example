package p08_Lambda訪問介面的default方法;

import java.util.stream.Stream;

public class Test1015_anyMatch {

    public static void main(String[] args) {
        anyMatch1();
    }

    public static void anyMatch1() {
        System.out.println(Stream.of(1, 2, 3).anyMatch(t -> t > 2)); //true       
        System.out.println(Stream.of(1, 2, 3).anyMatch(t -> t > 3)); //false
    }
}
