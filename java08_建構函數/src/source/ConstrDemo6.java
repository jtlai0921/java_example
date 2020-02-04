
package source;

public class ConstrDemo6 {

    public int x = 1;
    public int y = 2;
    public static int z = 3;
    public final int a; //物件等級常數
    public static final int b; //類別等級常數

    {
        x = 4;
        y = 5;
    }
    static {
        z = 4;
        b = 2;
    }
    public ConstrDemo6() {
        this(100, 100);
        // a = 100;
    }
    public ConstrDemo6(int x, int y) {
        this.x = x;
        this.y = y;
        a = 100;
    }
    static {
        z = 100;
        // b = 9; //不能再設定一次
    }
    {
        x = 99;
        y = 99;
    }
    public void abc() {
        // a=10; 不可在方法內設定 常數值
    }
}

