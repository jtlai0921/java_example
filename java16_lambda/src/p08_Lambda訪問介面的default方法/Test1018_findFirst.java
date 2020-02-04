package p08_Lambda訪問介面的default方法;

import java.util.stream.Stream;

public class Test1018_findFirst {

    public static void main(String[] args) {
       // findFirst1();
    }

    public static void findFirst1() {
        System.out.println(Stream.of(1, 2, 3).findFirst().get());//1        
    }
}
