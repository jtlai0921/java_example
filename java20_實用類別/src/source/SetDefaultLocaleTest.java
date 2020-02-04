package source;

import java.text.NumberFormat;
import java.util.Locale;

public class SetDefaultLocaleTest {

    public static void main(String[] args) throws Exception {

        System.out.println("Default locale:" + Locale.getDefault().toString());
        formattedDoubleTest();

        System.out.println("\nSetting default locale to en_US");
        Locale en_USLocale = new Locale("en", "US");
        Locale.setDefault(en_USLocale);

        System.out.println("New default locale:" + Locale.getDefault().toString());
        formattedDoubleTest();

    }

    public static void formattedDoubleTest() {
        double doub = 1234567.89;
        Locale defaultLocale = Locale.getDefault();
        NumberFormat numberFormat = NumberFormat.getInstance(defaultLocale);
        String formattedNum = numberFormat.format(doub);
        System.out.println(doub + " formatted (" + defaultLocale.toString() + "):" + formattedNum);
    }

}
