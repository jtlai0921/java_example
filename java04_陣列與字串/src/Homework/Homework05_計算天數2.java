package Homework;

import java.util.Scanner;

public class Homework05_計算天數2 {

    public static void main(String[] args) {
        int[] day1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //閏年
        int[] day2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //平年
        Scanner s = new Scanner(System.in);
        int startyear;
        int startmonth;
        int finishyear;
        int finishmonth;
        int total = 0;
        System.out.print("起始年 = ");
        startyear = s.nextInt();
        System.out.print("起始月 = ");
        startmonth = s.nextInt();
        System.out.print("終止年 = ");
        finishyear = s.nextInt();
        System.out.print("終止月 = ");
        finishmonth = s.nextInt();

        if (startyear == finishyear) {

            if (((startyear % 4 == 0) && (startyear % 100 != 0)) || (startyear % 400 == 0)) {//閏年

                for (int i = startmonth; i <= finishmonth; i++) {
                    total = total + day1[i];
                }
            } else {
                for (int i = startmonth; i <= finishmonth; i++) {
                    total = total + day2[i];
                }
            }

        } else {
            for (int k = startyear; k <= finishyear; k++) {

                if (k == startyear) {
                    if (((k % 4 == 0) && (k % 100 != 0)) || (k % 400 == 0)) {//閏年

                        for (int i = startmonth; i <= 12; i++) {
                            total = total + day1[i];
                        }
                    } else {
                        for (int i = startmonth; i <= 12; i++) {
                            total = total + day2[i];
                        }
                    }
                } else if (k == finishyear) {
                    if (((k % 4 == 0) && (k % 100 != 0)) || (k % 400 == 0)) {//閏年
                        for (int i = 1; i <= finishmonth; i++) {
                            total = total + day1[i];
                        }
                    } else {
                        for (int i = 1; i <= finishmonth; i++) {
                            total = total + day2[i];
                        }
                    }
                } else if (((k % 4 == 0) && (k % 100 != 0)) || (k % 400 == 0)) {//閏年
                    for (int i = 1; i <= 12; i++) {
                        total = total + day1[i];
                    }
                } else {
                    for (int i = 1; i <= 12; i++) {
                        total = total + day2[i];
                    }
                }

            }
        }
        System.out.println("總天數=" + total + " 天");
    }

}
