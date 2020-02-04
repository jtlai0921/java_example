package source;

public class AssertionDemo4 {

    final int MALE = 1;
    final int FEMALE = 2;

    private int getDays(int year, int month) {
        assert (month >= 1) && (month <= 12) : month;
        int day = 0;
        //
        //計算某年某月有幾天
        //
        assert (day >= 28) && (month <= 31) : day;
        return day;
    }

    public void f(int x) {
        if ((x % 2) == 0) {
            System.out.println("even");
            return;
        } else if ((x % 2) == 1) {
            System.out.println("odd");
            return;
        }
        assert false : "我斷言 程式不會跑到這裡來";
    }

    public void g(int x) {
        switch (x) {
            case MALE:
                //.....
                break;

            case FEMALE:
                //.....
                break;

            default:
                assert false :
                        "我斷言 x 若不是 MALE，就一定是 FEMALE。" + x;
        }
        //......
    }

    public void h(int x) {
        if (x > 0) {
            //......
        } else {
            assert (x < 0) : "我斷言 x 一定小於 0。" + x;
            //......
        }
        //......
    }
}
