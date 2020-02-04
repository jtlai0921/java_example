package source;

//複雜的多載
//標準 > 最近的放寬 > 包裝 > 參數串
public class TestComplex {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        sumxy(x, y);
    }

    public static void sumxy(int x, int y) { //1.標準
        System.out.print("int,int");
    }

    public static void sumxy(long x, long y) {//2.放寬
        System.out.print("long,long");
    }

    public static void sumxy(float x, float y) {//2.放寬
        System.out.print("float,float");
    }

    public static void sumxy(double x, double y) {//2.放寬
        System.out.print("double,double");
    }

    public static void sumxy(Integer x, Integer y) {//3.包裝
        System.out.print("Integer,Integer");
    }

    public static void sumxy(Long x, Long y) {//不可
        System.out.print("Long,Long");
    }

    public static void sumxy(Number x, Number y) {//3.包裝
        System.out.print("Number,Number");
    }

    //Integer...會跟其他參數串相衝突 int...,long...,float...,double...
    public static void sumxy(int... x) {//4.參數串最後被選擇
        System.out.print("int ...");
    }

    public static void sumxy(Integer... x) {//4.參數串最後被選擇
        System.out.print("Integer ...");
    }

    public static void sumxy(long... x) {//4.參數串最後被選擇
        System.out.print("long ...");
    }

    public static void sumxy(Long... x) {//不可
        System.out.print("Long ...");
    }

    public static void sumxy(float... x) {//4.參數串最後被選擇
        System.out.print("float ...");
    }

    public static void sumxy(double... x) {//4.參數串最後被選擇
        System.out.print("double ...");
    }

}
