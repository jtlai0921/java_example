package source;

public class InnerAnonyClass1 {

    public void s1() {
        class InnerDemo1C implements InnerDemo1P {

            public void f() {
                System.out.println("B");
            }
        }
        new InnerDemo1C().f();
    }
}
