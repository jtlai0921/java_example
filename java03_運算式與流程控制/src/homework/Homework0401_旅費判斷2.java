package homework;

import java.util.Scanner;


public class Homework0401_旅費判斷2 {

    public static void main(String[] args) {
         int money;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入旅費 :");
        money = s.nextInt();

        if (money < 10000) {
            System.out.println("旅費輸入錯誤！");
            return;
        }

        switch (money / 10000) {
            default:
                System.out.println("在歐洲玩！");
            case 5:
            case 4:
                System.out.println("在美國玩！");
            case 3:
            case 2:
                System.out.println("在日本玩！");
            case 1:
                System.out.println("在台灣玩！");
        }
    }

}
