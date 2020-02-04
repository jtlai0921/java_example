package p08_Lambda訪問介面的default方法;

import java.util.function.Supplier;

public class Test0601_Supplier {

    public static void main(String[] args) {
        // Supplier1();     
    }

    //Supper(供應商)==>提供值輸出(回傳)
    public static void Supplier1() {
        //匿名類別
        Supplier<String> a = new Supplier<String>() {
            @Override
            public String get() {
                return " 想回家";
            }
        };
        System.out.println(a.get());
        //Lambda
        Supplier<String> b = () -> " 想回家";
        System.out.println(b.get());
    }

    public static void Supplier2() {
        //直接回傳 20
        Supplier<Integer> c = () -> 20;
        System.out.println(c.get()); //20
    }
}
