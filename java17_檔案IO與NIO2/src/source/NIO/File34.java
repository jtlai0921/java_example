package source.NIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File34 {
   
    public static void main(String[] args) {
         try {
            try (PrintWriter pw = new PrintWriter("fileWrite34.txt")) {
                pw.println("howdy");
                pw.println("folks");
                pw.flush();
            }
            try (FileReader fr = new FileReader("fileWrite34.txt");
                 BufferedReader br = new BufferedReader(fr)) {
                String data;
                while ((data = br.readLine()) != null) {
                    System.out.println(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
