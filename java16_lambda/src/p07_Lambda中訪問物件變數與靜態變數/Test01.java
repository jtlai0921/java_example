package p07_Lambda中訪問物件變數與靜態變數;

interface Super01<F, T> {

    T convert(F from);
}

////////////////////////////////////////////////////////////////////////////////
public class Test01 {

    public static int num1; //静態變數
    public int num2; //物件變數

    public void testScopes() {

        Super01<Integer, String> stringConverter = from -> {
            //可以修改 類別變數
            num1 = 72;
            //可以修改 物件變數
            num2 = 23;
            return String.valueOf(from);
        };
        System.out.println(stringConverter.convert(123));
    }

    public static void main(String[] args) {
        new Test01().testScopes();
    }
}
