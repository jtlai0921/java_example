package source.pack4;

public class MySql implements Conn2 {

    public void conn() {
        System.out.println("MySQL連接了");
    }

    public void close() {
        System.out.println("MySQL-close");
    }
}
