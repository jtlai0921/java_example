package p09_DateAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Test05_Duration {

    public static void main(String[] args) {
       //  Duration1();
       Duration2();
    }

    public static void Duration1() {
        // 2017-01-05 10:07:00
        LocalDateTime from = LocalDateTime.of(2017, Month.JANUARY, 5, 10, 7, 0);   
       // 2017-02-05 10:07:00
        LocalDateTime to = LocalDateTime.of(2017, Month.FEBRUARY, 5, 10, 7, 0);  
       // 表示從 2017-01-05 10:07:00 到 2017-02-05 10:07:00 這段時間
        Duration duration = Duration.between(from, to); 
        System.out.println(duration.toDays()); // 31 這段時間的總天數 
        System.out.println(duration.toHours());  //744  這段時間的小時數
        System.out.println(duration.toMinutes());  //44640 這段時間的分鐘數
        System.out.println(duration.getSeconds());  //2678400 這段時間的秒數
        System.out.println(duration.toMillis());  //2678400000 這段時間的毫秒數
        System.out.println(duration.toNanos());  //2678400000000000 這段時間的纳秒數
    }

    public static void Duration2() {
        //Duration對象還可以通過of()方法創建，該方法接受一個時間段長度，和一個時間單位作為參數
        Duration duration1 = Duration.of(5, ChronoUnit.DAYS);       // 5天
        Duration duration2 = Duration.of(1000, ChronoUnit.MILLIS);  // 1000毫秒
    }
}
