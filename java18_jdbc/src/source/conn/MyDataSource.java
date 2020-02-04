package source.conn;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;

public class MyDataSource {

    public DataSource getPool() {

        MysqlDataSource ds= new MysqlDataSource();
        //傳入參數       
        ds.setServerName("127.0.0.1");
        ds.setPortNumber(3306);
        ds.setDatabaseName("test");
        ds.setUser("joyes");
        ds.setPassword("sun2000");
        
        return ds;
    }
}
