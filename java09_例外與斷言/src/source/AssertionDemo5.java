package source;

public class AssertionDemo5 {

    int i = 0;

    public boolean check() {
        i /= 0;
        return false;
    }

    public static void main(String[] args) {
        AssertionDemo5 t = new AssertionDemo5();
        assert t.check();
        System.out.println(t.i);
    }
}
