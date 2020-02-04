package source.序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDog1 {

    public static void main(String[] args) {
        Collar1 c = new Collar1(3);
        Dog1 d = new Dog1(c, 5);

        System.out.println("before: collar size is " + d.getCollar().getCollarSize());  //3

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
            d = (Dog1) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after: collar size is " + d.getCollar().getCollarSize());  //3
    }
}

//頸圈加上序列化
class Dog1 implements Serializable {

    private Collar1 theCollar;
    private int dogSize;

    public Dog1(Collar1 collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar1 getCollar() {
        return theCollar;
    }
}

class Collar1 implements Serializable {

    private int collarSize;

    public Collar1(int size) {
        collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }
}
