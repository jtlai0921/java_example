package source;

public class ThreadDemo1{
    
}
class MotherThread implements Runnable {

    public void run() {
        System.out.println("媽媽準備煮飯");
        System.out.println("媽媽發現米酒用完了");
        System.out.println("媽媽叫兒子去買米酒");

        Thread son = new Thread(new SonThread());
        son.start();

        System.out.println("媽媽等待兒子把米酒買回來");

        try {
            son.join();
        } catch (InterruptedException ie) {
            System.err.println("發生例外！");
            System.err.println("媽媽中斷煮飯");
            System.exit(1);
        }

        System.out.println("媽媽開始煮飯");
        System.out.println("媽媽煮好飯了");
    }
}

class SonThread implements Runnable {

    public void run() {
        System.out.println("兒子出門去買米酒");
        System.out.println("兒子買東西來回需5分鐘");

        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.print(i + "分鐘 ");
            }
        } catch (InterruptedException ie) {
            System.err.println("兒子發生意外");
        }

        System.out.println("\n兒子買米酒回來了");
    }
}

///////////////////////////////////////////////////////////////////////////////

class Hello1 extends Thread {

    String name;

    public Hello1(String n) {
        name = n;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " Hello " + i);
            Thread.yield();
        }
    }
}

class Hello2 extends Thread {

    String name;

    public Hello2(String n) {
        name = n;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " Hello " + i);

        }
    }
}

///////////////////////////////////////////////////////////////////////////////

class ShareData implements Runnable {
    private int i;

    public void run() {
        while (i < 10) {
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

///////////////////////////////////////////////////////////////////////////////

class SyncShareData1 implements Runnable {
    private int i;

    public void run() {
        while (i < 10) {
            synchronized (this) {
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class SyncShareData2 implements Runnable {
    private int i;

    public synchronized void run() {
        while (i < 10) {
            i++;
            try {
                Thread.sleep(1000);              
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

//執行緒的合作///////////////////////////////////////////////////////////////////

class Storage {

    private int count; //現在庫存量
    private int size; //庫存量上限

    public Storage(int s) {
        size = s;
    }

    public synchronized void addData(String n) {
        while (count == size) {

            try {
                System.out.println("生產者等待");
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        count++;
        System.out.println(n + " make  data  count= " + count);
        System.out.println("通知消費者");
        this.notify();
    }

    public synchronized void delData(String n) {
        while (count == 0) {
            try {
                System.out.println("消費者等待");
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        count--;
        System.out.println(n + " use  data  count: " + count);
        System.out.println("通知生產者");
        this.notify();
    }
}

class Producer extends Thread {

    private String name;
    private Storage s;

    public Producer(String n, Storage s) {
        name = n;
        this.s = s;
    }
    public void run() {
        while (true) {
            s.addData(name);
            try {
                Thread.sleep((int) Math.random() * 3000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer extends Thread {

    private String name;
    private Storage s;

    public Consumer(String n, Storage s) {
        name = n;
        this.s = s;
    }
    public void run() {
        while (true) {
            s.delData(name);

            try {
                Thread.sleep((int) Math.random() * 3000);
            } catch (InterruptedException e) {
            }
        }
    }
}

