package p09_DateAPI;

import java.time.Instant;

public class Test04_Instant {

    public static void main(String[] args) {
        //Instant1();        
    }

    public static void Instant1() {
        Instant instant1 = Instant.now();
        System.out.println(instant1); //2019-02-10T13:30:17.690Z
        //方法的第一個參數為秒，第二個參數為納秒，上面的代碼表示從1970-01-01 00:00:00開始後兩分鐘的10萬纳秒的時刻
        Instant instant2 = Instant.ofEpochSecond(120, 100000);
        System.out.println(instant2); //1970-01-01T00:02:00.000100Z
    }
}
