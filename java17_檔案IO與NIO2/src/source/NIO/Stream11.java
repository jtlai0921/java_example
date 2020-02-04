package source.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream11 {

    public static void main(String[] args) {
        try {
            dump(new FileInputStream("條碼.txt"), new FileOutputStream("條碼2.txt",true)); //append
            //dump(new FileInputStream("pic1.jpg"), new FileOutputStream("pic2.jpg"));
            // dump(new FileInputStream("data1.mdb"), new FileOutputStream("data2.mdb"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dump(InputStream src, OutputStream dest) throws IOException {

        try (InputStream input = src; OutputStream output = dest) {
            byte[] data = new byte[1024]; //嘗試每次從來源讀取 1024 位元組
            int length = 0;
            while ((length = input.read(data)) != -1) {
                System.out.println(length); //測試時放開
                output.write(data, 0, length); //byte 陣列 , 初始索引 , 資料長度
            }
            System.out.println(length); //測試時放開
        }
    }
}
