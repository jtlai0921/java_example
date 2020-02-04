package source.NIO;

import java.io.File;

public class File52 {
   
    public static void main(String[] args) {
        
        File delDir = new File("deldir");
        File newDir = new File("newDir");

        File delFile2 = new File(delDir, "delFile2.txt");
        File newName = new File(delDir, "newName.txt");

        delFile2.renameTo(newName);
        delDir.renameTo(newDir);
    }
}
