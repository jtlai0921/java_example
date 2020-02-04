package source.NIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File21 {

    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;

        try {
            File file = new File("fileWrite21.txt");
            FileWriter fw = new FileWriter(file);

            fw.write("howdy\nfolks\n");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            size = fr.read(in);
            System.out.println(size + " ");

            for (char c : in) {
                System.out.print(c);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
