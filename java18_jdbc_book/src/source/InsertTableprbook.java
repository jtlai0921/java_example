package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableprbook {

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

    public InsertTableprbook() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/abc?useUnicode=true&characterEncoding=UTF8";
        String user = "joyes";
        String password = "sun2000";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null && !conn.isClosed()) {
                System.out.println("資料庫連線測試成功！");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("DriverClassNotFound :" + e.toString());
        } catch (SQLException x) {
            System.out.println("Exception :" + x.toString());
        }
    }

    public void insertTable(int id, String name, String author, int price, String note) {

        insertdbSQL = "Insert into book "
                + " (id, name,author,price,note) values (?,?,?,?,? ) ";
        try {
            pst = conn.prepareStatement(insertdbSQL);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, author);
            pst.setInt(4, price);
            pst.setString(5, note);
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("InsertDB Exception :" + e.toString());
        }
    }

    private void close() {
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
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            System.out.println("Close Exception :" + e.toString());
        }
    }

    public static void main(String[] args) {

        InsertTableprbook test = new InsertTableprbook();
        test.insertTable(11, "java", "胡瓜", 100, "DHDHDF");
        test.insertTable(12, "c&c++", "成龍", 200, "FGDHDFG");
        test.insertTable(13, "vb", "李連杰", 350, "efsfsfsf");
        test.close();

    }
}
