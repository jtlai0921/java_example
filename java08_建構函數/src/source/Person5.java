package source;

public class Person5 {

    public String 名字;
    public int 身高;
    public int 體重;
    public static int 人數;
    public Head5 頭 = new Head5(); //明顯初始化
    public static Say5 說 = new Say5(); //明顯初始化

    public Person5() {
        super();
        人數++;
    }
    public Person5(String n) {
        super();
        名字 = n;
        人數++;
    }
    public Person5(String n, int h, int w) {
        super();
        名字 = n;
        身高 = h;
        體重 = w;
        人數++;
    }
    public Person5(String n, int h, int w, Head5 head) {
        super();
        名字 = n;
        身高 = h;
        體重 = w;
        頭 = head;
        人數++;
    }
    public void 秀名字身高體重人數() {
        System.out.println("名字=" + 名字);
        System.out.println("身高=" + 身高);
        System.out.println("體重=" + 體重);
        System.out.println("眼睛=" + 頭.眼睛);
        System.out.println("嘴巴=" + 頭.嘴巴);
        System.out.println("鼻子=" + 頭.鼻子);
        System.out.println("目前人數=" + 人數);
    }

    public String toString() {
        return "名字=" + 名字 + "\n"
                + "身高=" + 身高 + "\n"
                + "體重=" + 體重 + "\n"
                + "眼睛=" + 頭.眼睛 + "\n"
                + "鼻子=" + 頭.鼻子 + "\n"
                + "嘴巴=" + 頭.嘴巴 + "\n"
                + "目前人數=" + 人數 + "\n";
    }
}

class Head5 {

    public String 眼睛;
    public String 鼻子;
    public String 嘴巴;

    public Head5() {
        super();
    }

    public Head5(String e, String n, String m) {
        super();
        眼睛 = e;
        鼻子 = n;
        嘴巴 = m;
    }
}

class Say5 {

    public void 我愛你() {
        System.out.println("我愛你");
    }

    public void 我恨你() {
        System.out.println("我恨你");
    }
}
