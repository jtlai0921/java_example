package source.資源回收;

public class CheckFinalize1 {

    CheckFinalize1 i;

    public static void main(String[] args) {        
        CheckFinalize1 i2 = new CheckFinalize1();
        CheckFinalize1 i3 = new CheckFinalize1();
        CheckFinalize1 i4 = new CheckFinalize1();
        i2.i = i3; 
        i3.i = i4; 
        i4.i = i2; 
        i2 = null;
        i3 = null;
        i4 = null;

        System.gc();
    }

    public void finalize() {
        System.out.println("有發生資源回收喔....");
    }
}

