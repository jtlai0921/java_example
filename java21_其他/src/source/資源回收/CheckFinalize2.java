package source.資源回收;

import java.util.Date;

public class CheckFinalize2 {

    public static Runtime rt = Runtime.getRuntime();

    public static void main(String[] args) {
        Date d = getDate();
        System.out.println("d = " + d);
        d=null; //再一次有資格被回收 , 但 finalize 已不會被執行
        System.gc();
    }
    public static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;  //已經喪失回收的機會
    }
    public void finalize() {
        System.out.println("有發生資源回收喔....");
    }
}

