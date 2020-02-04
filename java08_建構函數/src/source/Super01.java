package source;

/*
 class Object{

 }
 */
class SuperSuper01 {

    public SuperSuper01() {
        //super();
        System.out.println("我是ㄚ公 SuperSuper01");
    }
}

public class Super01 extends SuperSuper01 {

    public Super01() {
        //super();
        System.out.println("我是父親 Super01");
    }
}

class Sub01 extends Super01 {

    public Sub01() {
        //super();
        System.out.println("我是小孩 Sub01");
    }
}

////////////////////////////////////////////////////////////////////////////////

/*
 class Object{

 }
 */
class Super02 {

    public int var1;

    public Super02() {
        // super(); //可以不寫
        System.out.println("我是父親 Super02");
    }

    public Super02(int var1) {
        //super(); //可以不寫
        System.out.println("我是父親 Super02(int)");
        this.var1 = var1;
    }
}

class Sub02 extends Super02 {

    public int var2;

    public Sub02() {
        //super(); //可以不寫，會自動呼叫 Super02()
        System.out.println("我是小孩 Sub02");
    }

    public Sub02(int var2) {
        super(var2); //必須要寫 , 指定傳入 var2 值來呼叫 Super02(int)
        System.out.println("我是小孩 Sub02(int)");
        this.var2 = var2;
    }
}

///////////////////////////////////////////////////////////////////////////////

class Super03 {

    public int var1;

    public Super03() {
        this(10); //呼叫兄弟建構函數
    }

    public Super03(int var1) {
        super(); //呼叫父親建構函數
        System.out.println("我是父親 Super03(int)");
        this.var1 = var1;
    }
}

class Sub03 extends Super03 {

    public int var2;

    public Sub03() {
        this(10); //呼叫兄弟建構函數
    }

    public Sub03(int var2) {
        super(var2); //呼叫父親建構函數
        System.out.println("我是小孩 Sub03(int)");
        this.var2 = var2;
    }
}
