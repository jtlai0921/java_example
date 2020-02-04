package source;

import source.pack1.P1;
import source.pack2.ET;

public class Test06 {

    public static void 使用B001_1() {
        B001 p = new B001();
        p.a = 10;
        System.out.println("p.a=" + p.a);
        //不能使用 b
        // 因為 b 是 父類別特別保護給子類別用的
        // p.b = 20;
        //System.out.println("b=" + p.b);
    }

    public static void 使用B001_2() {
        B001 p = new B001();
        p.a = 10;
        System.out.println("p.a=" + p.a);
        //p.b = 20;
        //System.out.println("b=" + p.b);
        p.setb(20); //透過公開的方法設定
        System.out.println("b=" + p.getb()); //透過公開的方法取得
    }

    public static void 使用Animal() {
        Animal animal1 = new Animal();
        animal1.legs = 4;
        System.out.println("animal1 has " + animal1.legs + " legs.");
        animal1.eat();
        animal1.move();
    }

    public static void 使用Animalx() {
        Animalx animal1 = new Animalx();
        // animal1.legs=4;
        animal1.setlegs(4);
        // System.out.println("animal1 has "+ animal1.legs+" legs.");
        System.out.println("animal1 has " + animal1.getlegs() + " legs.");
        animal1.eat();
        animal1.move();
    }

    public static void 繼承存取權() {
        P1 fish = new P1();
        // fish.blood = 'A'; //錯誤 , P1的 private 成員只能在 P1 裡存取        
        fish.setBlood('A');
        System.out.println("fish的血型=" + fish.getBlood());
        // fish.DNA = "AAAAABBBB"; //錯誤 , 不可在此存取 protected 的成員       
        fish.name = "colorfish";
        System.out.println("fish的name=" + fish.name);

        ET Axel = new ET(); //只能透過子類別存取 DNA
        Axel.setDNA("oiujhgtffd");
        System.out.println("Axel 的 DNA=" + Axel.getDNA());
    }

    public static void abstract修飾字() {
        //錯誤，abstract 類別 或介面 不能 new 產生實體
        //Abstract1 p1 = new Abstract1();
        Abstract1 p2 = new Abstract2();

        //Abstract5 q1 = new Abstract5();
        Abstract5 q2 = new Abstract6();
    }

    public static void static修飾字() {
        int price = 2100;

        int cost1 = Sale.count(price, Sale.MODE1);
        System.out.println("客人1 購買的價格= " + cost1);
        int cost2 = Sale.count(price, Sale.MODE2);
        System.out.println("客人2 購買的價格= " + cost2);
    }

    public static void 使用Account1() {

        String id = "111-22-3333";
        int money = 10000;

        Account1 MyAccount = new Account1();
        MyAccount.設定資料(id, money);

        System.out.println(" == 存入 5000 元後");
        MyAccount.存款(5000);
        System.out.println(" == 領出 20000 元後");
        MyAccount.提款(20000);
    }

    public static void 使用Account2() {
        String id = "111-22-3333";
        int money = 10000;

        Account2 MyAccount = new Account2();
        MyAccount.設定資料(id, money);

        System.out.println(" == 存入 50000 元後");
        MyAccount.存款(50000);

        System.out.println(" == 領出 20000 元後");
        MyAccount.提款(20000);

        System.out.println(" == 轉帳 80000 元後");
        MyAccount.轉帳(80000);

    }

}
