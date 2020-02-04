package source;

public class EnumeratedTypes2 {

    enum Color {

        RED, GREEN, BLUE, ORANGE
    };

    enum Fruit {

        BANANA, ORANGE, PEACH
    };

    public static void main(String[] args) {
      // Color color = ORANGE; // 無法通過編譯  
        Color color = Color.ORANGE; // 必須指定類別才能通過編譯  
        System.out.println("Color.ORANGE==>" + color);
        Fruit fruit = Fruit.ORANGE;
        System.out.println("Fruit.ORANGE==>" + fruit);
    }
}
