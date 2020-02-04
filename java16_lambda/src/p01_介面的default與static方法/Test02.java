package p01_介面的default與static方法;

interface Super02{

    double calculate(int x);

    default double sqrt(int x) {
        return Math.sqrt(x);
    }
}
class Sub02 implements Super02 {

    @Override
    public double calculate(int x) {
        return sqrt(x * 100);
    }
}
////////////////////////////////////////////////////////
public class Test02 {

    public static void main(String[] args) {
        //方法實作   
        Super02 a = new Sub02();
        System.out.println(a.calculate(100)); //100.0  
        System.out.println(a.sqrt(100));  //10.0 

        //匿名類別
        Super02 b = new Super02() {
            @Override
            public double calculate(int x) {
                return sqrt(x * 100);
            }
        };
        System.out.println(b.calculate(100));  //100.0  
        System.out.println(b.sqrt(100));  //10.0      
                      
        //Lambda表達式中是無法訪問到默認方法的==>sqrt
        //Super02 c = x -> sqrt(x * 100);
        //System.out.println(c.calculate(100));
    }
}
