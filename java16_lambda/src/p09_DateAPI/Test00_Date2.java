package p09_DateAPI;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test00_Date2 {

    public static void main(String[] args) {
             不同時區的Date();   
     
    }

    public static void 不同時區的Date() {

        Date date = new Date(1503544630000L);  // 對應的北京時間是2017-08-24 11:17:10

        SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");     // 北京
        bjSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));  // 設置北京時區

        SimpleDateFormat tokyoSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 東京
        tokyoSdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));  // 設置東京時區

        SimpleDateFormat londonSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 倫敦
        londonSdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));  // 設置倫敦時區

        System.out.println("毫秒數:" + date.getTime() + ", 北京時間:" + bjSdf.format(date));
        System.out.println("毫秒數:" + date.getTime() + ", 東京時間:" + tokyoSdf.format(date));
        System.out.println("毫秒數:" + date.getTime() + ", 倫敦時間:" + londonSdf.format(date));
    }

}
