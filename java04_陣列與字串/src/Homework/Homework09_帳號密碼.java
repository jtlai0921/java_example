package Homework;

import java.util.Scanner;

public class Homework09_帳號密碼 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] account = {"apple", "banana", "orange"};
        String[] password = {"123", "456", "789"};

        String 帳號;
        String 密碼;
        boolean ok = false;

        System.out.print("輸入帳號=");
        帳號 = s.next();
        System.out.print("輸入密碼=");
        密碼 = s.next();
        for (int i = 0; i < account.length; i++) {
            if (帳號.equals(account[i]) && 密碼.equals(password[i])) {
                ok = true;
                break;
            }
        }
        //跳出迴圈後
        if (ok) {
            System.out.println("登入");
        } else {
            System.out.println("無法登入");
        }
    }

}
