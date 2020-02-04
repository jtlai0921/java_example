package source;

public abstract class OverDemo3P {

    public int x;
    private int y;  //子類別看不到

    void abc(int x, float y) {
    }
    
    final void xyz() {//子類別無法覆蓋
    }
    
    public static int m1() {//子類別也要 static
        return 1;
    }

    public abstract void m2();

    protected void m3(float z) {
    }

    private void m4(int x) {//子類別看不到
    }

    private final void m5() {//子類別看不到
    }
}

class OverDemo3C extends OverDemo3P {

    public float x;
    public int y;

    public void abc(int x, float y) {
    }

//    void xyz() { //不能覆寫 , 因為父親是 final  
//        
//    }
    public static int m1() {//因為父親是 static 我也要 static
        return 1;
    }
    
    public void m2() {
    }

    protected final void m3(float z) {//依然有覆蓋父親
    }

    private void m4(int x) {//自行定義
    }

    void m5() {//自行定義
    }
}
