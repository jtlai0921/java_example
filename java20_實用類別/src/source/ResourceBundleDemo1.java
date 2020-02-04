package source;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo1 {
//路徑要放到 [classes] 下
    public static void main(String[] args) {
        Locale locale1 = new Locale("zh", "TW");
        ResourceBundle resb1 = ResourceBundle.getBundle("example", locale1);
        System.out.println(resb1.getString("aaa"));

        Locale locale2 = new Locale("en", "US");
        ResourceBundle resb2 = ResourceBundle.getBundle("example", locale2);
        System.out.println(resb2.getString("aaa"));
        
        
        ResourceBundle resource = ResourceBundle.getBundle("resources.Messages");
        System.out.print(resource.getString("aaa"));
        
    }
}
