package source;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Test09 {

//ArithmeticException
    public static void 除以0的例外() {
        int a, b;
        b = 0;
        System.out.println("AA");
        a = 10 / b;
        System.out.println("BB");
    }

    //ArrayIndexOutOfBoundsException
    public static void 超出陣列索引的例外() {
        System.out.println("AA");
        int[] a = new int[5];
        a[10] = 100;
        System.out.println("BB");
    }

    //StringIndexOutOfBoundsException
    public static void 超出字串索引的例外() {
        System.out.println("AA");
        String a = "abcdef";
        char b = a.charAt(7);
        System.out.println(b);
        System.out.println("BB");
    }

//NullPointerException
    public static void 空指標的例外() {
        System.out.println("AA");
        Human1 人1 = null;
        人1.名字 = "賴玉珊";
        System.out.println("BB");
    }

//NumberFormatException
    public static void 格式錯的例外() {
        int x;
        System.out.println("AA");
        x = Integer.parseInt("ABC");
        System.out.println(x);
    }

//ClassCastException
    public static void 多型的例外() {
        動物 ani = new 狗();
        貓 cat;
        cat = (貓) ani;
    }
////////////////////////////////////////////////////////////////////////////

    public static void 處理例外的語法() {
//        try { //不能只有一個 try 區塊
//
//        }
        //////////////////
        try {

        } catch (ArithmeticException e) {

        }
        //////////////////
        try {

        } finally {

        }
        ///////////////////
        try {

        } catch (ArithmeticException e) {

        } catch (NumberFormatException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } finally {

        }
    }

///////////////////////////////////////////////////////////////////////////
    public static void 呼叫除以0的例外_自行處理() {
        除以0的例外_自行處理();
    }

    public static void 除以0的例外_自行處理() {
        int a, b;

        try {
            b = 0;
            System.out.println("AA");
            a = 10 / b;  //當
            System.out.println("cc");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("一定會做");
        }
        System.out.println("BB");
    }

///////////////////////////////////////////////////////////////////////////
    
    public static void 呼叫除以0的例外_丟出去1() {
        try {
            除以0的例外_丟出去1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }finally{
            System.out.println("一定會做");
        }
    }
    public static void 除以0的例外_丟出去1() throws ArithmeticException {
        int a, b;
        b = 0;
        System.out.println("AA");
        a = 10 / b; //當
        System.out.println("BB");
    }
    
///////////////////////////////////////////////////////////////////////////

    public static void 呼叫除以0的例外_丟出去2() {
        try {
            除以0的例外_丟出去2();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }finally{
            System.out.println("一定會做");
        }
    }
    public static void 除以0的例外_丟出去2() throws ArithmeticException {
        int a, b;

        try {
            b = 0;
            System.out.println("AA");
            a = 10 / b;
        } finally {
            System.out.println("close");
        }
        System.out.println("BB"); //當掉了 , 不會做到
    }
///////////////////////////////////////////////////////////////////////////

    public static void checked的例外1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void checked的例外2() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);
            Thread.sleep(2000);
        }
    }

    public static void unchecked的例外() {
        int x;
        System.out.println("AA");
        x = Integer.parseInt("ABC");
        System.out.println(x);
    }

////////////////////////////////////////////////////////////////////////////////
    public static void 系統引發1() { //unchecked
        int a = 10;
        int b = 0;
        int c;
        c = a / b;
    }

    public static void 使用者引發1() { //unchecked
        throw new ArithmeticException();
    }

    public static void 系統引發2() throws FileNotFoundException { //checked
        PrintWriter file = new PrintWriter("c://file.txt");
    }

    public static void 使用者引發2() throws FileNotFoundException { //checked
        throw new FileNotFoundException();
    }

    public static void 使用者引發3() { //unchecked
        throw new MyDefClass1();
    }

    public static void 使用者引發4() { //checked
        try {
            throw new MyDefClass2();
        } catch (MyDefClass2 e) {
            System.out.println(e);
        }
    }

    public static void 使用者引發5() throws MyDefClass2 { //checked
        throw new MyDefClass2();
    }

