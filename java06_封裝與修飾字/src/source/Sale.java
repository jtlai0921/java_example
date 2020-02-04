package source;

public class Sale {

    public static final double MODE1 = 0.65;  
    public static final double MODE2 = 0.78;
    public static final double MODE3 = 0.9;

    public static int count(int price, double mode) {

        return (int) (price * mode);
    }
}
