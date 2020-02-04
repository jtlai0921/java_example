
package source;

public class ConstrDemo2P {

    public int var1 = 100;

    protected void showVar1() {
        System.out.println("ConstrDemo2P 定義的 showVar1() var1 = " + var1);
    }
}
class ConstrDemo2C extends ConstrDemo2P {

    public double var1 = 1111.111;

    public void showVar1() {
        System.out.println("ConstrDemo2C 定義的 showVar1() var1 = " + var1);
        double add = var1 + super.var1;//編譯器會將 var1 視為 this.var1
        //double add = this.var1 + super.var1; //上行同於此行

        System.out.println("add = " + add);
    }

    public void callSuper() {
        super.showVar1(); //呼叫父類別的 showVar1()

    }
}
