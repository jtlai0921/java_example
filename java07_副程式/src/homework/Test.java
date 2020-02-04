package homework;

public class Test {

    public static void 練習1() {

        String 姓名 = "賴玉珊";
        String 地址 = "新北市";
        String 電話 = "29018251";

        接收1(姓名, 地址, 電話);
    }

    public static void 接收1(String name, String address, String tel) {

        System.out.println(name);
        System.out.println(address);
        System.out.println(tel);
    }

    public static void 練習2() {
        String[] data = {"賴玉珊", "新北市", "29018251"};
        接收2(data);
    }

    public static void 接收2(String[] data) {

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
    }

    public static void 練習3() {
        Data data = new Data();
        data.name = "賴玉珊";
        data.address = "新北市";
        data.tel = "29018251";
        接收3(data);
    }

    public static void 接收3(Data data) {
        System.out.println(data.name);
        System.out.println(data.address);
        System.out.println(data.tel);
    }

////////////////////////////////////////////////////////////////////////
    public static void 練習4() {
        String[] data;
        data = 回傳4().split(",");

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);

    }

    public static String 回傳4() {

        String 姓名 = "賴玉珊";
        String 地址 = "新北市";
        String 電話 = "29018251";

        return 姓名 + "," + 地址 + "," + 電話;
    }

    public static void 練習5() {

        String[] data;
        data = 回傳5();

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
    }

    public static String[] 回傳5() {

        String[] data = {"賴玉珊", "新北市", "29018251"};

        return data;
    }

    public static void 練習6() {

        Data data;
        data = 回傳6();

        System.out.println(data.name);
        System.out.println(data.address);
        System.out.println(data.tel);
    }

    public static Data 回傳6() {
        Data data = new Data();

        data.name = "賴玉珊";
        data.address = "新北市";
        data.tel = "29018251";
        return data;
    }

}

//   public static void main(String[] args) {
//        練習1();
////        練習2();
////        練習3();
////        練習4();
////        練習5();
////        練習6();
//       
//    }
//
//    public static void 練習1() { //傳 3 個變數
//      String name="賴玉珊";
//      String address="新北市";
//      String tel="29018251";
//    }
//
//    public static void 接收1() {
//    
//    }
//
//    public static void 練習2() { //傳 陣列 data
//      
//    }
//
//    public static void 接收2() {
//
//    }
//
//    public static void 練習3() { //傳 物件 Data
//       
//    }
//
//    public static void 接收3() {
//       
//    }
//
//////////////////////////////////////////////////////////////////////////
//    
//    public static void 練習4() {      
//
//    }
//
//    public static String 回傳4() { //回傳 變數
//        
//    }
//
//    public static void 練習5() {
//      
//    }
//
//    public static String[] 回傳5() { //回傳 陣列 data
//        
//    }
//
//    public static void 練習6() {
//
//    }
//
//    public static Data 回傳6() { //回傳 物件 Data
//      
//    }
//    
//}
