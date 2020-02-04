package source;

public class VarDemo2 {

    public static float var = 99.99F; 

    public static void 變數的有效範圍() {

        System.out.println("var = " + var);     
        //錯誤，尚未定義出 i 變數
       // System.out.println("i = " + i);  
      
        int i = 1000;       
        System.out.println("i = " + i);
    }
}
