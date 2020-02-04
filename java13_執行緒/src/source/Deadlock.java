package source;

public class Deadlock {
    static StringBuffer a = new StringBuffer("");
    static StringBuffer b = new StringBuffer("");

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (a) {
                    a.append("a");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ie) {
                    }
                    synchronized (b) {
                        b.append("b");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (b) {
                    b.append("B");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ie) {
                    }
                    synchronized (a) {
                        a.append("A");
                    }
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
        }
        System.out.println(a);
        System.out.println(b);
    }
}
