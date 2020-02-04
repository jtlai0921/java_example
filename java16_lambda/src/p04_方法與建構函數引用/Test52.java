package p04_方法與建構函數引用;

import java.util.function.BiFunction;

class Util {

    public static String append(String t, String u) {
        return t + "===" + u;
    }
}
// BiFunction 是系統所提供的一個函數式介面==>傳兩個值進去(型態可以不同),回傳一個值回來
public class Test52 {

    public static void main(String[] args) {     
        //匿名類別
        BiFunction<String, String, String> b = new BiFunction<String, String, String>() {
            @Override
            public String apply(String t, String u) {
                return t + "===" + u;
            }
        };
         System.out.println(b.apply("abc", "xyz"));//abc===xyz
        //Lambda
        BiFunction<String, String, String> c = (t, u) -> t + "===" + u;
        System.out.println(c.apply("abc", "xyz")); //abc===xyz
        //方法引用-2.類名 :: 静態方法名 
        BiFunction<String, String, String> d = Util::append;
        System.out.println(d.apply("abc", "xyz")); //abc===xyz
    }
}
