package p08_Lambda訪問介面的default方法;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test1013_max {

    public static void main(String[] args) {
//        max_min1();
//        max_min2();
    }

    public static void max_min1() {
        int max = Stream.of(120, 24, 59, 63, 11, 74)
                //.max(Comparator.comparing(n -> n))
                .max((n,m)->n.compareTo(m))
                .get();
        System.out.println("max: " + max); //max: 120

        int min = Stream.of(120, 24, 59, 63, 11, 74)
                //.min(Comparator.comparing(n -> n))
                .min((n,m)->n.compareTo(m))
                .get();
        System.out.println("min: " + min);  //min: 11      
    }

    public static void max_min2() {
        String max = Stream.of("加利福尼亞州", "喬治亞州", "康涅狄格州")
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println("max: " + max); //"加利福尼亞州"
        String min = Stream.of("加利福尼亞州", "喬治亞州", "康涅狄格州")
                .min(Comparator.comparing(String::length))
                .get();
        System.out.println("min: " + min); //"喬治亞州"
    }
}
