package txtJFrame;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Frame05_08清單2 extends JFrame {

    public JLabel JL1;
    public JList JLST1, JLST2;
    public JScrollPane scrollPane1, scrollPane2;
    public Container ContentPane;

    public Frame05_08清單2() {
        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JL1 = new JLabel();
        JLST1 = new JList();
        JLST2 = new JList();
        scrollPane1 = new JScrollPane();
        scrollPane2 = new JScrollPane();

        JL1.setBackground(Color.YELLOW);
        JL1.setOpaque(true);
        JLST1.setModel(new AbstractListModel() {
            String[] strings = {"汽車", "卡車", "戰車",
                "計程車", "跑車", "迷你車",
                "腳踏車", "三輪車", "摩托車",
                "飛機", "直升機", "火箭"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        JLST1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// 設置選擇模式

        JLST2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {"1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        
        JLST2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);// 設置選擇模式
        JLST2.setFixedCellHeight(20);                   // 設置選項高度
        JLST2.setVisibleRowCount(6);                   // 設置可見個數
        JLST2.setSelectionBackground(Color.GREEN);      // 設置被選中項的背景顏色
        JLST2.setSelectionForeground(Color.RED);         // 設置被選中項的字體颜色
        scrollPane1 = new JScrollPane();
        scrollPane2 = new JScrollPane();

        JL1.setBounds(20, 0, 400, 40);
        scrollPane1.setBounds(20, 50, 150, 200);
        scrollPane2.setBounds(200, 50, 150, 200);

        JLST1.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent evt) {

                choose(evt);
            }
        });
        scrollPane1.setViewportView(JLST1);

        JLST2.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent evt) {
                choose(evt);
            }
        });
        scrollPane2.setViewportView(JLST2);

        ContentPane.add(JL1);
        ContentPane.add(scrollPane1);
        ContentPane.add(scrollPane2);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ListSelectionEvent evt) {

        JL1.setText("您選擇了");
        JList tmp = (JList) evt.getSource();

        if (tmp == JLST1) {
            String str = (String) tmp.getSelectedValue();
            JL1.setText(JL1.getText() + "    " + str);
        }

        if (tmp == JLST2) {
            Object[] selectedValues = tmp.getSelectedValues();
            for (int i = 0; i < selectedValues.length; i++) {
                JL1.setText(JL1.getText() + "    " + selectedValues[i]);
            }
        }
    }

    public static void main(String[] args) {
        new Frame05_08清單2();
    }
}
