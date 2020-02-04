package source;

public class 物件導向程式 {

    public static void main(String[] args) {
        開車_物件導向();
    }
    public static void 開車_物件導向() {
        Car 車子1 = new Car();  //定義物件

        車子1.直行();
        車子1.左轉();
        車子1.直行();
        車子1.右轉();
        車子1.直行();
        車子1.左轉();
        車子1.直行();
        車子1.停止();
    }
}

//汽車元件
class Car {

    public void 直行() {
        System.out.println("甲");
        System.out.println("乙");
        System.out.println("丙");
    }

    public void 左轉() {
        System.out.println("X");
        System.out.println("Y");
        System.out.println("Z");
    }

    public void 右轉() {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }

    public void 停止() {
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
    }
}
