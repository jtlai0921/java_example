package source;

public class Test01 {

    public static void 呼叫程式() {
        //呼叫方法
        sub1();
        //呼叫函數1
        int x = fun1();
        System.out.println("x=" + x);
        //呼叫函數2
        System.out.println("x=" + fun1());
    }

    public static void sub1() {
        int x = 123;
        System.out.println(x);
    }

    public static int fun1() {
        int x = 123;
        return x;
    }

///////////////////////////////////////////////////////////////////
    public static void 參數傳遞與回傳() {
        int x = 123;
        int y = 456;
        int z = 789;
        int sum;
        //呼叫方法
        sub2(x, y, z);
        //呼叫函數1
        sum = fun2(x, y, z);
        System.out.println("sum=" + sum);
        //呼叫函數2
        System.out.println("sum=" + fun2(x, y, z));
    }

    public static void sub2(int a, int b, int c) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    public static int fun2(int a, int b, int c) {
        return a + b + c;
    }

///////////////////////////////////////////////////////////////////
    public static void 副程式的種類() {
        int x;
        int y;
        int sum;
        x = 4;
        y = 5;
        //方法呼叫
        sumxy(x, y);
        //函數呼叫1
        sum = sumab(x, y);
        System.out.println("函數 sum=" + sum);
        //呼叫函數2
        System.out.println("函數 sum=" + sumab(x, y));
    }

    //方法 , 程序 , sub
    public static void sumxy(int x, int y) {
        int sum;
        sum = x + y;
        System.out.println("方法 sum=" + sum);
    }

    //函數 , 函式 , function
    public static int sumab(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    ///////////////////////////////////////////////////////////////////////////
    public static void 結構化程式1() {

        System.out.println("我愛妳");
        System.out.println("我恨妳");
        System.out.println("我喜歡你");
    }

    public static void 結構化程式2() {
        印字1();
        印字2();
        印字3();
    }

    public static void 印字1() {
        System.out.println("我愛你");
    }

    public static void 印字2() {
        System.out.println("我恨你");
    }

    public static void 印字3() {
        System.out.println("我喜歡你");
    }

    public static void 結構化程式3() {
        印字("我愛妳");
        印字("我恨妳");
        印字("我喜歡你");
    }

    public static void 結構化程式4() {
        String x = "我愛妳";
        String y = "我恨妳";
        String z = "我喜歡妳";
        印字(x);
        印字(y);
        印字(z);
    }

    public static void 印字(String x) {
        System.out.println(x);
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void 傳統程式() {
        int 長;
        int 寬;

        長 = 10;
        寬 = 5;

        長方形面積(長, 寬);
        長方形周長(長, 寬);
    }

    public static void 長方形面積(int 長, int 寬) {
        int 面積;
        面積 = 長 * 寬;
        System.out.println("面積=" + 面積);
    }

    public static void 長方形周長(int 長, int 寬) {
        int 周長;
        周長 = (長 + 寬) * 2;
        System.out.println("周長=" + 周長);
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void 物件導向程式1() {
        Rectangle1 長方形1 = new Rectangle1();
        長方形1.寬 = 10;
        長方形1.長 = 20;
        長方形1.長方形面積();
        長方形1.長方形周長();

        Rectangle1 長方形2 = new Rectangle1();
        長方形2.寬 = 20;
        長方形2.長 = 30;
        長方形2.長方形面積();
        長方形2.長方形周長();
    }

    public static void 物件導向程式2() {
        Rectangle2 長方形1 = new Rectangle2();
        長方形1.set長寬(10, 20);
        長方形1.長方形面積();
        長方形1.長方形周長();

        Rectangle2 長方形2 = new Rectangle2();
        長方形2.set長寬(20, 30);
        長方形2.長方形面積();
        長方形2.長方形周長();
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void 由類別產生物件1() {
        Human1 人1 = new Human1();
        人1.名字 = "林青霞";
        人1.身高 = 190;
        人1.體重 = 50;
        System.out.println("人1.名字 " + 人1.名字);
        System.out.println("人1.身高 " + 人1.身高 + "公分");
        System.out.println("人1.體重 " + 人1.體重 + "公斤");
        人1.吃(5);
        人1.跑(10);

        Human1 人2 = new Human1();
        人2.名字 = "張學友";
        人2.身高 = 180;
        人2.體重 = 70;
        System.out.println("人2.名字 " + 人2.名字);
        System.out.println("人2.身高 " + 人2.身高 + "公分");
        System.out.println("人2.體重 " + 人2.體重 + "公斤");
        人2.吃(10);
        人2.跑(20);
    }

    public static void 由類別產生物件2() {
        Human2 人1 = new Human2();
        人1.setdata("林青霞", 190, 50); //透過介面
        人1.getdata(); //透過介面
        人1.吃(5);
        人1.跑(10);

        Human2 人2 = new Human2();
        人2.setdata("張學友", 180, 70); //透過介面
        人2.getdata(); //透過介面
        人2.吃(10);
        人2.跑(20);
    }

}
