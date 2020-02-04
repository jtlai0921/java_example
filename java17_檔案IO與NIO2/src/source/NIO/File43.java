package source.NIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class File43 {
   
    public static void main(String[] args) {
         try {
            File myDir3 = new File("mydir3");
            myDir3.mkdir();
            //String , String
            File myFile = new File("mydir3", "myFile1.txt");
            // myFile.createNewFile();

            PrintWriter pw = new PrintWriter(myFile);
            pw.println("new stuff");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
