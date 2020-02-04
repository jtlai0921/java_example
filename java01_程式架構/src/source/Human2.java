package source;

public class Human2 {
//我被鎖住了
    private String 名字;
    private int 身高;
    private int 體重;

    public void 吃(int x) {
        System.out.println("吃" + x + "碗飯");
    }

    public void 跑(int y) {
        System.out.println("跑" + y + "公里");
    }    
    
    //我是跟外界溝通的管道 介面
    public void setdata(String n, int h, int w) {
        名字 = n;
        身高 = h;
        體重 = w;
    }
    public void getdata() {
        System.out.println("名字 " + 名字);
        System.out.println("身高 " + 身高 + "公分");
        System.out.println("體重 " + 體重 + "公斤");
    }    
}
