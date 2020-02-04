package source;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo5 {
//路徑要放到 [classes] 下
    public static void main(String[] args) {
        Locale locale1 = new Locale("de","DE");
        ResourceBundle resb1 = ResourceBundle.getBundle("MessagesBundle", locale1);
        System.out.println(resb1.getString("inquire"));

       
        
        
      
        
    }
}
