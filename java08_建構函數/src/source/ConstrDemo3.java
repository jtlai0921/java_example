package source;

//類別組成
public class ConstrDemo3 {
    //成員屬性/////////////////////

    public int x;
    public static int y;

    //instance 區塊///////////////
    {
        x = 10;
    }
    //static 區塊////////////////

    static {
        y = 20;
    }
    //建構函數///////////////////

    public ConstrDemo3() {
        x = 30;
    }
    //成員方法//////////////////

    public void xyz() {
    }
    //巢狀類別//////////////////

    private static class ConstrDemo4 {

        int a;

        void abc() {
        }
    }
    //列舉//////////////////////

    public enum Color5 {

        RED, YELLOW, BLUE
    }
}
