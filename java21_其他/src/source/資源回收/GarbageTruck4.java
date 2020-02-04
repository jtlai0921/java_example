package source.資源回收;

public class GarbageTruck4 {

    GarbageTruck4 i;

    public static void main(String[] args) {
        GarbageTruck4 i2 = new GarbageTruck4();
        GarbageTruck4 i3 = new GarbageTruck4();
        GarbageTruck4 i4 = new GarbageTruck4();
        i2.i = i3; // i2 refers to i3
        i3.i = i4; // i3 refers to i4
        i4.i = i2; // i4 refers to i2
        i2 = null;
        i3 = null;
        i4 = null;
    }
}
