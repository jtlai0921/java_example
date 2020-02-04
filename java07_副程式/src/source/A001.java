package source;

public class A001 {

    public A001() {

    }

    public static A001 getA001Instance() {
        return new A001();
    }
}

class B001 {

}

class C001 {

}


class ClassManager {

    public static A001 getA001Instance() {
        return new A001();
    }

    public A001 createA001Instance() {
        return new A001();
    }

    public static B001 getB001Instance() {
        return new B001();
    }

    public B001 createB001Instance() {
        return new B001();
    }

    public static C001 getC001Instance() {
        return new C001();
    }

    public C001 createC001Instance() {
        return new C001();
    }
}
