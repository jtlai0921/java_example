package source.NIO2.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

//使用快捷迴圈
public class PathDemo2 {

    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.home"), "Documents", "Downloads");
        System.out.printf("toString: %s\n", path.toString());
        for (Path p : path) {
            System.out.println(p);
        }
    }
}
