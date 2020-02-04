package source.NIO;

import java.io.File;
import java.io.IOException;

public class File61 {
   //判斷是目錄還是檔案
    public static void main(String[] args) {
         try {
            File dir1 = new File("dir1");
            dir1.mkdir();

            File file1 = new File(dir1, "File1.txt");
            file1.createNewFile();

            System.out.println("dir1 is 目錄嗎 : " + dir1.isDirectory());
            System.out.println("file is 檔案嗎 : " + file1.isFile());
            System.out.println("file 存在嗎 : " + file1.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
