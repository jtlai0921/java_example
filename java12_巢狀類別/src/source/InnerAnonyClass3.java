package source;

public class InnerAnonyClass3 {
    
    public void s1() {
        s2(new InnerDemo1C());
    }

    public void s2(InnerDemo1C p) {
        p.f();
    }
}
