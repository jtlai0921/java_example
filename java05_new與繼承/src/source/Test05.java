package source;

import java.util.Date;

import source.pack1.Import1;
//import source.pack1.Import3;
//import static source.pack1.Import4.x;
//import static source.pack1.Import4.s1;
import static source.pack1.Import4.*;

public class Test05 {

    public static void 類別成員與物件成員() {

        Static01 P = new Static01();
        P.x = 123;
        Static01.y = 888;
        P.m1();
        Static01.m2();

        Static01 Q = new Static01();
        Q.x = 456;
        Static01.y = 999;
        Q.m1();
        Static01.m2();
    }

    public static void 接力賽() {
        Run 爸1 = new Run();
        爸1.跑("爸爸1", 10);
        Run 哥1 = new Run();
        哥1.跑("哥哥1", 20);
        Run 弟1 = new Run();
        弟1.跑("弟弟1", 30);

        Run.清除總公里數();
        System.out.println("=========================");

        Run 爸2 = new Run();
        爸2.跑("爸爸2", 30);
        Run 哥2 = new Run();
        哥2.跑("哥哥2", 40);
        Run 弟2 = new Run();
        弟2.跑("弟弟2", 90);

        Run.清除總公里數();
    }

    public static void import的用法() {
        //第一種用法  正常
        Import1 a = new Import1();
        a.x = 10;
        a.s1();

        //第二種用法  麻煩
        source.pack1.Import2 b = new source.pack1.Import2();
        b.x = 20;
        b.s1();
        source.pack2.Import2 c = new source.pack2.Import2();
        c.x = 10;
        c.s1();

        //static 複習
        //Import3.x = 30;
        //Import3.s1();
        source.pack1.Import3.x = 30;
        source.pack1.Import3.s1();

        //第三種用法 5.0 以上版本 新式用法 適用於 static 成員
        x = 30;
        s1();
    }

    public static void 連接資料庫_程式設計師1() {
        source.pack3.Conn1 b = new source.pack3.MsSQL();
        b.conn();
        source.pack3.Conn1 c = new source.pack3.Oracle();
        c.conn();
        source.pack3.Conn1 d = new source.pack3.MySql();
        d.conn();
        //////////////////////////
        source.pack3.Conn1 a;
        a = new source.pack3.MsSQL();
        a.conn();
        //
        a = new source.pack3.Oracle();
        a.conn();
        //
        a = new source.pack3.MySql();
        a.conn();

    }

    public static void 連接資料庫_程式設計師2() {
        source.pack4.Conn2 b = new source.pack4.MsSQL();
        b.conn();
        source.pack4.Conn2 c = new source.pack4.Oracle();
        c.conn();
        source.pack4.Conn2 d = new source.pack4.MySql();
        d.conn();
        //////////////////////////
        source.pack4.Conn2 a;
        a = new source.pack4.MsSQL();
        a.conn();
        //
        a = new source.pack4.Oracle();
        a.conn();
        //
        a = new source.pack4.MySql();
        a.conn();

    }

    public static void 類別之間的關係_new() {
        Son2 p = new Son2();
        p.麵店();
    }

    public static void 由類別產生物件1() {
        Person1 人1 = new Person1();
        人1.名字 = "劉德華";
        人1.身高 = 183;
        人1.體重 = 70;
        Person1.人數++;
        人1.秀名字身高體重人數();
        Person1.我愛你();
        System.out.println(人1 instanceof Person1);
        System.out.println(人1.getClass().getName());

        System.out.println("==================");
        Person1 人2 = new Person1();
        人2.名字 = "張學友";
        人2.身高 = 171;
        人2.體重 = 60;
        Person1.人數++;
        人2.秀名字身高體重人數();
        Person1.我愛你();
        System.out.println(人2 instanceof Person1);
        System.out.println(人2.getClass().getName());
    }

    public static void 由類別產生物件2() {
        Person2 人1;
        人1 = new Person2("劉德華", 183, 70);
        人1.秀名字身高體重人數();
        Person1.我愛你();

        System.out.println("==================");
        Person2 人2 = new Person2("張學友", 171, 60);
        人2.秀名字身高體重人數();
        Person2.我愛你();

        System.out.println("==================");
        Person2 人3 = new Person2();
        人3.秀名字身高體重人數();
        Person2.我愛你();
    }

    public static void 由類別產生物件4() {
        Person4 人1 = new Person4();
        人1.名字 = "賴玉珊";
        人1.身高 = 160;
        人1.體重 = 50;
        人1.頭.眼睛 = "藍色";
        人1.頭.鼻子 = "很挺";
        人1.頭.嘴巴 = "很大";

        // 人1.秀名字身高體重人數();
        System.out.println(人1);

        Person4.說.我愛你();
        Person4.說.我恨你();
    }

    public static void 物件的內容() {

        Person2 人1 = new Person2("賴玉珊", 162, 50);   //自訂類別     
        int[] ar1 = new int[5]; //陣列

        StringBuffer str1 = new StringBuffer("abc");  //StringBuffer
        StringBuilder str2 = new StringBuilder("xyz"); //StringBuilder
        Integer num1 = new Integer(123);  //八個包裝類別
        Double num2 = new Double(456.78);
        Date d1 = new Date(); //日期
        System.out.println("人1=" + 人1);
        System.out.println("ar1=" + ar1);
        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
        System.out.println("d1=" + d1);
    }

//////////////////////////////////////////////////////////////////////////////
    public static void 繼承1() {
        Plane 飛機1 = new Plane();
        飛機1.起飛();

        Airplane 客機1 = new Airplane();
        客機1.起飛();

        Aircraft 太空船1 = new Aircraft();
        太空船1.超光速飛行();
        太空船1.起飛();
    }

    public static void 繼承2() {
        Plane 飛機1 = new Plane();
        飛機1.起飛();

        Plane 客機1 = new Airplane();
        客機1.起飛();

        Plane 太空船1 = new Aircraft();
        太空船1.起飛();
    }

    public static void 繼承3() {
        Plane 飛機1;

        飛機1 = new Plane();
        飛機1.起飛();

        飛機1 = new Airplane();
        飛機1.起飛();

        飛機1 = new Aircraft();
        飛機1.起飛();
    }

    public static void 繼承4() {
        Plane[] 飛機 = {new Plane(), new Airplane(), new Aircraft()};

        for (Plane x : 飛機) {
            x.起飛();
        }
    }

////////////////////////////////////////////////////////////////////////////////
    public static void instance的關係1() {
        //Animal1 是父類別 , Dog1 是子類別
        Dog5 p = new Dog5();
        System.out.println("p instanceof Dog5 =" + (p instanceof Dog5));  //兒子 - true
        System.out.println("p instanceof Animal5 =" + (p instanceof Animal5));  //父親 - true        
        //System.out.println("p instanceof Cat5 =" + (p instanceof Cat5)); //沒有任何關係 , 所以錯誤
    }

    public static void instance的關係2() {
        //Animal1 是父類別 , Dog1 是子類別
        Dog5 p = new Dog5();
        呼叫instance的關係(p);
    }

    //Compiler 時 會認為 p 是 Object 的型態 與 Cat5 有繼承關係
    //run 時才會挖出 p 真正的內容是 Dog5     
    public static void 呼叫instance的關係(Object p) {
        System.out.println("p instanceof Dog5 =" + (p instanceof Dog5));  //兒子 - true
        System.out.println("p instanceof Animal5 =" + (p instanceof Animal5));  //父親 - true        
        System.out.println("p instanceof Cat5 =" + (p instanceof Cat5)); //不相關 -false
    }
}
