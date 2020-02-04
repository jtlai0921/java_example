package source;

public class EnumeratedTypes1 {

    public enum Month {

        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    };

    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.print(month + " ");
        }
        System.out.println();
        Month month = Month.JAN;
        System.out.println("Month.JAN==>" + month);
        System.out.println("month.getClass()==>" + month.getClass());
    }
}
