package source;

public class Rectangle1 {

    public int 長;
    public int 寬;

    public void 長方形面積() {
        int 面積;
        面積 = 長 * 寬;
        System.out.println("面積=" + 面積);
    }
    public void 長方形周長() {
        int 周長;
        周長 = (長 + 寬) * 2;
        System.out.println("周長=" + 周長);
    }
}


