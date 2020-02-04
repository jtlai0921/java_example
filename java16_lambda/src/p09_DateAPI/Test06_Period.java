package p09_DateAPI;

import java.time.LocalDate;
import java.time.Period;

public class Test06_Period {

    public static void main(String[] args) {
        // Period1();
         Period2();
    }
  public static void Period1() {
        //Period在概念上和Duration類似，區别在於Period是以年月日來衡量一個時間段，比如2年3個月6天
        Period period = Period.of(2, 3, 6);
        System.out.println(period); //P2Y3M6D
    }

    public static void Period2() {
        // 2017-01-05 到 2017-02-05 這段時間
        Period period = Period.between( LocalDate.of(2017, 1, 5), LocalDate.of(2017, 2, 5));
        System.out.println(period); //P1M
    }
}
