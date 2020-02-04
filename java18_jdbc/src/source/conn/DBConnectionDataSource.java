package source.conn;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionDataSource {
//連線物件

    private MysqlDataSource ds = null;
    private Connection conn = null;

    public DBConnectionDataSource() {
        ds = (MysqlDataSource) new MyDataSource().getPool();

        try {
            conn = ds.getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("資料庫連線測試成功！");
            }
        } catch (SQLException x) {
            System.out.println("Exception :" + x.toString());
        }
    }

    private void Close() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            System.out.println("Close Exception :" + e.toString());
        }
    }

    public static void main(String[] args) {

        DBConnectionDataSource test = new DBConnectionDataSource();
        test.Close();
    }
}
