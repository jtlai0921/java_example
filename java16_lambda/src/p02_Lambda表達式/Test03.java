package p02_Lambda表達式;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator 是 系統的 API ==>武斷順序 可以由大到小排
public class Test03 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        //1. 匿名類別     
        Collections.sort(names, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });        
        System.out.println(names); //[xenia, peter, mike, anna]
        
        //2. Lambda      
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
        System.out.println(names); //[xenia, peter, mike, anna]   
    }
}
