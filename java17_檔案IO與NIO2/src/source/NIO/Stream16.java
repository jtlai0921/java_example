package source.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Stream16 {

    public static void main(String[] args) {
        try {
            String str = readFile16("條碼.txt");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile16(String name) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        InputStream input = new FileInputStream(name);
        Scanner scanner = new Scanner(input);
        Throwable localThrowable2 = null;
        try {
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append('\n');
            }
        } catch (Throwable localThrowable1) {
            localThrowable2 = localThrowable1;
            throw localThrowable1;
        } finally {
            if (scanner != null) {
                try {
                    scanner.close();
                } catch (Throwable x2) {
                    localThrowable2.addSuppressed(x2); //可將第2個例外記錄在第1個例外中
                }
            } else {
                scanner.close();
            }
        }
        return builder.toString();
    }
}
