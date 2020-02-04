package source;

public class Static03 extends Static01 {

    public int a; //物 , 死
    public static int b; //類 , 活    

    public void n1() { //物 , 死
        //使用自己
        a = 10;
        b = 20;
        n3();
        n4();
        //使用父類別繼承而來的成員
        x = 10;
        super.x=10;   
        this.x=10;
        y = 20;        
        Static01.y=20;    
        Static03.y=20;
        m3();
        super.m3();
        this.m3();
        m4();
        Static01.m4();
        Static03.m4();
    }
    
    public static void n2() { //類 , 活
        //使用自己
        //  a=10;
        b = 20;
        //  n3();
        n4();

        Static03 p = new Static03();
        p.a = 10;
        p.n3();
        //使用父類別繼承而來的成員
        y = 20;        
        m4();
        p.x = 10;
        p.m3();
    }

    public void n3() { //物 , 死
    }

    public static void n4() { //類 , 活
    }
}
