package Homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Student {

    public String 名字;
    public double 數學;
    public double 英文;
    public double 國文;
    public double 總分;
    public double 平均;

    public Student() {
        super();
    }

    public Student(String 名字, double 數學, double 英文, double 國文) {
        super();
        this.名字 = 名字;
        this.數學 = 數學;
        this.英文 = 英文;
        this.國文 = 國文;
        this.總分 = 數學 + 英文 + 國文;

        this.平均 = (數學 + 英文 + 國文)/3.0;
    }

    public String toString() {

        return 名字 + ","
                + 數學 + ","
                + 英文 + ","
                + 國文 + ","
                + 總分 + ","
                + 平均;

    }
    
    public static void 寫檔案(String str) {
        try {
            FileWriter fw = new FileWriter("Student.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(str);

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
