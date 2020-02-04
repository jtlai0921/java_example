package homework;

import java.util.Scanner;


public class Homework0802_最接近n的最大最小質數 {

     public static void main(String[] args) {
        int n;
        int cnt = 0;
        Scanner s = new Scanner(System.in);
        
        while (true) {

            System.out.printf("Input n ( > 0) : ");
            n = s.nextInt();

            if (n > 0) {
                break;
            }
            System.out.println("Error , n<0 ");
        }

        for (int x = n + 1;; x++) {
            cnt = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.println(x + "是 > " + n + " 最近的質數");
                break;
            }
        }

        for (int x = n - 1;; x--) {
            cnt = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.println(x + "是 < " + n + " 最近的質數");
                break;
            }
        }
    }
}
