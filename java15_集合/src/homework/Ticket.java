package homework;

public class Ticket {

    private final int original; //車票有幾張
    private int current; //車票目前剩下幾張
    private final Destation destation; //目的地

    public Ticket(int nums, Destation where) {
        current = original = nums;
        destation = where;
    }

    public int degress() {
        return --current;
    }

    public boolean soldout() {
        return current <= 0;
    }

    public Destation getDestation() {
        return destation;
    }

    public int getoriginal() {
        return original;
    }

    public int getCurrent() {
        return current;
    }
}
