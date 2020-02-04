package p04_方法與建構函數引用;

interface Super03<T1, T2> {

    boolean test(T1 x, T2 y);
}

////////////////////////////////////////////////////////////////////////////////
public class Test03 {

    public static void main(String[] args) {

        //匿名類別
        Super03<String, String> a = new Super03<String, String>() {
            @Override
            public boolean test(String x, String y) {
                return x.equals(y);
            }
        };
        System.out.println(a.test("abc", "abc")); //true
        //Lambda
        Super03<String, String> b = (x, y) -> x.equals(y);
        System.out.println(b.test("abc", "abc")); //true
        //方法引用-3. 類名 :: 實例方法名      
        Super03<String, String> c = String::equals;
        System.out.println(c.test("abc", "abc")); //true
    }
}
