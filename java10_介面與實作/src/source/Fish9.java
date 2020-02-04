package source;

//錯誤的定義
public abstract class Fish9 {//魚

    public abstract void swim();
}
class Anemonefish9 extends Fish9 {//小丑魚

    public void swim() {
        System.out.println("小丑魚游泳");
    }
}
class Shake9 extends Fish9 {//鯊魚

    public void swim() {
        System.out.println("鯊魚游泳");
    }
}
class Piranha9 extends Fish9 {//食人魚

    public void swim() {
        System.out.println("食人魚游泳");
    }
}
class Human9 extends Fish9 { //人

    public void swim() {
        System.out.println("人游泳");
    }
}
class Submarine9 extends Fish9 {//潛水艇

    public void swim() {
        System.out.println("潛水艇游泳");
    }
}



