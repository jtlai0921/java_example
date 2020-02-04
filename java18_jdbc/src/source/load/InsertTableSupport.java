

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

public class InsertTableSupport {

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

    public InsertTableSupport() {
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

    public void insertTable(int s001, String s002, String s003, String s004, String s005, String s006, String s007, String s008, String s009, String s010, String s011) {

        insertdbSQL = "Insert into Support "
                + " (s001, s002,s003, s004,s005, s006,s007, s008,s009, s010,s011) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {

            pst = conn.prepareStatement(insertdbSQL);
            pst.setInt(1, s001);
            pst.setString(2, s002);
            pst.setString(3, s003);
            pst.setString(4, s004);
            pst.setString(5, s005);
            pst.setString(6, s006);
            pst.setString(7, s007);
            pst.setString(8, s008);
            pst.setString(9, s009);
            pst.setString(10, s010);
            pst.setString(11, s011);

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
        InsertTableSupport test = new InsertTableSupport();

        try {
            File file = new File("Support.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String data;
            int n = 0;
            while ((data = br.readLine()) != null) {
                data = data.replace("﻿", "");
                z = data.split(",");           
                test.insertTable(Integer.parseInt(z[0]), z[1], z[2], z[3], z[4], z[5], z[6], z[7], z[8], z[9], z[10]);
            }

        } catch (IOException e) {
        }

    }
}

