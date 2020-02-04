package p08_Lambda訪問介面的default方法;

import java.util.function.Function;

public class Test0201_Function {

    public static void main(String[] args) {
//        Function1();
//        Function2();
    }

    //Function==>傳一個值進去 , 消費 , 回傳一個值回來(可以不同型態)
    public static void Function1() {
        //匿名類別
        Function<String, Integer> a = new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                return Integer.valueOf(t);
            }
        };
        System.out.println(a.apply("123")); //@123@
        //Lambda
        Function<String, Integer> b = t -> Integer.valueOf(t);
        System.out.println(b.apply("123")); //@123@
    }

    public static void Function2() {
        Function<Integer, Integer> a = t -> t * 2;
        Function<Integer, Integer> b = t -> t * t;
        //調用者 是 a , 參數 是 b
        System.out.println(a.apply(4)); //8
        System.out.println(b.apply(4)); //16       
        //先4×4然後16×2,  先執行參數，再執行調用者     
        System.out.println(a.compose(b).apply(4));  //32 
        //先4×2,然後8×8,  先執行調用者，再執行參數。    
        System.out.println(a.andThen(b).apply(4));  //64         
    }
}
