package source.NIO2.DirectoryStream;

import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.FileVisitResult.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryStreamDirAll {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("c:\\windows");
        Files.walkFileTree(path, new ConsoleFileVisitor());
    }
}
class ConsoleFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {
        printSpace(path);
        System.out.printf("%s\n", path.getFileName());
        return CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
        printSpace(path);
        System.out.printf("[%s]\n", path.getFileName());
        return CONTINUE;
    }
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }
    private void printSpace(Path path) {
        System.out.printf("%" + path.getNameCount() * 2 + "s", " ");
    }
}
