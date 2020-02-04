package source;

public class Outer4 {

    public void abc(int p1, int p2) {
        int f1 = 30;
        int f2 = 40;
        class Inn1 {

            public int a;
            public int b;

            public Inn1() {
                a = p1;
                b = p2;
            }

            public void f() {
                System.out.println("晚上");
            }
        }
        Inn1 p = new Inn1();
        p.f();
        //====================================
        class Inn2 {

            public int c;
            public int d;

            public Inn2() {
                c = f1;
                d = f2;
            }

            public void g() {
                System.out.println("黃昏");
            }
        }
        Inn2 q = new Inn2();
        q.g();
    }
}
