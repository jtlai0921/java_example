package source;

interface Head11P {

    void showHeadProperties();
}

public class Person11 {

    public Head11P theH;
    private int age;
    public String name;

    public Person11(int a, String n) {
        age = a;
        name = n;
    }

    public void setHead(String e, String f, String h, double s) {
        theH = new Head11P() {
            public String eye;
            public String face;
            public String hair;
            public double size;

            {
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
        };
    }
}
