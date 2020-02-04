package p09_DateAPI;

import java.time.LocalTime;

public class Test02_LocalTime {

    public static void main(String[] args) {
        LocalTime1();
    }

    public static void LocalTime1() {
        LocalTime localTime = LocalTime.of(17, 23, 52);// 初始化一個時間：17:23:52
        System.out.println("hour=" + localTime.getHour()); // 時：17
        System.out.println("minute =" + localTime.getMinute());// 分：23
        System.out.println("second =" + localTime.getSecond()); // 秒：52
    }
}
