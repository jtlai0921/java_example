package homework;

import java.util.Arrays;
//樂透號碼_陣列
public class Homework03 {

    public static void main(String[] args) {
         int[] ar1 = new int[6];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = (int) (Math.random() * 49) + 1;
            for (int j = 0; j < i - 1; j++) {
                if (ar1[i] == ar1[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(ar1);

        for (int x : ar1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
