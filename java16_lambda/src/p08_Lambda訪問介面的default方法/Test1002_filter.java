package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1002_filter {

    public static void main(String[] args) {
//        filter1();
//        filter2();
//        filter3();
    }

    public static void filter1() {
        List<String> list = Arrays.asList("nanjing", "beijing", "nantong", "haimen", "shangrao");
        List<String> names = new ArrayList<>();
        //傳統方法
        for (String name : list) {
            if (name.length() > 7) {
                names.add(name);
            }
        }
        System.out.println(names);//shangrao   
    }

    //Stream
    public static void filter2() {
        List<String> list = Arrays.asList("nanjing", "beijing", "nantong", "haimen", "shangrao");
        list.stream().filter(x -> x.length() > 7)
                .forEach(System.out::println); //shangrao       
    }

    public static void filter3() {
    //Stream
        List<String> names = Stream.of("nanjing", "beijing", "nantong", "haimen", "shangrao")
                .filter(x -> x.length() > 7)
                .collect(Collectors.toList());
        System.out.println(names);//[shangrao]       
    }   
}
