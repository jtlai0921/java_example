package p04_方法與建構函數引用;

import java.util.function.Function;

public class Test54 {

    public static void main(String[] args) {
        //匿名類別==>Function ==> apply方法收兩個參數，回傳一個值
        Function<String, Integer> a = new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                return t.length();
            }
        };
        System.out.println(a.apply("abcdefg")); //7
        //Lambda
        Function<String, Integer> b = t -> t.length();
        System.out.println(b.apply("abcdefg"));  //7
        //方法引用-3. 類名 :: 實例方法名      
        Function<String, Integer> c = String::length;
        System.out.println(c.apply("abcdefg")); //7
    }
}
