package homework;

import java.util.Comparator;

public class PersonX implements Comparable, Comparator {

    public String 名字;
    public int 年齡;
    public int 身高;

    public PersonX() {
    }

    public PersonX(String 名字, int 年齡, int 身高) {
        this.名字 = 名字;
        this.年齡 = 年齡;
        this.身高 = 身高;
    }

    public String toString() {
        return "\n" + 名字 + " " + Integer.toString(年齡) + " " + Integer.toString(身高) +"\n" ;
    }
    
//年齡
//    public int compareTo(Object obj) { //由小到大排
//        PersonX a = (PersonX) obj;
//        if (年齡 < a.年齡) {
//            return -1;
//        }
//        if (年齡 > a.年齡) {
//            return 1;
//        }
//        return 0;
//    }
//
//    public int compare(Object obj1, Object obj2) { //由大到小排-裁判
//
//        PersonX a = (PersonX) obj1;
//        PersonX b = (PersonX) obj2;
//        if (a.年齡 < b.年齡) {
//            return 1;
//        }
//        if (a.年齡 > b.年齡) {
//            return -1;
//        }
//        return 0;
//    }
    
    //名字
    public int compareTo(Object obj) { //由小到大排
        PersonX a = (PersonX) obj;
        return this.名字.compareTo(a.名字);
    }

    public int compare(Object obj1, Object obj2) { //由大到小排-裁判

        PersonX a = (PersonX) obj1;
        PersonX b = (PersonX) obj2;
        return b.名字.compareTo(a.名字);
    }
}
