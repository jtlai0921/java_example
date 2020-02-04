package source;

public class Person4 {

    public String 名字;
    public int 身高;
    public int 體重;
    public static int 人數;
    public Head4 頭 = new Head4();  // 必需先 new
    public static Say4 說 = new Say4(); //必需先 new

    public Person4() {
        super();
        人數++;
    }

    public Person4(String n, int h, int w) {
        super();
        名字 = n;
        身高 = h;
        體重 = w;
        人數++;
    }
    public void 秀名字身高體重人數() {
        System.out.println("名字=" + 名字);
        System.out.println("身高=" + 身高);
        System.out.println("體重=" + 體重);
        System.out.println("目前人數=" + 人數);
        System.out.println("眼睛=" + 頭.眼睛);
        System.out.println("鼻子=" + 頭.鼻子);
        System.out.println("嘴巴=" + 頭.嘴巴);
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

class Head4 {

    public String 眼睛;
    public String 鼻子;
    public String 嘴巴;
}

class Say4 {

    public void 我愛你() {
        System.out.println("我愛你");
    }

    public void 我恨你() {
        System.out.println("我恨你");
    }
}
