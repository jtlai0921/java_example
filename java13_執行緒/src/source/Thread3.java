package source;


public class Thread3 implements Runnable {

    public void run() {
        Thread theMain = Thread.currentThread();
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Thread4 implements Runnable {

    public void run() {
        Thread theMain = Thread.currentThread();
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}