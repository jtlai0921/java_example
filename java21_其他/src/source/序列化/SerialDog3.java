package source.序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDog3 {

    public static void main(String[] args) {
        Collar3 c = new Collar3(3);
        Dog3 d = new Dog3(c, 5);

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
            d = (Dog3) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after: collar size is " + d.getCollar().getCollarSize());
    }
}

//自製的讀出和寫入
class Dog3 implements Serializable {

    //不想序列化的變數 , 會恢復成 null 或 0 或 0.0
    private transient Collar3 theCollar;
    private int dogSize;

    public Dog3(Collar3 collar, int size) {
        theCollar = collar;
        dogSize = size;
    }
    public Collar3 getCollar() {
        return theCollar;
    }
    private void writeObject(ObjectOutputStream os) {

        try {         
            os.writeInt(theCollar.getCollarSize()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void readObject(ObjectInputStream is) {

        try {         
           theCollar = new Collar3(is.readInt()); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Collar3 {

    private int collarSize;

    public Collar3(int size) {
        collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }
}
