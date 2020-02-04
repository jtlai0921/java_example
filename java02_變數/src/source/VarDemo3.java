package source;

public class VarDemo3 {

    public static String s1 = "gogo";
   //public String s1 = "ok"; 

    public static void fun1() {
        String s1 = "abc";      
        int x = 200;
        //byte x = 120; 
        float y = 33.91F;
        System.out.println("s1 = " + s1);  
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        fun2();  
    }
    public static void fun2() {
        int x = 10;   
        char y = 'C';
        System.out.println("in fun1(), x = " + x);
        System.out.println("in fun1(), y = " + y);
        System.out.println("in fun1(), s1 = " + s1);      
    }
}
