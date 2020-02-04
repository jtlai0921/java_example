package source.NIO2.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3 {

    public static void main(String[] args) {
        //路徑與路徑的結合
        Path path1 = Paths.get("C:\\Users");
        Path path2 = Paths.get("joyes");
        Path path3 = path1.resolve(path2);
        System.out.printf("path3: %s\n", path3.toString());
        
        //從一個路徑切到另一個路徑     
        Path path4 = Paths.get(System.getProperty("user.home"),"Documents", "Downloads");
        System.out.printf("path4: %s\n", path4.toString());
        Path path5 = Paths.get("C:\\Program files");
         System.out.printf("path5: %s\n", path5.toString());
        Path p4TOp5 = path4.relativize(path5);
        System.out.printf("p4TOp5: %s\n", p4TOp5.toString());
    }
}
