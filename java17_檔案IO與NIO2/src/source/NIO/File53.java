package source.NIO;

import java.io.File;

public class File53 {
   
    public static void main(String[] args) {
         File delDir = new File("c:\\windows");

        for (File file : delDir.listFiles()) {            
            if (file.isDirectory()) {
                System.out.println("[" + file + "]");
            } else {
                System.out.println(file);
            }
        }
    }
}
