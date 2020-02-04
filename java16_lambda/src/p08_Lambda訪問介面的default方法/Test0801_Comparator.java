package p08_Lambda訪問介面的default方法;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test0801_Comparator {

    public static void main(String[] args) {
        Comparator1();
    }

    public static void Comparator1() {

        List<String> users = Arrays.asList("John", "Jane", "Alex");

        System.out.println("Before sort:");
        System.out.println(users); //[John, Jane, Alex]
        //匿名類別
//        Collections.sort(users, new Comparator<String>() {
//            @Override
//            public int compare(String t1, String t2) {
//                return t2.compareTo(t1);
//            }
//        });
//        System.out.println("\nAfter sort:");
//        System.out.println(users); //[John, Jane, Alex]
        //Lambda
        Collections.sort(users, (t1, t2) -> t2.compareTo(t1));
        System.out.println("\nAfter sort:");
        System.out.println(users); //[John, Jane, Alex]
    }
}
