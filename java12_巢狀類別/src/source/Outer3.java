package source;

public class Outer3 {

    public int x = 1;
    public int y = 2;

    public void s1(int r) {

        int m = 3;

        class Inner3 {

            public int a = 4;
            public int b = 5;

            public void n1() {
                int c;
                c = x + y + m + a + b + r;

            }
        }
        Inner3 inn = new Inner3();  //在方法內 new
        inn.n1();
        //m = 123; //閉包內用到的 外圍區域變數值不可被更改 , 預設為 final
    }

    public void s2() {
        //Inner3 inn = new Inner3();  //不可在別的方法內 new , 超出範圍
        //inn.n1(); 
    }
}
