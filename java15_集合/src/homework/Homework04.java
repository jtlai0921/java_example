package homework;

import java.util.Set;
import java.util.TreeSet;

//樂透號碼_集合
public class Homework04 {

    public static void main(String[] args) {
          Set aSet = new TreeSet();
        do {
            aSet.add((int) (Math.random() * 49) + 1);
        } while (aSet.size() < 7);
        System.out.println(aSet);
    }
}
