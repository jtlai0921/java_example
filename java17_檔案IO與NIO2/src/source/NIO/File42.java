package source.NIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class File42 {
   
    public static void main(String[] args) {
         try {
            File myDir2 = new File("mydir2");
            myDir2.mkdir();

            //File , String
            File myFile = new File(myDir2, "myFile.txt");
            // myFile.createNewFile();

            PrintWriter pw = new PrintWriter(myFile);
            pw.println("new stuff");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("會當掉");
        }
    }
}
