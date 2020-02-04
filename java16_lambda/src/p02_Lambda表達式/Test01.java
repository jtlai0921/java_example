package p02_Lambda表達式;

//定義介面
interface Super01 {

    void a();
}

interface Super02 {

    void a(int x);
}

interface Super03 {

    void a(int x, int y);
}

interface Supe04 {

    int a();
}

interface Super05 {

    int a(int x);
}

interface Super06 {

    int a(int x, int y);
}

/////////////////////////////////////////////
//子類別實作
class Sub01 implements Super01 {

    public void a() {
        System.out.println("我愛你");
    }
}
class Sub02 implements Super02 {

    public void a(int x) {
        System.out.println(x);
    }
}
class Sub03 implements Super03 {

    public void a(int x, int y) {
        System.out.println(x);
        System.out.println(y);
    }
}
class Sub04 implements Supe04 {

    public int a() {
        return 999;
    }
}
class Sub05 implements Super05 {

    public int a(int x) {
        return x;
    }
}
class Sub06 implements Super06 {

    public int a(int x, int y) {
        x = x + 1;
        y = y + 1;
        return x + y;
    }
}

/////////////////////////////////////////////////////////
public class Test01 {

    public static void main(String[] args) {
        //1.1 正常實作 
        Super01 a1 = new Sub01();
        a1.a(); //"我愛你"

        //2.1 正常實作 
        Super02 a2 = new Sub02();
        a2.a(123); //123

        //3.1 正常實作 
        Super03 a3 = new Sub03();
        a3.a(123, 456);

        //4.1 正常實作
        Supe04 a4 = new Sub04();
        System.out.println(a4.a());

        //5.1 正常實作
        Super05 a5 = new Sub05();
        System.out.println(a5.a(123));

        //6.1 正常實作
        Super06 a6 = new Sub06();
        System.out.println(a6.a(123, 456));

        ////////////////////////////////////////////////////////////////
        
        //1.2 匿名類別
        Super01 b1 = new Super01() {
            public void a() {
                System.out.println("我愛你");
            }
        };
        b1.a(); //"我愛你"

        //2.2 匿名類別
        Super02 b2 = new Super02() {
            @Override
            public void a(int x) {
                System.out.println(x);
            }
        };
        b2.a(123); //123        

        //3.2 匿名類別
        Super03 b3 = new Super03() {
            public void a(int x, int y) {
                System.out.println(x);
                System.out.println(y);
            }
        };
        b3.a(123, 456);

        //4.2 匿名類別
        Supe04 b4 = new Supe04() {
            public int a() {
                return 999;
            }
        };
        System.out.println(b4.a());
        //5.2 匿名類別
        Super05 b5 = new Super05() {
            public int a(int x) {
                return x;
            }
        };
        System.out.println(b5.a(123));
        //6.2 匿名類別
        Super06 b6 = new Super06() {
            public int a(int x, int y) {
                x = x + 1;
                y = y + 1;
                return x + y;
            }
        };
        System.out.println(b6.a(123, 456));

        ///////////////////////////////////////////////////////////////
        //1.3 Lambda 沒有參數 , 單行不回傳
        Super01 c1 = () -> System.out.println("我愛你");
        c1.a(); //"我愛你"
        
        //2.3 Lambda 一個參數 , 單行不回傳
        Super02 c2 = x -> System.out.println(x);
        c2.a(123); //123            

        //3.3 Lambda 二個參數 , 多行不回傳
        Super03 c3 = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        c3.a(123, 456);        
        //4.3 Lambda 沒有參數 , 單行回傳
        Supe04 c4 = () -> 999;
        System.out.println(c4.a());       
        
        //5.3 Lambda 一個參數 , 單行回傳
        Super05 c5 = x -> x;
        System.out.println(c5.a(123));

        //6.3 Lambda 二個參數 , 多行回傳
        Super06 c6 = (x, y) -> {
            x = x + 1;
            y = y + 1;
            return x + y;
        };
        System.out.println(c6.a(123, 456));
    }
}
