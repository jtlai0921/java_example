package source;

public class ConstrDemo8P {
    public int x = 1;
    public static int y = 2;
    {
        x = 11;
        System.out.println("我是父親instance區塊1");
    }
    static {
        y = 22;
        System.out.println("我是父親static區塊1");
    }
    public ConstrDemo8P() {
        //super();
        System.out.println("我是父親建構函數");
    }
    {
        x = 21;
        System.out.println("我是父親instance區塊2");
    }
}
class ConstrDemo8C extends ConstrDemo8P {
    public int a = 2;
    public static int b = 4;
    {
        a = 21;
        System.out.println("我是小孩instance區塊1");
    }
    static {
        b = 8;
        System.out.println("我是小孩static區塊1");
    }
    public ConstrDemo8C() {
        //super()
        a = 11;
        System.out.println("我是小孩建構函數");
    }
    static {
        b = 10;
        System.out.println("我是小孩static區塊2");
    }
}
