package source;

public class Static02 {
    public int a; //物 , 死
    public static int b; //類 , 活    

    public void n1() { //物 , 死
        //使用自己
        a = 10;
        b = 20;
        n3();
        n4();
        //使用別的類別
        Static01.y = 20;
        Static01.m4();
        Static01 q = new Static01();
        q.x = 10;
        q.m3();
    }
    public static void n2() { //類 , 活
        //使用自己
        //  a=10;
        b = 20;
        //  n3();
        n4();

        Static02 p = new Static02();
        p.a = 10;
        p.n3();
        //使用別的類別
        Static01.y = 20;
        Static01.m4();

        Static01 q = new Static01();
        q.x = 10;
        q.m3();
    }
    public void n3() { //物 , 死
    }
    public static void n4() { //類 , 活
    }
}
