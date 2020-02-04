package source.rowset;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetUpdate {

    private JdbcRowSet rowset = null;
    private String selectdbSQL = null;

    public RowSetUpdate() {
        
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF8";
        String user = "joyes";
        String password = "sun2000";

        selectdbSQL = "select * from User ";
        try {
            rowset = RowSetProvider.newFactory().createJdbcRowSet();
            rowset.setUrl(url);
            rowset.setUsername(user);
            rowset.setPassword(password);
            rowset.setCommand(selectdbSQL);
            rowset.execute();

        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void ADD(int id, String name, String password) {

        try {
            rowset.moveToInsertRow();
            rowset.updateInt(1, id);
            rowset.updateString(2, name);
            rowset.updateString(3, password);
            rowset.insertRow();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void DELETE(String name) {
        try {
            rowset.beforeFirst();
            while (rowset.next()) {
                if (rowset.getString("name").equals(name)) {
                    rowset.deleteRow();
                }
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void UPDATE(String name) {
        try {
            rowset.beforeFirst();
            while (rowset.next()) {
                if (rowset.getString("name").equals(name)) {
                    rowset.updateString(2, "我是偉人");
                    rowset.updateString(3, "XXXX");
                    rowset.updateRow();
                }
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void FIRST() {
        try {
            rowset.first();
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void NEXT() {
        try {
            if (rowset.isLast()) {               
                System.out.println("已是最後一筆");
            } else {
                rowset.next();
            }
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void PREVIOUS() {
        try {
            if (rowset.isFirst()) {              
                System.out.println("已是第一筆");
            } else {
                rowset.previous();
            }
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void LAST() {
        try {
            rowset.last();
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        System.out.println();
    }

    public void showsingle() {
        try {
            //欄名
            ResultSetMetaData rm = rowset.getMetaData();
            int cnum = rm.getColumnCount();
            for (int i = 1; i <= cnum; i++) {
                System.out.print(rm.getColumnName(i) + "\t\t");
            }
            System.out.println();
            for (int i = 1; i <= cnum; i++) {
                System.out.print(rowset.getObject(i) + "\t\t");
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    public void showall() {
        try {
            rowset.beforeFirst();
            //欄名
            ResultSetMetaData rm = rowset.getMetaData();
            int cnum = rm.getColumnCount();
            for (int i = 1; i <= cnum; i++) {
                System.out.print(rm.getColumnName(i) + "\t\t");
            }
            System.out.println();
            while (rowset.next()) {
                for (int i = 1; i <= cnum; i++) {
                    System.out.print(rowset.getObject(i) + "\t\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
    }

    private void close() {
        try {
            if (rowset != null) {
                rowset.close();
                rowset = null;
            }

        } catch (SQLException e) {
            System.out.println("Close Exception :" + e.toString());
        }
    }

    public static void main(String[] args) {

        RowSetUpdate test = new RowSetUpdate();
//        test.ADD(1, "賴玉珊", "1234");
//        test.ADD(2, "張小燕", "4321");
//        test.ADD(3, "林青霞", "5678");
//        test.ADD(4, "成龍", "8765");
//        test.ADD(5, "胡瓜", "9012");
//        test.DELETE("賴玉珊");
//        test.UPDATE("成龍");  
//
//        test.FIRST();
//        test.LAST();
//        test.PREVIOUS();
//        test.NEXT();

        test.showall();
        test.close();
    }
}
