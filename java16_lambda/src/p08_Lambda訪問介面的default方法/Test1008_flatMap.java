package p08_Lambda訪問介面的default方法;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1008_flatMap {

    public static void main(String[] args) {
        //flatMap1();
        //flatMap2();
        //flatMap3();
    }

    public static void flatMap1() {
        Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                //.flatMap(num -> num.stream()) //傳集合進來變成流
                .flatMap(List::stream) //方法引用
                .forEach(System.out::println); // 1,2,3,4      
    }

    public static void flatMap2() {
        Stream.of(Arrays.asList("Tony", "Tom", "John"),
                Arrays.asList("Amy", "Emma", "Iris"))
                //.flatMap(names -> names.stream()) //傳集合進來變成流
                .flatMap(List::stream) //方法引用
                .forEach(System.out::println); //[Tony, Tom, John, Amy, Emma, Iris]
    }

    public static void flatMap3() {
        List<String> list = Stream.of(Arrays.asList("Tony", "Tom", "John"),
                Arrays.asList("Amy", "Emma", "Iris"))
                //.flatMap(names -> names.stream()) //傳集合進來變成流     
                .flatMap(List::stream) //方法引用
                .collect(Collectors.toList()); //[Tony, Tom, John, Amy, Emma, Iris]
        System.out.println(list);
    }
}
