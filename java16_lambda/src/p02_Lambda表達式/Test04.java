package p02_Lambda表達式;

public class Test04 {

    public static void main(String[] args) {
        new Test04().test();
    }
    public void test() {
        //傳統方法-至少要 4 行
        Runnable r1 = new Runnable() {
            public void run() {                
                System.out.println("r1: " + this.getClass().getName()); 
            }
        };
        //Lambda       
        Runnable r2 = () -> System.out.println("r2: " + this.getClass().getName()); 
        
        new Thread(r1).start();
        new Thread(r2).start();              
    }
}
