package source;

public class InnerAnonyClass4 {

    public void s1() {
        s2(new InnerDemo1P() {
            @Override
            public void f() {
                System.out.println("D");
            }
        });
    }

    public void s2(InnerDemo1P p) {
        p.f();
    }
}
