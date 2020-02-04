package source;

public class InnerAnonyClass2 {

    public void s1() {
        new InnerDemo1P() {

            public void f() {
                System.out.println("C");
            }
        }.f();
    }
}
