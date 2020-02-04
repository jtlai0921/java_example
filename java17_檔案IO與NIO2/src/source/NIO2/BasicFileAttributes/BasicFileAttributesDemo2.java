package source.NIO2.BasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesDemo2 {

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("abc.txt");
        //設定最後修改時間
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis((currentTime));
        
        Files.setLastModifiedTime(file, ft);
    }
}
