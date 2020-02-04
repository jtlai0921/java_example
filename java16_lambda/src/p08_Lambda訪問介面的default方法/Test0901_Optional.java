package p08_Lambda訪問介面的default方法;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

class MyEntity {

    int id;
    String name;

    String getName() {
        return name;
    }
}

public class Test0901_Optional {

    public static void main(String[] args) {
        // Optional1();
        //Optional2();
        // Optional3();
        // Optional4();
        // Optional5();
        // Optional6();
        // Optional7();
        // Optional8();
        // Optional9();
        //  Optional10();
        Optional11();
    }

    //傳統判斷 null 方式
    public static void Optional1() {

        MyEntity myEntity = null;
        //System.out.println(myEntity.getName()); //當掉 , 大魔王
        if (myEntity != null) {
            System.out.println(myEntity.getName());
        } else {
            System.out.println("ERROR");
        }
    }

    //值不是null的情況
    public static void Optional2() {
        String name = "Tony";
        Optional<String> a = Optional.of(name);
        System.out.println(a.get());//Tony
    }

//值變成 null 了
    public static void Optional3() {
        String name = null;
        Optional<String> a = Optional.of(name);
        System.out.println(a.get());//NullPointerException大魔王
    }

    //改用ofNullable()
    public static void Optional4() {
        String name = null;
        Optional<String> a = Optional.ofNullable(name);
        System.out.println(a.get());//NoSuchElementException小魔王
    }

    //使用前先檢查
    public static void Optional5() {
        String name = null;
        Optional<String> a = Optional.ofNullable(name);
        if (a.isPresent()) { //一定要用 Optional.ofNullable 不然會當
            System.out.println(a.get());
        } else {
            System.out.println("Name is null"); //"Name is null"
        }
    }

    //使用 orElse 就可以丟掉 if 了 
    public static void Optional6() {
        String name = null;
        Optional<String> a = Optional.ofNullable(name);
        System.out.println(a.orElse("Name is null."));//"Name is null"
    }

    //包裝值的另一個方式
    public static void Optional7() {
        String name = null;
        Optional<String> a;
        if (name == null) {
            a = Optional.empty();
        } else {
            a = Optional.of(name);
        }
        System.out.println(a.get());//NoSuchElementException
    }

    //使用 orElseGet
    public static void Optional8() {
        String name = null;
        Optional<String> a = Optional.ofNullable(name);
        System.out.println(a.orElseGet(() -> "WHAT! null!"));//"WHAT! null!"
    }

    //使用 OrElseThrow 丟出例外
    public static void Optional9() {
        class MyException extends Exception {

            public MyException(String message) {
                super(message);
            }
        }
        String name = null;
        Optional<String> a = Optional.ofNullable(name);
        try {
            System.out.println(a.orElseThrow(() -> new MyException("WHAT! NULL!")));
        } catch (MyException e) {
            System.out.println("My Exception! " + e.getMessage());//"WHAT! NULL!"
        }
    }

    public static void Optional10() {
        Integer value1 = null;
        Integer value2 = 123;
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println("第一個參數值存在: " + a.isPresent()); //false  
        System.out.println("第二個參數值存在: " + b.isPresent()); //true 
    }

    public static void Optional11() {

        List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print(i++ + " : ");
            return result;
        };
        str.stream()
                .filter(test)
                .findFirst()
                .ifPresent(System.out::print);
    }

}
