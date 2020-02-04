package source;

public class Sub1 extends Super1 {

    public void 使用繼承而來的屬性與方法() {
        x = 10;  //public ok
        y = 20;  //protected ok
        s1();   //無 ok
        //  s2();   //private error
    }
}
