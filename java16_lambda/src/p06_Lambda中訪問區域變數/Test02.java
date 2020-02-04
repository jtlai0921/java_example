package p06_Lambda中訪問區域變數;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02 {

    public static void main(String[] args) {
        
        Path first = Paths.get("/usr/bin");
        //下面的first與上面的產生衝突。
        //Comparator<String> comp = (first, second) -> Integer.compare(first.length(), second.length());       
      
    }
}
