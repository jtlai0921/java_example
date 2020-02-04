package source;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo2 {
//路徑要放到 [classes] 下

    public static void main(String[] args) throws UnsupportedEncodingException {
        ResourceBundle resb1 = ResourceBundle.getBundle("hello", Locale.US);
        System.out.println(resb1.getString("hello"));
        
        ResourceBundle resb2 = ResourceBundle.getBundle("hello", Locale.TAIWAN);
        //System.out.println(rsTaiwan.getString(testString));
        System.out.println(new String(resb2.getString("hello").getBytes("8859_1"), "big5"));
    }
}
