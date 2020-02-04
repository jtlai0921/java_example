package source;

public class AssertionDemo2 {

    int i = 0;

    public static void main(String[] args) {
        AssertionDemo2 t = new AssertionDemo2();
        t.g();
        System.out.println(t.i);
    }
    private int g() {
        //
        //
        assert ++i < 10;
        return i;

    }
}
