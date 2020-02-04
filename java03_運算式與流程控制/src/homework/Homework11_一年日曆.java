package homework;

import java.io.IOException;
import java.util.Scanner;

public class Homework11_一年日曆 {

    static int year, weekDay;

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int firstWeekDayOfYear(int year) {
        long day = year * 365;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                day += 1;
            }
        }
        return (int) day % 7;
    }

    public static int getMonthOfDays(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static void showMonths() {
        for (int m = 1; m <= 12; m++) {
            System.out.println(m + "月");
            System.out.println("Sunday  Monday  Tuesday  Wednesday  Thursday  Friday  Saturday");
            for (int j = 1; j <= weekDay; j++) {
                System.out.print("         ");
            }
            int monthDay = getMonthOfDays(m);
            for (int d = 1; d <= monthDay; d++) {
                if (d < 10) {
                    System.out.print("  " + "0" + d + "     ");
                } else {
                    System.out.print("  " + d + "     ");
                }
                weekDay = (weekDay + 1) % 7;
                if (weekDay == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("請輸入一個年份");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        year = Integer.parseInt(str);
        weekDay = firstWeekDayOfYear(year);
        System.out.println("\n          " + year + "年          ");
        showMonths();
    }

}
