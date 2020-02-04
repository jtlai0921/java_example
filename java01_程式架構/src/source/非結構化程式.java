package source;

public class 非結構化程式 {

    public static void main(String[] args) {
        開車_非結構化程式();
    }
    public static void 開車_非結構化程式() {
        
        System.out.println("甲");
        System.out.println("乙"); //直行
        System.out.println("丙");

        System.out.println("X");
        System.out.println("Y");  //左轉
        System.out.println("Z");

        System.out.println("甲");
        System.out.println("乙");  //直行
        System.out.println("丙");

        System.out.println("A");
        System.out.println("B");  //右轉
        System.out.println("C");

        System.out.println("甲");
        System.out.println("乙");  //直行
        System.out.println("丙");

        System.out.println("a");
        System.out.println("b");   //停止
        System.out.println("c");
    }    
}
