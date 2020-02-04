package source;

public class InterfaceDemo1P {//我是普通類別

    public int x = 5;

    public InterfaceDemo1P() { //建構函數
        super();
        x = 10;
    }

    public void s1() {

    }

    public void s2() {

    }
}

class InterfaceDemo1C extends InterfaceDemo1P {

    public float x = 4.5F;

    public InterfaceDemo1C() {//建構函數
        super();
        x = 8.5F;
    }

    public void s1() {

    }
}

///////////////////////////////////////////////////////////////
abstract class InterfaceDemo2P {//我是抽象類別

    public int x = 5;

    public InterfaceDemo2P() {//建構函數
        super();
        x = 10;
    }

    public void s1() {

    }

    public abstract void s2(); //我是抽象的方法
}

class InterfaceDemo2C extends InterfaceDemo2P {

    public float x = 4.5F;

    public InterfaceDemo2C() {//建構函數
        super();
        x = 8.5F;
    }

    public void s1() {

    }

    public void s2() {

    }
}

///////////////////////////////////////////////////////////////
interface InterfaceDemo3P {//我是介面 ,我沒有建構函數

    int x = 4;  //我是常數 public static final int x=4

    void s1(); //我是抽象的方法 public abstract void s1();

    void s2(); //我是抽象的方法 public abstract void s2();
}

class InterfaceDemo3C implements InterfaceDemo3P {

    public float x = 4.5F;

    public InterfaceDemo3C() {//建構函數
        super();
    }

    public void s1() {

    }

    public void s2() {

    }
}

////////////////////////////////////////////////////////////////////////////////
class InterfaceDemo4P1 {

    public int x;

    public void s1() {

    }
}

class InterfaceDemo4P2 {

    public int y;

    public void s2() {

    }
}
//父子類別不能多重繼承

class InterfaceDemo4C extends InterfaceDemo4P1 {

    public int a;

    public void m1() {

    }
}

////////////////////////////////////////////////////////////////////////////////
interface InterfaceDemo5P1 {

    int x = 4;

    void s1();
}

interface InterfaceDemo5P2 {

    int y = 4;

    void s2();
}
//父子介面可以多重繼承

interface InterfaceDemo5C extends InterfaceDemo5P1, InterfaceDemo5P2 {

    void m1();
}

//////////////////////////////////////////////////////////////////////////////
interface InterfaceDemo6P1 {

    int x = 4; //常數

    void s1(); //抽象方法
}

interface InterfaceDemo6P2 {

    int y = 5; //常數

    void s2(); //抽象方法
}
//父介面與子類別==>可以多重實作

class InterfaceDemo6C implements InterfaceDemo6P1, InterfaceDemo6P2 {

    public void s1() {

    }

    public void s2() {

    }
}

//////////////////////////////////////////////////////////////////////////////
//
//class InterfaceDemo7P {
//
//    public void s1() {
//    }
//}
////父類別與子介面==>無此關係
//interface InterfaceDemo7C extends InterfaceDemo7P {
//
//    final int x = 4; //常數
//
//    void s1(); //抽象方法
//}
///////////////////////////////////////////////////////////////////////////////
interface InterfaceDemo8P {

    void p1();
}

interface InterfaceDemo9P {

    void p2();
}

interface InterfaceDemo10P extends InterfaceDemo8P, InterfaceDemo9P {
// P1() , P2()

    void s1();

    void s2();
}

interface InterfaceDemo11P {

    void s3();
}

class InterfaceDemo12P {

    public void n1() {
    }
}

class InterfaceDemo13P extends InterfaceDemo12P  implements InterfaceDemo10P, InterfaceDemo11P  {

    public void s1() {

    }

    public void s2() {

    }

    public void p1() {

    }

    public void p2() {

    }

    public void s3() {

    }
}
