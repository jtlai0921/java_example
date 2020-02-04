package source.NIO;

import java.io.File;
import java.io.IOException;

public class File12 {

    public static void main(String[] args) {
        try {
            File file = new File("fileWrite12.txt");
            System.out.println(file.exists());  //false
            file.createNewFile();
            System.out.println(file.exists());  //true
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
