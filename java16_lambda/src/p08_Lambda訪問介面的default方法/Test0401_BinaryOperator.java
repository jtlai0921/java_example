package p08_Lambda訪問介面的default方法;

import java.util.function.BinaryOperator;

public class Test0401_BinaryOperator {

    public static void main(String[] args) {
        // BinaryOperator1();
    }

    //BinaryOperator==>傳兩個值進去(都要同型態) ,消費 , 回傳一個值回來 (同型態) 
    public static void BinaryOperator1() {
        //匿名類別
        BinaryOperator<String> a = new BinaryOperator<String>() {
            public String apply(String t1, String t2) {
                return t1 + "===" + t2;
            }
        };
        System.out.println(a.apply("賴玉珊", "想回家")); //賴玉珊===想回家
        //Lambda
        BinaryOperator<String> b = (t1, t2) -> t1 + "===" + t2;
        System.out.println(b.apply("賴玉珊", "想回家")); //賴玉珊===想回家
    }
}
