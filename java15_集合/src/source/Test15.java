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

public class Test15 {

    public static void 陣列() {
        String[] ar1 = new String[5];
        ar1[0] = "apple";
        ar1[1] = "banana";
        ar1[2] = "banana";
        ar1[3] = "banana";
        ar1[4] = "orange";

        for (String x : ar1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void 集合() {
        List 集合1 = new LinkedList();
        集合1.add("apple");
        集合1.add("banana");
        集合1.add("banana");
        集合1.add("banana");
        集合1.add("orange");
        System.out.println(集合1.toString());

        Set 集合2 = new HashSet();
        集合2.add("apple");
        集合2.add("banana");
        集合2.add("banana");
        集合2.add("banana");
        集合2.add("orange");
        System.out.println(集合2);

        Set 集合3 = new TreeSet();

        集合3.add("apple");
        集合3.add("banana");
        集合3.add("banana");
        集合3.add("banana");
        集合3.add("orange");
        System.out.println(集合3);

        Map 集合4 = new HashMap();
        集合4.put("apple", "A");
        集合4.put("banana", "B");
        集合4.put("orange", "C");
        集合4.put("apple", "D");
        集合4.put("banana", "E");
        System.out.println(集合4);

        Map 集合5 = new TreeMap();
        集合5.put("apple", "A");
        集合5.put("banana", "B");
        集合5.put("orange", "C");
        集合5.put("apple", "D");
        集合5.put("banana", "E");
        System.out.println(集合5);
    }

    public static void List集合() {
        List list1 = new LinkedList();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ddd");
        list1.add("ccc");
        list1.add("bbb");
        list1.add("bbb");
        System.out.println("LinkedList==>" + list1);
        //--------------------------------------
        List<String> list2 = new ArrayList();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ddd");
        list2.add("ccc");
        list2.add("bbb");
        list2.add("bbb");
        System.out.println("ArrayList==>" + list2);
    }

    public static void Stack集合1() {
        //先進後出
        Stack<String> stack = new Stack();
        stack.push("1.orange");
        stack.push("2.apple");
        stack.push("3.banana");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }

    public static void Queue集合1() {

        Queue<String> pq = new PriorityQueue<String>();
        pq.offer("orange");
        pq.offer("apple");
        pq.offer("banana");

        System.out.println("toString()方式印==>" + pq);

        System.out.print("poll()方式印==>");
        while ((pq.peek()) != null) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }

    public static void Queue集合2() {

        Queue<String> pq = new LinkedList<String>();
        pq.offer("orange");
        pq.offer("apple");
        pq.offer("branana");

        System.out.println("toString()方式印==>" + pq);

        System.out.print("poll()方式印==>");
        while ((pq.peek()) != null) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }

    public static void Set集合1() {
        Set s1 = new HashSet();
        s1.add("aaa");
        s1.add("bbb");
        s1.add("ddd");
        s1.add("ccc");
        s1.add("bbb");
        s1.add("bbb");
        System.out.println("HashSet==>" + s1);
        //--------------------------------------
        Set s2 = new TreeSet();
        s2.add("aaa");
        s2.add("bbb");
        s2.add("ddd");
        s2.add("ccc");
        s2.add("bbb");
        s2.add("bbb");
        System.out.println("TreeSet==>" + s2);
        //--------------------------------------
        Set s3 = new LinkedHashSet();
        s3.add("aaa");
        s3.add("bbb");
        s3.add("ddd");
        s3.add("ccc");
        s3.add("bbb");
        s3.add("bbb");
        System.out.println("LinkedHashSet==>" + s3);
    }

    public static void Set集合2() {
        List list1 = new LinkedList();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ddd");
        list1.add("ccc");
        list1.add("bbb");
        list1.add("bbb");
        System.out.println("LinkedList==>" + list1);
        //--------------------------------------
        Set set = new HashSet();
        set.addAll(list1);
        System.out.println("HashSet==>" + set);
    }

    public static void Map集合() {
        Map m1 = new HashMap();
        m1.put("aaa", "a1");
        m1.put("bbb", "a2");
        m1.put("ddd", "a4");
        m1.put("ccc", "a3");
        m1.put("aaa", "a5");
        m1.put("bbb", "a6");
        System.out.println("HashMap==>" + m1);
        //--------------------------------------
        Map m2 = new TreeMap();
        m2.put("aaa", "a1");
        m2.put("bbb", "a2");
        m2.put("ddd", "a4");
        m2.put("ccc", "a3");
        m2.put("aaa", "a5");
        m2.put("bbb", "a6");
        System.out.println("TreeMap=>" + m2);
        //--------------------------------------
        Map m3 = new LinkedHashMap();
        m3.put("aaa", "a1");
        m3.put("bbb", "a2");
        m3.put("ddd", "a4");
        m3.put("ccc", "a3");
        m3.put("aaa", "a5");
        m3.put("bbb", "a6");
        System.out.println("LinkedHashMap==>" + m3);

        Map m4 = new HashMap();
        m4.putIfAbsent("aaa", "a1");
        m4.putIfAbsent("bbb", "a2");
        m4.putIfAbsent("ddd", "a4");
        m4.putIfAbsent("ccc", "a3");
        m4.putIfAbsent("aaa", "a5"); //防止 key值 覆蓋
        m4.putIfAbsent("bbb", "a6");
        System.out.println("HashMap==>" + m4);
    }

///////////////////////////////////////////////////////////////////////////////
    public static void iterator1() {
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ddd");
        set.add("ccc");
        set.add("bbb");
        set.add("bbb");
        System.out.println(set);

        Iterator it1 = set.iterator();
        System.out.println(it1);

        while (it1.hasNext()) {
            Object o = it1.next();
            System.out.print(o + " ");
            it1.remove();
        }
        System.out.println();
    }

    public static void iterator2() {
        List list = new LinkedList();
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ccc");
        list.add("bbb");
        list.add("bbb");
        System.out.println(list);

        Iterator it1 = list.iterator();
        while (it1.hasNext()) {
            Object o = it1.next();
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void iterator3() {
        Map m = new HashMap();
        m.put("aaa", "a1");
        m.put("bbb", "a2");
        m.put("ddd", "a4");
        m.put("ccc", "a3");
        m.put("aaa", "a5");
        m.put("bbb", "a6");
        System.out.println(m);

        System.out.println("key------------------------");
        Set key = m.keySet();
        Iterator it1 = key.iterator();
        while (it1.hasNext()) {
            Object o = it1.next();
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("value------------------------");
        Collection value = m.values();
        Iterator it2 = value.iterator();
        while (it2.hasNext()) {
            Object o = it2.next();
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("entryset------------------------");
        Set entryset = m.entrySet();
        Iterator it3 = entryset.iterator();
        while (it3.hasNext()) {
            Map.Entry o = (Map.Entry) it3.next();
            Object ok = o.getKey();
            Object ov = o.getValue();
            System.out.println(ok + " " + ov);
        }
    }

    public static void 印集合的方式() {
        List list = new LinkedList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("ccc");
        list.add("ddd");
        //1.直接印
        System.out.println(list.toString());
        System.out.println();
        //2.快捷迴圈
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
        //3.產生到陣列印
        for (Object o : list.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println();
        //4.產生到ierator的型態
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.print(o + " ");
        }
        //5.直接印 Iterator ==>會得到 null
        System.out.println();
        System.out.println(it);
        //6.Iterator 型態不能用快捷迴圈印
//        for (Object o : it) {
//            System.out.print(o);
//        }
    }

    ///////////////////////////////////////////////////////////////////////////
    public static void Arrays_排序() {
        //排序
        String[] sa = {"a", "abc", "xyz", "ijk", "ab"};
        Arrays.sort(sa);
        for (String i : sa) {
            System.out.print(i + " ");
        } // a ab abc ijk xyz
        System.out.println();

        //布林不能排序 會 Compiler 錯
        boolean[] ar3 = {true, false};
        //Arrays.sort(ar3);
    }

    public static void Arrays_陣列放到集合() {
        String[] sa = {"a", "abc", "xyz", "ijk", "ab"};

        //把陣列放到集合
        List list1 = Arrays.asList(sa); //固定size
        List list2 = new ArrayList(Arrays.asList(sa)); //非固定size

        // list1.add("yyy"); //固定 size不能再加入 , 會當掉
        System.out.print(list1);
        System.out.println();

        list2.add("yyy"); // 非固定 size 可再加入
        System.out.print(list2);
        System.out.println();
    }

    public static void Arrays_比較相不相等() {
        String[] sa1 = {"A", "B", "C", "D"};
        String[] sa2 = {"A", "B", "C", "D"};

        //陣列比較 String 有覆寫 equals 但 String[] 沒有
        System.out.println("sa1 == sa2 是" + (sa1 == sa2));  //false
        System.out.println("sa1.equals(sa2) 是 " + (sa1.equals(sa2)));  //false
        System.out.println("Arrays.equals(sa1, sa2) 是" + (Arrays.equals(sa1, sa2)));  //true
    }

    public static void Arrays_填滿() {
        String[] sa = {"a", "abc", "xyz", "ijk", "ab"};
        //填滿
        Arrays.fill(sa, "A");
        for (String i : sa) {
            System.out.print(i + " ");
        }
    }

    public static void Arrays_binarysearch1() {
        int index;
        String[] ar1 = {"3", "1", "5", "4", "7"};

        Arrays.sort(ar1);
        for (String i : ar1) {
            System.out.print(i + " ");
        }
        System.out.println();

        //1 3 4 5 7
        index = Arrays.binarySearch(ar1, "5");
        System.out.println("index=" + index); //3
        index = Arrays.binarySearch(ar1, "6");
        System.out.println("index=" + index);  //-5
    }

    public static void Arrays_binarysearch2() {
        int index;
        String[] sa = {"blue", "red", "green", "yellow", "orange"};

        Arrays.sort(sa);
        for (String i : sa) {
            System.out.print(i + " ");
        }
        System.out.println();

        //blue green orange red yellow
        index = Arrays.binarySearch(sa, "orange");
        System.out.println("index=" + index);  //2
        index = Arrays.binarySearch(sa, "violet");
        System.out.println("index=" + index);  //-5
    }

    public static void Collections_排序() {
        List list = new LinkedList();
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        list.add("ddd");
        list.add("ccc");
        Collections.sort(list);
        System.out.println(list);
    }

    public static void Collections_洗牌() {
        List list = new LinkedList();
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        list.add("ddd");
        list.add("ccc");
        //洗牌
        Collections.shuffle(list);
        System.out.println(list);
    }

///////////////////////////////////////////////////////////////////////////////
//七個包裝類別 與 字串 已有複寫 Comparable 所以可以排序
    public static void 字串可以排序_有實作Comparable() {
        Comparator p = new Comparator<String>() {
            public int compare(String m, String n) {
                return n.compareTo(m);
            }
        };
        String[] sa = {"b", "c", "a"};

        Arrays.sort(sa);
        for (String a : sa) {
            System.out.print(a + " ");
        }
        System.out.println();
        Arrays.sort(sa, p);
        for (String a : sa) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void 七個包裝類別可以排序_有實作Comparable() {
        Comparator p = new Comparator<Integer>() {
            public int compare(Integer m, Integer n) {
                return n.compareTo(m);
            }
        };
        Integer[] sa = {4, 2, 3, 1};

        Arrays.sort(sa);
        for (Integer a : sa) {
            System.out.print(a + " ");
        }
        System.out.println();
        Arrays.sort(sa, p);
        for (Integer a : sa) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //自定的類別無法排序 , 除非實作 自然順序 compatable的 compareTo  //會當掉
    public static void 自訂的類別無法排序_沒有實作Comparable() {
        CollectionDemo1[] sa = {new CollectionDemo1(4), new CollectionDemo1(2),
            new CollectionDemo1(3), new CollectionDemo1(1)};
        Arrays.sort(sa);
        for (CollectionDemo1 a : sa) {
            System.out.print(a + " ");
        }
    }

    public static void 自訂的類別_可以排序有實作Comparable與Comparator_陣列_沒有泛型() {
        CollectionDemo2 p = new CollectionDemo2();
        CollectionDemo2[] sa = {new CollectionDemo2(4), new CollectionDemo2(2),
            new CollectionDemo2(3), new CollectionDemo2(1)};
        Arrays.sort(sa, null);
        for (CollectionDemo2 x : sa) {
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.sort(sa, p);
        for (CollectionDemo2 x : sa) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void 自訂的類別_可以排序有實作Comparable與Comparator_集合_沒有泛型() {
        CollectionDemo2 p = new CollectionDemo2();
        List list = new ArrayList();
        list.add(new CollectionDemo2(4));
        list.add(new CollectionDemo2(2));
        list.add(new CollectionDemo2(3));
        list.add(new CollectionDemo2(1));

        Collections.sort(list, null);
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
        Collections.sort(list, p);
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void 自訂的類別_可以排序有實作Comparator_陣列_有泛型() {
        CollectionDemo3 p = new CollectionDemo3();
        CollectionDemo3[] sa = {new CollectionDemo3(4), new CollectionDemo3(2),
            new CollectionDemo3(3), new CollectionDemo3(1)};
        Arrays.sort(sa, null);
        for (CollectionDemo3 x : sa) {
            System.out.print(x + " ");
        }
        System.out.println();

        Arrays.sort(sa, p);

        for (CollectionDemo3 x : sa) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void 自訂的類別_可以排序有實作Comparator_集合_有泛型() {
        CollectionDemo3 p = new CollectionDemo3();
        List<CollectionDemo3> list = new ArrayList();
        list.add(new CollectionDemo3(4));
        list.add(new CollectionDemo3(2));
        list.add(new CollectionDemo3(3));
        list.add(new CollectionDemo3(1));

        Collections.sort(list, null);

        for (CollectionDemo3 obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();

        Collections.sort(list, p);
        for (CollectionDemo3 obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void 不同資料型態不能sort() {
        //布林不能排序 , 會 Compiler 錯誤
        boolean[] ar3 = {true, false};
        // Arrays.sort(ar3);
        //不同資料型態不能sort , 會當掉
        Object[] myObjects = {
            new Integer(12),
            new String("foo"),
            new Integer(5), // new Boolean(true)
        };
        Arrays.sort(myObjects);
    }

/////////////////////////////////////////////////////////////////////////////
    public static void 八個包裝類別_hashCode的值() {

        Integer a = new Integer(4);
        Integer b = new Integer(4);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public static void 字串_hashCode的值() {

        String a = "abc";
        String b = "abc";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public static void 自訂類別_沒有覆寫hashCode的值() {

        CollectionDemo1 a = new CollectionDemo1(4);
        CollectionDemo1 b = new CollectionDemo1(4);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public static void 自訂類別_有覆寫hashCode的值() {

        CollectionDemo4 a = new CollectionDemo4(4);
        CollectionDemo4 b = new CollectionDemo4(4);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

////////////////////////////////////////////////////////////////////////////////
    //八個包裝類別與字串已有複寫 equals 與 hashcode()
    public static void 八個包裝類別_加到HashSet集合() {
        Integer a = new Integer(4);
        Integer b = new Integer(4);

        System.out.println(a.hashCode());  //呼叫到 Object 若沒覆寫
        System.out.println(b.hashCode());

        Set aSet = new HashSet();
        aSet.add(a);
        aSet.add(b);
        System.out.println(aSet);
    }

    public static void 字串_加到HashSet集合() {
        String a = "123";
        String b = "123";

        System.out.println(a.hashCode());  //呼叫到 Object 若沒覆寫
        System.out.println(b.hashCode());

        Set aSet = new HashSet();
        aSet.add(a);
        aSet.add(b);
        System.out.println(aSet);
    }

    public static void 自訂類別_沒有覆寫equals與hashCode_加到HashSet集合() {
        CollectionDemo1 a = new CollectionDemo1(4);
        CollectionDemo1 b = new CollectionDemo1(4);
        System.out.println(a.hashCode());  //呼叫到 Object 若沒覆寫
        System.out.println(b.hashCode());

        Set aSet = new HashSet();
        aSet.add(a);
        aSet.add(b);
        System.out.println(aSet);
    }

    public static void 自訂類別_有覆寫equals與hashCode_加到HashSet集合() {
        CollectionDemo4 a = new CollectionDemo4(4);
        CollectionDemo4 b = new CollectionDemo4(4);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Set aSet = new HashSet();
        aSet.add(a);
        aSet.add(b);
        System.out.println(aSet);
    }

    public static void 覆寫hashCode的演算法() {

        CollectionDemo5 a = new CollectionDemo5(1, 1);
        CollectionDemo5 b = new CollectionDemo5(1, 2);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Set aSet = new HashSet();
        aSet.add(a);
        aSet.add(b);
        System.out.println(aSet);
    }
//////////////////////////////////////////////////////////////////////////////
//七個包裝類別跟字串已有實作 Comparable ,所以可以禁止重覆與排序
//傳回 0 就代表相等

    public static void 七個包裝類別_加到TreeSet集合() {

        Integer a = new Integer(4);
        Integer b = new Integer(6);
        Integer c = new Integer(4);

        Set aSet = new TreeSet();
        aSet.add(a);
        aSet.add(b);
        aSet.add(c);
        System.out.println(aSet);
    }

    public static void 字串_加到TreeSet集合() {

        String a = "123";
        String b = "123";
        String c = "abc";

        Set aSet = new TreeSet();
        aSet.add(a);
        aSet.add(b);
        aSet.add(c);
        System.out.println(aSet);
    }

//////////////////////////////////////////////////////////////////////////////
    public static void 自訂類別_沒有實作Comparable_加到TreeSet集合() {

        CollectionDemo1 a = new CollectionDemo1(4);
        CollectionDemo1 b = new CollectionDemo1(6);
        CollectionDemo1 c = new CollectionDemo1(4);

        Set aSet = new TreeSet();
        aSet.add(a);
        aSet.add(b);
        aSet.add(c);
        System.out.println(aSet);
    }

    public static void 自訂類別_有實作Comparable_加到TreeSet集合() {

        CollectionDemo2 a = new CollectionDemo2(4);
        CollectionDemo2 b = new CollectionDemo2(6);
        CollectionDemo2 c = new CollectionDemo2(4);
        Set aSet = new TreeSet();
        aSet.add(a);
        aSet.add(b);
        aSet.add(c);
        System.out.println(aSet);
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 自訂類別_沒有覆寫hashCode_加到Map() {
        Map m = new HashMap();
        m.put(new CollectionDemo6(170, 66), "peter");
        System.out.println(m.get(new CollectionDemo6(170, 66)));
    }

    public static void 自訂類別_有覆寫hashCode_加到Map() {
        Map m = new HashMap();
        m.put(new CollectionDemo7(170, 66), "peter");
        System.out.println(m.get(new CollectionDemo7(170, 66)));
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 自訂類別_有實作comparable() {
        Map m = new TreeMap();
        m.put(new CollectionDemo8(170, 76), "peter");
        m.put(new CollectionDemo8(150, 56), "carl");
        m.put(new CollectionDemo8(170, 76), "albert");
        System.out.print(m);
    }

    public static void 自訂類別_有覆寫equals跟hashCode() {
        Map m = new HashMap();
        m.put(new CollectionDemo8(170, 76), "peter");
        m.put(new CollectionDemo8(150, 56), "carl");
        m.put(new CollectionDemo8(170, 76), "albert");
        System.out.print(m);
    }

}
