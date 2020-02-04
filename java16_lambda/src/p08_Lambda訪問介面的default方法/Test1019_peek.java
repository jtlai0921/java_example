package p08_Lambda訪問介面的default方法;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1019_peek {

    public static void main(String[] args) {
//        peek1();
//        peek2();
 //     peek3();
     peek4();
  //     peek5();
    }

    public static void peek1() {
        Stream.of(0, 2, 4, 6, 8, 10)
                .peek(System.out::println); //不會有任何輸出 , 少了終端操作
    }

    public static void peek2() {
        Stream.of(0, 2, 4, 6, 8, 10)
                .peek(System.out::println)
                .count(); //輸出 0 2 4 6 8 10      
    }

    public static void peek3() {
        List<Integer> list = Stream.of(0, 2, 4, 6, 8, 10)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    public static void peek4() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .count();
    }

    public static void peek5() {
        Stream.of("one", "two", "three", "four")
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .count();
    }
}
