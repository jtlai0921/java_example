package source.NIO2.DirectoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirectoryStreamDir {
    
//會先列出目錄 , 再列出檔案
    public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("c:\\");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            List<String> files = new ArrayList<>();
            
            for (Path path1 : stream) {
                
                if (Files.isDirectory(path1)) {
                    System.out.printf("[%s]\n", path1.getFileName()); //目錄直接印
                } else {
                    files.add(path1.getFileName().toString()); //把檔案加進集合內
                }
            }
            for (String file : files) { //最後再把檔案印出來
                System.out.println(file);
            }
        }
    }
}



