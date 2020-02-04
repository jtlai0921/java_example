package p08_Lambda訪問介面的default方法;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1010_sorted {

    public static void main(String[] args) {
//     sorted1();
//     sorted2();
    }

    public static void sorted1() {
        Stream.of("nanjing", "beijing", "nantong", "shangrao")
                .sorted()
                .forEach(System.out::println);//beijing , nanjing , nantong , shangrao        
    }

    public static void sorted2() {
        //ASC
        List<Integer> sortedAsc = Stream.of(120, 24, 59, 63, 11, 74)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("sorted asc: "+sortedAsc);// [11, 24, 59, 63, 74, 120]     

        //DESC
        List<Integer> sortedDesc = Stream.of(120, 24, 59, 63, 11, 74)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        System.out.println("sorted desc: " + sortedDesc);//[120, 74, 63, 59, 24, 11]      
    }
}
