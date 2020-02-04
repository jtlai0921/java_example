package source;

public class InnerStruct1 {

    public int x;
    private static int y;
    public static int z;

    public void s1() {

    }

    public static void s2() {

    }

//類別等級巢狀類別
    public static class Inner1 implements InnerFather {

        private int a;
        public static int b;

        public Inner1() {
            a = 123;
        }

        public void m1() {
            // x = 123
            y = 789;
        }

        public static void n1() {

        }
    }

    //物件等級巢狀類別
    public class Inner2 implements InnerFather {

        private int a;
        //public static int b;

        public Inner2() {
            a = 123;
        }

        public void m1() {
            x = 123;
            y = 789;
        }
        // public static void n1() {

        // }
    }

    public void s3() {
        //區域巢狀類別
        class Inner3 implements InnerFather {

            private int a;

            public Inner3() {
                a = 123;
            }

            public void m1() {
                x = 123;
                y = 789;
            }
        }
        Inner3 p = new Inner3();
        p.m1();
    }

    public void s4() {
        //匿名類別
        InnerFather p = new InnerFather() {

            private int a;

            {
                a = 123;
            }

            public void m1() {
                x = 123;
                y = 789;
            }
        };
        p.m1();
    }

    public void test1() {
        //類別等級
        InnerStruct1.y = 123;
        InnerStruct1.z = 123;
        InnerStruct1.s2();
        InnerStruct1.Inner1.b = 123;
        InnerStruct1.Inner1.n1();
        //////
        InnerStruct1.Inner1 p = new InnerStruct1.Inner1();
        p.a = 123;
        p.m1();
        //物件等級
        this.x = 123;
        this.s1();
        /////////
        InnerStruct1.Inner2 q = new InnerStruct1.Inner2();
        q.a = 123;
        q.m1();
    }

    public static void test2() {
        //類別等級
        InnerStruct1.y = 123;
        InnerStruct1.z = 123;
        InnerStruct1.s2();
        InnerStruct1.Inner1.b = 123;
        InnerStruct1.Inner1.n1();
        //////
        InnerStruct1.Inner1 p = new InnerStruct1.Inner1();
        p.a = 123;
        p.m1();
        //物件等級
        new InnerStruct1().x = 123;
        new InnerStruct1().s1();
        ///////
        InnerStruct1.Inner2 q = new InnerStruct1().new Inner2();                
        q.a = 123;
        q.m1();       
    }
}

//不相關的類別
class OtherA {

    public void test3() {
        //類別等級
        InnerStruct1.z = 123;
        InnerStruct1.s2();
        InnerStruct1.Inner1.b = 123;
        InnerStruct1.Inner1.n1();
        //////
        InnerStruct1.Inner1 p = new InnerStruct1.Inner1();
        //p.a = 123;
        p.m1();
        //物件等級
        new InnerStruct1().x = 123;
        new InnerStruct1().s1();
        /////////
        InnerStruct1.Inner2 q = new InnerStruct1().new Inner2();
        // q.a = 123;
        q.m1();
    }
}
