package Homework;

import java.util.Scanner;

public class Homework03_統計字元 {

    public static void main(String[] args) {
        String str;
        Scanner s1 = new Scanner(System.in);
        char[] var;
        int n1 = 0, n2 = 0, n3 = 0;
        System.out.print("輸入字串 = ");
        str = s1.next();
        var = str.toCharArray();

        for (int i = 0; i < var.length; i++) {

            if (var[i] >= '0' && var[i] <= '9') {
                n1++;
            }
            if (var[i] >= 'a' && var[i] <= 'z') {
                n2++;
            }
            if (var[i] >= 'A' && var[i] <= 'Z') {
                n3++;
            }
        }
        System.out.println("數字=" + n1 + " 個");
        System.out.println("小寫字母=" + n2 + " 個");
        System.out.println("大寫字母=" + n3 + " 個");
    }

}
