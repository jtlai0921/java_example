package source;

public class Person6 {

    public String 名字;
    public int 身高;
    public int 體重;
    public static int 人數;
    public Head6 頭 = new Head6();
    public static Say6 說 = new Say6();

    public Person6() {
        this("賴玉珊", 160, 50);
    }
    public Person6(String 名字) {
        super();
        this.名字 = 名字;
        人數++;
    }
    public Person6(String 名字, int 身高, int 體重) {
        super();
        this.名字 = 名字;
        this.身高 = 身高;
        this.體重 = 體重;
        人數++;
    }
    public Person6(String 名字, int 身高, int 體重, Head6 頭) {
        super();
        this.名字 = 名字;
        this.身高 = 身高;
        this.體重 = 體重;
        this.頭 = 頭;
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

class Head6 {

    public String 眼睛;
    public String 鼻子;
    public String 嘴巴;

    public Head6() {
        super();
    }

    public Head6(String 眼睛, String 鼻子, String 嘴巴) {
        super();
        this.眼睛 = 眼睛;
        this.鼻子 = 鼻子;
        this.嘴巴 = 嘴巴;
    }
}

class Say6 {

    public void 我愛你() {
        System.out.println("我愛你");
    }

    public void 我恨你() {
        System.out.println("我恨你");
    }
}
