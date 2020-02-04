package txtJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame05_09組合框1 extends JFrame {

    public JLabel JL1;
    public JComboBox JCB1;
    public Container ContentPane;
    public String[] traffic = {"汽車", "卡車", "戰車", "計程車", "跑車", "迷你車"};

    public Frame05_09組合框1() {

        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JL1 = new JLabel();
        JCB1 = new JComboBox(traffic);
        
        JL1.setBackground(Color.yellow);
        JL1.setOpaque(true);
        JCB1.setEditable(true);

        JL1.setBounds(20, 20, 200, 40);
        JCB1.setBounds(20, 100, 150, 40);

        JCB1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });

        ContentPane.add(JL1);
        ContentPane.add(JCB1);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ItemEvent evt) {

        int[] ar1 = {10, 20, 30, 40, 50, 60};
        JComboBox tmp = (JComboBox) evt.getSource();
        String str = (String) tmp.getSelectedItem();
        JL1.setText("您選擇了" + str + ar1[tmp.getSelectedIndex()] + "。");
    }

    public static void main(String[] args) {
        new Frame05_09組合框1();
    }
}
