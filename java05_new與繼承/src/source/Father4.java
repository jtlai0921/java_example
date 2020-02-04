package source;

public abstract class Father4 {//抽象的類別
    public void 麵店() {
        System.out.println("牛肉麵");
    }
    public abstract void 自助餐();//抽象的方法
}
interface Mother4 { //介面
    void 咖啡廳();
    void 超市();
}
interface Friend4 { //介面
    void 美容院();
}
class Son4 extends Father4 implements Mother4, Friend4 {
    public void 飲料店() {//兒子自己的
        System.out.println("紅茶");
    }
    public void 麵店() { //覆寫爸爸
        System.out.println("義大利麵");
    }
    public void 自助餐() {//實作爸爸
        System.out.println("自助餐");
    }
    public void 咖啡廳() {//實作媽媽
        System.out.println("拿鐵");
    }
    public void 超市() {//實作媽媽
        System.out.println("日常用品");
    }
    public void 美容院() {//實作朋友
        System.out.println("洗頭");
    }
}
