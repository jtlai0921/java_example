package source;

import source.pack2.New3;

public class New1 {

    public void 使用New2() { //在同 package
        New2 a = new New2();
        a.x = 10;  // public ok
        a.y = 20;  // protected ok
        a.s1();  // 無 ok
        // a.s2();  //private error
    }

    public void 使用New3() { //在不同 package
        New3 a = new New3();
        a.x = 10;  // public ok
        // a.y=20;  // protected error
        // a.s1();  // 無 error
        // a.s2();  //private error
    }
    
}
