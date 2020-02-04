package p09_DateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test03_LocalDateTime {

    public static void main(String[] args) {
         LocalDateTime1();
        //LocalDateTime2();
        //LocalDateTime3();      
    }

    public static void LocalDateTime1() {

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1); //2019-09-09T13:26:17.836
        System.out.println(localDateTime1.getYear()); //2019
        System.out.println(localDateTime1.getMonthValue()); //9
        System.out.println(localDateTime1.getDayOfMonth()); //9
        System.out.println(localDateTime1.getHour()); //13
        System.out.println(localDateTime1.getMinute()); //26
        System.out.println(localDateTime1.getSecond()); //17
        System.out.println(localDateTime1.getNano()); //836000000

        LocalDateTime localDateTime2 = LocalDateTime.of(2017, 12, 17, 9, 31, 31, 31);
        System.out.println(localDateTime2); //2017-12-17T09:31:31.000000031

        LocalDateTime localDateTime3 = localDateTime2.plusDays(12); //加 12 天
        System.out.println(localDateTime3); //2017-12-29T09:31:31.000000031

        LocalDateTime localDateTime4 = localDateTime3.minusYears(2); //減 2 年
        System.out.println(localDateTime4); //2015-12-29T09:31:31.000000031
    }

    public static void LocalDateTime2() {
        LocalDateTime localDateTime1 = LocalDateTime.of(2017, Month.JANUARY, 4, 17, 23, 52);
        System.out.println("localDateTime1=" + localDateTime1); //localDateTime1=2017-01-04T17:23:52
        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 4);
        LocalTime localTime = LocalTime.of(17, 23, 52);
        LocalDateTime localDateTime2 = localDate.atTime(localTime);
        System.out.println("localDateTime2=" + localDateTime2); //localDateTime2=2017-01-04T17:23:52
    }

    public static void LocalDateTime3() {
        //LocalDateTime也提供用於向LocalDate和LocalTime的轉化
        LocalDateTime date1 = LocalDateTime.of(2017, Month.JANUARY, 4, 17, 23, 52);
        LocalDate localDate = date1.toLocalDate();
        LocalTime localTime = date1.toLocalTime();
        System.out.println("localDate=" + localDate); //localdate=2017-01-04
        System.out.println("localTime=" + localTime); //localtime=17:23:52
    }  
}
