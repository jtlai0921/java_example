package source;

public class Poly04P {

    public int var1 = 100;

    protected void showVar1() {
        System.out.println("Poly04P 定義的 showVar1() var1 = " + var1);
    }
}

class Poly04C extends Poly04P {

    public double var1 = 1111.111;

    public void showVar1() {
        System.out.println("Poly04C 定義的 showVar1() var1 = " + var1);
    }
}
