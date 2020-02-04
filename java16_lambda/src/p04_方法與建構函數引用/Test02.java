package p04_方法與建構函數引用;

@FunctionalInterface
interface Super02<F, T> {

    T convert(F from);
}

////////////////////////////////////////////////////////////////////////////////
public class Test02 {

    public static void main(String[] args) {

        //匿名類別
        Super02<String, Integer> a = new Super02<String, Integer>() {
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };
        System.out.println(a.convert("123")); //@123@
        //Lambda
        Super02<String, Integer> b = from -> Integer.valueOf(from);
        System.out.println(b.convert("123")); //@123@
        //方法引用-2.類名 :: 静態方法名 
        Super02<String, Integer> c = Integer::valueOf;
        Integer converted = c.convert("123");
        System.out.println(converted);
    }
}
