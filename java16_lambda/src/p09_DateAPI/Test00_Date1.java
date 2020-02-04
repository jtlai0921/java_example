package p09_DateAPI;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Test00_Date1 {

    public static void main(String[] args) {

//        Date方法1();
        Date方法2();
//      Date方法3();
//        Date_加1小時();
//        Calendar_加1小時();

//        Calendar計算();
//        DateFormat方法();
//        Locale方法();
    }

    public static void Date方法1() {
        Date now = new Date(1000000000000L);  //1970/1/1
        System.out.println("now date " + now.toString()); //now date Sun Sep 09 09:46:40 CST 2001
        // 1000=1秒
    }

    public static void Date方法2() {
        //January 1, 1970 00:00:00 GMT.
        Date date = new Date(1000);
        System.out.println(date); //Thu Jan 01 08:00:01 CST 1970 時間多 8 小時 因為位於 東 8 時區
    }

    public static void Date方法3() {
        Date now = new Date();  //1970/1/1
        System.out.println("now date " + now.toString()); //now date Sat Oct 26 21:40:34 CST 2019
        // 1000=1秒
    }

    public static void Date_加1小時() {
        Date now = new Date();
        System.out.println("今天是 : " + now.toString());  //今天是 : Thu Feb 09 11:35:19 CST 2017

        now.setTime(now.getTime() + 3600000); // 3600000 millis / hour
        System.out.println("加 1個小時 是 " + now.toString());  //加 1個小時 是 Thu Feb 09 12:35:19 CST 2017
    }

    public static void Calendar_加1小時() {

        Date now1 = new Date();
        System.out.println("今天是 :" + now1.toString()); //今天是 :Thu Feb 09 11:33:47 CST 2017
        Calendar c = Calendar.getInstance();
        c.setTime(now1);
        c.add(Calendar.HOUR, 1);
        Date now2 = c.getTime();
        System.out.println("加 1個小時 是 : " + now2.toString()); //加 1個小時 是 : Thu Feb 09 12:33:47 CST 2017
    } 

    public static void Calendar計算() {
        Date now1 = new Date();
        Date now2;
        System.out.println("今天是 :" + now1.toString()); //今天是 :Thu Feb 09 11:32:24 CST 2017
        Calendar c = Calendar.getInstance();

        c.setTime(now1);
        c.add(Calendar.YEAR, 2);
        now2 = c.getTime();
        System.out.println("加 2 年 新日期是 : " + now2.toString()); //加 2 年 新日期是 : Sat Feb 09 11:32:24 CST 2019

        c.setTime(now1);
        c.add(Calendar.MONTH, 1);
        now2 = c.getTime();
        System.out.println("加1個月後新日期是 : " + now2.toString()); //加1個月後新日期是 : Thu Mar 09 11:32:24 CST 2017  

        c.setTime(now1);
        c.add(Calendar.HOUR, -4);
        now2 = c.getTime();
        System.out.println("減 4 小時 新日期是 : " + now2.toString()); //減 4 小時 新日期是 : Thu Feb 09 07:32:24 CST 2017
    }

    public static void DateFormat方法() {
        Date now = new Date();
        DateFormat[] dfa = new DateFormat[7];

        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
        dfa[6] = DateFormat.getDateInstance(DateFormat.DEFAULT);
        for (DateFormat df : dfa) {
            System.out.println(df.format(now));
        }
    }

    public static void Locale方法() {

        Calendar c = Calendar.getInstance();
        c.set(2011, 9, 15); // Sat Oct 15 09:30:30 CST 2011 // (month is 0-based)
        Date d2 = c.getTime();
        System.out.println(d2);
        Locale locIT = new Locale("it", "IT"); // Italy
        Locale locPT = new Locale("pt"); // Portugal
        Locale locBR = new Locale("pt", "BR"); // Brazil
        Locale locIN = new Locale("hi", "IN"); // India
        Locale locJA = new Locale("ja"); // Japan
        Locale locZH = new Locale("zh", "TW"); // Taiwan

        DateFormat dfUS = DateFormat.getInstance();
        System.out.println("US " + dfUS.format(d2)); //US 2010/12/14 上午 10:59
        DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("US full " + dfUSfull.format(d2));  //US full 2010年12月14日 星期二
        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
        System.out.println("Italy " + dfIT.format(d2)); //Italy marted? 14 dicembre 2010
        DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
        System.out.println("Portugal " + dfPT.format(d2)); //Portugal Ter?a-feira, 14 de Dezembro de 2010
        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        System.out.println("Brazil " + dfBR.format(d2)); //Brazil Ter?a-feira, 14 de Dezembro de 2010
        DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        System.out.println("India " + dfIN.format(d2)); //India शनिवार, १५ अक्‍तूबर, २०११
        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
        System.out.println("Japan " + dfJA.format(d2)); //Japan 2010年12月14日
        DateFormat dfZH = DateFormat.getDateInstance(DateFormat.FULL, locZH);
        System.out.println("Taiwan " + dfZH.format(d2)); //Taiwan 2010年12月14日 星期二
        DateFormat dfKA = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
        System.out.println("Korea " + dfKA.format(d2)); //Korea 2011년 10월 15일 토요일
        DateFormat dfDA = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
        System.out.println("Default " + dfDA.format(d2)); //Default 2011年10月15日 星期六
    }
}
