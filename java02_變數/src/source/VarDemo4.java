package source;

public class VarDemo4 {

    public static int x ; //回自動初始化成 0

    public static void main(String[] args) {
        //測試全域變數
        a1();
        System.out.println("--->x= " + x);
        a2();
        System.out.println("--->x= " + x);
        //測試區域變數     
        a3();       
        a3();      
        a3();      
    }
    public static void a1() {      
        x = x + 10; //全域變數
    }
    public static void a2() {     
        x = x + 20;
    }
    public static void a3() {
        int y = 0;
        y = y + 1;
        System.out.println("--->y= " + y);
    }
}
