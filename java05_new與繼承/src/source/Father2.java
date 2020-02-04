package source;

public class Father2 {

    public void 麵店() {
        System.out.println("牛肉麵");
    }
    public void 自助餐() {
    }
}
class Mother2 {

    public void 咖啡廳() {
    }
    public void 超市() {
    }
}
class Friend2 {

    public void 美容院() {
    }
}
class Son2 extends Father2 {

    public void 飲料店() {
        System.out.println("紅茶");
    }
   public void 麵店() {//覆寫
        System.out.println("義大利麵");
    } 
}
