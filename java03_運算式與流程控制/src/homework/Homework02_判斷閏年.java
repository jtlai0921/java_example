package homework;

import java.util.Scanner;

public class Homework02_判斷閏年 {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int year;

        System.out.print("輸入年度 =");
        year = s.nextInt();

        if (  ( year % 4 == 0 && year % 100 != 0  )     ||     year % 400 == 0   ) {
            System.out.println("閏年");
        } else {
            System.out.println("平年");
        }
    }

}
