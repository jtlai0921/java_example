package source.NIO2.BasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesDemo3 {

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("abc.txt");
        //設定最後修改時間
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis((currentTime));
        
        // [viewname:]attribute-name                 
        Files.setAttribute(file, "basic:lastModifiedTime", ft);
        //隱藏屬性
        Files.setAttribute(file, "dos:hidden", false);
    }
}
