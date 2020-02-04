package source;


public abstract class Traffic1 {

    protected static int miles;

    public abstract void speedUp();
}

class Airplane1 extends Traffic1 {

    public void speedUp() {
        miles += 15;
        System.out.println("駕駛飛機,加速中,前進" + miles + "公里");
    }
}

class Car1 extends Traffic1 {

    public void speedUp() {
        miles += 2;
        System.out.println("駕駛車子,加速中,前進" + miles + "公里");
    }
}
