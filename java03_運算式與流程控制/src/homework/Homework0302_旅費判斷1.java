package homework;

import java.util.Scanner;

public class Homework0302_旅費判斷1 {

    public static void main(String[] args) {
        int money;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入旅費 :");
        money = s.nextInt();

        if (money < 10000) {
            System.out.println("旅費輸入錯誤！");
            return;
        }

        if (money >= 60000) {
            System.out.println("在歐洲玩！");
        } else if (money >= 40000) {
            System.out.println("在美國玩！");
        } else if (money >= 20000) {
            System.out.println("在日本玩！");
        } else if (money >= 10000) {
            System.out.println("在台灣玩！");
        }
    }

}
