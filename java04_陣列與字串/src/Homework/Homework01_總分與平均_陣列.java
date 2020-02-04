package Homework;

import java.util.Scanner;

public class Homework01_總分與平均_陣列 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] name = {"甲同學", "乙同學", "丙同學"};
        double[][] grade = new double[3][3];
        double[] total = new double[3];
        double[] average = new double[3];

        for (int i = 0; i < grade.length; i++) {
            System.out.println("第" + (i + 1) + "人");
            for (int j = 0; j < grade[i].length; j++) {
                System.out.print("-------第" + (j + 1) + "科=");
                grade[i][j] = s.nextInt();
                total[i] = total[i] + grade[i][j];
            }
        }
        for (int i = 0; i < grade.length; i++) {
            average[i] = (double) total[i] / grade[i].length;
            System.out.println(name[i] + " 總分= " + total[i] + " 平均= " + average[i]);
        }
    }

}
