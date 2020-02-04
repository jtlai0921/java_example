package p04_方法與建構函數引用;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test55 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("peter", "anna", "make");       
        //匿名類別
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                return t.compareTo(t1);
            }
        });
        System.out.println(list); //[anna, make, peter]
        //Lambda        
        Collections.sort(list, (t, t1) -> t.compareTo(t1));
        System.out.println(list); //[anna, make, peter]
        ///////////
        //方法引用-3. 類名 :: 實例方法名
        Collections.sort(list, String::compareTo);
        System.out.println(list); //[anna, make, peter]
    }
}
