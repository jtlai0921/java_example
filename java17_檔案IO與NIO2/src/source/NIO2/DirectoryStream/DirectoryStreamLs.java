package source.NIO2.DirectoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class DirectoryStreamLs {

    public static void main(String[] args) throws IOException {
        // 取得目前工作路徑
        Path path = Paths.get(System.getProperty("user.dir"));
        System.out.println(path.toString());
        // 預設取得所有檔案
       // String glob = "*"; //比對 零個或多個字元
         String glob = "*.{txt,jpg}"; 
       
        try (DirectoryStream<Path> stream = Files.newDirectoryStream( path, glob)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        }
    }
}

