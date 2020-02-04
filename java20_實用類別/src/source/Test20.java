package source;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DecimalFormat;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test20 {

    public static void 系統參數() {

        System.out.println(System.getProperty("java.version")); //1.7.0_07
        System.out.println(System.getProperty("os.name")); //Windows 7
        System.out.println(System.getProperties());
        System.out.println(System.getProperties().get("os.name"));
        //System 提供的設定與取得
        System.setProperty("three", "3");
        System.out.println("three=" + System.getProperty("three")); //3     
    }

    public static void 三種字串型別的不同() {
        String x = "abcde";
        x.concat("xyz"); //產生新字串
        System.out.println("String 無重新指派 x=" + x);  //abcde

        x = x.concat("xyz"); //產生新字串 , 重新指派到新字串    
        System.out.println("String 有重新指派 x=" + x); //abcdexyz

        StringBuffer y = new StringBuffer("abcde");
        y.append("xyz");
        System.out.println("StringBuffer y=" + y);  //abcdexyz

        StringBuilder z = new StringBuilder("abcde");
        z.append("xyz");
        System.out.println("StringBuilder z=" + z);  //abcdexyz
    }

    public static void String的函數1() {
        // 字串的 三種型別都有 subString() 的方法
        // 但 subString==>會回傳 String 型別
        String s1 = "abcdefg";
        System.out.println("s1.substring(2)=" + s1.substring(2));  //cdefg
        System.out.println("s1.substring(2, 4)=" + s1.substring(2, 4)); //cd

        StringBuffer s2 = new StringBuffer("abcdefg");
        String s3 = s2.substring(2);
        System.out.println("s3=" + s3);

        StringBuilder s4 = new StringBuilder("abcdefg");
        String s5 = s4.substring(2);
        System.out.println("s5=" + s5);
    }

    public static void String的函數2() {
        //charAt
        String s1 = "abcdefg";
        System.out.println("s1.charAt(0) = " + s1.charAt(0)); //a

        //toCharArray
        char[] ar1;
        ar1 = "abcde".toCharArray();
        for (char x : ar1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        //getChars
        char[] ca = new char[5];  //空
        "abcdef".getChars(1, 4, ca, 1);
        for (char x : ca) {
            System.out.print(x + " ");
        }
    }

    public static void String的函數3() {
        // startsWith
        System.out.println("abc123abc123".startsWith("abc"));  //true
        System.out.println("abc123abc123".endsWith("c123"));  //true
        System.out.println("abc123abc123".startsWith("3abc1", 5));  //true

        //compareTo
        System.out.println("abc".compareTo("abc"));  //0
        System.out.println("abc".compareTo("abcdef"));  //-3
        System.out.println("a".compareTo("Azzzz"));  //32

        //indexOf
        System.out.println("abc123abc123".indexOf("c12"));  //2
        System.out.println("abc123abc123".indexOf("c12", 3));  //8
        System.out.println("abc123abc123".lastIndexOf("c12", 8));  //8
        System.out.println("abc123abc123".lastIndexOf("c12", 7));  //2
    }

    public static void String的函數4() {
        //replace
        System.out.println("abc123abc123".replace('a', 'x')); //xbc123xbc123"  1.4
        System.out.println("abc123abc123".replace("abc", "xyz"));// xyz123xyz123 5.0
        System.out.println("  abc 123   ".trim());  //abc 123
    }

    public static void StringBuffer的函數() {
        StringBuffer sb = new StringBuffer("12345678");
        StringBuffer sc = new StringBuffer("12345678");

        System.out.println("sc.equals(sb) =" + sc.equals(sb)); //false , 沒有覆寫 equals
        System.out.println(sc.toString().equals(sb.toString())); //true 

        String a = "abcdefg";
        String b = "abcdefg";

        System.out.println("a.equals(b) = " + a.equals(b)); //true 有覆寫 equals

        // "12345678"
        sb.setCharAt(3, 'a');
        System.out.println("sb = " + sb);  //123a5678
        //replace
        sb.replace(1, 6, "xyz");
        System.out.println("sb= " + sb);  //1xyz78
        //append
        sb.append("z");
        System.out.println("sb= " + sb);  //1xyz78z
        sb.append("3.1416");
        System.out.println("sb= " + sb);  //1xyz78z3.1416
        //setLength
        sb.setLength(3);
        System.out.println("sb= " + sb);  //1xy
        //delete
        sb.delete(1, 2);
        System.out.println("sb= " + sb);  //1y
        sb.append("wxyz"); //1ywxyz
        //insert
        sb.insert(2, "abc");
        System.out.println("sb= " + sb);  //1yabcwxyz
        //reverse
        sb.reverse();
        System.out.println("sb= " + sb);  //zyxwcbay1
    }

    //搜尋
    public static void 樣式匹配搜尋1() {

        Pattern p = Pattern.compile("ab");  //樣版
        Matcher m = p.matcher("abaaaba");
        boolean b = false;
        System.out.println("Pattern is " + m.pattern()); //ab

        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 0 找到 ab
//在位置 4 找到 ab
    public static void 樣式匹配搜尋2() {

        Pattern p = Pattern.compile("aba");  //樣版
        Matcher m = p.matcher("abababa");  //索引 2 的 ab 被消耗了

        boolean b = false;
        System.out.println("Pattern is " + m.pattern());
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 0 找到 aba
//在位置 4 找到 aba
//使用中介字元
    public static void 樣式匹配搜尋3() {
        String x = "\\d";
        String y = "a12c3e456f";

        Pattern p = Pattern.compile(x);  //樣版
        Matcher m = p.matcher(y);

        boolean b = false;
        System.out.println("Pattern is " + m.pattern());
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 1 找到 1
//在位置 2 找到 2
//在位置 4 找到 3
//在位置 6 找到 4
//在位置 7 找到 5
//在位置 8 找到 6
    public static void 樣式匹配搜尋4() {
        String x = "\\w";
        String y = "a 1 56 _Z";
        Pattern p = Pattern.compile(x);  //樣版

        Matcher m = p.matcher(y);
        boolean b = false;
        System.out.println("Pattern is " + m.pattern());
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 0 找到 a
//在位置 2 找到 1
//在位置 4 找到 5
//在位置 5 找到 6
//在位置 7 找到 _
//在位置 8 找到 Z
    public static void 樣式匹配搜尋5() {
        String x = "\\d\\w";
        String y = "ab4 56_7ab";
        Pattern p = Pattern.compile(x);  //樣版

        Matcher m = p.matcher(y);
        boolean b = false;
        System.out.println("Pattern is " + m.pattern());
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 4 找到 56
//在位置 7 找到 7a
    public static void 樣式匹配搜尋6() {
        String x = "[a-f]";
        String y = "ab4 56_7ab";
        Pattern p = Pattern.compile(x);  //樣版

        Matcher m = p.matcher(y);
        boolean b = false;
        System.out.println("Pattern is " + m.pattern());
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 0 找到 a
//在位置 1 找到 b
//在位置 8 找到 a
//在位置 9 找到 b
    public static void 樣式匹配搜尋7() {
        String x = "[abc]";
        String y = "ab4 5c6_7acb";
        Pattern p = Pattern.compile(x);  //樣版

        Matcher m = p.matcher(y);
        boolean b = false;
        System.out.println("Pattern is " + m.pattern());
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 0 找到 a
//在位置 1 找到 b
//在位置 5 找到 c
//在位置 9 找到 a
//在位置 10 找到 c
//在位置 11 找到 b
    public static void 樣式匹配搜尋8() {
        String x = "[a-fA-F]";
        String y = "ab4 56_7ab9BF";
        Pattern p = Pattern.compile(x);  //樣版

        Matcher m = p.matcher(y);
        boolean b = false;
        System.out.println("Pattern is " + m.pattern());
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 0 找到 a
//在位置 1 找到 b
//在位置 8 找到 a
//在位置 9 找到 b
//在位置 11 找到 B
//在位置 12 找到 F
    public static void 樣式匹配搜尋9() {
        String x = "\\d";
        String y = "ab12cde345fg";
        Pattern p = Pattern.compile(x);
        Matcher m = p.matcher(y);
        boolean b = false;
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 2 找到 1
//在位置 3 找到 2
//在位置 7 找到 3
//在位置 8 找到 4
//在位置 9 找到 5
    public static void 樣式匹配搜尋10() {
        String x = "\\d+";
        String y = "ab12cde345fg";
        Pattern p = Pattern.compile(x);
        Matcher m = p.matcher(y);
        boolean b = false;
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }

//在位置 2 找到 12
//在位置 7 找到 345
    public static void 樣式匹配搜尋11() {
        String x = "\\d*";
        String y = "ab12cde345fg";
        Pattern p = Pattern.compile(x);
        Matcher m = p.matcher(y);
        boolean b = false;
        while (b = m.find()) {
            System.out.println("在位置 " + m.start() + " " + "找到 " + m.group());
        }
    }
//在位置 0 找到
//在位置 1 找到
//在位置 2 找到 12
//在位置 4 找到
//在位置 5 找到
//在位置 6 找到
//在位置 7 找到 345
//在位置 10 找到
//在位置 11 找到
//在位置 12 找到

//符號化==>剖析
    public static void split1() {
        String x = "abeeeeee#cdy#efd";
        String y = "#";
        String[] z;
        z = x.split(y);
        for (String m : z) {
            System.out.println(m);
        }
    }

//abeeeeee
//cdy
//efd
    public static void split2() {
        String x = "abeeeeee5cdy67efd";
        String y = "\\d";
        String[] z;
        z = x.split(y);
        for (String m : z) {
            System.out.println(m);
        }
    }

//abeeeeee
//cdy
//
//efd
    public static void split3() {
        String x = "abeeeeee5cdy67efd";
        String y = "\\d+";
        String[] z;
        z = x.split(y);
        for (String m : z) {
            System.out.println(m);
        }
    }

    public static void scanner1() {

        boolean x, y;
        int i;
        String s;

        String a = "1 true 34 hi";  // Scanner 會以空白分隔

        String b = "1 a 3 4";  // Scanner 會以空白分隔

        // Scanner s1 = new Scanner(a).useDelimiter(" ");
        Scanner s1 = new Scanner(a);

        while (x = s1.hasNext()) {
            s = s1.next();
            System.out.println(s + " ");
        }

        System.out.println();

        Scanner s2 = new Scanner(b);
        while (y = s2.hasNext()) {
            i = s2.nextInt();

            System.out.println(i + " "); //印完 1 後 會當掉--------
        }
    }

    public static void scanner2() {
        boolean x, y;
        int i, m;
        String s;
        String a = "1 true 34 hi";  // Scanner 會以空白分隔

        Scanner s1 = new Scanner(a);

        while (x = s1.hasNextInt()) { //剛好第一個是數字
            m = s1.nextInt();
            System.out.println(m);  //不會當掉 但只印出 1
        }
    }

    public static void scanner3() {
        boolean x, y;
        int i, m;
        String s;
        String a = "a true 34 hi";  // Scanner 會以空白分隔

        Scanner s1 = new Scanner(a);
        while (x = s1.hasNextInt()) { //如果第一個遇到不是數字
            m = s1.nextInt();
            System.out.println(m);  //沒有任何輸出
        }
    }

    public static void scanner4() {
        boolean b2, b;
        int i;
        String s, hits = "";

        String a = "1 true 34 hi";  // Scanner 會以空白分隔

        Scanner s1 = new Scanner(a);
        Scanner s2 = new Scanner(a);

        while (s1.hasNext()) {
            s = s1.next();
            hits += "s";   //ssss
        }
        System.out.println("結果: " + hits);

        hits = "";
        while (b = s2.hasNext()) { //不管遇到什麼都會往前

            if (s2.hasNextInt()) {
                i = s2.nextInt();
                hits += "i";
            } else if (s2.hasNextBoolean()) {
                b2 = s2.nextBoolean();
                hits += "b";
            } else {
                s2.next();
                hits += "s2";
            }
        }
        System.out.println("結果: " + hits);  //ibis2
    }

    public static void scanner5() {
        String a = "Sue,5, true  ,3, abc, false";
        Scanner s1 = new Scanner(a).useDelimiter("\\s*,\\s*");
        boolean ss;

        while (s1.hasNext()) {

            if (s1.hasNextBoolean()) {
                ss = s1.nextBoolean();
                System.out.println(ss);
            } else {
                s1.next();
            }
        }
    }

    public static void scanner6() {
        boolean x;
        String y;

        String input = "ab    ,    cd  ,   ef";
        Scanner s = new Scanner(input).useDelimiter("\\s*,\\s*");
        //  Scanner s = new Scanner(input).useDelimiter(",");
        while (x = s.hasNext()) {
            y = s.next();
            System.out.println(y);
        }
    }

//ab
//cd
//ef
    public static void scanner7() {
        boolean x;
        String y;

        String input = "1   fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        //Scanner s = new Scanner(input).useDelimiter("fish");

        while (x = s.hasNext()) {
            y = s.next();
            System.out.println(y);
        }
    }

//1
//2
//red
//blue
    public static void scanner81() {
        boolean x;
        String y;
        Scanner s = null;

        try {
            File file = new File("abc.txt");
            s = new Scanner(file).useDelimiter("\\s*fish\\s*");
        } catch (FileNotFoundException e) {
            System.out.println("沒有發現檔案");
        }

        while (x = s.hasNext()) {
            y = s.next();
            System.out.println(y);
        }
    }

    public static void scanner82() {
        boolean x;
        String y;

        InputStream file;
        Scanner s = null;

        try {
            file = new FileInputStream("abc.txt");
            s = new Scanner(file).useDelimiter("\\s*fish\\s*");
        } catch (FileNotFoundException e) {
            System.out.println("沒有發現檔案");
        }
        while (x = s.hasNext()) {
            y = s.next();
            System.out.println(y);
        }
    }

    public static void scanner9() {
        Scanner sc = new Scanner("123 A 3b c,45, x5x,76 82 L");
        do {
            if (sc.hasNextInt()) {
                System.out.print(sc.nextInt() + " ");
            }

        } while (sc.hasNext());  //do迴圈一碰到 非數字就不會繼續往前
        //只會印出 123 後就無窮迴圈了
    }

//////////////////////////////////////////////////////////////////////////////
    public static void StringTokenizer1() {
        StringTokenizer st = new StringTokenizer("www.ooobj.com", ".b");
        while (st.hasMoreTokens()) {
            System.out.println("Token:" + st.nextToken());
        }
    }

    public static void StringTokenizer2() {
        StringTokenizer st = new StringTokenizer("www ooobj com");
        while (st.hasMoreElements()) {
            System.out.println("Token:" + st.nextToken());
        }
    }

    public static void StringTokenizer3() {
        StringTokenizer st = new StringTokenizer("www.ooobj.com", ".", true);
        while (st.hasMoreElements()) {
            System.out.println("Token:" + st.nextToken());
        }
    }

    public static void StringTokenizer4() {
        StringTokenizer st = new StringTokenizer("www.ooobj.com");
        while (st.hasMoreTokens()) {
            System.out.println("Token:" + st.nextToken("."));
        }
    }

    //////////////////////////////////////////////////////////////////////////

    public static void 數字的格式化1() {
        //   %[引數索引$][標記][寬度][精確度]轉換字元]
        int i1 = -123;
        int i2 = 12345;

        System.out.printf(">%1$(7d< \n", i1); //負數放在括號內 7碼 >  (123)<

        System.out.printf(">%0,7d< \n", i2); //用 0 填滿 , 7碼 >012,345<

        System.out.format(">%+-7d< \n", i2); //正負號 , 靠左對齊 7 碼 >+12345 <

        System.out.printf(">%2$b + %1$5d< \n", i1, false); //第 2 個數先顯示 布林
        //再顯示第1個數 整數  >false +  -123<
    }

    public static void 數字的格式化2() {
        // System.out.printf("%f", 12); //會當掉
        // System.out.printf("%d", 12.5); //會當掉
        System.out.printf("%7.2f", 12.5);
        System.out.println();
        System.out.printf("%b", 10.2); //true
        System.out.println();
    }

    public static void 數字的格式化3() {

        DecimalFormat formatter = new DecimalFormat("#,###,###.00");

        System.out.printf("%s\n", formatter.format(1234567));

    }

}
