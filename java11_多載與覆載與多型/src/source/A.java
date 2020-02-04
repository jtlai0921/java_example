package source;

public interface A {

    public void doSomething(String thing);
}

class AImpl implements A {

    public void doSomething(String msg) {
    }
}

///////////////////////////////////////////////////
class B {

    public A doit() {
        return new AImpl();
    }

    public String execute() {
        return "abc";
    }
}

class C extends B {

    public AImpl doit() {
        return new AImpl();
    }
//    public Object execute() {
//        return new Object();
//    }
}
