package p01_介面的default與static方法;

interface Super0601 {
    default void a() {
        System.out.println("a");
    }
}
interface Super0602 {
    default void a() {
        System.out.println("b");
    }
}
//////////////////////////////////////////////
//如果兩個介面裡的方法名相同都是default方法,在類別中需要重寫該方法
class Sub06 implements Super0601, Super0602 {
    
    public void a() {
        System.out.println("c");
    }
}
public class Test06 {
    
    public static void main(String[] args) {
        Super0601 p = new Sub06();
        p.a();
    }
}
