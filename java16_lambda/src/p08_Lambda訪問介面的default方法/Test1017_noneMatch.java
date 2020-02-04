package p08_Lambda訪問介面的default方法;

import java.util.stream.Stream;

public class Test1017_noneMatch {

    public static void main(String[] args) {
       // noneMatch1();
    }

    public static void noneMatch1() {
        System.out.println(Stream.of(1, 2, 3).noneMatch(t -> t > 2)); //false
        // 全都不符合 > 3
        System.out.println(Stream.of(1, 2, 3).noneMatch(t -> t > 3)); //true
    }
}
