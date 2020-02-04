package source;

public class Outer6 {

    public int x;
    public static int y;

    public class Inn3 {

        public int a;
        public int b;

        public Inn3() {
            a = 4;
            b = 5;
        }

        public void 習慣() {
            System.out.println("吃檳榔");
        }
    }

    public void s1(int p) {

        s2(new Inn3());
    }

    public void s2(Inn3 t) {
        t.習慣();
    }
}
