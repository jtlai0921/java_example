package source;

public class ConstrDemo1P { //父

    public int x = 10;
    public int b = 20;
    public static int c = 30;

    public void s1() {
    }

    public void m1() {
    }

    public static void m2() {
    }
}

class ConstrDemo1C extends ConstrDemo1P {//子

    public double x = 20.5;
    public int y = 40;
    public static int z = 50;

    public void s1() {
        System.out.println(super.x); //10    
        System.out.println(super.b); //20 
        System.out.println(this.b); //20 
        System.out.println(b); //20  
        System.out.println(ConstrDemo1P.c); //30
        System.out.println(ConstrDemo1C.c); //30
        System.out.println(c); //30
        /////////
        System.out.println(this.x); //20.5  
        System.out.println(x); //20.5  
        System.out.println(this.y); //40  
        System.out.println(y); //40  
        System.out.println(ConstrDemo1C.z); //50  
        System.out.println(z); //50 
    }

    public void s2() {
        super.s1();
        super.m1();
        this.m1();
        m1();
        ConstrDemo1P.m2();
        ConstrDemo1C.m2();
        m2();
        ///////
        this.s1();
        s1();
    }

    public static void s3() {
//static 內不能有 this指標 , 因為目前 this 是 null 不能使用
//        System.out.println(this.x);
//        System.out.println(x);
//        this.s1();  
//        s1();
        ConstrDemo1C p = new ConstrDemo1C();
        p.x = 123;
    }

    public void s4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void callSuper() {
        super.s1(); // 父  
    }
}

//外面的類別
class ConstrDemo1T {

    public void t1() {

        ConstrDemo1C p = new ConstrDemo1C();
        System.out.println(p.x); //20.5 子
        System.out.println(p.b);//20 父
        System.out.println(ConstrDemo1P.c); //30 父
        System.out.println(ConstrDemo1C.c);//30 父
        p.callSuper(); //父
        p.m1(); //父
        ConstrDemo1P.m2(); //父
        ConstrDemo1C.m2(); //父        
        //////////////////////////
        System.out.println(p.x); //20.5 子
        System.out.println(p.y); //40 子
        System.out.println(ConstrDemo1C.z);//50 子
        p.s1(); //子
        p.s2(); //子
        ConstrDemo1C.s3(); //子
        p.s4(10, 20); //子
    }
}
