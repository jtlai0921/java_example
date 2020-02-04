package source.NIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriter1 {

    public static void main(String[] args) {
        FileOutputStream fin;
        try {
            fin = new FileOutputStream("Number.txt");
            DataOutputStream dataWrite = new DataOutputStream(fin);
            short sh[] = {1, 2, 3, 4, 5};
            for (short i : sh) {
                dataWrite.writeShort(i);//這裡的方法要搭配資料型態使用
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
