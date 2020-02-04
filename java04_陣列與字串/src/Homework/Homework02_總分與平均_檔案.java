package Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework02_總分與平均_檔案 {

    public static void main(String[] args) {
        String[] ar1;
        double[] total = new double[3];
        double[] average = new double[3];
        int i = 0;
        try {
            FileReader fr = new FileReader("分數.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                ar1 = data.split(",");

                for (int j = 1; j <= 3; j++) {
                    total[i] = total[i] + Integer.parseInt(ar1[j]);
                }
                average[i] = (double) total[i] / 3;
                System.out.println(ar1[0] + " 總分= " + total[i] + " 平均= " + average[i]);
                i++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
