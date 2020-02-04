package p04_方法與建構函數引用;

import java.util.Comparator;

public class Test53 {
    public static void main(String[] args) {
        //匿名類別
        Comparator<Integer> a = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
//                if (x < y) {
//                    return -1;
//                } else if (x > y) {
//                    return 1;
//                }
//                return 0;
                return x.compareTo(y);
            }
        };
        System.out.println(a.compare(10, 5)); //1
        //Lambda
        Comparator<Integer> b = (x, y) ->x.compareTo(y);       
        System.out.println(b.compare(10, 5));
        //方法引用-2.類名 :: 静態方法名 
        //Integer類中的compare静態方法已經實現了比較兩個整數的大小，     
        Comparator<Integer> c = Integer::compare;
        System.out.println(c.compare(10, 5));
    }
}
