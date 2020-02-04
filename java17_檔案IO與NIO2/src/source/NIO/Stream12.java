package source.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Stream12 {

    public static void main(String[] args) {
        String str = readFile12("條碼.txt");
        System.out.println(str);
    }
//在讀檔的過程中自行處理例外的發生不符合需求
    public static String readFile12(String name) {
        StringBuilder builder = new StringBuilder();
        try {
            InputStream input = new FileInputStream(name);
            Scanner scanner = new Scanner(input);
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
