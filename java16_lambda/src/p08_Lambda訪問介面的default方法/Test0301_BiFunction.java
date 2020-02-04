package p08_Lambda訪問介面的default方法;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test0301_BiFunction {

    public static void main(String[] args) {
//        BiFunction1();
//        BiFunction2();
    }
    
    //BiFunction==>傳兩個值進去(可以不同型態) , 消費 , 回傳一個值回來(可以不同型態)
    public static void BiFunction1() {
        //匿名類別
        BiFunction<String, String, String> a = new BiFunction<String, String, String>() {
            public String apply(String t1, String t2) {
                return t1 + "==== " + t2;
            }
        };
        System.out.println(a.apply("賴玉珊", "早安")); //賴玉珊==== 早安
        //Lambda
        BiFunction<String, String, String> b = (t1, t2) -> t1 + "==== " + t2;
        System.out.println(b.apply("賴玉珊", "早安")); //賴玉珊==== 早安
    }
    public static void BiFunction2() {
        BiFunction<String, String, String> a = (t1, t2) -> t1 + "===" + t2;
        //調用者是 a , 參數是 b
        //先執行調用者 a 再執行參數 b
        //andThen表示將在apply方法後面執行
        Function<String, String> b = t -> t + " c";
        System.out.println(a.andThen(b).apply("a ", " b")); //a===b c
    }
}
