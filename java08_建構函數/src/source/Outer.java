package source;

public class Outer {

    public static void main(String[] args) {
        new Outer().abc();
    }

    public void abc() {
//        Inner p = new Inner();
//        p.show();
        Super p = new Super() {
            public int x;
            public int y;

            {
                x = 10;
                y = 20;
            }

            public void show() {
                System.out.println("x=" + x);
                System.out.println("y=" + y);
            }
        };
        p.show();
    }
}

//////////////////////////////////////////////
abstract class Super { //父類別

    public abstract void show();
}

class Inner extends Super {//子類別

    public int x;
    public int y;

    public Inner() {

        x = 10;
        y = 20;
    }

    public void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
