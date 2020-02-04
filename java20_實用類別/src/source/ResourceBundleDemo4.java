package source;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo4 {
//路徑要放到 [classes] 下
    public static void main(String[] args) {
             
        ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
        System.out.println(resource.getString("HELLO_MESG"));           
        System.out.println(resource.getString("GOODBYE_MSG"));           
    }
}
