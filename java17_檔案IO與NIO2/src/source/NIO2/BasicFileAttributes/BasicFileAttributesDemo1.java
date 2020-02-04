package source.NIO2.BasicFileAttributes;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesDemo1 {

    public static void main(String[] args) throws IOException {
      
        Path file = Paths.get("data1.mdb");
        BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);       
        System.out.printf("creationTime: %s\n", attrs.creationTime());
        System.out.printf("lastAccessTime: %s\n", attrs.lastAccessTime());
        System.out.printf("lastModifiedTime: %s\n", attrs.lastModifiedTime());
        System.out.printf("isDirectory: %b\n", attrs.isDirectory());       
        
        //捷徑
        System.out.printf("isSymbolicLink: %b\n", attrs.isSymbolicLink()); 
        System.out.printf("size: %d\n", attrs.size());
    }
}
