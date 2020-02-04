package source;

import source.pack2.Super2;

public class Sub2 extends Super2 {

    public void 使用繼承而來的屬性與方法() {
        x = 10;  //public ok
        y = 20;  //protected ok
        //    s1();   //無 error
        //   s2();   //private error
    }
}
