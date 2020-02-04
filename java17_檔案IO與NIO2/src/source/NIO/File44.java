package source.NIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class File44 {
   
    public static void main(String[] args) {
        try {
            File myDir4 = new File("mydir4");
            myDir4.mkdir();

            File myFile = new File("mydir4//myFile1.txt");
            //  myFile.createNewFile();

            PrintWriter pw = new PrintWriter(myFile);
            pw.println("new stuff");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
