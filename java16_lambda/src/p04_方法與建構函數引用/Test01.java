package p04_方法與建構函數引用;

@FunctionalInterface
interface Super01<T> {

    void accept(T t);
}

//Info類中的show方法實現了相同的功能
class Info<T> {

    public void show(T t) {
        if (t != null) {
            System.out.println(t);
        } else {
            System.out.println("t 為空");
        }
    }
}

////////////////////////////////////////////////////////////////
public class Test01 {

    public static void main(String[] args) {
        //匿名類別
        Super01<String> a = new Super01<String>() {
            public void accept(String t) {
                if (t != null) {
                    System.out.println(t);
                } else {
                    System.out.println("t 為空");
                }
            }
        };
        a.accept("我愛你");
        a.accept(null);
        System.out.println("------------");
        //Lambda
        Super01<String> b = t -> {
            if (t != null) {
                System.out.println(t);
            } else {
                System.out.println("t 為空");
            }
        };
        b.accept("我愛你");
        b.accept(null);
        System.out.println("------------");
        //方法引用-1. 物名 :: 實例方法名
        Info<String> info = new Info<String>();
        Super01<String> c = info::show;
        c.accept("我愛你");
        c.accept(null);
        System.out.println("------------");
    }
}
