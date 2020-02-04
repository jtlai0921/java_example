package p01_介面的default與static方法;

interface Super04 {

    void a();

    default void b() {
        System.out.println("b");
    }
}
//如果介面中有default修飾的方法不需要重寫
class Sub04 implements Super04 {

    public void a() {
        System.out.println("a");
    }
}
public class Test04 {

    public static void main(String[] args) {
        Super04 p=new Sub04();
        p.a();
        p.b();
    }
}
