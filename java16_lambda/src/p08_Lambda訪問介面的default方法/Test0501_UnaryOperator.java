package p08_Lambda訪問介面的default方法;

import java.util.function.UnaryOperator;

public class Test0501_UnaryOperator {

    public static void main(String[] args) {
//        UnaryOperator1();
//        UnaryOperator2();
    }
    
    //UnaryOperator==>傳一個值進去(同型態) , 消費 , 回傳一個值回來 (同型態)
    public static void UnaryOperator1() {
        //匿名類別
        UnaryOperator<String> a = new UnaryOperator<String>() {
            public String apply(String t1) {
                return t1 + "===" + "想回家";
            }
        };
        System.out.println(a.apply("賴玉珊")); //賴玉珊===想回家
        //Lambda
        UnaryOperator<String> b = (t1) -> t1 + "===" + "想回家";
        System.out.println(b.apply("賴玉珊")); //賴玉珊===想回家
    }

    public static void UnaryOperator2() {
        UnaryOperator<Integer> a = t -> t + 1;
        System.out.println(a.apply(10));// 11   
    }
}
