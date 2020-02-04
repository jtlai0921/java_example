package p02_Lambda表達式;

//Runnable介面是 系統 API 
public class Test02 {

    public static void main(String[] args) {
        //1. 匿名類別
        Runnable a = new Runnable() {

            public void run() {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.print(i + " ");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        new Thread(a).start();
        //2. Lambda 沒有介面 , 多行沒有回傳
        Runnable b = () -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };
        new Thread(b).start();
       
    }
}
