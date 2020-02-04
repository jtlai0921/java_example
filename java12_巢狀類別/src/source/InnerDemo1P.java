package source;

public interface InnerDemo1P {

    void f();
}

class InnerDemo1C implements InnerDemo1P {

    public void f() {
        System.out.println("A");
    }
}
