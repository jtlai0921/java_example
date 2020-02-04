package source.NIO2.DirectoryStream;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Visitor_NIO2 {

    public static String path = "D:\\wwwroot"; //要搜尋的路徑
    public static String fileName = "Default.aspx"; //要尋找的檔案名稱

    public static void main(String[] args) throws IOException {

        Path rootD = Paths.get(path); //取得要掃描的目錄
        Files.walkFileTree(rootD, new FindMp4Visitor()); //呼叫walkFileTree方法，

    }
    //SimpleFileVisitor是最簡單易用實作FileVisitor的類別
    public static class FindMp4Visitor extends SimpleFileVisitor<Path> { 

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {//掃描檔

            if (file.getFileName().toString().equals(fileName)) {//判斷是否為要搜尋的檔案
                System.out.println(file);
            }

            return FileVisitResult.CONTINUE; //繼續往下找
        }
    }
}
