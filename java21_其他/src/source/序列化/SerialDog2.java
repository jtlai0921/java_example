package source.序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDog2 {

    public static void main(String[] args) {
        Collar2 c = new Collar2(3);
        Dog2 d = new Dog2(c, 5);
        System.out.println("before: collar size is " + d.getCollar().getCollarSize());
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
            d = (Dog2) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after: collar size is " + d.getCollar().getCollarSize());
    }
}

//頸圈不想序列化
class Dog2 implements Serializable {

    private transient Collar2 theCollar;
    private int dogSize;

    public Dog2(Collar2 collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar2 getCollar() {
        return theCollar;
    }
}

class Collar2 {

    private int collarSize;

    public Collar2(int size) {
        collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }
}
