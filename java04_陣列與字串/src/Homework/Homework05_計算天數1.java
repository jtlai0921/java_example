package Homework;

import java.util.Scanner;

public class Homework05_計算天數1 {

    public static void main(String[] args) {
           int[] day1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//閏年
        int[] day2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//平年	
        int[] day = day2;
        Scanner s = new Scanner(System.in);
        int startyear;
        int startmonth;
        int finishyear;
        int finishmonth;
        int total = 0;

        int addstart = 1;
        int addend = 12;

        System.out.print("起始年 = ");
        startyear = s.nextInt();
        System.out.print("起始月 = ");
        startmonth = s.nextInt();
        System.out.print("終止年 = ");
        finishyear = s.nextInt();
        System.out.print("終止月 = ");
        finishmonth = s.nextInt();

        for (int i = startyear; i <= finishyear; i++) {

            if (i == startyear) {
                addstart = startmonth;
            }
            if (i == finishyear) {
                addend = finishmonth;
            }
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                day = day1;
            }
            for (int j = addstart; j <= addend; j++) {
                total = total + day[j];
            }
            addstart = 1;
            addend = 12;
            day = day2;
        }
        System.out.println("總天數=" + total + " 天");
    }

}
