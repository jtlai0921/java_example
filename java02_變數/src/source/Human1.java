package source;


public class Human1 {

    public String 名字;
    public int 身高;
    public int 體重;

    public void 吃(int x) {
        System.out.println("吃" + x + "碗飯");
    }

    public void 跑(int y) {
        System.out.println("跑" + y + "公里");
    }
    
    public String toString(){
        return 名字 + " " + 身高 + " " + 體重;
    }
}
