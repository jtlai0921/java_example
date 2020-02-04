package source.NIO2.FileSystem;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileSystemWatchDir {
    
    public static void main(String[] args) {        
        Runnable myRun = new Runnable() {
            public void run() {
                Path path = Paths.get("abc");//你電腦的目錄
                WatchService watchService = null;       
                   try {
                    watchService = FileSystems.getDefault().newWatchService(); //取得 FileSystem
                    path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY, //註冊 監聽
                            StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
                } catch (IOException e) {
                    e.printStackTrace();
                }                
                for (;;) { //無窮迴圈
                    WatchKey key = null;
                    try {
                        key = watchService.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }                    
                    for (WatchEvent<?> event : key.pollEvents()) {
                        switch (event.kind().name()) {
                            case "OVERFLOW":
                                System.out.println("We lost some events");
                                break;
                            case "ENTRY_MODIFY":
                                System.out.println("File " + event.context() + " is changed!");
                                break;
                            case "ENTRY_CREATE":
                                System.out.println("File " + event.context() + " is ENTRY_CREATE!");
                                break;
                            case "ENTRY_DELETE":
                                System.out.println("File " + event.context() + " is ENTRY_DELETE!");
                                break;
                        }
                    }
                    key.reset();
                }
            }
        };        
        ExecutorService exs = Executors.newCachedThreadPool();
        exs.execute(myRun);
    }
}
