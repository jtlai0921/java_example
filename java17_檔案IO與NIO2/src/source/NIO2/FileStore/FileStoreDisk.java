package source.NIO2.FileStore;

import java.io.IOException;
import java.nio.file.*;
import java.text.DecimalFormat;

public class FileStoreDisk {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("c:\\");

//全部磁碟
        FileSystem fs = FileSystems.getDefault();
        for (FileStore store : fs.getFileStores()) {
            printDisk(store);
        }
//指定單一磁碟
        FileStore store = Files.getFileStore(path);
        printDisk(store);
    }

    public static void printDisk(FileStore store) throws IOException {
        long total = store.getTotalSpace();
        long used = store.getTotalSpace() - store.getUnallocatedSpace();
        long usable = store.getUsableSpace();
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        System.out.println(store.toString());
        System.out.printf("\t- 總容量\t%s\t位元組\n", formatter.format(total));
        System.out.printf("\t- 已用空間\t%s\t位元組\n", formatter.format(used));
        System.out.printf("\t- 可用空間\t%s\t位元組\n", formatter.format(usable));
    }
}
