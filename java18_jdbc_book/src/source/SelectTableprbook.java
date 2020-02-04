package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTableprbook {
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

    public SelectTableprbook() {
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

    public void selectTable(int id) {

        selectdbSQL = "select * from book ";
        //selectdbSQL = "select * from book where id=? ";

        try {
            pst = conn.prepareStatement(selectdbSQL);
            // pst.setInt(1, id);
            rs = pst.executeQuery();
            //欄名
            ResultSetMetaData rm = rs.getMetaData();
            int cnum = rm.getColumnCount();
            for (int i = 1; i <= cnum; i++) {
                System.out.print(rm.getColumnName(i) + "\t\t");
            }
            System.out.println();
            while (rs.next()) {

                for (int i = 1; i <= cnum; i++) {
                    System.out.print(rs.getObject(i) + "\t\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
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

        SelectTableprbook test = new SelectTableprbook();
        test.selectTable(3);
        test.close();
        
    }
}
