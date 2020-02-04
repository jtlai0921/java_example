package p09_DateAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Test01_LocalDate {

    public static void main(String[] args) {
        LocalDate1();
       // LocalDate2();
    }

    public static void LocalDate1() {
        //獲取當前的日期 LocalDate
        System.out.println(LocalDate.now());//2019-02-14
        //根據年月日的值獲取 LocalDate
        System.out.println(LocalDate.of(2016, 11, 30));//2016-11-30
        //根據某年的第n天獲取 LocalDate
        System.out.println(LocalDate.ofYearDay(2016, 300));//2016-10-26    

        System.out.println("加法運算----------------------------");
        System.out.println("當前：" + LocalDate.now()); //2019-02-14
        System.out.println("加1天：" + LocalDate.now().plusDays(1)); //2019-02-15
        System.out.println("加1周：" + LocalDate.now().plusWeeks(1));//2019-02-21 
        System.out.println("加1月：" + LocalDate.now().plusMonths(1)); //2019-03-14
        System.out.println("加1年：" + LocalDate.now().plusYears(1));//2020-02-14
        System.out.println("减法運算------------------------------");
        System.out.println("當前：" + LocalDate.now());//2019-02-14
        System.out.println("减1天：" + LocalDate.now().minusDays(1));//2019-02-13
        System.out.println("减1周：" + LocalDate.now().minusWeeks(1));//2019-02-07
        System.out.println("减1月：" + LocalDate.now().minusMonths(1));//2019-01-14
        System.out.println("减1年：" + LocalDate.now().minusYears(1));//2018-02-14
        System.out.println("替換運算------------------------------");
        System.out.println("當前：" + LocalDate.now());//2019-10-26
        System.out.println("替換[日期]為10：" + LocalDate.now().withDayOfMonth(10));//2019-10-10
        System.out.println("替換[天數]為200：" + LocalDate.now().withDayOfYear(200));//2019-07-19
        System.out.println("替換[月份]為1：" + LocalDate.now().withMonth(1));//2019-01-26
        System.out.println("替換[年份]為2020：" + LocalDate.now().withYear(2020));//2020-10-26
        LocalDate 當天 = LocalDate.of(2019, 9, 1);
        System.out.println("2019/9/1：" + 當天);//2019-9-1
        System.out.println("今天是否在當天之前：" + 當天.isBefore(LocalDate.now()));//true
        System.out.println("是否在當天之後：" + 當天.isAfter(LocalDate.now()));//false
        System.out.println("是否在當天：" + 當天.isEqual(LocalDate.now()));//false
        System.out.println("今年是否是閏年：" + LocalDate.now().isLeapYear());//false
    }

    public static void LocalDate2() {
        LocalDate localDate = LocalDate.of(2019, 9, 9);
        int year = localDate.getYear();
        System.out.println("year=" + year);  // year=2019
        Month month = localDate.getMonth();
        System.out.println("month=" + month); // month=SEPTEMBER （英文[enum]表示）
        int monthvalue = localDate.getMonthValue();
        System.out.println("monthvalue=" + monthvalue);  // monthvalue=9
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println("dayOfMonth=" + dayOfMonth); // dayOfMonth=9 一年中的第幾個月
        int getDayOfYear = localDate.getDayOfYear();
        System.out.println("getDayOfYear=" + getDayOfYear);// getDayOfYear=252 當天所在這一年的第幾天（從1開始） 
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("dayOfWeek=" + dayOfWeek); // 一周的星期幾：MONDAY
        int lengthOfYear = localDate.lengthOfYear();
        System.out.println("lengthOfYear=" + lengthOfYear);// 當年的天數 365
        int lengthOfMonth = localDate.lengthOfMonth();
        System.out.println("lengthOfYear=" + lengthOfMonth); // 當月的天數 ：31
        boolean leapYear = localDate.isLeapYear();
        System.out.println("leapYear=" + leapYear); // 是否為閏年：false      
    }
}
