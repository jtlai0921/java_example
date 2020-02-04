package source;

public class VarDemo5 {

    public int a = 4;                    //全域 , 物件等級 , 基本形態 , 變數
    public final double b = 5.5;         //全域 , 物件等級 , 基本型態 , 常數
    public static double c;              //全域 , 類別等級 , 基本型態 , 變數
    public VarDemo1 d;                   //全域 , 物件等級 , 參考型態 , 變數(類別)
    public static VarDemo1 e;            //全域 , 類別等級 , 參考型態 , 變數(類別)
    public int[] f = new int[5];         //全域 , 物件等級 , 參考型態 , 變數(陣列)
    public String g = "abc";             //全域 , 物件等級 , 參考型態 , 變數(字串)

    public void abc(int p) {              //區域 , 基本型態 , 參數 ( 變數 )
        int total =0  ;                   //區域 , 基本型態 , 變數     
        final double k = 4.6;             //區域 , 基本型態 , 常數
        VarDemo1 l = new VarDemo1();      //區域 , 參考型態 , 變數(類別)
        double[] m = new double[10];      //區域 , 參考型態 , 變數(陣列)
        String n = "xyz";                 //區域 , 參考型態 , 變數(字串)       

        for (int i = 0; i < 10; i++) {    //區塊 , 基本型態 , 變數
            total = total + i;
        }
        if (total > 4.5) {
            VarDemo1 o = new VarDemo1();   //區塊 , 參考型態 , 變數(類別)
            String q = new String("abc");  //區塊 , 參考型態 , 變數(字串)
            final double sum = 0;          //區塊 , 基本型態 , 常數
        }
    }
    public static void xyz() {
        int r = 0;                         //區域 ,  基本形態 , 變數
    }
}
