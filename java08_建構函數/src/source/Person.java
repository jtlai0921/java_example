package source;

//public class Person {
//
//    public String 名字;
//    public int 身高;
//    public int 體重;
//    public static int 人數;
//
//    public static void 我愛你() {
//        System.out.println("我愛你");
//    }
//
//    public void 秀名字身高體重人數() {
//        System.out.println("名字=" + 名字);
//        System.out.println("身高=" + 身高);
//        System.out.println("體重=" + 體重);
//        System.out.println("目前人數=" + 人數);
//    }
//}

//////////////////////////////////////////////////////////////////////////
//public class Person {
//
//    public String 名字;
//    public int 身高;
//    public int 體重;
//    public static int 人數;
//
//    public Person() {
//        super();
//    }
//
//    public static void 我愛你() {
//        System.out.println("我愛你");
//    }
//
//    public void 秀名字身高體重人數() {
//        System.out.println("名字=" + 名字);
//        System.out.println("身高=" + 身高);
//        System.out.println("體重=" + 體重);
//        System.out.println("目前人數=" + 人數);
//    }
//}
///////////////////////////////////////////////////////////////////////////

public class Person {

    public String 名字;
    public int 身高;
    public int 體重;
    public static int 人數;

//    public  Person() { //預設的被收走了
//        super();
//    }
    public  Person(String n, int h, int w) { //自行定義     
        //super()
        名字 = n;
        身高 = h;
        體重 = w;
    }
    public static void 我愛你() {
        System.out.println("我愛你");
       
    }
    public void 秀名字身高體重人數() {
        System.out.println("名字=" + 名字);
        System.out.println("身高=" + 身高);
        System.out.println("體重=" + 體重);
        System.out.println("目前人數=" + 人數);
      ;
    }
}
