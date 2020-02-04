package homework;

import java.util.Arrays;

public class TestPersonX {

    public static void main(String[] args) {

        PersonX 人1 = new PersonX("甲", 30, 170);
        PersonX 人2 = new PersonX("乙", 35, 160);
        PersonX 人3 = new PersonX("丙", 20, 150);
        PersonX[] 人 = {人1, 人2, 人3};
        
        Arrays.sort(人, null);
        System.out.println("自然排序");
        for (PersonX x : 人) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("武斷排序");
        Arrays.sort(人, new PersonX());

        for (PersonX x : 人) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
