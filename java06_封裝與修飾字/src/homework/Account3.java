package homework;

import java.util.Scanner;

public class Account3 {

    private String 帳號;    //  存放帳號
    private int 存款餘額;   //  存簿餘額
    private final String password = "sun2000";

    public boolean 密碼驗證() {

        Scanner s = new Scanner(System.in);
        String pass;

        for (int i = 1; i <= 3; i++) {
            System.out.print("輸入密碼 : ");
            pass = s.next();
            if (檢查密碼(pass)) {
                return true;
            } else {
                System.out.println(" 密碼錯誤,請重新輸入" + i + "次");
            }
        }
        return false;
    }

    private boolean 檢查密碼(String pass) {
        if (pass.equals(password)) {
            return true;
        }
        return false;
    }

    public void 銀行作業() {

        Scanner s = new Scanner(System.in);
        int input;
        String mark;  //提錢 , 存錢 , 轉帳 註記
        int cash; //提錢 , 存錢 , 轉帳 金額
        AA:
        while (true) {
            System.out.print("請問要 :  1.存錢 2.領錢 3.轉帳 4.其它. 離開 : ");
            input = s.nextInt();
            switch (input) {
                case 1:
                    mark = " 存入 ";
                    break;
                case 2:
                    mark = " 領出 ";
                    break;
                case 3:
                    mark = " 轉帳 ";
                    break;
                default:
                    break AA;
            }

            System.out.print("請輸入" + mark + " 金額 : ");
            cash = s.nextInt();
            System.out.println(mark + cash + " 元後");

            switch (input) {
                case 1:
                    存款(cash);
                    break;
                case 2:
                    提款(cash);
                    break;
                case 3:
                    轉帳(cash);
                    break;
                default:
                    break AA;
            }
        }
    }

    public void 存款(int 存款) { // 存款
        if (檢核存款(存款)) {
            存款餘額 += 存款;
            秀金額();
        } else {
            System.out.println("存款失敗--不能超過5萬元");
            System.out.println("============================================");
        }
    }

    public void 提款(int 提款) { // 提款

        if (檢核提款(提款)) {
            存款餘額 -= 提款;
            秀金額();
        } else {
            System.out.println("提款失敗--餘額不足");
            System.out.println("============================================");
        }
    }

    public void 轉帳(int 轉帳) { // 轉帳

        if (檢核提款(轉帳)) {
            存款餘額 -= 轉帳;
            秀金額();
        } else {
            System.out.println("轉帳失敗--餘額不足");
            System.out.println("============================================");
        }
    }

    private boolean 檢核存款(int 存款) {
        if (存款 > 50000) {
            return false;
        }
        return true;
    }

    private boolean 檢核提款(int 提款) {
        if (提款 > 存款餘額) {
            return false;
        }
        return true;
    }

    public void 設定資料(String id, int money) {// 設定資料

        帳號 = id;
        存款餘額 = money;
        秀金額();
    }

    public void 秀金額() { //  顯示餘額

        System.out.println(" 帳號 : " + 帳號);
        System.out.println(" 餘額 : " + 存款餘額);
        System.out.println("============================================");
    }
}
