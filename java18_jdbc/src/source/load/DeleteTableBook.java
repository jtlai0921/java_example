package source.load;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DeleteTableBook {

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

    public DeleteTableBook() {
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/load?useUnicode=true&characterEncoding=UTF8";
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

    public void deleteTable(int id) {
         //deletedbSQL = "Delete  From user ";
        deletedbSQL = "Delete  From book where bid=" + id;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(deletedbSQL);

        } catch (SQLException e) {
            System.out.println("DeleteDB Exception :" + e.toString());
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

    public static void main(String[] args) {

        DeleteTableBook test = new DeleteTableBook();
        test.deleteTable(1);

    }
}
