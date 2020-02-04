package source.resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class ResultSetUpdate {

    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private String selectdbSQL = null;

    public ResultSetUpdate() {

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
            selectdbSQL = "select * from User ";
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(selectdbSQL);

        } catch (ClassNotFoundException e) {
            System.out.println("DriverClassNotFound :" + e.toString());
        } catch (SQLException x) {
            System.out.println("Exception :" + x.toString());
        }
    }

    public void ADD(int id, String name, String password) {
        try {
            rs.moveToInsertRow();
            rs.updateInt(1, id);
            rs.updateString(2, name);
            rs.updateString(3, password);

            rs.insertRow();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void DELETE(String name) {
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getString("name").equals(name)) {
                    rs.deleteRow();
                }
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void UPDATE(String name) {
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getString("name").equals(name)) {
                    rs.updateString(2, "我是偉人");
                    rs.updateString(3, "XXXX");
                    rs.updateRow();
                }
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void FIRST() {
        try {
            rs.first();
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void NEXT() {
        try {
            if (rs.isLast()) {
                System.out.println("已是最後一筆");
            } else {
                rs.next();
            }
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void PREVIOUS() {
        try {
            if (rs.isFirst()) {
                System.out.println("已是第一筆");
            } else {
                rs.previous();
            }
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void LAST() {
        try {
            rs.last();
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void showsingle() {
        try {
            //欄名
            ResultSetMetaData rm = rs.getMetaData();
            int cnum = rm.getColumnCount();
            for (int i = 1; i <= cnum; i++) {
                System.out.print(rm.getColumnName(i) + "\t\t");
            }
            System.out.println();
            for (int i = 1; i <= cnum; i++) {
                System.out.print(rs.getObject(i) + "\t\t");
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void showall() {
        try {
            rs.beforeFirst();
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

        ResultSetUpdate test = new ResultSetUpdate();
//        test.ADD(1, "賴玉珊", "1234");
//        test.ADD(2, "張小燕", "4321");
//        test.ADD(3, "林青霞", "5678");
//        test.ADD(4, "成龍", "8765");
//        test.ADD(5, "胡瓜", "9012");

//        test.DELETE("賴玉珊");
//        test.UPDATE("成龍");

//        test.FIRST();
//        test.LAST();
//        test.PREVIOUS();
//        test.NEXT();

        test.showall();
        test.close();
    }
}
