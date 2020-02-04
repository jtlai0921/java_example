package source;

public class InnerStruct2 {

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
        y = 123;
        z = 123;
        s2();
        Inner1.b = 123;
        Inner1.n1();
        //////
        Inner1 p = new Inner1();
        p.a = 123;
        p.m1();
        //物件等級
        x = 123;
        s1();
        /////////
        Inner2 q = new Inner2();
        q.a = 123;
        q.m1();
    }

    public static void test2() {
        //類別等級
        y = 123;
        z = 123;
        s2();
        Inner1.b = 123;
        Inner1.n1();
        //////
        Inner1 p = new Inner1();
        p.a = 123;
        p.m1();
        //物件等級
//        new InnerStruct2().x = 123;
//        new InnerStruct2().s1();
//        ///////
//        Inner2 q = new InnerStruct2().new Inner2();
//        q.a = 123;
//        q.m1();
        ///////////
        InnerStruct2 t = new InnerStruct2();
        t.x = 123;
        t.s1();
        /////////
        Inner2 q = t.new Inner2();
        q.a = 123;
        q.m1();
    }
}

//不相關的類別
class OtherB {

    public void test3() {
        //類別等級
        InnerStruct2.z = 123;
        InnerStruct2.s2();
        InnerStruct2.Inner1.b = 123;
        InnerStruct2.Inner1.n1();
        //////
        InnerStruct2.Inner1 p = new InnerStruct2.Inner1();
        //p.a = 123;
        p.m1();
        //物件等級
        new InnerStruct2().x = 123;
        new InnerStruct2().s1();
        /////////
        InnerStruct2.Inner2 q = new InnerStruct2().new Inner2();
        // q.a = 123;
        q.m1();
    }
}
