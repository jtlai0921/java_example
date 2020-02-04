package source;

public class Wheel {

    public float thickness; //厚度
    public float size;      //直徑
}

class Bike {

    public int mileage;     //里程數
    public int wheelCount;  //輪子數量
    public Wheel theWheel;  //輪子

    public void setWheel(Wheel WL) {
        WL.size = WL.size + 15;
        theWheel = WL;   //theWheel 和 WL 參考同一份物件實體
        
    }

    public void setProperties(int mile, int count) {
        mileage = mile;
        wheelCount = count;
        mile = mile + 99;  //此敘述句僅為測試而作
        count = count + 99;  //此敘述句僅為測試而作
    }

    public void showProperties() {
        System.out.println("里程數=" + mileage + " 輪子數量=" + wheelCount);
        System.out.println("輪子 厚度=" + theWheel.thickness + " 直徑=" + theWheel.size);
    }
}
