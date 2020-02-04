package source.NIO2.DirectoryStream;

import java.io.File;

public class Visitor_IO {

    public static String path = "d:\\wwwroot"; //要搜尋的路徑
    public static String fileName = "Default.aspx"; //要尋找的檔案名稱

    public static void main(String arg[]) {

        File file = new File(path);
        method(file);
    }

    public static void method(File file) {
        File f[] = file.listFiles(); //回傳file目錄下的所有檔案與資料夾

        for (int i = 0; i < f.length; i++) {

            if (f[i].isFile()) {//走訪所有目錄，如果不是檔案則進入下一層重覆此搜尋動作
                if (f[i].getName().equals(fileName)) {//是檔案的話，則判斷是不是要找尋的目標               
                    System.out.println(f[i]);
                }
            } else {
                method(f[i]);
            }
        }
    }
}
