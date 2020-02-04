package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1004_map {

    public static void main(String[] args) {
//        map1();
//        map2();
//        map3();
        map4();
    }

    public static void map1() {
        List<String> list = Arrays.asList("tony", "tom", "john");
        //傳統方法
        List<String> names = new ArrayList<>();
        for (String name : list) {
            String upperName = name.toUpperCase();
            names.add(upperName);
        }
        System.out.println(names); //[TONY, TOM, JOHN]       
    }

    public static void map2() {
        List<String> list = Arrays.asList("tony", "tom", "john");
        list.stream()
                //.map(name -> name.toUpperCase())
                .map(String::toUpperCase) //方法引用                
                .forEach(System.out::println);  //TONY , TOM , JOHN   
    }

    public static void map3() {
        //Stream
        List<String> names = Stream.of("tony", "tom", "john")
                .map(String::toUpperCase) //方法引用
                .collect(Collectors.toList());
        System.out.println(names); //[TONY, TOM, JOHN]       
    }

    public static void map4() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        list.stream().map(x -> x * 10)
                .forEach(System.out::println);  //方法引用100,200,300  
    }
}
