package source;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test13 {

    public static void 主執行緒() {

        Thread theMain = Thread.currentThread();

        for (int i = 1; i <= 10; i++) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
///////////////////////////////////////////////////////////////////////////////

    public static void 產生執行緒_繼承() {
        Thread1 obj1 = new Thread1();
        obj1.start();

        Thread2 obj2 = new Thread2();
        obj2.start();

        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void 產生執行緒_實作() {
        Thread obj1 = new Thread(new Thread3(), "AAAA");
        obj1.start();
        Thread obj2 = new Thread(new Thread4(), "BBBB");
        obj2.start();

        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void 產生執行緒_區域巢狀類別_繼承() {
        class Thread1 extends Thread {

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
        new Thread1().start();

        class Thread2 extends Thread {

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
        new Thread2().start();
        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void 產生執行緒_區域巢狀類別_實作() {
        class Thread3 implements Runnable {

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
        new Thread(new Thread3(), "AAAA").start();
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
        new Thread(new Thread4(), "BBBB").start();
        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void 產生執行緒_匿名類別_繼承() {
        new Thread() {
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
        }.start();

        new Thread() {
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
        }.start();

        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void 產生執行緒_匿名類別_實作1() {

        new Thread(new Runnable() {
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
        }, "AAAA").start();
        new Thread(new Runnable() {
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
        }, "BBBB").start();

        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void 產生執行緒_匿名類別_實作2() {
        Runnable p = new Runnable() {
            public void run() {
                Thread theMain = Thread.currentThread();
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("執行緒名稱：" + theMain.getName()
                            + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
                    try {
                        Thread.sleep(1000);
                        //令「主執行緒」休眠 1000 毫秒(1秒)
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        new Thread(p, "AAAA").start();
        Runnable q = new Runnable() {
            public void run() {
                Thread theMain = Thread.currentThread();

                for (int i = 2; i <= 10; i += 2) {
                    System.out.println("執行緒名稱：" + theMain.getName()
                            + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
                    try {
                        Thread.sleep(1000);
                        //令「主執行緒」休眠 1000 毫秒(1秒)
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        new Thread(q, "BBBB").start();
        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void 產生執行緒_匿名類別_實作3() {
        ExecutorService pool = Executors.newCachedThreadPool();
        Runnable p = new Runnable() {
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
        };
        Runnable q = new Runnable() {
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
        };
        //execute(Runnable 對象)方法
        //其實就是對Runnabl  start()方法        
        pool.execute(p);
        pool.execute(q);
        //主執行緒的工作
        Thread theMain = Thread.currentThread();
        int i = 1;
        while (i <= 5) {
            System.out.println("執行緒名稱：" + theMain.getName()
                    + ", 執行緒ID：" + theMain.getId() + "  ,i=" + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        pool.shutdown();
    }
///////////////////////////////////////////////////////////////////////////////

    public static void join練習() {
        Thread mother = new Thread(new MotherThread());
        mother.start();
    }

    public static void yield練習() {
        Hello1 t1 = new Hello1("Thread1");
        Hello2 t2 = new Hello2("Thread2");

        t1.start();
        t2.start();
    }
///////////////////////////////////////////////////////////////////////////////

    public static void 共用程式不共用資料() {

        Thread t1 = new Thread(new ShareData());
        Thread t2 = new Thread(new ShareData());

        t1.start();
        t2.start();
    }

    public static void 共用程式共用資料() {

        ShareData s = new ShareData();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }

    public static void 共用程式共用資料_同步化區塊() {

        SyncShareData1 s = new SyncShareData1();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }

    public static void 共用程式共用資料_同步化方法() {

        SyncShareData2 s = new SyncShareData2();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 共用程式不共用資料_同步化方法() {

        Thread t1 = new Thread(new SyncShareData2());
        Thread t2 = new Thread(new SyncShareData2());

        t1.start();
        t2.start();
    }

///////////////////////////////////////////////////////////////////////////////
    public static void 生產者與消費者() {

        Storage s = new Storage(5);
        Producer p1 = new Producer("Producer1", s);
        Producer p2 = new Producer("Producer2", s);

        Consumer c1 = new Consumer("Consumer1", s);
        Consumer c2 = new Consumer("Consumer2", s);

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }

    public static void 階乘() {
        int num = 5;
        System.out.println("階乘_一般方法 " + num + " degree = " + 階乘_一般方法(num));
        System.out.println("階乘_遞迴 " + num + " degree = " + 階乘_遞迴(num));
    }

    // 5 * 階乘_遞迴(4)
    // 5 * 4 * 階乘_遞迴(3)
    // 5 * 4 * 3 * 階乘_遞迴(2)
    // 5 * 4 * 3 * 2 * 階乘_遞迴(1)
    // 5 * 4 * 3 * 2 * 1 * 階乘_遞迴(0)
    public static int 階乘_一般方法(int num) {//沒有使用遞迴

        int total = 1;

        for (int i = 1; i <= num; i++) {
            total = total * i;
        }
        return total;
    }

    public static int 階乘_遞迴(int num) { //使用遞迴

        if (num == 0) {
            return 1;
        } else {
            return num * 階乘_遞迴(num - 1);
        }
    }

// 費式數列_遞迴(5)
// 費式數列_遞迴(3) + 費式數列_遞迴(4)
// 費式數列_遞迴(1) + 費式數列_遞迴(2) + 費式數列_遞迴(2) + 費式數列_遞迴(3)
// 費式數列_遞迴(1) + 費式數列_遞迴(0) + 費式數列_遞迴(1)) + 費式數列_遞迴(0) + 費式數列_遞迴(1) +  費式數列_遞迴(1) + 費式數列_遞迴(2)
// 費式數列_遞迴(1) + 費式數列_遞迴(0)  + 費式數列_遞迴(1) +  費式數列_遞迴(0) + 費式數列_遞迴(1)) + 費式數列_遞迴(1) + 費式數列_遞迴(0) + 費式數列_遞迴(1)
// 1+0+1+0+1+1+0+1 ==>5
    public static void 費式數列() {
        int num = 45;
        System.out.println("費式數列_遞迴 " + num + "=" + 費式數列_遞迴(num));
    }

    public static int 費式數列_遞迴(int num) {

        if (num == 0 || num == 1) {
            return num;
        } else {
            return 費式數列_遞迴(num - 1) + 費式數列_遞迴(num - 2);
        }
    }
}
