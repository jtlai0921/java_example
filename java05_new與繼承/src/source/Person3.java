package source;

public class Person3 {
    public String 名字;
    public int 身高;
    public int 體重;
    public static int 人數;
    
    public String 眼睛;
    public String 鼻子;
    public String 嘴巴;

    public Person3() {
        super();
        人數++;
    }
    public Person3(String n, int h, int w) {
        super();
        名字 = n;
        身高 = h;
        體重 = w;
        人數++;
    }
    
    public static void 我愛你() {
        System.out.println("我愛你");
    }
    public static void 我恨你() {
        System.out.println("我恨你");
    }
    
    public void 秀名字身高體重人數() {
        System.out.println("名字=" + 名字);
        System.out.println("身高=" + 身高);
        System.out.println("體重=" + 體重);
        System.out.println("目前人數=" + 人數);
    }
}



