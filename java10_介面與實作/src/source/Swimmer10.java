package source;

//正確的定義
public interface Swimmer10 {

    public void swim();
}
class Anemonefish10 implements Swimmer10 {//小丑魚

    public void swim() {
        System.out.println("小丑魚游泳");
    }
}
class Shake10 implements Swimmer10 {//鯊魚

    public void swim() {
        System.out.println("鯊魚游泳");
    }
}
class Piranha10 implements Swimmer10 {//食人魚

    public void swim() {
        System.out.println("食人魚游泳");
    }
}
class Human10 implements Swimmer10 { //人

    public void swim() {
        System.out.println("人游泳");
    }
}
class Submarine10 implements Swimmer10 {//潛水艇

    public void swim() {
        System.out.println("潛水艇游泳");
    }
}
