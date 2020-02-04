package source.NIO;

import java.io.File;

public class File11 {

    public static void main(String[] args) {
        File newFile = new File("fileWrite11.txt");
        System.out.println(newFile.exists());  //false
    }
}
