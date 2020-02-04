package source;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test14 {

    public static void 沒有泛型() {
        Foo3 a = new Foo3();
        a.setFoo(123);
        Integer a1 = a.getFoo();
        System.out.println("a1=" + a1); //123

        Foo4 b = new Foo4();
        b.setFoo(123.45);
        Double b1 = b.getFoo();
        System.out.println("b1=" + b1); //123.45
    }

    public static void 使用Object_需轉型() {
        Foo5 a = new Foo5();
        a.setFoo(123); //自動包裝
        Integer a1 = (Integer) a.getFoo();
        System.out.println(a1);

        Foo5 b = new Foo5();
        b.setFoo(123.45); //自動包裝
        Double b1 = (Double) b.getFoo();
        System.out.println(b1);

        Foo5 c = new Foo5();
        c.setFoo("abc");
        String c1 = (String) c.getFoo();
        System.out.println(c1);
    }

    public static void 使用Object_型態轉換不正確_當掉() {

        Foo5 a = new Foo5();
        a.setFoo(123); //自動包裝
        Boolean a1 = (Boolean) a.getFoo(); //不小心轉成布林 
        System.out.println(a1);
    }

    ////////////////////////////////////////////////////////////////////////////
    //泛型定義的方式
    public static void 泛型定義_有傳入型態時() {

        //GenericFoo1<Integer> a = new GenericFoo1<Integer>();
        //GenericFoo1<Integer> a = new GenericFoo1<>();
        GenericFoo1<Integer> a = new GenericFoo1();
        a.setFoo(4);
        Integer a1 = a.getFoo();
        System.out.println("a1=" + a1);

        //GenericFoo1<Double> c = new GenericFoo1<Double>();
        GenericFoo1<Double> b = new GenericFoo1<>();
        b.setFoo(4.5);
        Double b1 = b.getFoo();
        System.out.println("b1=" + b1);

        //GenericFoo1<Boolean> c = new GenericFoo1<Boolean>();
        GenericFoo1<Boolean> c = new GenericFoo1<>();
        c.setFoo(true);
        Boolean c1 = c.getFoo();
        System.out.println("c1=" + c1);
    }

    public static void 泛型定義_沒有傳入型態時1() {
        //沒有傳入型態時 , 一律當成 Object
        GenericFoo1 a = new GenericFoo1();
        a.setFoo(123);
        Integer a1 = (Integer) a.getFoo(); //記得轉型 , 否則會Compiler 錯
        System.out.println("a1=" + a1);
    }

    public static void 泛型定義_沒有傳入型態時2() {
        //沒有傳入型態時 , 一律當成 Object
        GenericFoo1 a = new GenericFoo1();
        a.setFoo(123);
        Object a1 = a.getFoo();
        System.out.println("a1=" + a1);
    }

    public static void 限制泛型可用類型() {

        GenericFoo2<Integer> foo1 = new GenericFoo2<>();
        GenericFoo2<Double> foo2 = new GenericFoo2<>();
        // GenericFoo2<String> foo3 = new GenericFoo2<>(); //字串不能 , 有限制型態
    }

////////////////////////////////////////////////////////////////////////////////
    public static void 型態通配字元_兩個參考名稱() {

        GenericFoo1<Integer> foo1 = null;
        foo1 = new GenericFoo1<Integer>();
        GenericFoo1<Double> foo2 = null;
        foo2 = new GenericFoo1<Double>();
    }

    public static void 型態通配字元_一個參考名稱() {

        GenericFoo1<? extends Number> foo1 = null;
        foo1 = new GenericFoo1<Integer>();
        foo1 = new GenericFoo1<Double>();
        // foo1 = new GenericFoo1<String>();
        foo1 = new GenericFoo1(); //不傳入型態也 可以 

        GenericFoo1<?> foo2 = null;
        foo2 = new GenericFoo1<Integer>();
        foo2 = new GenericFoo1<Double>();
        foo2 = new GenericFoo1<String>();
        foo2 = new GenericFoo1(); //不傳入型態也 可以   

        GenericFoo1<? super Number> foo3 = null;
        foo3 = new GenericFoo1<Number>(); //只能接受 Number 上層        
        foo3 = new GenericFoo1(); //不傳入型態也 可以        
    }

    public static void 型態通配字元的限制() {
        //1.傳入型態
        GenericFoo1<Integer> a = new GenericFoo1<Integer>();
        a.setFoo(123); //可以加入
        a.setFoo(null); //可以移除
        Integer a1 = a.getFoo(); //可以取回
        System.out.println(a1);

        //2.傳入通配型態 Number 
        GenericFoo1<? extends Number> b = null;
        b = new GenericFoo1<Integer>();
        // b.setFoo(123);  //不能加入
        b.setFoo(null); //可以移除
        Number b1 = b.getFoo(); //可以取回
        System.out.println(b1);
        b = new GenericFoo1<Double>();
        // b.setFoo(4.5); //不能加入 , 只能取回  或 移除
        b.setFoo(null);  //可以移除
        Number b2 = b.getFoo();  //可以取回要轉型
        System.out.println(b2);

        //3.傳入通配型態 Object 
        GenericFoo1<?> c = null;
        c = new GenericFoo1<String>();
        // c.setFoo("abc");  //不能加入
        c.setFoo(null); //可以移除
        String c1 = (String) c.getFoo(); //可以取回
        System.out.println(c1);
        //4.傳入通配型態 String 
        GenericFoo1<? super String> d = null; //向上繼承 
        d = new GenericFoo1<String>();
        d.setFoo("abc");         //能加入
        d.setFoo(null);          //可以清除 
        String f = (String) d.getFoo();   //可以取回

        //5.向上限制
        GenericFoo1 e = new GenericFoo1(); //沒有傳入型態 
        e.setFoo(123); //可以加入
        e.setFoo(null); //可以移除
        Integer e1 = (Integer) e.getFoo(); //可以取回要轉型
        System.out.println(e1);
    }

    public static void 向下限制() {

        List<Fruit> 水果 = new ArrayList<Fruit>();
        List<Apple> 蘋果 = new ArrayList<Apple>();
        List<RedApple> 紅蘋果 = new ArrayList<RedApple>();
        List<? extends Apple> 水果盤子 = null;
        //水果盤子 = 水果; //不可以是蘋果的父親
        水果盤子 = 蘋果; //只要是蘋果或蘋果的小孩都可以
        水果盤子 = 紅蘋果; //只要是蘋果或蘋果的小孩都可以
        //水果盤子.add(new Apple());    //compile error
        //水果盤子.add(new RedApple()); //compile error
        //水果盤子.add(new Fruit());    //compile error 
        //水果盤子.add(new Object());   //compile error
    }

    public static void 向上限制() {

        List<Fruit> 水果 = new ArrayList<Fruit>();
        List<Apple> 蘋果 = new ArrayList<Apple>();
        List<RedApple> 紅蘋果 = new ArrayList<RedApple>();
        List<? super Apple> 水果盤子 = null;
        水果盤子 = 水果; //只要是蘋果或蘋果的父親都可以
        水果盤子 = 蘋果; //只要是蘋果或蘋果的父親都可以 
        //水果盤子 = 紅蘋果; //不可以是蘋果的小孩 
        水果盤子.add(new Apple());    //work
        水果盤子.add(new RedApple()); //work
        //水果盤子.add(new Fruit());   //compile error 
        //水果盤子.add(new Object());  //compile error
    }

    public static void 型態通配字元_參數傳遞() {

        List<Object> x = new ArrayList<Object>();
        List y = new ArrayList();
        List<String> z = new ArrayList<String>();

        foo1(x);
        foo1(y);
        //foo1(z);  //不行

        foo2(x);
        foo2(y);
        foo2(z);

        foo3(x);
        foo3(y);
        foo3(z);

        foo4(x);
        foo4(y);
        foo4(z);

        //foo5(x); //不行
        foo5(y);
        foo5(z);
    }

    public static void foo1(List<Object> list) {
        list.add(2);
        list.add("abc");
    }

    public static void foo2(List list) {
        list.add(2);
        list.add("abc");
    }

    public static void foo3(List<? extends Object> list) {
//        list.add(2);
//        list.add("abc");
    }

    public static void foo4(List<?> list) {
//        list.add(2);
//        list.add("abc");
    }

    public static void foo5(List<String> list) {
        list.add("xyz");
        list.add("abc");
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 泛型應用_型態通配字元1() {

        List<Integer> a = new ArrayList();
        a.add(123);
        a.add(456);
        印集合11(a);
        印集合12(a);

        List<Double> b = new ArrayList();
        b.add(12.34);
        b.add(45.98);
        印集合13(b);
        印集合14(b);
    }

    public static void 印集合11(List obj) {
        for (Object x : obj) {
            System.out.println((Integer) x + " ");
        }
    }

    public static void 印集合12(List<Integer> obj) {
        for (Integer x : obj) {
            System.out.println(x + " ");
        }
    }

    public static void 印集合13(List obj) {
        for (Object x : obj) {
            System.out.println((Double) x + " ");
        }
    }

    public static void 印集合14(List<Double> obj) {
        for (Double x : obj) {
            System.out.println(x + " ");
        }
    }

////////////////////////////////////////////////////////////////////////
    public static void 泛型應用_型態通配字元2() {
        List<Integer> a = new ArrayList();
        a.add(123);
        a.add(456);
        印集合2(a);
        List<Double> b = new ArrayList();
        b.add(12.34);
        b.add(45.98);
        印集合2(b);
    }

    public static void 印集合2(List<? extends Number> obj) {
        for (Number x : obj) {
            System.out.println(x + " ");
        }
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 泛型應用_HashSet() {
        HashSet<Integer> aSet = new HashSet<Integer>();
        aSet.add(1);
        aSet.add(new Integer(2));
        aSet.add(new Integer(3));
        //aSet.add(new Double(3.5));
        System.out.println(aSet);
    }
    ////////////////////////////////////////////////////////////////////////////

    public static void 泛型應用_兩個型態() {
        GenericFoo5<Integer, Boolean> foo = new GenericFoo5<>();
        foo.setFoo1(123);
        Integer a = foo.getFoo1();
        foo.setFoo2(true);
        Boolean b = foo.getFoo2();
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void 泛型應用_陣列() {

        String[] str1 = {"caterpillar", "momor", "bush"};
        String[] str2;
        GenericFoo6<String> foo = new GenericFoo6<String>();
        foo.setFooArray(str1);
        str2 = foo.getFooArray();
        for (String s : str2) {
            System.out.println(s + " ");
        }
    }

    public static void 泛型應用_特定物件容器() {
        SimpleCollection<String> c = new SimpleCollection<>();
        c.add("aa");
        c.add("bb");
        c.add("cc");
        c.add("dd");
        System.out.println(c.toString());
    }
}
