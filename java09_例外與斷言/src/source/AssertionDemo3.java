package source;


public class AssertionDemo3 {

    int i = 0;

    private boolean check() {
        i = 1;
        return true;
    }

    public static void main(String[] args) {
        AssertionDemo3 t = new AssertionDemo3();
        assert t.check();
        System.out.println(t.i);
    }
}
