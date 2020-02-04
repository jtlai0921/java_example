package txtJFrame;

import java.awt.*;
import javax.swing.*;

public class Frame05_02表格4 extends JFrame {

    public JScrollPane scrollPane;
  
    public Container ContentPane;
    public JTable table1;

    public Frame05_02表格4() {
        initComponents();      
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
        scrollPane.setBounds(0, 30, 300, 200);
        
        ContentPane.add(scrollPane);
    
        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame05_02表格4();
    }
}
