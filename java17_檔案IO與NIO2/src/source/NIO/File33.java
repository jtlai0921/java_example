package source.NIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File33 {
   
    public static void main(String[] args) {
         try {
            //5.0
            PrintWriter pw = new PrintWriter("fileWrite33.txt");

            pw.println("howdy");
            pw.println("folks");
            pw.flush();
            pw.close();

            FileReader fr = new FileReader("fileWrite33.txt");
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
