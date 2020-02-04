package source;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo3 {
//路徑要放到 [classes] 下 , 讀不到資源檔時 , 會讀到 A.properties

    public static void main(String[] args) throws UnsupportedEncodingException {
        ResourceBundle rsdefault = ResourceBundle.getBundle("A", Locale.getDefault());
        System.out.println(new String(rsdefault.getString("Test").getBytes("8859_1"), "big5"));
        ResourceBundle rsEnglish = ResourceBundle.getBundle("A", Locale.ENGLISH);
        System.out.println(rsEnglish.getString("Test"));
        ResourceBundle rsTaiwan = ResourceBundle.getBundle("A", Locale.TAIWAN);
        //System.out.println(rsTaiwan.getString(testString));
        System.out.println(new String(rsTaiwan.getString("Test").getBytes("8859_1"), "big5"));

        Locale locale = new Locale.Builder().setLanguage("en").setRegion("FR").build();
        ResourceBundle rsdefault1 = ResourceBundle.getBundle("A", locale);
        System.out.println(rsdefault1.getString("Test"));
    }
}
