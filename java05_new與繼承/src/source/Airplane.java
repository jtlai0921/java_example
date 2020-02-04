package source;

public class Airplane extends Plane {

    public int 載客人數;
    public double 載重 = 10000.0;  //遮蔽

    public void 客艙服務() {
        System.out.println("我是客艙服務");
    }

    public void 起飛() {//覆蓋
        速度 = 100;
        System.out.println("我是客機-起飛速度:" + 速度);
    }
}
