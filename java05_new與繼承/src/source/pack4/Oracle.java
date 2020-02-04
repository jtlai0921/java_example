package source.pack4;

public class Oracle implements Conn2 {

    public void conn() {
        System.out.println("Oracle連接了");
    }

    public void close() {
        System.out.println("Oracle-close");
    }
}
