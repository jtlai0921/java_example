package p01_介面的default與static方法; 

interface Calculator2 {
//介面中的静態方法可以幫我們實現静態工廠類，不需要你去額外寫一個工廠類了
    static Calculator2 getInstance() {
        return new BasicCalculator2();
    }

    default int addThree(int first, int second, int Third) {
        return first + second + Third;
    }

    int add(int first, int second);

    int subtract(int first, int second);

    int divide(int first, int second);

    int multiply(int first, int second);
}

class BasicCalculator2 implements Calculator2 {

    @Override
    public int add(int first, int second) {
        return first + second;
    }

    @Override
    public int subtract(int first, int second) {
        return first - second;
    }

    @Override
    public int divide(int first, int second) {
        return first / second;
    }

    @Override
    public int multiply(int first, int second) {
        return first * second;
    }
}

public class Test09 {

    public static void main(String[] args) {
        //呼叫 Calculator2 自身工廠函數方式呼叫
        System.out.println(Calculator2.getInstance().add(1, 2));
        System.out.println(Calculator2.getInstance().addThree(1, 2, 3));
    }
}
