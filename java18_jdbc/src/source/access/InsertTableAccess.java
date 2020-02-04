package source.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableAccess {

    //連線物件
    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pst = null; //預先指令 ?
    private ResultSet rs = null;
    //sql指令
    private String createdbSQL = null;
    private String dropdbSQL = null;
    private String insertdbSQL = null;
    private String deletedbSQL = null;
    private String updatedbSQL = null;
    private String selectdbSQL = null;

    public InsertTableAccess() {
       String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        String url = "jdbc:ucanaccess://test.accdb";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "", "");
            if (conn != null && !conn.isClosed()) {
                System.out.println("資料庫連線測試成功！");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("DriverClassNotFound :" + e.toString());
        } catch (SQLException x) {
            System.out.println("Exception :" + x.toString());
        }
    }

    public void insertTable(int id, String name, String passwd) {
        insertdbSQL = "Insert into user "
                + " (id, name,passwd) values "
                + "(" + id + ",'" + name + "','" + passwd + "')";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(insertdbSQL);

        } catch (SQLException e) {
            System.out.println("InsertDB Exception :" + e.toString());
        } finally {
            Close();
        }
    }

    private void Close() {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
            if (pst != null) {
                pst.close();
                pst = null;
            }

        } catch (SQLException e) {
            System.out.println("Close Exception :" + e.toString());
        }
    }

    public static void main(String[] args) throws Exception {

        InsertTableAccess test = new InsertTableAccess();
        test.insertTable(1, "aaaa", "bbb");
        test.insertTable(2, "cccc", "ddd");
        test.insertTable(3, "fff", "eee");
    }
}
