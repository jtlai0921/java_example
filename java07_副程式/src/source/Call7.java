package source;

public interface Call7 {

    void 叫();
}
abstract class Animal7 {

    public abstract void 叫();
}


class Dog7 implements Call7 {

    public void 叫() {
        System.out.println("狗叫");
    }
}
class Cat7 implements Call7 {

    public void 叫() {
        System.out.println("貓叫");
    }
}
class Bird7 implements Call7 {

    public void 叫() {
        System.out.println("鳥叫");
    }
}
