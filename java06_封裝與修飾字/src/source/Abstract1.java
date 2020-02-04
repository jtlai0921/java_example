package source;

public abstract class Abstract1 {

    public abstract void abc();

    public abstract void xyz();

    public void m1() {
    }
}

class Abstract2 extends Abstract1 {

    @Override
    public void abc() {
    }

    @Override
    public void xyz() {
    }

    @Override
    public void m1() {
    }
}

abstract class Abstract3 extends Abstract1 {

    @Override
    public void xyz() {
    }

    @Override
    public void m1() {
    }
}

class Abstract4 extends Abstract3 { //孫子

    @Override
    public void abc() {
    }
}

/////////////////////////////////////////////////////////////////////////////

interface Abstract5 {

    void abc();

    void xyz();
}

class Abstract6 implements Abstract5 {

    @Override
    public void abc() {
    }

    @Override
    public void xyz() {
    }
}

abstract class Abstract7 implements Abstract5 {

    @Override
    public void xyz() {
    }
}

class Abstract8 extends Abstract7 { //孫子

    @Override
    public void abc() {
    }
}