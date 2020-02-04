package source;

//父親
//class Exception extends Throwable{
//    private String detailMessage;  //繼承自 Throwable
//
//    public Exception() {
//    }
//
//    public Exception(String detailMessage) {
//        this.detailMessage = detailMessage;
//    }
//
//    public String getMessage() { //繼承自 Throwable
//        return detailMessage;
//    }
//}

//歸類為 checked的例外
//public class MyDefClass2 extends Exception {
//
//    public MyDefClass2() {
//        //自動有 super();
//    }
//}

//////////////////////////////////////////////////////////////////////////////

public class MyDefClass2 extends Exception {

    public MyDefClass2() {
        //自動有 super();
    }

    public MyDefClass2(String msg) {
        super(msg);  //呼叫父類別的建構子
    }

    public String getMessage() {
        return "例外訊息:" + super.getMessage();
    }
}
