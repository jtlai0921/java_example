package source;

public class Outer1 {

    public int x;
    public static int y;
    private static int z;

    public void s1() {
        Inner1.b = 123;
        Inner1.n2();
        Inner1 p = new Inner1();
        p.a = 123;
        p.c = 123;
        p.n1();
    }

    public static void s2() {
        Inner1.b = 123;
        Inner1.n2();
        Inner1 p = new Inner1();
        p.a = 123;
        p.c = 123;
        p.n1();
    }

    public static class Inner1 {

        public int a;
        public static int b;
        private int c;

        public void n1() {
            //x=123;
            y = 123;
            z = 123;
            // s1();
            s2();
        }

        public static void n2() {
            //x=123;
            y = 123;
            z = 123;
            // s1();
            s2();
        }
    }
}

class Other1 {

    public void m1() {
        Outer1.Inner1.b = 123;
        Outer1.Inner1.n2();
        Outer1.Inner1 p = new Outer1.Inner1();
        p.a = 123;
        //p.c = 123;
        p.n1();
    }
}
