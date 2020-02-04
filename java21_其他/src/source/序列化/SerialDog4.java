package source.序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDog4 {

    public static void main(String[] args) {
        superNotSerial();
    }

    public static void superNotSerial() {
        Dog4 d = new Dog4(35, "Fido");
        System.out.println("before: " + d.name + " " + d.weight);
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (Dog4) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after: " + d.name + " " + d.weight);
    }
}

// Dog4 繼承了 動物 不 序列化的 weight
class Dog4 extends Animal4 implements Serializable {

    public String name;

    public Dog4(int w, String n) {
        weight = w; // inherited
        name = n; // not inherited
    }
}
