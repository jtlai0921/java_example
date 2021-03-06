package source;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceMessageDemo {

    public static void main(String[] args) {
        Locale currentLocale;
        ResourceBundle messages;

        currentLocale = new Locale("es");

        messages = ResourceBundle.getBundle("resources.Messages", currentLocale);
        System.out.println(messages.getString("Messagesgreetings"));
        System.out.println(messages.getString("Messagesinquiry"));
        System.out.println(messages.getString("Messagesfarewell"));

    }

}
