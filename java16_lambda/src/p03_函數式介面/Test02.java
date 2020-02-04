package p03_函數式介面;

@FunctionalInterface
interface Converter<F, T> {

    T convert(F from);
}

public class Test02 {

    public static void main(String[] args) {
        //匿名類別 從 String 轉成 Integer
        Converter<String, Integer> a = new Converter<String, Integer>() {
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };
        System.out.println(a.convert("123")); // @123@
        ///////////////////////////////////////////////////////////////////
        //Lambda 從 String 轉成 Integer
        Converter<String, Integer> b = from -> Integer.valueOf(from);
        System.out.println(b.convert("123")); // @123@       
    }
}
