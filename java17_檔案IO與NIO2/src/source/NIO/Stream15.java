package source.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Stream15 {
   
    public static void main(String[] args) {
          String str = "";
        try {
            str = readFile15("條碼.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println(str);
    }
  public static String readFile15(String name) throws FileNotFoundException {
        InputStream input = new FileInputStream(name);

        try (Scanner scanner = new Scanner(input)) {//自動嘗試關閉資源
            StringBuilder builder = new StringBuilder();

            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append("\n");
            }
            return builder.toString();
        }
    }
}
