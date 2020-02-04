package p09_DateAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Test08_ChrononUnit {

    public static void main(String[] args) {
       ChrononUnit1();
    }
  public static void ChrononUnit1() {
        LocalDate startDate = LocalDate.of(1993, Month.OCTOBER, 19);
        System.out.println("開始時間  : " + startDate); //1993-10-19

        LocalDate endDate = LocalDate.of(2017, Month.JUNE, 16);
        System.out.println("結束時間 : " + endDate); //2017-06-16

        long daysDiff = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("兩天之間的差在天數   : " + daysDiff); //8641
    }
}
