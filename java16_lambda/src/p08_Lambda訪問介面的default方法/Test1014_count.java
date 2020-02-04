package p08_Lambda訪問介面的default方法;


import java.util.stream.Stream;

public class Test1014_count {

    public static void main(String[] args) {
//        count1();
 //       count2();
    }

    public static void count1() {
        long count = Stream.of(1, 2, 3).count();
        System.out.println("count: " + count); //count: 3       
    }

    public static void count2() {
        long count = Stream.of("Tony", "Tom", "John", "Andy")
                .filter(name -> name.startsWith("T"))
                .count();
        System.out.println("count: " + count); //count: 2       

    }
}
