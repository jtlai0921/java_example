package source.load;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class InsertTableOrderM {
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

    public InsertTableOrderM() {
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

    public void insertTable(int m001, String m002, String m003, Date m004, Date m005, Date m006, String m007, int m008, String m009, String m010, String m011, String m012, String m013) {

        insertdbSQL = "Insert into orderM "
                + " (m001, m002,m003, m004,m005, m006,m007, m008,m009, m010,m011,m012,m013) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            pst = conn.prepareStatement(insertdbSQL);
            pst.setInt(1, m001);
            pst.setString(2, m002);
            pst.setString(3, m003);
            pst.setDate(4, m004);
            pst.setDate(5, m005);
            pst.setDate(6, m006);
            pst.setString(7, m007);
            pst.setInt(8, m008);
            pst.setString(9, m009);
            pst.setString(10, m010);
            pst.setString(11, m011);
            pst.setString(12, m012);
            pst.setString(13, m013);

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
        InsertTableOrderM test = new InsertTableOrderM();

        try {
            File file = new File("orderM.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String data;
            int n = 0;
            SimpleDateFormat bartdateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String strDate1;
            String strDate2;
            String strDate3;

            java.util.Date date1;
            java.util.Date date2;
            java.util.Date date3;

            java.sql.Date sqldate1;
            java.sql.Date sqldate2;
            java.sql.Date sqldate3;

            while ((data = br.readLine()) != null) {

                data = data.replace("﻿", "");
                z = data.split(",");
                strDate1 = z[3].substring(0, 10);
                strDate2 = z[4].substring(0, 10);
                strDate3 = z[5].substring(0, 10);
                try {

                    date1 = bartdateFormat.parse(strDate1);
                    sqldate1 = new java.sql.Date(date1.getTime());
                    date2 = bartdateFormat.parse(strDate2);
                    sqldate2 = new java.sql.Date(date2.getTime());
                    date3 = bartdateFormat.parse(strDate1);
                    sqldate3 = new java.sql.Date(date3.getTime());

                    test.insertTable(Integer.parseInt(z[0]), z[1], z[2], sqldate1, sqldate2, sqldate3, z[6], Integer.parseInt(z[7]), z[8], z[9], z[10], z[11], z[12]);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } catch (IOException e) {
        }

    }
}
