package p01_介面的default與static方法;

interface Super01 {

    void a();

    default void b() {
        System.out.println("b");
    }

    //工廠函數
    static int c() {
        return 123;
    }
}

class Sub0101 implements Super01 {

    public void a() {
        System.out.println("x");
    }
}

class Sub0102 implements Super01 {

    public void a() {
        System.out.println("y");
    }
}
//////////////////////////////////////////////

public class Test01 {

    public static void main(String[] args) {
        System.out.println(Super01.c()); //123
        Super01 p = new Sub0101();
        p.a(); //"x"
        p.b(); //"b"
    }
}
