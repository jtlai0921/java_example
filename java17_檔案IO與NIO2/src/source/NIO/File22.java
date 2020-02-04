package source.NIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File22 {
    
    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;

        try {
            // File file = new File("fileWrite22.txt");
            FileWriter fw = new FileWriter("fileWrite22.txt", true);
            fw.write("howdy\nfolks\n");
            fw.flush();
            fw.close();
            //FileReader fr = new FileReader(file);
            FileReader fr = new FileReader("fileWrite22.txt");
            size = fr.read(in);
            System.out.print(size + " ");

            for (char c : in) {
                System.out.print(c);
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
