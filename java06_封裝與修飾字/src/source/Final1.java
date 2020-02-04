package source;

public class Final1 {

    protected final void 習慣() {
        System.out.println("抽煙");
    }

    public void xyz() {
        System.out.println("xyz");
    }
}

class Final2 extends Final1 {

// 父類別方法 加了 final 修飾字 , 子類別不能覆蓋
//    public void 習慣() {
//        System.out.println("吃檳榔");
//    }
    public void xyz() {
        System.out.println("abc");
    }

    public void m1() {
        System.out.println("m1");
    }
}

///////////////////////////////////////////////////////////////////////////////
final class Final3 {

    protected void 習慣() {
        System.out.println("抽煙");
    }

    public void xyz() {
        System.out.println("xyz");
    }
}
//父類別加了 final 整個不能繼承
// class Final4 extends Final3{ 
//
//}

