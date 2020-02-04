package p09_DateAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test07_ZonedDateTime {

    public static void main(String[] args) {
        //ZonedDateTime1();
       //ZonedDateTime2();
        // ZonedDateTime3();  
           ZonedDateTime4(); 
        // ZonedDateTime5();
    }

    public static void ZonedDateTime1() {
        final ZonedDateTime currentPoint = ZonedDateTime.now();
        System.out.println(currentPoint);//2019-10-26T22:53:18.875+08:00[Asia/Taipei]
    }

    public static void ZonedDateTime2() {
        final LocalDateTime currentDateTime = LocalDateTime.now();
        final ZonedDateTime zonedCurrentDateTime = currentDateTime.atZone(ZoneId.of("+8"));
        System.out.println(zonedCurrentDateTime);//2019-10-26T22:57:14.506+08:00
    }

    public static void ZonedDateTime3() {
        final ZoneId zoneidDefault = ZoneId.systemDefault(); //系統預設時區
        System.out.println(zoneidDefault);//Asia/Taipei
        //使用of()工廠方法創建ZoneId
        final ZoneId zoneidPlus8 = ZoneId.of("UTC+8"); //UTC時間+8
        System.out.println(zoneidPlus8); //UTC+08:00
    }

    public static void ZonedDateTime4() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        //2019-10-26T23:01:34.628+08:00[Asia/Taipei]
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        ZoneId zoneId1 = ZoneId.of("GMT"); //格林威治時間
        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(instant, zoneId1);
        //2019-10-26T15:01:34.629Z[GMT]
        System.out.println(zonedDateTime2);             
      
    }

    public static void ZonedDateTime5() {
        //ZoneId 中的 getAvailableZoneIds()返回所有已知時區ID。
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }
}
