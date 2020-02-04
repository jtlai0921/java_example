package homework;

import java.util.Scanner;

public class Homework0402_旅費判斷2 {

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
            case 5:
            case 4:
                System.out.println("在美國玩！");
                break;
            case 3:
            case 2:
                System.out.println("在日本玩！");
                break;
            case 1:
                System.out.println("在台灣玩！");
                break;
            default:
                System.out.println("在歐洲玩！");
        }
    }

}
