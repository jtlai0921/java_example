package source;

import java.util.Comparator;

public class CollectionDemo1 {

    public int x;

    public CollectionDemo1(int x) {
        this.x = x;
    }

    public String toString() {
        return String.valueOf(x);
    }
}

/////////////////////////////////////////////////////////////////////////////
class CollectionDemo2 implements Comparable, Comparator {

    public int x;

    public CollectionDemo2() {
    }

    public CollectionDemo2(int x) {
        this.x = x;
    }

    public String toString() {
        return Integer.toString(x);
    }

    public int compareTo(Object obj) { //由小到大排
        CollectionDemo2 a = (CollectionDemo2) obj;
        if (x < a.x) {
            return -1;
        }
        if (x > a.x) {
            return 1;
        }
        return 0;
    }

    public int compare(Object obj1, Object obj2) { //由大到小排-裁判

        CollectionDemo2 a = (CollectionDemo2) obj1;
        CollectionDemo2 b = (CollectionDemo2) obj2;
        if (a.x < b.x) {
            return 1;
        }
        if (a.x > b.x) {
            return -1;
        }
        return 0;
    }
}

/////////////////////////////////////////////////////////////////////////////

class CollectionDemo3 implements Comparable<CollectionDemo3>, Comparator<CollectionDemo3> {

    public int x;

    public CollectionDemo3() {
    }

    public CollectionDemo3(int x) {
        this.x = x;
    }

    public String toString() {
        return Integer.toString(x);
    }

    public int compareTo(CollectionDemo3 obj) { //由小到大排
        CollectionDemo3 a = obj;
        if (x < a.x) {
            return -1;
        }
        if (x > a.x) {
            return 1;
        }
        return 0;
    }

    public int compare(CollectionDemo3 obj1, CollectionDemo3 obj2) { //由大到小排-裁判

        CollectionDemo3 a = obj1;
        CollectionDemo3 b = obj2;
        if (a.x < b.x) {
            return 1;
        }
        if (a.x > b.x) {
            return -1;
        }
        return 0;
    }
}

/////////////////////////////////////////////////////////////////////////////
class CollectionDemo4 {

    public int x;

    public CollectionDemo4(int x) {
        this.x = x;
    }

    public String toString() {
        return Integer.toString(x);
    }

    public boolean equals(Object obj) {
        if ((obj != null && obj instanceof CollectionDemo4)) {
            if ((x == ((CollectionDemo4) obj).x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return x;
    }
}

////////////////////////////////////////////////////////////////////////////////
class CollectionDemo5 {

    private int x;
    private int y;

    public CollectionDemo5(int x, int y) {
        this.x = x;
        this.y = y;
    }

// equals 只拿 x 來比較, 所以 hashcode 也只能拿 x 來產生值
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof CollectionDemo5)) {
            if (x == ((CollectionDemo5) obj).x) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return Integer.toString(x);
    }
//    public int hashCode() { //ok
//        return x;
//    }
//    public int hashCode() { //不行
//        return y;
//    }
//
//    public int hashCode() { // ok
//        return 1;
//    }
//

    public int hashCode() { //不行
        return x + y;
    }
}

///////////////////////////////////////////////////////////////////////////////
class CollectionDemo6 {

    private int height;
    private int weight;

    public CollectionDemo6(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return height + " " + weight;
    }

    public boolean equals(Object obj) {
        if ((obj != null && obj instanceof CollectionDemo6)) {
            if ((height == ((CollectionDemo6) obj).height)
                    && (weight == ((CollectionDemo6) obj).weight)) {
                return true;
            }
        }
        return false;
    }
    // object hashcode()
}

///////////////////////////////////////////////////////////////////////////////
class CollectionDemo7 {

    private int height;
    private int weight;

    public CollectionDemo7(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return height + " " + weight;
    }

    public boolean equals(Object obj) {
        if ((obj != null && obj instanceof CollectionDemo7)) {
            if ((height == ((CollectionDemo7) obj).height)
                    && (weight == ((CollectionDemo7) obj).weight)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (new Integer(height).hashCode())
                ^ (new Integer(weight).hashCode());
    }
}

///////////////////////////////////////////////////////////////////////////////
class CollectionDemo8 implements Comparable {

    private int height;
    private int weight;

    public CollectionDemo8(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return height + " " + weight;
    }

    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof CollectionDemo8)) {
            if ((height == ((CollectionDemo8) obj).height)
                    && (weight == ((CollectionDemo8) obj).weight)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (new Integer(height).hashCode())
                ^ (new Integer(weight).hashCode());
    }

    public int compareTo(Object obj) {
        CollectionDemo8 a = (CollectionDemo8) obj;
        if (height < a.height) {
            return -1;
        }
        if (height > a.height) {
            return 1;
        }
        if (weight < a.weight) {
            return -1;
        }
        if (weight > a.weight) {
            return 1;
        }
        return 0;
    }
}

///////////////////////////////////////////////////////////////////////////////
class CollectionDemo9 {

    private String name;
    private int age;
    private double weight;

    public CollectionDemo9(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof CollectionDemo9)) {
            CollectionDemo9 t = (CollectionDemo9) obj;

            if ((name.equals(t.name))
                    && (age == t.age)
                    && (weight == t.weight)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (name.hashCode())
                ^ (new Integer(age).hashCode())
                ^ (new Double(weight).hashCode());
        return i;
    }
}
