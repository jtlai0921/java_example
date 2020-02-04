package p09_DateAPI;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Test09_DateTimeFormatter {

    public static void main(String[] args) {
        // DateTimeFormatter1();
         DateTimeFormatter2();      
    } 

    public static void DateTimeFormatter1() {
        //預定格式 FormatStyle
        LocalDateTime dateTime = LocalDateTime.now();
        String strDate5;
        DateTimeFormatter shortDateTime1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter shortDateTime3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        strDate5 = dateTime.format(shortDateTime1);
        System.out.println(strDate5); //2019/2/14
        strDate5 = dateTime.format(shortDateTime2);
        System.out.println(strDate5); //2019/2/14 下午 11:46:24
        strDate5 = dateTime.format(shortDateTime3);
        System.out.println(strDate5); //下午 11:46:24
    }

    public static void DateTimeFormatter2() {
        //自定義格式 Pattern
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f1)); // January 20, 2020, 01:12
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f2)); // 01 20, 2020, 01:12

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM DD, YY, HH:mm");
        System.out.println(dateTime.format(f3)); // January 20, 2020, 13:12
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f4)); // January 20, 2020, 01:12

        DateTimeFormatter f5 = DateTimeFormatter.ofPattern("MMMM dd, yy, hh:mm:ss");
        System.out.println(dateTime.format(f5)); // January 20, 2020, 01:12:34
        DateTimeFormatter f6 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss:SS");
        System.out.println(dateTime.format(f6)); // January 20, 2020, 01:12:00
    }  
}
