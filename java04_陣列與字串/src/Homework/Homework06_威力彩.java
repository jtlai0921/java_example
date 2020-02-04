package Homework;

public class Homework06_威力彩 {

    public static void main(String[] args) {
        boolean[] ok = new boolean[49 + 1]; //49個狀態
        int[] data = new int[6]; //6個數字        
        int tmp;
        for (int i = 0; i < 6;) {
            int num = (int) (Math.random() * 49) + 1; //1~49
            if (ok[num] == false) { //未抓過
                data[i] = num;
                ok[num] = true; //設定為抓取過
                i++;
            }
        }

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(data[i] + "\t");
        }
    }

}
