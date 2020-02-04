package p03_函數式介面;

//函數式介面 --> 只能有一個抽象方法 , 但可以有 default 與 static 方法
@FunctionalInterface
interface Super01 {

    void a();
    //void b();

    default void c() {
        System.out.println("c");
    }

    static String d() {
        return "d";
    }
}

public class Test01 {

    public static void main(String[] args) {
        Super01 p = () -> System.out.println("a");;
        p.a();
        p.c();
        System.out.println(Super01.d());
    }
}
