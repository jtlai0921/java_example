package source.NIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File32 {
   
    public static void main(String[] args) {
          try {
            File file = new File("fileWrite32.txt");
            PrintWriter pw = new PrintWriter(file);  //5.0

            pw.println("howdy");
            pw.println("folks");
            pw.flush();
            pw.close();

            FileReader fr = new FileReader(file);
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
