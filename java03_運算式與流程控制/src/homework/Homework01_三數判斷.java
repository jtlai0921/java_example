package homework;

import java.util.Scanner;

public class Homework01_三數判斷 {

    public static void main(String[] args) {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入三個數字 :");
        System.out.print("數字1 : ");
        x = s.nextInt();
        System.out.print("數字2 : ");
        y = s.nextInt();
        System.out.print("數字3 : ");
        z = s.nextInt();

        if (x == y && y == z) {
            System.out.println("三值相等");
        } else if (x == y || y == z || z == x) {
            System.out.println("兩值相等");
        } else {
            System.out.println("三值不相等");
        }
    }

}
