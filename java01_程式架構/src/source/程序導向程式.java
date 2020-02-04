package source;

public class 程序導向程式 {

    public static void main(String[] args) {
        開車_程序導向程式(); 
    }

    public static void 開車_程序導向程式() {
        直行();
        左轉();
        直行();
        右轉();
        直行();
        左轉();
        直行();
        停止();
    }

    //副程式的定義
    public static void 直行() {
        System.out.println("甲");
        System.out.println("乙"); //直行
        System.out.println("丙");
    }

    public static void 左轉() {
        System.out.println("X");
        System.out.println("Y");  //左轉
        System.out.println("Z");
    }

    public static void 右轉() {
        System.out.println("A");
        System.out.println("B");  //右轉
        System.out.println("C");
    }

    public static void 停止() {
        System.out.println("a");
        System.out.println("b");   //停止
        System.out.println("c");
    }
}
