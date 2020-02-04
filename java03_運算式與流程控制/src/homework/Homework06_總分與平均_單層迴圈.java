package homework;


import java.util.Scanner;

public class Homework06_總分與平均_單層迴圈 {

    public static void main(String[] args) {
        int grade;
        int total = 0;
        double average;

        Scanner s = new Scanner(System.in);

        for (int j = 1; j <= 3; j++) {

            System.out.print("分數" + j + " : ");
            grade = s.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("分數錯誤 (應 >=0 and <= 100 )-請重新輸入");
                j--;
                continue;
            }

            total = total + grade;
        }
        average = (double) total / 3;
        System.out.println(" 總分=" + total + " 平均=" + average);
    }

}
