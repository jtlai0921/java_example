package txtJFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Frame05_02表格資料1 extends JFrame {

    public JTextField JT1, JT2, JT3;
    public JTextField[] JT;
    public JButton JB1, JB2;
    public JScrollPane scrollPane;
    public DefaultTableModel myModel;
    public Container ContentPane;
    public JTable table1;

    public Frame05_02表格資料1() {
        initComponents();

        myModel = (DefaultTableModel) table1.getModel();
        JT = new JTextField[]{JT1, JT2, JT3};
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

        JT1 = new JTextField("");
        JT2 = new JTextField("");
        JT3 = new JTextField("");
        JB1 = new JButton("傳回儲存格的值整列的值");
        JB2 = new JButton("傳回儲存格的值單欄的值");

        table1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                choose1(evt);
            }
        });
        
        scrollPane.setBounds(0, 30, 300, 200);
        JT1.setBounds(400, 50, 90, 28);
        JT2.setBounds(400, 100, 90, 28);
        JT3.setBounds(400, 150, 90, 28);
        JB1.setBounds(0, 300, 200, 40);
        JB2.setBounds(250, 300, 200, 40);

        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose2(evt);
            }
        });
        JB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose3(evt);
            }
        });
        
        ContentPane.add(scrollPane);
        ContentPane.add(JT1);
        ContentPane.add(JT2);
        ContentPane.add(JT3);
        ContentPane.add(JB1);
        ContentPane.add(JB2);

        this.setTitle(getClass().getName());
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

    public void choose2(ActionEvent evt) {

        StringBuilder ss = new StringBuilder();
        String str;

        int selRow = table1.getSelectedRow();
        int selColumn = table1.getSelectedColumn();

        if (selRow == -1) {
            return;
        }

        for (int i = 0; i < table1.getColumnCount(); i++) {
            str = (String) myModel.getValueAt(selRow, i);
            if (i < table1.getColumnCount() - 1) {
                ss.append(str).append(" , ");
            } else {
                ss.append(str);
            }
        }
        JOptionPane.showMessageDialog(null, ss);

    }

    public void choose3(java.awt.event.ActionEvent evt) {

        StringBuilder ss = new StringBuilder();
        String str;

        int selRow = table1.getSelectedRow();
        int selColumn = table1.getSelectedColumn();

        if (selRow == -1) {
            return;
        }

        str = (String) myModel.getValueAt(selRow, selColumn);
        JOptionPane.showMessageDialog(null, str + " 在 " + selRow + "列" + selColumn + "欄");

    }

    public static void main(String[] args) {
        new Frame05_02表格資料1();
    }
}
