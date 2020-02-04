package p06_Lambda中訪問區域變數;

public class Test01 {

    public static void main(String[] args) {
        //不需要是final的 , 但只要是 匿名類別或是 Lambda中有用到 就不可修改 
        String message = "Howdy, world!";
        //匿名類別
        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println(message);
            }
        };
        //Lambda      
        Runnable b = () -> System.out.println(message);
        b.run();
        //不可修改
        //message = "change it";
    }
}
