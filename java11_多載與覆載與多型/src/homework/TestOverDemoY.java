package homework;

class OverDemoY {

    private int height;
    private int weight;

    public OverDemoY(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return height + " " + weight;
    }

    public boolean equals(Object obj) {
        if ((obj != null && obj instanceof OverDemoY)) {
            if ((height == ((OverDemoY) obj).height)
                    && (weight == ((OverDemoY) obj).weight)) {
                return true;
            }
        }
        return false;
    }
}

public class TestOverDemoY {

    public static void main(String[] args) {

        OverDemoY p1 = new OverDemoY(162, 50);
        OverDemoY p2 = new OverDemoY(162, 50);
        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);

        System.out.println("p1.equals(p2)=" + p1.equals(p2));

    }
}

//p1=162 50
//p2=162 50
//p1.equals(p2)=true