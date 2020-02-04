package source;

public class Test08 {

    public static void 建構子1() {
        Person p1 = new Person("林青霞", 162, 50);
        p1.秀名字身高體重人數();

        //Person p2 = new Person();
        //上行錯誤，Person 類別沒有 Person() 這個建構子
    }

    public static void 建構子多載() {

        Person5 p1 = new Person5();
        System.out.println(p1);
        System.out.println("==============================");
        Person5 p2 = new Person5("張曼玉");
        System.out.println(p2);
        System.out.println("==============================");
        Person5 p3 = new Person5("林青霞", 162, 50);
        System.out.println(p3);
        System.out.println("==============================");
        //先把 head new 出來
        Head5 head = new Head5("藍色", "很挺", "很大");
        Person5 p4 = new Person5("林青霞", 162, 50, head);
        System.out.println(p4);
    }   

    public static void this與super() {
        ConstrDemo2C obj = new ConstrDemo2C();
        obj.showVar1();
        System.out.println("===============");
        obj.callSuper();
    }

    public static void 建構子2() {
        new Sub01();
    }

    public static void 建構子3() {     
        new Sub02();       
        new Sub02(100);
    }

    public static void 建構子4() {
        new Sub03();
    }

    public static void 初始化的順序1() {
        ConstrDemo5.印1();
        new ConstrDemo5().印2();
    }

    public static void 初始化的順序2() {
        new ConstrDemo7C();
    }

    public static void 初始化的順序3() {
        new ConstrDemo8C();
    }
}
