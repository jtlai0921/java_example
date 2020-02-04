package source.trans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class JDBCTransaction {

    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private String insertdbSQL = null;
    private String selectdbSQL = null;
    private String deletedbSQL = null;

    public JDBCTransaction() {

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

    public void deleteTable() {
        deletedbSQL = "Delete  From MEMBER ";

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(deletedbSQL);

        } catch (SQLException e) {
            System.out.println("DeleteDB Exception :" + e.toString());
        }
    }

    public void insertTable() {

        try {
            stmt = conn.createStatement();
            //////////
            insertdbSQL = "Insert into member "
                    + " (ID, NAME,SEX,EMAIL) values(1,'VICENT','男','VICENT@XXX.XXX')";
            stmt.executeUpdate(insertdbSQL);
            //////////    
            insertdbSQL = "Insert into member "
                    + " (ID, NAME,SEX,EMAIL) values(2,'ANITA','女','ANITA@XXX.XXX')";
            stmt.executeUpdate(insertdbSQL);
            //////////
            insertdbSQL = "Insert into member "
                    + " (ID, NAME,SEX,EMAIL) values(3,'JOANNA','女','JOANNA@XXX.XXX')";
            stmt.executeUpdate(insertdbSQL);
            //////////    
            insertdbSQL = "Insert into member "
                    + " (ID, NAME,SEX,EMAIL) values(4,'JOHN','男','JOHN@XXX.XXX')";
            stmt.executeUpdate(insertdbSQL);
            //////////   
            //設定認可模式
            conn.setAutoCommit(false);
            //////////   
            insertdbSQL = "Insert into member "
                    + " (ID, NAME,SEX,EMAIL) values(5,'SAM','男','SAM@XXX.XXX')";
            stmt = conn.createStatement();
            stmt.executeUpdate(insertdbSQL);
            //////////   
            //RollBack回復點
            Savepoint point = conn.setSavepoint("point");
            //////////    
            insertdbSQL = "Insert into member "
                    + " (ID, NAME,SEX,EMAIL) values(6,'JANE','女','JANE@XXX.XXX')";
            stmt.executeUpdate(insertdbSQL);
            //回復動作
            conn.rollback(point);
            //釋放回復點
            conn.releaseSavepoint(point);
            /////////
            insertdbSQL = "Insert into member "
                    + " (ID, NAME,SEX,EMAIL) values(7,'TOM','女','TOM@XXX.XXX')";
            stmt.executeUpdate(insertdbSQL);
            ////////
            //認可提交
            conn.commit();
        } catch (SQLException e) {
            System.out.println("InsertDB Exception :" + e.toString());
        }
    }

    public void selectTable() {

        try {
            selectdbSQL = "select * from member";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(selectdbSQL);

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

    public static void main(String[] args) {
        JDBCTransaction test = new JDBCTransaction();
        // test.deleteTable();
        test.insertTable();
        test.selectTable();
    }
}
