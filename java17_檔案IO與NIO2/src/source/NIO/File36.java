package source.NIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File36 {
   
    public static void main(String[] args) {
         try {
            try (PrintWriter pw = new PrintWriter("fileWrite38.txt");
                 FileReader fr = new FileReader("fileWrite38.txt");
                 BufferedReader br = new BufferedReader(fr)) {
                
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        pw.printf("%d*%d=%2d ", i, j, i * j);
                    }
                    pw.println();
                }
                pw.flush();

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
