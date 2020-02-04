package source.資源回收;

import java.util.Date;

public class GarbageTruck3 {

    public static void main(String[] args) {
        Date d = getDate();       
        System.out.println("d = " + d);
    }

    public static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }
}
