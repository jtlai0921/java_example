package source.load;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableGuest {

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

    public InsertTableGuest() {
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

    public void insertTable(String g001, String g002, String g003, String g004, String g005, String g006, String g007, String g008, String g009, String g010) {

        insertdbSQL = "Insert into guest "
                + " (g001, g002,g003, g004,g005, g006,g007, g008,g009, g010) values (?,?,?,?,?,?,?,?,?,?)";
        try {

            pst = conn.prepareStatement(insertdbSQL);
            pst.setString(1, g001);
            pst.setString(2, g002);
            pst.setString(3, g003);
            pst.setString(4, g004);
            pst.setString(5, g005);
            pst.setString(6, g006);
            pst.setString(7, g007);
            pst.setString(8, g008);
            pst.setString(9, g009);
            pst.setString(10, g010);


            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("InsertDB Exception :" + e.toString());
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
        String[] z;
        InsertTableGuest test = new InsertTableGuest();

        try {
            File file = new File("guest.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String data;

            while ((data = br.readLine()) != null) {
                data = data.replace("﻿", "");
                z = data.split(",");
                test.insertTable(z[0], z[1], z[2], z[3], z[4], z[5], z[6], z[7], z[8], z[9]);

            }

        } catch (IOException e) {
        }

    }
}
