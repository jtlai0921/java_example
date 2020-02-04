package source;

public class Test12 {

    public static void 匿名巢狀類別轉變1() {
        new InnerDemo2C().abc();
    }

    public static void 匿名巢狀類別轉變2() {

        class InnerDemo2C implements InnerDemo2P {

            public int a;
            public int b;

            public InnerDemo2C() {
                a = 20;
                b = 20;
            }

            public void abc() {
                System.out.println("a=" + a + "  b=" + b);
            }

            public void xyz() {
                System.out.println("xyz");
            }
        }
        new InnerDemo2C().abc();
    }

    public static void 匿名巢狀類別轉變3() {

        new InnerDemo2P() {
            public int a;
            public int b;

            {
                a = 30;
                b = 30;
            }

            public void abc() {
                System.out.println("a=" + a + "  b=" + b);
            }

            public void xyz() {
                System.out.println("xyz");
            }
        }.abc();
    }

    public static void 匿名巢狀類別轉變4() {

        // 請注意 p 在 compiler 階段會系統會認為是 InnerDemo2P 的型態
        InnerDemo2P p = new InnerDemo2P() {
            public int a;
            public int b;

            {
                a = 40;
                b = 40;
            }

            public void abc() {
                System.out.println("a=" + a + "  b=" + b);
            }

            public void xyz() {
                System.out.println("xyz");
            }
        };
        p.abc();
        //p.xyz();
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 匿名巢狀類別轉變5() {

        呼叫匿名巢狀類別轉變5(new InnerDemo2C());
    }

    public static void 呼叫匿名巢狀類別轉變5(InnerDemo2C p) {
        p.abc();
        p.xyz();
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 匿名巢狀類別轉變6() {

        呼叫匿名巢狀類別轉變6(new InnerDemo2P() {

            public int a;
            public int b;

            {
                a = 50;
                b = 50;
            }

            public void abc() {
                System.out.println("a=" + a + "  b=" + b);
            }

            public void xyz() {
                System.out.println("xyz");
            }
        });
    }

    public static void 呼叫匿名巢狀類別轉變6(InnerDemo2P p) {
        p.abc();
        // p.xyz();
    }

////////////////////////////////////////////////////////////////////////////////
    
    public static void 匿名巢狀類別_轉換前1() {
        Outer4 p = new Outer4();
        p.abc(90, 100);
    }

    public static void 匿名巢狀類別_轉換後1() {
        Outer5 p = new Outer5();
        p.abc(90, 100);
    }

    
    public static void 匿名巢狀類別_轉換前2() {
        Outer6 p = new Outer6();
        p.s1(4);
    }

    public static void 匿名巢狀類別_轉換後2() {
        Outer7 p = new Outer7();
        p.s1(4);
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 巢狀類別範例1() {
        Person10 cyh = new Person10(100, "cyh");
        cyh.setHead("咖啡黑", "不是方形", "黑色", 57.5);
        cyh.theH.showHeadProperties();
    }

    public static void 巢狀類別範例2() {
        Person11 cyh = new Person11(100, "cyh");
        cyh.setHead("咖啡黑", "不是方形", "黑色", 57.5);
        cyh.theH.showHeadProperties();

    }

}
