package Homework;

import java.util.Scanner;

public class Homework04_分數範圍 {

    public static void main(String[] args) {
        int[] grade;
        int[] bar = new int[11]; //長條圖 0-100 分共 11 個區間
        int number;
        Scanner s = new Scanner(System.in);

        System.out.print("請輸入學生人數 (1-10 人) : ");

        while (true) {
            number = s.nextInt();
            if (number >= 1 && number <= 10) {
                break;
            }
            System.out.print("人數範圍為 1 ~ 10 ,請重新輸入 : ");
        }

        grade = new int[number];

        System.out.println("請輸入學生分數(0-100 分)");
        for (int i = 0; i < grade.length; i++) {
            System.out.printf("第 %d 位 : ", i + 1);
            grade[i] = s.nextInt();
            if (grade[i] <0 || grade[i] > 100) {
                System.out.println("分數範圍 0 ~100,請重新輸入 : ");
                i--;
                continue;
            }

            bar[grade[i] / 10]++;
        }

        System.out.println(" === 分數分布直方圖===");
        System.out.println();
        for (int i = 10; i >= 0; i--) {

            if (i == 10) {
                System.out.print("100   : ");
            } else {
                System.out.print((i * 10) + "-" + (i * 10 + 9) + " : ");
            }
            for (int j = 0; j < bar[i]; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
