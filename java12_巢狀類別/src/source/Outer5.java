package source;

interface Inn1P {
    void f();
}

abstract class Inn2P {
    public abstract void g();
}

public class Outer5 {

    public void abc(int p1, int p2) {

        int f1 = 30;
        int f2 = 40;
        Inn1P p = new Inn1P() {
            public int a;
            public int b;

            {
                a = p1;
                b = p2;
            }

            public void f() {
                System.out.println("晚上");
            }
        };
        p.f();
        //===================================================
        new Inn2P() {
            public int c;
            public int d;

            {
                c = f1;
                d = f2;
            }

            public void g() {
                System.out.println("黃昏");
            }
        }.g();
    }
}
