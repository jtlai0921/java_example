package source;

public class 結構化程式 {

    public static void main(String[] args) {
        開車_結構化程式();
    }
    public static void 開車_結構化程式() {
        直行();
        左轉();
        直行();
        右轉();
        直行();
        左轉();
        直行();
        停止();
    }
    public static void 直行() {
        System.out.println("甲");
        System.out.println("乙");
        System.out.println("丙");
    }
    public static void 左轉() {
        System.out.println("X");
        System.out.println("Y");
        System.out.println("Z");
    }
    public static void 右轉() {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }
    public static void 停止() {
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
    }
}
