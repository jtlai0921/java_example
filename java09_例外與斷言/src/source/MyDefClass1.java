package source;

//public class RuntimeException extends Exception {
//
//    private String detailMessage;  //繼承自 Exception
//
//    public RuntimeException() {
//        // compiled code
//    }
//    public RuntimeException(String string) {
//        // compiled code
//    }
//    public RuntimeException(String string, Throwable thrwbl) {
//        // compiled code
//    }
//    public RuntimeException(Throwable thrwbl) {
//        // compiled code
//    }
//    protected RuntimeException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
//        // compiled code
//    }
//    public String getMessage() { //繼承自  Exception
//        return detailMessage;
//    }
//}

//歸類為 unchecked的例外
//public class MyDefClass1 extends RuntimeException {
//    
//    public MyDefClass1() {
//        //自動有 super();
//    }
//}
//////////////////////////////////////////////////////////////////////////////

public class MyDefClass1 extends RuntimeException {

    public MyDefClass1() {
        //自動有 super();
    }

    public MyDefClass1(String msg) {
        super(msg);  //呼叫父類別的建構子
    }

    public String getMessage() {
        return "例外訊息:" + super.getMessage();
    }
}
