package source;

import source.pack1.A001;

public class B001 extends A001 {
    /* 不用寫
     public int a;
     private int b;
     X int c;
     X private int d;
     */
    //可透過公開的方法來設定
    public void setb(int x) {
        b = x;
    }

    public int getb() {
        return b;
    }    
}


//public class B001 extends A001 {
//    /* 不用寫
//     public int a;
//     private int b;
//     X int c;
//     X private int d;
//     */   
//}






