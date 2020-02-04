package p08_Lambda訪問介面的default方法;

import java.util.Arrays;
import java.util.List;


public class Test1007_mapToInt {

    public static void main(String[] args) {
        //mapToInt1();
    }

    public static void mapToInt1() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream()
                .mapToInt(t -> t * 10)
                .forEach(System.out::println); //10,20,30        
       
    }
}
