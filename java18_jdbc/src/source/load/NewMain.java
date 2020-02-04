package source.load;

import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class NewMain {

    public static void main(String[] args) {

        String str = "陳建仁昨天表示，很遺憾大理街這名獨居老人已經死亡，來不及採集檢體化驗到底是不是SARS，";

        StringTokenizer st = new StringTokenizer(str, "，");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        SimpleDateFormat bartdateFormat = new SimpleDateFormat("yyyy/MM/dd");

        String dateString = "1983/9/14";

        try {
            java.util.Date date = bartdateFormat.parse(dateString);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());
            System.out.println(sqldate.getTime());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
