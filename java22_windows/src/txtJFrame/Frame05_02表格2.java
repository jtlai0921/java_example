package txtJFrame;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Frame05_02表格2 extends JFrame {

    public JScrollPane scrollPane1;
    public Container ContentPane;
    public JTable table1;
    
    public MyTableModel myModel = new MyTableModel();

    public Frame05_02表格2() {
        initComponents();

    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);
        
        table1 = new JTable(myModel);
        scrollPane1 = new JScrollPane(table1);
        
        scrollPane1.setBounds(0, 30, 300, 200);        
        ContentPane.add(scrollPane1);

        
        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // 模型類別
    public class MyTableModel extends AbstractTableModel {

        String[] colname = {"名稱", "價格", "日期"};
        Object[][] data = {
            {"汽車", "1200", "10-01"},
            {"卡車", "2400", "10-05"},
            {"戰車", "3600", "10-06"},
            {"計程車", "2500", "10-10"},
            {"跑車", "2600", "10-11"},
            {"迷你車", "300", "10-12"},
            {"腳踏車", "800", "10-15"},
            {"三輪車", "600", "10-18"},
            {"飛機", "15000", "10-19"},
            {"直升機", "3500", "10-21"},
            {"火箭", "32800", "10-22"}
        };

        private int numColumns = colname.length;
        private int numRows = data.length;

        public MyTableModel() {
        }

        public int getRowCount() {
            return numRows;
        }

        public int getColumnCount() {
            return numColumns;
        }

        public Object getValueAt(int row, int column) {
            return data[row][column];
        }

        public String getColumnName(int column) {
            return colname[column];
        }

        public boolean isCellEditable(int row, int column) {
            return true;
        }

        public void setValueAt(Object value, int row, int column) {
            data[row][column] = (String) value;
            fireTableCellUpdated(row, column);
        }
    }

    public static void main(String[] args) {
        new Frame05_02表格2();
    }
}
