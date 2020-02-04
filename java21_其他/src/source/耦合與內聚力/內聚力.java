package source.耦合與內聚力;

public class 內聚力 {

    public static void main(String[] args) {
        //低內聚力
        印報表A1();
        印報表B1();
        印報表C1();
        //高內聚力
        印報表A2();
        印報表B2();
        印報表C2();
    }
////////////////////////////////////////////////////////////////////////////////
    //低內聚力
    public static void 印報表A1() {
        報表A p = new 報表A();
        p.印表機();
        p.資料庫();
        p.存檔();
    }

    public static void 印報表B1() {
        報表B p = new 報表B();
        p.印表機();
        p.資料庫();
        p.存檔();
    }

    public static void 印報表C1() {
        報表C p = new 報表C();
        p.印表機();
        p.資料庫();
        p.存檔();
    }
////////////////////////////////////////////////////////////////////////////////
    //高內聚力
    public static void 印報表A2() {
        印表機 x = new 印表機();
        資料庫 y = new 資料庫();
        存檔 z = new 存檔();

        x.丙印表機();
        y.甲資料庫();
        z.甲存檔();
    }
    public static void 印報表B2() {
        印表機 x = new 印表機();
        資料庫 y = new 資料庫();
        存檔 z = new 存檔();

        x.Z印表機();
        y.甲資料庫();
        z.Z存檔();
    }
    public static void 印報表C2() {
        印表機 x = new 印表機();
        資料庫 y = new 資料庫();
        存檔 z = new 存檔();

        x.甲印表機();
        y.Z資料庫();
        z.Z存檔();
    }
}
////////////////////////////////////////////////////////////////////////////////
//低內聚力
class 報表A {

    public void 印表機() {
        System.out.println("甲印表機");
    }
    public void 資料庫() {
        System.out.println("access");
    }
    public void 存檔() {
        System.out.println("存到excel");
    }
}
//低內聚力
class 報表B {

    public void 印表機() {
        System.out.println("Z印表機");
    }
    public void 資料庫() {
        System.out.println("SQLSERVER");
    }
    public void 存檔() {
        System.out.println("存到excel");
    }
}
//低內聚力
class 報表C {

    public void 印表機() {
        System.out.println("甲印表機");
    }
    public void 資料庫() {
        System.out.println("SQLSERVER");
    }
    public void 存檔() {
        System.out.println("存到WORD");
    }
}

////////////////////////////////////////////////////////////////////////////////
//高內聚力
class 印表機 {

    public void 甲印表機() {
        System.out.println("甲印表機");
    }
    public void Z印表機() {
        System.out.println("Z印表機");
    }
    public void 丙印表機() {
        System.out.println("丙印表機");
    }
}
//高內聚力
class 存檔 {

    public void 甲存檔() {
        System.out.println("甲存檔");
    }
    public void Z存檔() {
        System.out.println("Z存檔");
    }
    public void 丙存檔() {
        System.out.println("丙存檔");
    }
}
//高內聚力
class 資料庫 {

    public void 甲資料庫() {
        System.out.println("甲資料庫");
    }
    public void Z資料庫() {
        System.out.println("Z資料庫");
    }
    public void 丙資料庫() {
        System.out.println("丙資料庫");
    }
}
