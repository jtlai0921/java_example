package source;

public class OverDemo5 {

    public int x;

    public OverDemo5(int x) {
        this.x = x;
    }

    public int sum(OverDemo5 obj) {
        return this.x + obj.x;
    }

    public boolean compareto(OverDemo5 obj) {
        if (this.x == obj.x) {
            return true;
        }
        return false;
    }

    public int compare(OverDemo5 obj1, OverDemo5 obj2) {
        if (obj1.x == obj2.x) {
            return 0;
        }
        if (obj1.x > obj2.x) {
            return 1;
        }
        return -1;
    }
}
