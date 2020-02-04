package source;

public class ConstrDemo5 {

    public int x = 1;
    public int y = 2;
    public static int z = 3;

    {
        x = 4;
        y = 5;
    }
    static {
        z = 6;
    }
    public ConstrDemo5() {
        x = 100;
        y = 100;
    }
    public ConstrDemo5(int x, int y) {
        this.x = x;
        this.y = y;
    }
    static {
        z = 100;
    }
    {
        x = 99;
        y = 99;
    }
    public static void 印1() {
        System.out.println("z=" + z);
    }
    public void 印2() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
