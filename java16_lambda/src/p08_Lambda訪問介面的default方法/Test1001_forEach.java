package p08_Lambda訪問介面的default方法;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test1001_forEach {

    public static void main(String[] args) {
        //forEach1();
        //forEach2();
        // forEach3();
        //forEach4();
        // forEach5();
        // forEach6();       
    }

    public static void forEach1() {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void forEach2() {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        // 使用Java 8 forEach() 搭配 匿名類別
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    public static void forEach3() {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        // 使用Java 8 forEach() 搭配 Lambda語法
        list.forEach(s -> System.out.println(s));    
    }

    public static void forEach4() {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        list.forEach(System.out::println); //"one", "two", "three", "four"
    }

    public static void forEach5() {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        list.stream().forEach(s -> System.out.println(s));
    }

    public static void forEach6() {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        list.stream().forEach(System.out::println);
    }

    public static void forEach7() {
        Stream.of("one", "two", "three", "four").forEach(System.out::println);
    }
}
