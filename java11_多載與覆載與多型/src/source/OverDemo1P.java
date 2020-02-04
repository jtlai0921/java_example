package source;

public class OverDemo1P {

    protected void m1(double x) {
    }
}

class OverDemo1C extends OverDemo1P {

    public void m1() {
    }

    private static double m1(char x) {
        return 2.2;
    }

    public void m1(int x) {
    }

    final void m1(int x, float y) {
    }

    protected int m1(float x, int y) {
        return 1;
    }
}
