package source.資源回收;

public class GarbageTruck2 {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("hello");
        StringBuffer s2 = new StringBuffer("goodbye");
        System.out.println(s1);

        s1 = s2; // Redirects s1 to refer to the "goodbye" object

    }
}
