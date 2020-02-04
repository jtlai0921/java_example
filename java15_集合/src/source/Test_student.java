package source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test_student {

    public static void test01() {
        List<String> a = new LinkedList<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

    public static void test02() {
        List<String> a = new ArrayList<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add(2, "xxxx");
        a.remove(10);
        a.add("cccc");
        a.remove("aaaa");
        a.remove(1);
        a.add("dddd");
        // a.add(10,"yyyyy");

        System.out.println(a);
    }

    public static void test03() {
        Stack<String> a = new Stack<>();
        a.push("1.bbbb");
        a.push("2.aaaa");
        a.push("3.cccc");
        a.push("4.dddd");

        // System.out.println(a);
        while (!a.isEmpty()) {
            System.out.println(a.pop());
        }

    }

    public static void test04() {
        Queue<String> a = new PriorityQueue<>();
        a.offer("3.cccc");
        a.offer("4.dddd");
        a.offer("1.bbbb");
        a.offer("2.aaaa");

        System.out.println(a);

        while (a.peek() != null) {
            System.out.println(a.poll());
        }

    }

    public static void test05() {
        Queue<String> a = new LinkedList<>();
        a.offer("3.cccc");
        a.offer("4.dddd");
        a.offer("1.bbbb");
        a.offer("2.aaaa");

        System.out.println(a);

        while (a.peek() != null) {
            System.out.println(a.poll());
        }

    }

    public static void test06() {
        Set<String> a = new HashSet<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("cccc");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

    public static void test07() {
        Set<String> a = new TreeSet<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("cccc");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

    public static void test08() {
        Set<String> a = new LinkedHashSet<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("cccc");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

    public static void test09() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);
    }

    public static void test10() {
        Map<String, String> a = new TreeMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);
    }

    public static void test11() {
        Map<String, String> a = new LinkedHashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);
    }

    public static void test12() {
        Map<String, String> a = new LinkedHashMap<>();
        a.putIfAbsent("bbbb", "A1");
        a.putIfAbsent("aaaa", "A2");
        a.putIfAbsent("cccc", "A3");
        a.putIfAbsent("cccc", "A4");
        a.putIfAbsent("cccc", "A5");
        a.putIfAbsent("dddd", "A6");
        System.out.println(a);
    }

    public static void test13() {
        List<String> a = new LinkedList<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);

        Iterator it = a.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

    public static void test14() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);

        Set set = a.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

    public static void test15() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);

        Collection set = a.values();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

    public static void test16() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);

        Set set = a.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> b = (Map.Entry<String, String>) it.next();
            System.out.println(b.getKey() + " " + b.getValue());
        }

    }

    public static void test17() {
        Set<String> a = new HashSet<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("cccc");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a.toString());
        ////
        for (String o : a) {
            System.out.print(o + " ");
        }
        System.out.println();
        ///
        for (Object o : a.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void test18() {
        String[] ar1 = {"Mary", "Tom", "Jerry", "Kimy", "Joyes"};
        Arrays.sort(ar1);

        for (String o : ar1) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void test19() {
        String[] ar1 = {"Mary", "Tom", "Jerry", "Kimy", "Joyes"};
        List list = Arrays.asList(ar1);

        Collections.sort(list);
        System.out.println(list);
    }

    public static void test20() {
        String[] ar1 = {"Mary", "Tom", "Jerry", "Kimy", "Joyes"};

        List list = Arrays.asList(ar1);
        System.out.println(list);
    }

    public static void test21() {
        String[] ar1 = {"Mary", "Tom", "Jerry", "Kimy", "Joyes"};
        List list = Arrays.asList(ar1);

        Collections.sort(list);
        System.out.println(list);
    }

    public static void test22() {
//        Comparator p = new Comparator() {
//
//            public int compare(Object o1, Object o2) {
//                String s1 = (String) o1;
//                String s2 = (String) o2;
//                return s2.compareTo(s1); 
//            }
//        };

        Comparator<String> p = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        List<String> list = Arrays.asList("Mary", "Tom", "Jerry", "Kimy", "Joyes");
        Collections.sort(list, p);
        System.out.println(list);
    }

    public static void main(String[] args) {
        //test01();
        //test02();
        // test03();
        //test04();
        // test05();
        //test08();
//        test09();
//        test10();
//        test11();
//        test12();
//        test13();
//        test14();
//        test15();
//        test16();
//        test17();
//        test18();
//        test19();
//        test20();
//        test21();
        test22();
    }
}
