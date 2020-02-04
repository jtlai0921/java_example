package p01_介面的default與static方法;

interface Super0701 {
    default void a() {
        System.out.println("a");
    }
}
interface Super0702 {
    void a();
}
//////////////////////////////////////////////////////
//如果兩個介面中方法名，參數都相同的方法，一個介面是抽象方法
//，另一個是default修飾有方法體。這是該類也必須重寫該方法
class Sub07 implements Super0701, Super0702 {

    public void a() {
        System.out.println("c");
    }
}
public class Test07 {

    public static void main(String[] args) {
        Super0701 p = new Sub07();
        p.a();
    }
}
