package source.load;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableGuest {

    private Connection conn = null;
    private Statement stmt = null;
    //執行,傳入之sql為預儲之字申,需要傳入變數之位置 , 先利用?來做標示 
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private String createdbSQL = null;
    private String dropdbSQL = null;
    private String insertdbSQL = null;
    private String deletedbSQL = null;
    private String updatedbSQL = null;
    private String selectdbSQL = null;

    public CreateTableGuest() {
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
        }//有可能會產生sqlexception 
        catch (SQLException x) {
            System.out.println("Exception :" + x.toString());
        }
    }

    public void createTable() {
        createdbSQL = "CREATE TABLE Guest ("
                + "    g001   VARCHAR(10)"
                + "  , g002    VARCHAR(20) "
                + "  , g003    VARCHAR(20) "
                + "  , g004    VARCHAR(20) "
                + "  , g005    VARCHAR(50) "
                + "  , g006    VARCHAR(20) "
                + "  , g007    VARCHAR(20) "
                + "  , g008    VARCHAR(20) "
                + "  , g009    VARCHAR(20) "
                + "  , g010    VARCHAR(20) "
                + "  , g011    VARCHAR(20) "
                + "  , g012  VARCHAR(20))";



        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(createdbSQL);
        } catch (SQLException e) {
            System.out.println("CreateDB Exception :" + e.toString());
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

        CreateTableGuest test = new CreateTableGuest();
        test.createTable();
    }
}
