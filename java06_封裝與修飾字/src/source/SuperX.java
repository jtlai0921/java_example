package source;

public class SuperX {

    protected void abc(int x) {//覆蓋        
    }
}

class SubX extends SuperX {

    public void abc(int x) { //覆蓋
    }

//    private int abc(int x) { //同類別內 不允許參數重覆
//        return 1;
//    }
    
    void abc() { //多載
    }

    static void abc(char x) { //多載
    }

    public int abc(int x, float y) { //多載
        return 1;
    }

    private void abc(double x) { //多載
    }

    protected void abc(float x, int y) { //多載
    }
}
