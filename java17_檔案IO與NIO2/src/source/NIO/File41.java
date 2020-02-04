package source.NIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class File41 {
   
    public static void main(String[] args) {
          try {
            File myDir1 = new File("mydir1");
            // myDir1.mkdir();

            File myFile = new File(myDir1, "myFile.txt");
            //  myFile.createNewFile();

            PrintWriter pw = new PrintWriter(myFile);
            pw.println("new stuff");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("會當掉");
        }
    }
}
