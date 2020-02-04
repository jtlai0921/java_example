package source;

public class UtilityDemo1 {

    public int x;

    public UtilityDemo1(int x) {
        this.x = x;
    }
    public int hashCode() {
        return x;
    }
    public String toString() {
        return String.valueOf(x);
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof UtilityDemo1) {
            if (x == ((UtilityDemo1) o).x) {
                return true;
            }
        }
        return false;
    }
}



