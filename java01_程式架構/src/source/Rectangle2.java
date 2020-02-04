package source;

public class Rectangle2 {
    private int 長; //我被鎖住了
    private int 寬; //我被鎖住了

    public void 長方形面積() {
        int 面積;
        面積 = 長 * 寬;
        System.out.println("面績=" + 面積);
    }
    public void 長方形周長() {
        int 周長;
        周長 = (長 + 寬) * 2;
        System.out.println("周長=" + 周長);
    }
    //我是跟外介溝通的管道 ( 介面 )
    public void set長寬(int h, int w) {
        長 = h;
        寬 = w;
    }
}
