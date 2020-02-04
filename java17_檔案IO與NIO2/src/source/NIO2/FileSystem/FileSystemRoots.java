package source.NIO2.FileSystem;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemRoots {

    public static void main(String[] args) {
        
        FileSystem fs = FileSystems.getDefault();
        Iterable<Path> dirs =fs.getRootDirectories();
       
        for (Path name : dirs) {
            System.out.println(name);
        }
    }
}
