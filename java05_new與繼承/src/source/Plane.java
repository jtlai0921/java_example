package source;

public class Plane {//飛機

    public int 速度;
    public int 載重 = 1000;

    public void 起飛() {
        速度 = 10;
        System.out.println("我是飛機-起飛速度:" + 速度);
    }

    public void 降落() {
    }
}




