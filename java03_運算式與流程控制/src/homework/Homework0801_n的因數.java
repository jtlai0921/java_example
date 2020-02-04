package homework;

import java.util.Scanner;

public class Homework0801_n的因數 {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.printf("Input n ( > 0) : ");
            n = s.nextInt();

            if (n > 0) {
                break;
            }
            System.out.println("Error , n<0 ");
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
