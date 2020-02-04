package p08_Lambda訪問介面的default方法;

import java.util.function.Consumer;

public class Test0701_Consumer {

    public static void main(String[] args) {
        //Consumer1();
         Consumer2();      
    }

//Consumer(消費者)==>提供列印
    public static void Consumer1() {
        //匿名類別
        Consumer<String> a = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };
        a.accept("Hello");
        //Lambda
        Consumer<String> b = t -> System.out.println(t);
        b.accept("Hello"); //Hello
    } 

    public static void Consumer2() {
        Consumer<String> a = t -> System.out.print(t);
        Consumer<String> b = t -> System.out.println(" after bbb");
        a.andThen(b).accept("aaa"); //"aaa after bbb"
    }
}
