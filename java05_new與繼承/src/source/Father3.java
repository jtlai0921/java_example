package source;

public abstract class Father3 {//抽象的類別

    public void 麵店() {
        System.out.println("牛肉麵");
    }
    public abstract void 自助餐(); //抽象的方法
}
class Mother3 {

    public void 咖啡廳() {
    }

    public void 超市() {
    }
}
class Friend3 {

    public void 美容院() {
    }
}
class Son3 extends Father3 {

    public void 飲料店() {
        System.out.println("紅茶");
    }
    public void 麵店() {//覆寫
        System.out.println("義大利麵");
    }   
    public void 自助餐() {//實作
        System.out.println("自助餐");
    }
}
