package p08_Lambda訪問介面的default方法;

import java.util.stream.Stream;

public class Test1011_reduce {

    public static void main(String[] args) {
        // reduce1();
        // reduce2();       
    }

    public static void reduce1() {
        //有初始值
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, (sum, item) -> sum + item)); //20
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, Integer::sum)); //20    

        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, (min, item) -> Math.min(min, item))); //1
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, Integer::min)); //1

        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, (max, item) -> Math.max(max, item))); //4
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, Integer::max)); //4
    }

    public static void reduce2() {
        //沒有初始值 , ifPresent 接收一個 Comsumer
        Stream.of(1, 2, 3, 4)
                .reduce((sum, item) -> sum + item)
                .ifPresent(System.out::println); //10 假如有值就展示       
        
        
        System.out.println(Stream.of(1, 2, 3, 4) 
                .reduce(Integer::sum).orElse(0));//10     
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(Integer::min).orElse(0)); //1      
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(Integer::max).orElse(0)); //4
    }  
}
