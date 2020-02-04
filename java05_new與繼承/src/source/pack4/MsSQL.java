package source.pack4;



public class MsSQL implements Conn2{
  public void conn() {
        System.out.println("MsSQL連接了");
    }

    public void close() {
        System.out.println("MsSQL-close");
    }
}
