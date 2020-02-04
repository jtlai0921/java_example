package source.耦合與內聚力;

public class 耦合 {
   
    public static void main(String[] args) {
        
    }

}
///////////////////////////////////////////////////////////////////////////////

//緊密耦合
class Doubler {

    public static int doubleMe(Holder h) {
        return h.getAmount() * 2;
    }
}
class Holder {

    int amount = 10;

    public void doubleAmount() {
        amount = Doubler.doubleMe(new Holder());
    }

    public int getAmount() {
        return amount;
    }
//more code here
}


///////////////////////////////////////////////////////////////////////////////


//鬆散耦合
//public class Doubler {
//
//    public static int doubleMe(int h) {
//        return h * 2;
//    }
//}
//
//class Holder {
//
//    int amount = 10;
//
//    public void doubleAmount() {
//        amount = Doubler.doubleMe(amount);
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//more code here
//}