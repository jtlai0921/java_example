package source;

public interface Poly05P {

    void 習慣();
}

class Poly05C implements Poly05P {

    public void 習慣() {
        System.out.println("抽煙");
    }
}
class Poly06C implements Poly05P {

    public void 習慣() {
        System.out.println("吃檳榔");
    }
}
class Poly07C implements Poly05P {

    public void 習慣() {
        System.out.println("喝酒");
    }
}
