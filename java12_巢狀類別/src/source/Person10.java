package source;

public class Person10 {

    public Head10 theH;
    private int age;
    public String name;

    public Person10(int a, String n) {
        age = a;
        name = n;
    }
    public void setHead(String e, String f, String h, double s) {
        theH =new Head10(e, f, h, s);
    }
    public class Head10 {

        public String eye;
        public String face;
        public String hair;
        public double size;

        public Head10(String e, String f, String h, double s) {
            eye = e;
            face = f;
            hair = h;
            size = s;
            if (age > 80) {
                hair = hair + "，有白髮";
            }
        }
        public void showHeadProperties() {
            System.out.println(name + " 的頭：" + "\n眼睛： " + eye
                    + "\n臉： " + face + "\n頭髮： " + hair + "\n頭圍： " + size);
        }
    }    
}
