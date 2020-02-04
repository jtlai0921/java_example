package source;

//class Object{
//
//}
public class ConstrDemo7P {
    public int a = 1;   //6
    public static int b = 2;  // 1
    {
        a = 11;
        System.out.println("7");
    }
    static {
        b = 22;
        System.out.println("2");
    }
    public ConstrDemo7P() {
        //super();
        System.out.println("8");
    }
}
class ConstrDemo7C extends ConstrDemo7P {
    public int x = 1;  //9
    public static int z = 3;  //3
    {
        x = 4;
        System.out.println("10");
    }
    static {
        z = 6;
        System.out.println("4");
    }
    public ConstrDemo7C() {
        x = 100;
        System.out.println("12");
    }
    static {
        z = 100;
        System.out.println("5");
    }
    {
        x = 99;
        System.out.println("11");
    }
}
