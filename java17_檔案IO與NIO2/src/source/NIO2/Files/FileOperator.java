package source.NIO2.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileOperator {

    public static void createdirectory() throws IOException {
        Path file1 = Paths.get("dir1");
        Files.createDirectories(file1);
    }

    public static void createFile() throws IOException {
        Path target = Paths.get("study-copy.txt");
        Files.createFile(target);
    }

    public static void deleteFile() throws IOException {
        Path target = Paths.get("study-copy.txt");
        Files.delete(target);
    }

    public static void copyFile() throws IOException {
        Path source = Paths.get("study-copy.txt");
        Path target = Paths.get("study-copy2.txt");
        Files.copy(source, target, REPLACE_EXISTING);
    }

    public static void moveFile() throws IOException {
        Path source = Paths.get("study-copy.txt");
        Path target = Paths.get("c:\\study-copy.txt");
        Files.move(source, target, REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        try {
           //createdirectory();
           createFile();
           // deleteFile();
            //copyFile();
            //moveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
