package source.NIO;

import java.io.File;
import java.io.IOException;

public class File51 {
   
    public static void main(String[] args) {
          try {
            File delDir = new File("deldir");
            delDir.mkdir();

            File delFile1 = new File(delDir, "delFile1.txt");
            delFile1.createNewFile();

            File delFile2 = new File(delDir, "delFile2.txt");
            delFile2.createNewFile();

            delFile1.delete();
            //delFile2.delete();
            System.out.println("delDir is " + delDir.delete()); //false
            //要殺掉目錄,但裡面還有一個檔案所以殺不掉
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
