package source;


public class Animalx {

    private int legs;

    public void eat() {
        System.out.println("Eating");
    }

    public void move() {
        System.out.println("Moving");
    }
//把 legs的成員變數改成 private 再多加這兩段副程式

    public void setlegs(int x) {
        if (x <= 4) {
            legs = x;
        } else {
            System.out.println("腿設定值錯誤");
        }
    }

    public int getlegs() {
        return legs;
    }
}
