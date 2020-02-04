package source;

public class AssertionDemo6 {

    int i = 0;

    public int message() {
        return i /= 0;
    }

    public static void main(String[] args) {
        AssertionDemo6 t = new AssertionDemo6();
        assert false : t.message();
        System.out.println(t.i);
    }
}
