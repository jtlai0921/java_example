package source.NIO2.Path;

import java.nio.file.*;

public class PathDemo1 {

    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.home"), "Documents", "Downloads");
      
        System.out.printf("toString: %s\n", path.toString());
        System.out.printf("getFileName: %s\n", path.getFileName());
        System.out.printf("getName(0): %s\n", path.getName(0)); //以資料夾為單位 , 最上層是 0
        System.out.printf("getNameCount: %d\n", path.getNameCount());
        System.out.printf("subpath(0,2): %s\n", path.subpath(0, 2));
        System.out.printf("getParent: %s\n", path.getParent());
        System.out.printf("getRoot: %s\n", path.getRoot());        
    }
}
