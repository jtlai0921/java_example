package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTablebook {

    //連線物件
    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    //sql指令
    private String createdbSQL = null;
    private String dropdbSQL = null;
    private String insertdbSQL = null;
    private String deletedbSQL = null;
    private String updatedbSQL = null;
    private String selectdbSQL = null;

    public UpdateTablebook() {
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

    public void updateTable(int id, String name, String author,int price,String note) {
        updatedbSQL = "UPDATE book "
                + " SET name ='" + name + "', author='" + author + "', price=" + price + ", note='" + note+ "' WHERE id =" + id;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(updatedbSQL);

        } catch (SQLException e) {
            System.out.println("UpdateDB Exception :" + e.toString());
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

        UpdateTablebook test = new UpdateTablebook();
        test.updateTable(1, "c","張大千",999, "藏書");
        test.close();
    }
}
