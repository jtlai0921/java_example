package source;

//自訂類別==>有覆寫 equals
public class StringDemo2 {

    public int x = 10;

    public void xyz() {
    }

    public boolean equals(Object obj) {
        if ((obj != null && obj instanceof StringDemo2)) {
            if ((x == ((StringDemo2) obj).x)) {
                return true;
            }
        }
        return false;
    }
}
