package source;

//public abstract interface Interface1 {
//
//    public static final int x = 4;  //常數
//
//    public abstract void abc(); //抽象的方法
//
//    public abstract int xyz(); //抽象的方法
//
//    public default void sub1() { //預設方法
//        System.out.println("我是預設方法");
//    }
//    public static String fun1() { //工廠函數
//        return "我是工廠函數";
//    }
//}

public interface Interface1 {

    int x = 4;  //常數

    void abc(); //抽象的方法

    int xyz(); //抽象的方法

    default void sub1() {
        System.out.println("我是預設方法");
    }

    static String fun1() {
        return "我是工廠函數";
    }
}

class Sub1 implements Interface1 {

    public void abc() {
        System.out.println("abc");
    }

    public int xyz() {
        return 123;
    }     
}
