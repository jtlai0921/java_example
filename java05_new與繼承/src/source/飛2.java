package source;

public interface 飛2 {
    void 飛();
}
interface 游泳2 {
    void 游泳();
}
abstract class 人類 {
    String 名字;
    int 身高;
    int 體重;

    public abstract void 吃();
}
class 鳥2 implements 飛2 {
    public void 飛() {
        System.out.println("鳥飛");
    }
}
class 魚2 implements 游泳2 {
    public void 游泳() {
        System.out.println("魚游泳");
    }
}
class 飛魚2 extends 魚2 implements 飛2 {
    public void 飛() {
        System.out.println("飛魚飛");
    }
}
class 飛機2 implements 飛2 {
    public void 飛() {
        System.out.println("飛機飛");
    }
}

class 潛水艇2 implements 游泳2 {

    public void 游泳() {
        System.out.println("潛水艇游泳");
    }
}

class 人2 extends 人類 implements 游泳2 {

    public void 吃() {
        System.out.println("吃飯");
    }

    public void 游泳() {
        System.out.println("人游泳");
    }
}
