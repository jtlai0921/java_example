package source;

public interface InnerDemo2P {

    void abc();
   // void xyz();
}

class InnerDemo2C implements InnerDemo2P {

    public int a;
    public int b;

    public InnerDemo2C() {
        a = 10;
        b = 10;
    }

    public void abc() {
        System.out.println("a=" + a + "  b=" + b);
    }

    public void xyz() {
        System.out.println("xyz");
    }
}
