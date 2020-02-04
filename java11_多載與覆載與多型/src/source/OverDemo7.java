package source;

public class OverDemo7 {

    public int x;

    public OverDemo7(int x) {
        this.x = x;
    }

    // String , 八個包裝類別  有覆寫
    public boolean equals(Object obj) {
        if ((obj != null && obj instanceof OverDemo7)) {
            if ((x == ((OverDemo7) obj).x)) {
                return true;
            }
        }
        return false;
    }

    //StringBuffer , StringBuilder , 八個包裝類別 , File , Date...  有覆寫
    public String toString() {
        return String.valueOf(x);
    }

    //String , 八個包裝類別  有覆寫
    public int hashCode() {
        return x;
    }
}
