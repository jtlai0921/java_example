package p04_方法與建構函數引用;

@FunctionalInterface
interface Super51<T> {

    void accept(T t);
}
////////////////////////////////////////////////////////////////////////////////

public class Test51 {

    public static void main(String[] args) {
        //匿名類別
        Super51<String> a = new Super51<String>() {
            public void accept(String t) {
                System.out.println(t);
            }
        };
        a.accept("我愛妳");
        //Lambda
        Super51<String> b = t -> System.out.println(t);
        b.accept("我愛妳");
        //方法參考-1. 物名 :: 實例方法名
        //PrintStream ps = System.out;
        //Super03<String> c =ps::println;
        Super51<String> c = System.out::println;
        c.accept("我愛妳");
    }
}
