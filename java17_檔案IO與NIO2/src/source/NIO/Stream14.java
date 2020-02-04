package source.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Stream14 {

    public static void main(String[] args) {
        try {
            String str = readFile14("條碼.txt");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile14(String name) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        InputStream input = new FileInputStream(name); //假如失敗 , 會當在這一行
        Scanner scanner = new Scanner(input); //當上一行當掉 , 此行就不會做 , scanner 就會是 null
        try {
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
        } finally {
            scanner.close(); //如果 InputStream 建構失敗 , 此行會丟 NullPointerException
            return builder.toString();
        }
    }
}
