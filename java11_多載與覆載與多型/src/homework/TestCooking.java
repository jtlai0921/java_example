package homework;

import java.util.Scanner;

interface Cooking {

    void 買();

    void 煮();

    void 吃();

}

class Maid implements Cooking {

    public void 買() {
        System.out.println("便利商店");
    }

    public void 煮() {
        System.out.println("泡麵");
    }

    public void 吃() {
        System.out.println("廚房");
    }

    public String toString() {
        return "佣人在 便利商店 買的泡麵食材 , 煮完後在廚房吃";
    }

}

class Mother implements Cooking {

    public void 買() {

        System.out.println("市場");
    }

    public void 煮() {
        System.out.println("家常菜");
    }

    public void 吃() {
        System.out.println("餐桌");
    }

    public String toString() {
        return "媽媽在 市場 買的家常菜食材 , 煮完後在餐桌吃";
    }
}

class Chef implements Cooking {

    public void 買() {
        System.out.println("專門店");
    }

    public void 煮() {
        System.out.println("滿漢全席");
    }

    public void 吃() {
        System.out.println("餐廳");
    }

    public String toString() {
        return "廚師在 專門店 買的滿漢全席食材 , 煮完後在餐廳吃";
    }
}


public class TestCooking {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int opt;
        Cooking food1 = new Maid();
        Cooking food2 = new Mother();
        Cooking food3 = new Chef();
        Cooking food = null;

        do {
            System.out.print("請輸入 1=佣人 2=媽媽 3=廚師 4=結束 : ");
            opt = s.nextInt();

            if (opt == 1) {
                food = food1;
            }
            if (opt == 2) {
                food = food2;
            }
            if (opt == 3) {
                food = food3;
            }
            if (opt == 4) {
                break;
            }

            if (food != null) {
                food.買();
                food.煮();
                food.吃();
                System.out.println(food);
            }
        } while (true);
    }
}
