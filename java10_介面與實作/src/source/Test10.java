package source;

public class Test10 {

    public static void 實作介面() {
        Interface1 p = new Sub1();
        p.abc(); //"abc"
        System.out.println(p.xyz()); //123
        p.sub1(); //我是預設方法
        System.out.println(Interface1.fun1()); // 我是工廠函數
    }

    public static void 普通類別() {
        InterfaceDemo1P p = new InterfaceDemo1P();
    }

    public static void 抽象類別() {
        // InterfaceDemo2P p=new InterfaceDemo2P();
        InterfaceDemo2P p = new InterfaceDemo2C();
    }

    public static void 介面() {
        //  InterfaceDemo3P p=new InterfaceDemo3P();
        InterfaceDemo3P p = new InterfaceDemo3C();
    }

 

    public static void 游泳1() {//錯誤的定義
        Fish9 swimmer;
        swimmer = new Anemonefish9();
        swimmer.swim();
        swimmer = new Shake9();
        swimmer.swim();
        swimmer = new Piranha9();
        swimmer.swim();
        swimmer = new Human9();
        swimmer.swim();
        swimmer = new Submarine9();
        swimmer.swim();
    }

    public static void 游泳2() {//正確的定義
        Swimmer10 swimmer;
        swimmer = new Anemonefish10();
        swimmer.swim();
        swimmer = new Shake10();
        swimmer.swim();
        swimmer = new Piranha10();
        swimmer.swim();
        swimmer = new Human10();
        swimmer.swim();
        swimmer = new Submarine10();
        swimmer.swim();
    }
}
