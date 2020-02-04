package source;

//class Object{
//    
//}
public class New1P {

//public int x=0 預設始始化
    public int x = 1; //明顯始始化
//public int y=0 預設始始化    
    public int y = 2; //明顯始始化

    public New1P() {
        super();
        x = 11; //建構函數初始化
        y = 12; //建構函數初始化
    }

    public void s1() {

    }
}

class New1C extends New1P {

//public int a=0 預設始始化
    public int a = 3; //明顯始始化
//public int b=0 預設始始化     
    public int b = 4; //明顯始始化

    public New1C() {
        super();
        a = 13; //建構函數初始化
        b = 14; //建構函數初始化
    }

    public void m1() {

    }
}
