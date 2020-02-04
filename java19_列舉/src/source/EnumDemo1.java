package source;

enum Color1 {

    Red, Green, Blue, Black;
}

//////////////////////////////////////
public class EnumDemo1 {

    enum Color2 {

        Red, Green, Blue;
    }
}

//////////////////////////////////////
//列舉不能被定義在方法內
class EnumDemo2 {

    void abc() {
//        enum Color4 {
//
//            Red, Green, Blue;
//        }
    }
}

////////////////////////////////////////////////////////////////////////
enum CoffeeSize1 {

    BIG, HUGE, OVERWHELMING
}

class Coffee1 {

    CoffeeSize1 size;
}

class Coffee2 {

    enum CoffeeSize2 {

        BIG, HUGE, OVERWHELMING
    }
    CoffeeSize2 size;
}
////////////////////////////////////////////////////////////////////////

enum Example {

    Four, ONE, TWO, THREE
}
