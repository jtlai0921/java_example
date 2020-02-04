package source.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

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

    public InsertTable() {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF8";
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

    public void insertTable(int id, String name, String passwd) {

        insertdbSQL = "Insert into user "
                + " (id, name,passwd) values "
                + "(" + id + ",'" + name + "','" + passwd + "')";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(insertdbSQL);
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

        InsertTable test = new InsertTable();
        test.insertTable(1, "裴勇俊", "aaaa");
        test.insertTable(2, "崔智友", "bbbb");
        test.insertTable(3, "張小燕", "cccc");
        test.insertTable(4, "胡瓜", "dddd");
        test.insertTable(5, "成龍", "eeee");        
        test.close();
    }
}
