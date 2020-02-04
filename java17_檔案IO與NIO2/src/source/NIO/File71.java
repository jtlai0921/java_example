package source.NIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//讀檔案_壓jar後
public class File71 {
   
    public static void main(String[] args) {
         try {
            InputStream is = File71.class.getResourceAsStream("條碼.txt");

            // InputStream is = this.getClass().getResourceAsStream("條碼.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
