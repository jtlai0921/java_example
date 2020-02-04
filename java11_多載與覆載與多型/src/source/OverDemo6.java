package source;

public class OverDemo6 {

    public int x;

    public OverDemo6(int x) {
        this.x = x;
    }
    public int sum(OverDemo6 obj) {
        if (obj != null) {
            return this.x + obj.x;
        }
        return 0;
    }
    public boolean compareto(OverDemo6 obj) {
        if (obj != null) {
            if (this.x == obj.x) {
                return true;
            }
        }
        return false;
    }
    public int compare(OverDemo6 obj1, OverDemo6 obj2) {
        if (obj1 != null && obj2 != null) {
            if (obj1.x == obj2.x) {
                return 0;
            }
            if (obj1.x > obj2.x) {
                return 1;
            }
        }
        return -1;
    }
    public boolean equals(Object obj) {
        if ((obj != null && obj instanceof OverDemo6)) {
            if ((x == ((OverDemo6) obj).x)) {
                return true;
            }
        }
        return false;
    }
}
