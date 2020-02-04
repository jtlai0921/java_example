package homework;

import java.util.Scanner;

public class Homework09_猜數字遊戲 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int ran, input = 0, n = 0, x = 1, y = 100;

        ran = (int) (Math.random() * 100) + 1;
        System.out.println("取到的亂數是 " + ran);

        do {

            if (n == 5) {
                System.out.println("-- 歹勢 , 已經五次 , 挑戰失敗--");
                break;
            }

            System.out.print(x + "-" + y + "=>");
            input = s1.nextInt();

            if (input < x || input > y) {
                System.out.println("不在" + x + "-" + y + "範圍內 , 請重新輸入");
                continue;
            }
            if (input > ran) {
                System.out.println("太大");
                y = input;
            }
            if (input < ran) {
                System.out.println("太小");
                x = input;
            }
            n++;

        } while (ran != input);

        if (ran == input) {
            System.out.println("你猜對了");
            System.out.println("你猜了" + n + "次");
        }
    }

}
