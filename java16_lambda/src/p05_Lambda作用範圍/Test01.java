package p05_Lambda作用範圍;

// 匿名類別語法
class Hello1 {

    public Runnable r = new Runnable() {
        public void run() {
            // 這裡的this指的是匿名類別，而非Hello類別。        
            System.out.println("-->1 " + this.toString()); //-->1 p05_Lambda作用範圍.Hello1$1@15db9742
            // 想要引用Hello類別需要Hello.this!!!         
            System.out.println("-->2 " + Hello1.this.toString()); //-->2 Hello's custom toString()
        }
    };
    public String toString() {
        return "Hello's custom toString()";
    }
}
////////////////////////////////////////////////////////////////////
// Lambda語法
class Hello2 {

    public Runnable r = () -> { //會引用到 Hello2 的 toString()
        System.out.println(this); //Hello's custom toString()
        System.out.println(this.toString()); //Hello's custom toString()
    };

    public String toString() {
        return "Hello's custom toString()";
    }
}

////////////////////////////////////////////////////////////////////
public class Test01 {

    public static void main(String[] args) {
        Hello1 h1 = new Hello1();
        h1.r.run();

        Hello2 h2 = new Hello2();
        h2.r.run();
    }
}
