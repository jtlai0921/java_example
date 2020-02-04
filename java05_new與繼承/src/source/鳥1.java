package source;

public class 鳥1 {
    public void 飛() {
        System.out.println("鳥飛");
    }
}
class 魚1 {
    public void 游泳() {
        System.out.println("魚游泳");
    }
}
class 飛魚1 extends 鳥1 {
    public void 飛() {
        System.out.println("飛魚飛");
    }
}
class 飛機1 extends 鳥1 {
    public void 飛() {
        System.out.println("飛機飛");
    }
}
class 潛水艇1 extends 魚1 {
    public void 游泳() {
        System.out.println("潛水艇游泳");
    }
}
class 人1 extends 魚1 {
    public void 游泳() {
        System.out.println("人游泳");
    }
}
