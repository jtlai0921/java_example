package homework;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

public class Window151 extends JFrame {

    JLabel JL1;
    JScrollPane scrollPane;
    Container ContentPane;
    MyTableModel myModel = new MyTableModel();
    JTable table = new JTable(myModel);

    public Window151() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JL1 = new JLabel("歡迎光臨。");
        JL1.setBounds(0, 0, 90, 40);
        ContentPane.add(JL1);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 30, 400, 300);
        ContentPane.add(scrollPane);

        //////////////////////////////////////////////
        ContentPane.setBackground(Color.PINK);
        this.setTitle("Border Layout");
        this.setBounds(200, 100, 700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // 模型類別
    public class MyTableModel extends AbstractTableModel {

        List<String> colname;
        List<String> rowdata;
        List<List<String>> data;

        public MyTableModel() {
            data = new ArrayList();
            colname = new ArrayList();

            colname.add("機種名稱");
            colname.add("製品編號");
            colname.add("國際條碼");

            try {
                File file = new File("條碼.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String str;
                String[] arr;
                while ((str = br.readLine()) != null) {
                    rowdata = new ArrayList();
                    arr = str.split(",");
                    for (int i = 0; i < arr.length; i++) {
                        rowdata.add(arr[i]);
                    }
                    data.add(rowdata);
                }
            } catch (IOException e) {
            }

        }

        public int getRowCount() {
            return data.size();
        }

        public int getColumnCount() {
            return colname.size();
        }

        public Object getValueAt(int row, int column) {
            return data.get(row).get(column);
        }

        public String getColumnName(int column) {
            return colname.get(column);
        }

        public boolean isCellEditable(int row, int column) {
            return true;
        }

        public void setValueAt(Object value, int row, int column) {
            String x = (String) value;
            data.get(row).set(column, x);
            fireTableCellUpdated(row, column);
        }
    }

    public static void main(String[] args) {
        new Window151();
    }
}
