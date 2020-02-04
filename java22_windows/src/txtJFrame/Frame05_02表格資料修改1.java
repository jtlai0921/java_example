package txtJFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Frame05_02表格資料修改1 extends JFrame {

    public JLabel JL1, JL2, JL3;
    public JTextField JT1, JT2, JT3;
    public JTextField[] JT;
    public JButton JB1, JB2, JB3, JB4;
    public JScrollPane scrollPane;
    public DefaultTableModel myModel;
    public Container ContentPane;
    public JTable table1;

    public Frame05_02表格資料修改1() {

        initComponents();

        myModel = (DefaultTableModel) table1.getModel();

        JT = new JTextField[]{JT1, JT2, JT3};
        for (JTextField elm : JT) {
            elm.setEditable(false);
        }        
        //選取到第一列
        table1.setRowSelectionInterval(0, 0);
        TableColumn colTitle = table1.getColumnModel().getColumn(0);
        colTitle.setPreferredWidth(100); //設定欄位的喜好寬度為100 
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        table1 = new JTable();
        table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
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
                },
                new String[]{"名稱", "價格", "日期"}));

        scrollPane = new JScrollPane(table1);
        JL1 = new JLabel("名稱");
        JL2 = new JLabel("價格");
        JL3 = new JLabel("日期");
        JT1 = new JTextField("");
        JT2 = new JTextField("");
        JT3 = new JTextField("");
        JB1 = new JButton("新增");
        JB2 = new JButton("修改");
        JB3 = new JButton("刪除");
        JB4 = new JButton("取消");
        JB4.setEnabled(false);

        scrollPane.setBounds(0, 30, 300, 200);
        JL1.setBounds(320, 35, 90, 28);
        JL2.setBounds(320, 70, 90, 28);
        JL3.setBounds(320, 105, 90, 28);
        JT1.setBounds(400, 35, 90, 28);
        JT2.setBounds(400, 70, 90, 28);
        JT3.setBounds(400, 105, 90, 28);
        JB1.setBounds(300, 250, 90, 28);
        JB2.setBounds(390, 250, 90, 28);
        JB3.setBounds(480, 250, 90, 28);
        JB4.setBounds(570, 250, 90, 28);

        table1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                choose1(evt);
            }
        });

        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                新增(evt);
            }
        });

        JB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                修改(evt);
            }
        });

        JB3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                刪除(evt);
            }
        });

        JB4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                清除選取(evt);
            }
        });

        ContentPane.add(scrollPane);
        ContentPane.add(JL1);
        ContentPane.add(JL2);
        ContentPane.add(JL3);
        ContentPane.add(JT1);
        ContentPane.add(JT2);
        ContentPane.add(JT3);
        ContentPane.add(JB1);
        ContentPane.add(JB2);
        ContentPane.add(JB3);
        ContentPane.add(JB4);

        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose1(MouseEvent evt) {

        int selRow = table1.getSelectedRow();
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(myModel.getValueAt(selRow, i).toString());
        }
    }

    public void 新增(java.awt.event.ActionEvent evt) {
        if (evt.getActionCommand().equals("新增")) {

            for (JTextField elm : JT) {
                elm.setEditable(true);
                elm.setText(null);
            }
            JB1.setText("儲存");
            JB2.setEnabled(false);
            JB3.setEnabled(false);
            JB4.setEnabled(true);

        } else if (evt.getActionCommand().equals("儲存")) {

            Object[] newRow = {
                JT1.getText(),
                JT2.getText(),
                JT3.getText()
            };

            myModel.addRow(newRow);

            int newRowIndex = myModel.getRowCount() - 1;
            table1.setRowSelectionInterval(newRowIndex, newRowIndex);

            for (JTextField elm : JT) {
                elm.setEditable(false);
            }
            JB1.setText("新增");
            JB2.setEnabled(true);
            JB3.setEnabled(true);
            JB4.setEnabled(false);
        }
    }

    public void 修改(java.awt.event.ActionEvent evt) {

        if (evt.getActionCommand().equals("修改")) {
            //判斷是否選取不止一列, 是則設定僅選取第一列
            if (table1.getSelectedRows().length != 1) {
                int selRow = table1.getSelectedRow();
                //取得選取範圍的第一列
                table1.setRowSelectionInterval(selRow, selRow);
            }

            for (JTextField elm : JT) {
                elm.setEditable(true);
            }

            JB2.setText("儲存");
            JB1.setEnabled(false);
            JB3.setEnabled(false);
            JB4.setEnabled(true);

        } else if (evt.getActionCommand().equals("儲存")) {

            Object[] newData = {
                JT1.getText(),
                JT2.getText(),
                JT3.getText()
            };

            int selRow = table1.getSelectedRow();

            for (int i = 0; i < JT.length; i++) {
                JT[i].setEditable(false);

                myModel.setValueAt(newData[i], selRow, i);
            }
            JB2.setText("修改");
            JB1.setEnabled(true);
            JB3.setEnabled(true);
            JB4.setEnabled(false);
        }
    }

    public void 刪除(java.awt.event.ActionEvent evt) {

        int[] selRows = table1.getSelectedRows();

        if (selRows.length == 0) {
            return;
        }

        //依照選取列的索引值移除資料
        for (int i = selRows.length - 1; i >= 0; i--) {
            myModel.removeRow(selRows[i]);
            //必須從後面開始移除, 
            //因為移除一列資料時, 後面選取列的索引值將改變
            //從最後一列開始移除則可解決此問題
        }

        int rowCount = myModel.getRowCount();

        if (rowCount == 0) {

            for (JTextField elm : JT) {
                elm.setText(null);
            }
            return;
        }
        //刪除後索引值選第一列
        table1.setRowSelectionInterval(0, 0);

        int selRow = table1.getSelectedRow();
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(table1.getValueAt(selRow, i).toString());
        }
    }

    public void 清除選取(java.awt.event.ActionEvent evt) {
        int selRow = table1.getSelectedRow();

        table1.clearSelection(); //清除選取
        table1.setRowSelectionInterval(selRow, selRow); //重設選取範圍             

        //將文字欄設定為不可編輯
        for (JTextField elm : JT) {
            elm.setEditable(false);
        }
        JB4.setEnabled(false);
        //將取消按鈕設定為無效
        JB1.setText("新增");
        JB2.setText("修改");

        JB1.setEnabled(true);
        JB2.setEnabled(true);
        JB3.setEnabled(true);
    }

    public static void main(String[] args) {
        new Frame05_02表格資料修改1();
    }
}
