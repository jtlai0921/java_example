package p01_介面的default與static方法;

interface Super0501 {
    void a();
}
interface Super0502 {
    void a();
}
//////////////////////////////////////////////
//不同介面只需要實作一次
class Sub05 implements Super0501, Super0502 {

    public void a() {
        System.out.println("a");
    }
}
public class Test05 {

    public static void main(String[] args) {
        Super0501 p = new Sub05();
        p.a();
    }
}