//////////////////////////////////////////////////////////////////////////////
    public static void 自行處理的例外1() {
        try {
            throw new ArithmeticException(); //有補捉到 unchecked
            // throw new NumberFormatException();  //會當掉
            //throw new IOException();  // checked 一定要處理到
        } catch (ArithmeticException e) {
            System.out.println("除以0的例外發生");
            // return;
            //System.exit(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("超出索引的例外發生");
        } catch (NullPointerException e) {
            System.out.println("沒有指標的例外發生");
        } catch (ClassCastException e) {
            System.out.println("多形轉換的例外發生");
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
        System.out.println("我是正常的程式碼");
    }

    public static void 自行處理的例外2_多重捕捉() { // 7.0 版語法
        try {
            throw new ArithmeticException();
            // throw new NumberFormatException();  
            //throw new IOException();           
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | ClassCastException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
        System.out.println("我是正常的程式碼");
    }

    public static void 自行處理的例外3() {
        try {
            //throw new ArithmeticException(); 
            throw new NumberFormatException();
            //throw new IOException();  
        } catch (ArithmeticException e) {
            System.out.println("除以0的例外發生");
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
        System.out.println("我是正常的程式碼");
    }

    //多重捕捉 不可以有繼承關係
    public static void 自行處理的例外4() {
//        try {
//            //throw new ArithmeticException(); 
//            throw new NumberFormatException();
//            //throw new IOException();
//        } catch (ArithmeticException | RuntimeException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("這裡是一定會做的區塊");
//        }
//        System.out.println("我是正常的程式碼");
    }

    ///////////////////////////////////////////////////////////////////////////
    public static void 系統API丟出的例外() {

        int x = 120, divisor, y;
        try {
            divisor = Integer.parseInt(JOptionPane.showInputDialog("請輸入一個int值:"));
            y = x / divisor;
            System.out.println("y=" + y);
        } catch (NumberFormatException e) {
            System.out.println("錯誤:" + e.getMessage() + ";未填寫適當的除數!");
        } catch (ArithmeticException e) {
            System.out.println("錯誤:" + e.getMessage());
        }
        System.out.println("Bye Bye !");
        System.exit(0);
    }

///////////////////////////////////////////////////////////////////////////
    public static void unchecked丟出例外處理() {
        abc1();
    }

    public static void abc1() throws MyDefClass1 {

        throw new MyDefClass1(); //unchecked
    }

    public static void checked丟出例外處理() {
        try {
            abc2();
        } catch (MyDefClass2 e) {
            System.out.println(e);
        }
    }

    public static void abc2() throws MyDefClass2 {

        throw new MyDefClass2(); //checked
    }

////////////////////////////////////////////////////////////////////////////////
    public static void 同一段兩個例外_unchecked1() {
        try {
            呼叫同一段兩個例外_unchecked1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
        System.out.println("我是正常的程式碼");
    }

    public static void 呼叫同一段兩個例外_unchecked1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if ("a".equals("b")) {
            throw new ArithmeticException();
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

////////////////////////////////////////////////////////////////////////////////
    public static void 同一段兩個例外_checked1() {
        try {
            呼叫同一段兩個例外_checked1();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (EOFException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
        System.out.println("我是正常的程式碼");
    }

    public static void 呼叫同一段兩個例外_checked1() throws FileNotFoundException, EOFException {
        if ("a".equals("b")) {
            throw new FileNotFoundException();
        } else {
            throw new EOFException();
        }
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 不同段兩個例外_unchecked1() {

        try {
            呼叫不同段兩個例外_unchecked1();
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊2");
        }
        System.out.println("我是正常的程式碼2");
    }

    public static void 呼叫不同段兩個例外_unchecked1() throws NullPointerException {
        try {
            throw new ArithmeticException();

        } catch (ArithmeticException e) {
            System.out.println(e);
            throw new NullPointerException();

        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊1");
        }
        System.out.println("我是正常的程式碼1");
    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void 不同段兩個例外_unchecked2() {
        呼叫不同段兩個例外_unchecked2();
        System.out.println("我是正常的程式碼2");
    }

    public static void 呼叫不同段兩個例外_unchecked2() {
        try {
            throw new ArithmeticException();

        } catch (ArithmeticException e) {
            System.out.println(e);
            try {
                throw new NullPointerException();

            } catch (NullPointerException f) {
                System.out.println(f);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊1");
        }
        System.out.println("我是正常的程式碼1");
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 不同段兩個例外_checked1() {
        try {
            呼叫不同段兩個例外_checked1();

        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊2");
        }
        System.out.println("我是正常的程式碼2");
    }

    public static void 呼叫不同段兩個例外_checked1() throws InterruptedException {
        try {
            throw new IOException();

        } catch (IOException e) {
            System.out.println(e);
            throw new InterruptedException();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊1");
        }
        System.out.println("我是正常的程式碼1");
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 不同段兩個例外_checked2() {
        呼叫不同段兩個例外_checked2();
        System.out.println("我是正常的程式碼2");
    }

    public static void 呼叫不同段兩個例外_checked2() {
        try {
            throw new IOException();

        } catch (IOException e) {
            System.out.println(e);

            try {
                throw new InterruptedException();

            } catch (InterruptedException f) {
                System.out.println(f);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊1");
        }
        System.out.println("我是正常的程式碼1");
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 呼叫自訂的例外類別_自行處理() {
        自訂的例外類別_自行處理();
    }

    public static void 自訂的例外類別_自行處理() {
        try {
            throw new MyDefClass2("b 不可以=0");
        } catch (MyDefClass2 e) {
            System.out.println(e.getMessage());
        }
        System.out.println("我是正常的程式碼");
    }

    public static void 呼叫自訂的例外類別_丟出去() {
        try {
            自訂的例外類別_丟出去();
        } catch (MyDefClass2 e) {
            System.out.println(e.getMessage());
        }
    }

    public static void 自訂的例外類別_丟出去() throws MyDefClass2 {
        throw new MyDefClass2("b 不可以=0");
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 呼叫sumxy() {
        try {
            sumxy(12, 3);
        } catch (MyDefClass2 e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sumxy(int x, int y) throws MyDefClass2 {
        int sum = 0;
        sum = x + y;
        if (sum > 10) {
            throw new MyDefClass2("兩數相加不能大於10");
        }
        System.out.println("sum=" + sum);
    }

////////////////////////////////////////////////////////////////////////////////
    public static void 例外的類別名稱範圍要由小到大1() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("沒有指標的例外發生");
        } catch (Exception e) {
            System.out.println("AAAAAA");
        } catch (Throwable e) {
            System.out.println("BBBBBB");
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
    }

    public static void 例外的類別名稱範圍要由小到大2() {
//        try {
//           throw new NullPointerException();
//        } catch (Throwable e) {
//            System.out.println("BBBBBB");
//        } catch (Exception e) {
//            System.out.println("AAAAAA");
//        } catch (NullPointerException e) {
//            System.out.println("沒有指標的例外發生");
//        } finally {
//            System.out.println("這裡是一定會做的區塊");
//        }
    }
///////////////////////////////////////////////////////////////////////////////

    public static void 含蓋例外1() {
        try {
            throw new InterruptedException();
        } catch (Exception e) {
            System.out.println(e);
        } catch (Throwable e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
    }

    public static void 含蓋例外2() {
        try {
            含蓋例外引發2();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("這裡是一定會做的區塊");
        }
    }

    public static void 含蓋例外引發2() throws InterruptedException {
        throw new InterruptedException();
    }

///////////////////////////////////////////////////////////////////////////////
    //Compiler階段會認為 a 是 ExceptionDemo2P的型態
    public void 多型的例外處理1() {
        ExceptionDemo2P a = new ExceptionDemo2C();
        //a.abc();
    }

    public void 多型的例外處理2() {
        ExceptionDemo2P a = new ExceptionDemo2C();
        try {
            a.abc();
        } catch (ExcpA e) {
        }
    }

    public void 多型的例外處理3() throws ExcpA {
        ExceptionDemo2P a = new ExceptionDemo2C();
        a.abc();
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 處理例外訊息的方法() {
        try {
            InputStream f = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("===toString()===");
            System.err.println(e.toString());  //自動幫我們呼叫 toString()這個方法

            System.out.println("===getLocalizedMessage()===");
            System.err.println(e.getLocalizedMessage());
            System.out.println("===getMessage()===");
            System.err.println(e.getMessage());

            System.out.println("===printStackTrace()===");
            e.printStackTrace(); //像自然引發 , 會有引發的行數
        }
    }
}
