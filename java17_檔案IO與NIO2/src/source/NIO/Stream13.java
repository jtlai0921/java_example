package source.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Stream13 {
   //拋出給 呼叫者 main() 處理
    public static void main(String[] args) {
          try {
            String str = readFile13("條碼.txt");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 public static String readFile13(String name) throws FileNotFoundException {

        StringBuilder builder = new StringBuilder();
        InputStream input = new FileInputStream(name);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            builder.append(scanner.nextLine());
            builder.append('\n');
        }
        scanner.close(); //此行之前 若發生例外 , scanner.close()就不會做
        return builder.toString();
    }
}
