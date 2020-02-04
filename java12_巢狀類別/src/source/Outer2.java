package source;

public class Outer2 {

    public int x;
    public static int y;
    private static int z;

    public void s1() {
        Inner2 p = new Inner2();
        p.a = 123;
        p.c = 123;
        p.n1();

    }

    public static void s2() {
        Inner2 p = new Outer2().new Inner2();
        p.a = 123;
        p.c = 123;
        p.n1();
    }

    public class Inner2 {

        public int a;
        // public static int b;
        private int c;

        public void n1() {
            x = 123;
            y = 123;
            z = 123;
            // s1();
            s2();
        }

       // public static void n2() {
           // x = 123;
           // y = 123;
           // z = 123;
           // s1();
           // s2();
       // }
    }
}

class Other2 {

    public void m1() {

        Outer2.Inner2 p = new Outer2().new Inner2();
        p.a = 123;
        //p.c = 123;
        p.n1();
    }
}
