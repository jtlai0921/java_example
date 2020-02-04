package p08_Lambda訪問介面的default方法;

import java.util.function.Predicate;

public class Test0101_Predicate {

    public static void main(String[] args) {
//        Predicate1();
//        Predicate2();
//        Predicate3();
    }

    //Predicate==>判斷 , 回傳布林值
    public static void Predicate1() {
        //匿名類別
        Predicate<Integer> a = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t > 123;
            }
        };
        System.out.println(a.test(456)); //true
        //Lambda
        Predicate<Integer> b = t -> t > 123;
        System.out.println(b.test(456));  //true 
    }

    public static void Predicate2() {
        Predicate<Integer> c = t -> t > 10;
        Predicate<Integer> d = t -> t < 20;
        //not--->15 有 > 10 嗎
        System.out.println(c.negate().test(15));  //false
        // 15 有 > 10 and 15 有 < 20 嗎         
        System.out.println(c.and(d).test(15)); //true
        //not ----> 15 有 > 10 and 15 有 < 20 嗎         
        System.out.println(c.and(d).negate().test(15)); //false
    }

    public static void Predicate3() {
        Predicate<String> a = t -> t.length() > 10;
        Predicate<String> b = t -> t.contains("A");
        // "And" 的 長度 有 >10 or "And" 有包含 "A" 嗎        
        System.out.println(a.or(b).test("And")); //true
    }
}
