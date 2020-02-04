package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.List;

public class Test_parallel1 {

    public static void main(String[] args) {
        List<String> list = getLoopList();
        normalBeforeLoop(list);
        normalAfterLoop(list);
        notNormalAfterLoop(list);
    }

    private static void notNormalAfterLoop(List<String> list) {
        long a = System.currentTimeMillis();
        list.stream().parallel()
                .forEach(System.out::println);
        System.out.println(" list.stream().parallel().forEach 执行耗时 : " + (System.currentTimeMillis() - a) / 1000f + " 秒 ");
    }

    private static void normalAfterLoop(List<String> list) {
        long a = System.currentTimeMillis();
        list.stream()
                .forEach(System.out::println);
        System.out.println(" list.stream().forEach 执行耗时 : " + (System.currentTimeMillis() - a) / 1000f + " 秒 ");
        a = System.currentTimeMillis();
        list.forEach(System.out::println);
        System.out.println(" list.forEach 执行耗时 : " + (System.currentTimeMillis() - a) / 1000f + " 秒 ");
    }

    private static void normalBeforeLoop(List<String> list) {
        long a = System.currentTimeMillis();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(" for each 执行耗时 : " + (System.currentTimeMillis() - a) / 1000f + " 秒 ");
    }

    private static List<String> getLoopList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("item " + i);
        }
        return list;
    }
}
