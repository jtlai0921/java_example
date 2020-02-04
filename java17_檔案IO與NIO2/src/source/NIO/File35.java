package source.NIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File35 {
   
    public static void main(String[] args) {
         try {
            //5.0
            PrintWriter pw = new PrintWriter("fileWrite37.txt");  //5.0
            //PrintWriter pw = new PrintWriter("aa\\fileWrite35.txt");  //5.0
            //PrintWriter pw = new PrintWriter("c:\\fileWrite35.txt");  //5.0
            //PrintWriter pw = new PrintWriter("c:\\aa\fileWrite35.txt");  //5.0

            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    pw.printf("%d*%d=%2d ", i, j, i * j);
                }
                pw.println();
            }
            pw.flush();
            pw.close();

            FileReader fr = new FileReader("fileWrite35.txt");
            //FileReader fr = new FileReader("aa\\fileWrite35.txt");
            //FileReader fr = new FileReader("c:\\fileWrite35.txt");
            //FileReader fr = new FileReader("c:\\aa\\fileWrite35.txt");
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
