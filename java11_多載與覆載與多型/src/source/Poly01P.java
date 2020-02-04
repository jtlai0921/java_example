package source;

//
//public class Poly01P {
//
//    public void 習慣() {
//        System.out.println("父-抽煙");
//    }  
//}
//
//class Poly01C extends Poly01P {
// 
//    public void 習慣() {
//        System.out.println("子1-吃檳榔");
//    } 
//}
//
//class Poly02C extends Poly01P {
//
// 
//    public void 習慣() {
//        System.out.println("子2-喝酒");
//    }  
//}

////////////////////////////////////////////////////////////////////////////////
public class Poly01P {

    public int x = 1;
    public static int y = 4;

    public void 習慣() {
        System.out.println("父-抽煙");
    }
    public static void 喜愛() {
        System.out.println("父-唱卡拉ok");
    }
    public void 畫線() {
        System.out.println("父-xxxxxxxxxxxxxxxxx");
    }
}

class Poly01C extends Poly01P {

    public double x = 2.0;
    public static double y = 5.0;

    public void 習慣() {
        System.out.println("子1-吃檳榔");
    }
    public static void 喜愛() {
        System.out.println("子1-郊遊踏青");
    }
    public void 討厭() {
        System.out.println("子1-吃苦瓜");
    }
}

class Poly02C extends Poly01P {

    public double x = 3.0;
    public static double y = 6.0;

    public void 習慣() {
        System.out.println("子2-喝酒");
    }
    public static void 喜愛() {
        System.out.println("子2-釣魚");
    }
}
