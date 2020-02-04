package source.NIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class DataReader1 {

    public static void main(String[] args) {
        try {
            DataInputStream dataInput = new DataInputStream(new FileInputStream("Number.txt"));

            while (true) {
                short age = dataInput.readShort();
                System.out.print(age + "\t");
            }
        } catch (IOException ex) {

        }
        System.out.println();  
        
     }
}
