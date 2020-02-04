package source.load;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableOrderM {

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

    public CreateTableOrderM() {
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
        createdbSQL = "CREATE TABLE OrderM ("
                + "    m001      INT"
                + "  , m002    VARCHAR(20) "
                + "  , m003    VARCHAR(20) "
                + "  , m004    DATE "
                + "  , m005   DATE "
                + "  , m006    DATE "
                + "  , m007    VARCHAR(10) "
                + "  , m008    INT "
                + "  , m009    VARCHAR(20) "
                + "  , m010    VARCHAR(20) "
                + "  , m011    VARCHAR(20) "
                + "  , m012    VARCHAR(20) "
                + "  , m013  VARCHAR(20))";


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

        CreateTableOrderM test = new CreateTableOrderM();
        test.createTable();
    }
}
