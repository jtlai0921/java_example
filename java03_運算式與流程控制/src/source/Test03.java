package source;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import java.io.PrintWriter;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test03 {

    public static void 運算式() {
        //宣告
        int x = 0, y = 1, z = 2;
        //指派運算式
        x = 123;
        //算術運算式
        x = y + z; //一般運算式
        x = x + y; //累加運算式
        //算術指派運算式
        x += y;
        x += 1;
        //遞增遞減運算式
        x++;
        ++x;
        x--;
        --x;
        //比較運算式
        if (x > y) {

        }
        while (x > y) {

        }
        //邏輯運算式       
        if (x > y && y > z) {

        }
        while (x > y && y > z) {

        }
        //位元運算式       
        int a = 12 << 3;

        //三元運算子
        int c = 10 > 20 ? 100 : 200;
    }

    public static void 算術運算子() {
        //+ , - , * , / , %
        int grade1 = 89, grade2 = 99, grade3 = 92;

        double average = (grade1 + grade2 + grade3) / 3;
        //這樣小數點後一定是 0 ，因為 int/int 結果是 int
        System.out.println("三科平均 = " + average);

        average = (double) (grade1 + grade2 + grade3) / 3;
        System.out.println("三科平均 = " + average);

        average = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("三科平均 = " + average);
    }

    public static void 換錢1() {

        int money = 987;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

        m100 = money / 100;
        m50 = (money % 100) / 50;
        m10 = (money % 50) / 10;
        m5 = (money % 10) / 5;
        m1 = (money % 5) / 1;

        System.out.println("100 元 : " + m100);
        System.out.println("50 元 : " + m50);
        System.out.println("10 元 : " + m10);
        System.out.println("5 元 : " + m5);
        System.out.println("1 元 : " + m1);
    }

    public static void 算術指派運算子() {
        // += , -= , /= , %=
        int x = 4;
        short y = 0;

        y = (short) (y + x); //要轉型
        y += x;  //不用轉型
    }

//遞增遞減運算子0
    public static void 遞增遞減運算子1() {

        int a = 0, b = 0, c = 0, d = 0;

        a = a + 1;
        System.out.println("a=" + a);

        System.out.println("b=" + b);
        b = b + 1;

        c = c - 1;
        System.out.println("c=" + c);

        System.out.println("d=" + d);
        d = d - 1;
    }

    public static void 遞增遞減運算子2() {

        int a = 0, b = 0, c = 0, d = 0;

        a++;
        System.out.println("a=" + a);

        ++b;
        System.out.println("b=" + b);

        System.out.println("c=" + c++);

        System.out.println("d=" + ++d);
    }

    public static void 遞增遞減運算子3() {
        int a = 0, b = 0, c = 0, d = 0;

        int e;
        e = a++;
        System.out.println("後置遞增e=" + e + " a=" + a);
        e = ++b;
        System.out.println("前置遞增e=" + e + " b=" + b);
        e = c--;
        System.out.println("後置遞減e=" + e + " c=" + c);
        e = --d;
        System.out.println("前置遞減e=" + e + " d=" + d);
    }

    public static void 遞增遞減運算子4() {

        int i = 0, j = 0;

        System.out.println(i++ + i++ + i++);
        System.out.println(++j + ++j + ++j);

    }

    public static void 遞增遞減運算子5() {

        char[] str = {'a', 'b', 'c', 'd', 'e', 'f'};
        int length;
        length = str.length;
        int i = 0, j = length;

        do {
            // System.out.print(str[i++] + " ");
            System.out.print(str[i] + " ");
            i = i + 1;

        } while (i < length);

        System.out.println("\n================");

        do {
            // System.out.print(str[--j] + " ");
            j = j - 1;
            System.out.print(str[j] + " ");

        } while (j > 0);

        System.out.println("\n================");
    }

    public static void 比較運算子1() {
        int a = 4;
        int b = 5;

        if (a > b) {

        }
        while (a > b) {

        }
    }

    public static void 比較運算子2() {
        int a = 123;
        int b = 456;

        System.out.println("a> b =" + (a > b));
    }

    public static void 比較運算子3() {
        if (true) {
            System.out.println("條件成立");
        } else {
            System.out.println("條件不成立");
        }
    }

    public static void 比較運算子4() {
        while (true) {
            System.out.println("條件成立");
        }
    }

    public static void 邏輯運算子1() {        
        System.out.println("true && true && true || false = " + (true && true && true || false));
        System.out.println("false || false || false && true = " + (false || false || false && true));
        System.out.println("true ^ true=" + (true ^ true));
        System.out.println("true ^ false=" + (true ^ false));
        System.out.println("!true=" + (!true));
    }

    public static void 邏輯運算子2() {
        int grade = 95;

        if (grade >= 90 && grade <= 100) {
            System.out.println("優等");
        }
    }

    public static void 邏輯運算子3() {
        int a = 10, b = 10, c = 10, d = 10;

        // (== 與 != ) 的 優先權 比 ( || 跟 && ) 高
        if (a == 10 && b != 10) {

        }
        // (> 與 < ) 的 優先權 比 ( || 跟 && ) 高 , (&& 的 優先權比 || 高)
        if (a < 10 || b < 20 && c > 30) {

        }
    }

    public static void 位元運算子() {
        int a = 12;
        int b = 38;

        System.out.println(a + " & " + b + "=" + (a & b));
        System.out.println(a + " | " + b + "=" + (a | b));
        System.out.println(a + " ^ " + b + "=" + (a ^ b));
        System.out.println(a + " << " + 2 + "=" + (a << 2));
        System.out.println(a + " >> " + 2 + "=" + (a >> 2));
        System.out.println("~" + a + "=" + (~a));
    }

    public static void 兩數調換() {
        int x = 4;
        int y = 5;
        int tmp;
        System.out.println("調換前 x=" + x + "  y=" + y);
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("調換後 x=" + x + "  y=" + y);

    }

    public static void 兩數調換_位元運算1() {
        int x = 4;
        int y = 5;
        int tmp;
        System.out.println("調換前 x=" + x + "  y=" + y);
        tmp = x ^ y;
        y = tmp ^ y; //y 與 tmp 遮 會得到 原先 x 的值
        x = tmp ^ x; //x 與 tmp 遮 會得到 原先 y 的值
        System.out.println("調換後 x=" + x + "  y=" + y);
    }

    public static void 兩數調換_位元運算2() {
        int x = 4;
        int y = 5;
        System.out.println("調換前 x=" + x + "  y=" + y);
        x = x ^ y;  //x 暫時當 tmp        
        y = x ^ y;  //y 跟 tmp 遮 會得到原先 x 的值
        x = x ^ y;  //y 是原先 x 的值 跟 現在的 x 遮會 得到原先 y 的值
        System.out.println("調換後 x=" + x + "  y=" + y);
    }

    public static void 三元運算子() {

        int a = 10, b = 20, c;
        /* 
         if (a > b) {
         c = 100;
         } else {
         c = 200;
         }
         */
        c = a > b ? 100 : 200;
        System.out.println("c=" + c);
    }

    public static void if的架構1() {

        int a = 1, b = 2, c = 3, d = 4;
        //1 種情形
        if (a > b) {
        }
        //2 種情形
        if (a > b) {
        } else {
        }
        //3 種情形以上
        if (a > b) {
        } else if (b > c) {
        } else if (c > d) {
        } else {
        }
    }

    public static void if的架構2() {
        //複雜的巢狀 if
        int a = 1, b = 2, c = 3, d = 4;

        if (a > b) {

            if (b > c) {
            } else if (c > d) {
            } else {
            }

        } else if (d > a) {
        } else {
        }
    }

    public static void if_中斷() {
        int x = 3;

        if (x >= 1) {
            System.out.println("x>=1");
        } else if (x >= 2) {
            System.out.println("x>=2");
        } else if (x >= 3) {
            System.out.println("x>=3");
        } else if (x >= 4) {
            System.out.println("x>=4");
        } else if (x >= 5) {
            System.out.println("x>=5");
        }
    }

    public static void if_連續() {
        int x = 3;

        if (x >= 1) {
            System.out.println("x>=1");
        }
        if (x >= 2) {
            System.out.println("x>=2");
        }
        if (x >= 3) {
            System.out.println("x>=3");
        }
        if (x >= 4) {
            System.out.println("x>=4");
        }
        if (x >= 5) {
            System.out.println("x>=5");
        }
    }

    public static void 輸入帳號密碼1() {
        String userid, password;
        final String user = "sun2000", pass = "1234";
        Scanner s = new Scanner(System.in);

        System.out.print("輸入帳號:");
        userid = s.next();
        System.out.print("輸入密碼:");
        password = s.next();

        if (userid.equals(user) && password.equals(pass)) {
            System.out.println("Pass");
        } else {
            System.out.println("No Pass");
        }
    }

    public static void if分數等級1() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("成績：優等");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("成績：甲等");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("成績：乙等");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("成績：丙等");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("成績：丁等");
        } else {
            System.out.println("分數輸入錯誤,請檢核");
        }
    }

    public static void if分數等級2() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade >= 90) {
            System.out.println("成績：優等");
        } else if (grade >= 80) {
            System.out.println("成績：甲等");
        } else if (grade >= 70) {
            System.out.println("成績：乙等");
        } else if (grade >= 60) {
            System.out.println("成績：丙等");
        } else {
            System.out.println("成績：丁等");
        }
    }

    public static void if分數等級3() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數= ");
        grade = s.nextInt();

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("成績：優等");
            } else if (grade >= 80) {
                System.out.println("成績：甲等");
            } else if (grade >= 70) {
                System.out.println("成績：乙等");
            } else if (grade >= 60) {
                System.out.println("成績：丙等");
            } else {
                System.out.println("成績：丁等");
            }
        } else {
            System.out.println("分數輸入錯誤,請檢核");
        }
    }

    public static void if分數等級4() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("分數輸入錯誤,請檢核");
        } else if (grade >= 90) {
            System.out.println("成績：優等");
        } else if (grade >= 80) {
            System.out.println("成績：甲等");
        } else if (grade >= 70) {
            System.out.println("成績：乙等");
        } else if (grade >= 60) {
            System.out.println("成績：丙等");
        } else {
            System.out.println("成績：丁等");
        }
    }

    public static void return測試() {
        //函數
        int x = 4, y = 5;
        int sum;
        sum = return1(x, y);
        System.out.println("sum=" + sum);
        //方法       
        return2(x, y);
        System.out.println("Bye Bye");
    }

    public static int return1(int a, int b) {
        if (a == 0 && b == 0) {
            return 0; //中斷 + 回傳值
        }
        return a + b; //中斷 + 回傳值
    }

    public static void return2(int x, int y) {
        if (x == 0 && y == 0) {
            return; //中斷
        }
        System.out.println("x+y=" + (x + y));
    }

    public static void if分數等級() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();
        //檢核
        if (grade > 100 || grade < 0) {
            System.out.println("你的分數輸入錯誤");
            return;
        }
        //計算
        if (grade >= 90) {
            System.out.println("成績：優等");
        } else if (grade >= 80) {
            System.out.println("成績：甲等");
        } else if (grade >= 70) {
            System.out.println("成績：乙等");
        } else if (grade >= 60) {
            System.out.println("成績：丙等");
        } else {
            System.out.println("成績：丁等");
        }
    }

    /*
     語法 : 

     變數或運算式的型態為==>整數 , 字串 , 列舉 

     switch( 變數 或 運算式 )
     {
     case 整數常數值 或 列舉常數值 或 字串常數值 :
     //處理
     case 整數常數值 或 列舉常數值 或 字串常數值 :
     //處理
     case 整數常數值 或 列舉常數值 或 字串常數值 :
     //處理
     default :
     //處理
     }
     */
    public static void switch的架構_整數() {
        int a = 66;
        final int B = 66;

        switch (a) { //整數
            case 65:  //數值常數
                System.out.println("我是65");
            case B:   //常數的變數
                System.out.println("我是66");
            case 'C': //字元
                System.out.println("我是67");
            case 68:
            case 69:
                System.out.println("我是68 或 69");
            default:
                System.out.println("我什麼都不是");
        }
    }

    public static void switch的架構_字串() {
        String a = "abc";

        switch (a) { // 字串 
            case "XYZ":
                System.out.println("我是XYZ");
                break;
            case "ABC":
                System.out.println("我是ABC");
                break;
            case "abc":
                System.out.println("我是abc");
                break;
            default:
                System.out.println("我什麼都不是");
        }
    }

    public static void switch的架構_列舉() {
        ColorX a = ColorX.YELLOW;  //列舉變數       

        switch (a) { // 列舉
            case RED:
                System.out.println("我是RED");
                break;
            case YELLOW:
                System.out.println("我是YELLOW");
                break;
            case BLUE:
                System.out.println("我是BLUE");
                break;
            default:
                System.out.println("我什麼都不是");
        }
    }

    public static void switch分數等級() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("你的分數輸入錯誤");
            return;
        }
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("成績：優等");
                break;
            case 8:
                System.out.println("成績：甲等");
                break;
            case 7:
                System.out.println("成績：乙等");
                break;
            case 6:
                System.out.println("成績：丙等");
                break;
            default:
                System.out.println("成績：丁等");
        }
    }

    public static void switch站別() {
        String station;
        StringBuilder passStat = new StringBuilder("");
        Scanner s = new Scanner(System.in);

        System.out.print("A=台北\nB=板橋\nC=中壢\nD=新竹\n輸入起站 :");
        station = s.next();

        station = station.toUpperCase();

        switch (station) {
            case "A":
                passStat.append("台北->");
                System.out.println("台北開車");
            case "B":
                passStat.append("板橋->");
                System.out.println("板橋到了");
            case "C":
                passStat.append("中壢->");
                System.out.println("中壢到了");
            case "D":
                passStat.append("新竹");
                System.out.println("終站新竹");
                break;
            default:
                System.out.println("選項錯誤");
        }
        System.out.println("你的旅程是：\n" + passStat);
    }

    public static void switch三元運算子() {

        int cartype, money = 0, money2 = 0, money3 = 0, money4 = 0, sum = 0;
        String cdplayer, sunroof, autotrans;

        Scanner s = new Scanner(System.in);

        System.out.print("請選擇:(1)跑車 (2)轎車(豪華型) (3)轎車(經濟型) : ");
        cartype = s.nextInt();
        System.out.println();

        System.out.print("是否加裝CD音響?(y/n) : ");
        cdplayer = s.next();

        System.out.print("是否加裝天窗?(y/n) : ");
        sunroof = s.next();

        System.out.print("是否該裝成自動排檔?(y/n) : ");
        autotrans = s.next();

        switch (cartype) {
            case 1:
                money = 800000;
                break;
            case 2:
                money = 650000;
                break;
            case 3:
                money = 450000;
                break;
            default:
                System.out.println("謝謝惠顧!\n");
        }

        money2 = (cdplayer.equals("y")) ? 4000 : 0;
        money3 = (sunroof.equals("y")) ? 5000 : 0;
        money4 = (autotrans.equals("y")) ? 3000 : 0;

        sum = money + money2 + money3 + money4;
        System.out.printf("總價格為:%d\n", sum);
        System.out.println("謝謝惠顧!\n");
    }

    public static void 算術運算1() {
        int x, y;
        int sum;
        Scanner s = new Scanner(System.in);

        System.out.print("輸入數字1=");
        x = s.nextInt();
        System.out.print("輸入數字2=");
        y = s.nextInt();

        sum = 四則運算1(x, y, '+');
        System.out.println("x+y=" + sum);
        sum = 四則運算1(x, y, '-');
        System.out.println("x-y=" + sum);
        sum = 四則運算1(x, y, '*');
        System.out.println("x*y=" + sum);
        sum = 四則運算1(x, y, '/');
        System.out.println("x/y=" + sum);
        sum = 四則運算1(x, y, '#');
        System.out.println("x#y=" + sum);
    }

    public static int 四則運算1(int x, int y, char op) {

        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
            case 'X':
            case 'x':
                return x * y;
            case '/':
                return x / y;
            default:
                System.out.println("運算子錯誤");
                return 0;
        }
    }

    public static void 算術運算2() {
        int x, y;
        int sum;
        Scanner s = new Scanner(System.in);

        System.out.print("輸入數字1=");
        x = s.nextInt();
        System.out.print("輸入數字2=");
        y = s.nextInt();

        sum = 四則運算2(x, y, Count.加);
        System.out.println("x+y=" + sum);
        sum = 四則運算2(x, y, Count.減);
        System.out.println("x-y=" + sum);
        sum = 四則運算2(x, y, Count.乘);
        System.out.println("x*y=" + sum);
        sum = 四則運算2(x, y, Count.除);
        System.out.println("x/y=" + sum);
    }

    public static int 四則運算2(int x, int y, Count op) {

        switch (op) {
            case 加:
                return x + y;
            case 減:
                return x - y;
            case 乘:
                return x * y;
            case 除:
                return x / y;
            default:
                return 0;
        }
    }

    public static void switch_中斷() {
        int x = 3;
        switch (x) {
            default:
                System.out.println("x>=6");
                break;
            case 5:
                System.out.println("x>=5");
                break;
            case 4:
                System.out.println("x>=4");
                break;
            case 3:
                System.out.println("x>=3");
                break;
            case 2:
                System.out.println("x>=2");
                break;
            case 1:
                System.out.println("x>=1");
                break;
        }
    }

    public static void switch_連續() {
        int x = 3;
        switch (x) {
            default:
                System.out.println("x>=6");
            case 5:
                System.out.println("x>=5");
            case 4:
                System.out.println("x>=4");
            case 3:
                System.out.println("x>=3");
            case 2:
                System.out.println("x>=2");
            case 1:
                System.out.println("x>=1");
        }
    }

    public static void 單層迴圈1() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("for 我愛你" + i + "次");
        }
        //-------------------------
        i = 1;
        while (i <= 10) {
            System.out.println("while 我愛你" + i + "次");
            i++;
        }
        //-------------------------
        i = 1;
        do {
            System.out.println("do while 我愛你" + i + "次");
            i++;
        } while (i <= 10);
    }

    public static void 單層迴圈2() {
        int i;
        for (i = 10; i >= 1; i--) {
            System.out.println("for 我愛你" + i + "次");
        } //-------------------------
        i = 10;
        while (i >= 1) {
            System.out.println("while 我愛你" + i + "次");
            i--;
        }
        //-------------------------
        i = 10;
        do {
            System.out.println("do while 我愛你" + i + "次");
            i--;
        } while (i >= 1);
    }

    public static void 單層迴圈3() {
        int i;
        int sum = 0; //必須 init

        for (i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("for  i=" + i + "     sum = " + sum);
        }
        //-------------------------
        sum = 0;
        i = 1;
        while (i <= 10) {
            sum = sum + i;
            System.out.println("while  i=" + i + "     sum = " + sum);
            i++;
        }
        //-------------------------
        sum = 0;
        i = 1;
        do {
            sum = sum + i;
            System.out.println("do while  i=" + i + "     sum = " + sum);
            i++;
        } while (i <= 10);
    }

    public static void 雙層迴圈1() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(" i=" + i + " j=" + j);
            }

            System.out.println();
        }
    }

    public static void 雙層迴圈2() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("我愛你");
            for (int j = 1; j <= 3; j++) {
                System.out.print("我恨你");
            }
            System.out.println();
        }
    }

    public static void 雙層迴圈3() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" i=" + i + " j=");

            for (int j = 1; j <= 10; j++) {

                if (j < 10) {
                    System.out.print(j + " , ");
                } else {
                    System.out.print(j);
                }
                // System.out.print(j < 10 ? j + " , " : j);
            }
            System.out.println();
        }
    }

    public static void 九九乘法1() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
                if (i * j < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void 九九乘法2() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void 寫檔案() {
        try {
            FileWriter fw = new FileWriter("file1.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("AAA");
            pw.println("BBB");

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 讀檔案() {
        try {
            FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 讀檔案_擋頭() {
        try {
            FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                //以 utf-8編碼, 列頭第一個字是 Byte Order Mark (BOM)
                data = data.replace("\uFEFF", "");
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 寫檔案_九九乘法() {
        try {
            FileWriter fw = new FileWriter("九九乘法表.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    pw.printf("%d*%d=%2d ", i, j, i * j);
                }
                pw.println();
            }
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 讀檔案_九九乘法() {
        try {
            FileReader fr = new FileReader("九九乘法表.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
        }
    }

    public static void break1() {

        for (int i = 1; i <= 10; i++) {
            if (i > 6) {
                break;
            }
            System.out.print(i + " ");
        }
    }

    public static void break2() {

        AA:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j > 5) {
                    break AA; //加上標記一次可跳兩個迴圈
                }
                System.out.print(j + " ");
            }
        }
    }

    public static void continue1() {
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void 分數等級_迴圈() {
        int grade;
        Scanner s = new Scanner(System.in);
        String ans = "Y";
        do {
            System.out.print("請輸入分數 = ");
            grade = s.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("你的分數 輸入錯誤");
                continue;
            }
            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println("成績：優等");
                    break;
                case 8:
                    System.out.println("成績：甲等");
                    break;
                case 7:
                    System.out.println("成績：乙等");
                    break;
                case 6:
                    System.out.println("成績：丙等");
                    break;
                default:
                    System.out.println("成績：丁等");
            }
            System.out.print("繼續嗎：<Y/N>");
            ans = s.next();
        } while (ans.equals("Y") || ans.equals("y"));
    }

    public static void 輸入帳號密碼2() {
        String str1 = null;

        boolean ok = false;
        final String password = "ymca";

        Scanner s1 = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("請輸入密碼 : ");
            str1 = s1.next();

            if (str1.equals(password)) {
                ok = true;
                break;
            }

            System.out.println("密碼錯誤,無法進入");
            System.out.println();
        }
        if (ok) {
            System.out.println("Login成功,歡迎進入");
        } else {
            System.out.println("非法進入");
        }
    }

    public static void 換錢2() {

        Scanner s = new Scanner(System.in);
        int money;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

//        System.out.print("Input money ( < 1000 ) : ");
//        money = s.nextInt();
//        while (money >= 1000) {
//            System.out.println("money eror");
//            System.out.print("Input money ( < 1000 ) : ");
//            money = s.nextInt();
//        }                 
        while (true) {
            System.out.printf("Input money ( < 1000 ) : ");
            money = s.nextInt();

            if (money < 1000) {
                break;
            }
            System.out.println("Error , mony >=1000");
        }

        for (; money >= 100; money -= 100, m100++);
        for (; money >= 50; money -= 50, m50++);
        for (; money >= 10; money -= 10, m10++);
        for (; money >= 5; money -= 5, m5++);
        for (; money >= 1; money -= 1, m1++);

        System.out.println("100 元 : " + m100);
        System.out.println("50 元 : " + m50);
        System.out.println("10 元 : " + m10);
        System.out.println("5 元 : " + m5);
        System.out.println("1 元 : " + m1);
    }

    public static void 亂數() {
        //亂數種子的值 會分佈在 >=0  and <1 之間 

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
    }
    
  
}
