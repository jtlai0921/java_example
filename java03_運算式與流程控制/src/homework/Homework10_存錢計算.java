package homework;

public class Homework10_存錢計算 {

    //存到100元
    public static void main(String[] args) {
        int sum = 100;
        double db = 2.5;
        int day = 1;
        double dsum = 0;

        while (true) {
            dsum = dsum + db;
            if (day % 5 == 0) {
                dsum = dsum - 6;
                System.out.println("第" + day + "天花去 6 元 , 還剩 " + dsum + "元 ! ");
            }
            if (dsum >= sum) {
                System.out.println("要經過連續儲存 " + day + "天 , 才能存上 100 元 ! ");
                break;
            } else {
                day++;
            }
        }
    }

}
