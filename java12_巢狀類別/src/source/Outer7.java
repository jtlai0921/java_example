package source;

interface Inn3P {

    void 習慣();
}

public class Outer7 {

    public int x;
    public static int y;

    public void s1(int p) {

        s2(new Inn3P() {
            public int a;
            public int b;

            {
                a = 4;
                b = 5;
            }

            public void 習慣() {
                System.out.println("吃檳榔" + p + "顆");
            }
        });
    }

    public void s2(Inn3P t) {
        t.習慣();
    }
}
