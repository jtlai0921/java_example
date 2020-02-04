package txtJFrame;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Frame05_06選項鈕1 extends JFrame {

    public JPanel JP1, JP2;
    public JLabel JL1, JL2;
    public ButtonGroup buttongroup1, buttongroup2;
    public JRadioButton JRB1, JRB2, JRB3, JRB4;
    public Container ContentPane;

    public Frame05_06選項鈕1() {
        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);
        GridLayout layout = new GridLayout(1, 0);
        layout.setHgap(15);

        JL1 = new JLabel();
        JL2 = new JLabel();
        JP1 = new JPanel();
        JP2 = new JPanel();
        JRB1 = new JRadioButton("汽車", true);
        JRB2 = new JRadioButton("卡車", false);
        JRB3 = new JRadioButton("電動", true);
        JRB4 = new JRadioButton("汽油", false);
        buttongroup1 = new ButtonGroup();
        buttongroup2 = new ButtonGroup();

        JL1.setBounds(220, 50, 200, 28);
        JL1.setBackground(Color.yellow);
        JL1.setOpaque(true);
        JL2.setBounds(220, 100, 200, 28);
        JL2.setBackground(Color.yellow);
        JL2.setOpaque(true);

        JP1.setBounds(10, 50, 200, 40);
        JP2.setBounds(10, 100, 200, 40);

        JRB1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose1(evt);
            }
        });
        JRB2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose1(evt);
            }
        });
        JRB3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose2(evt);
            }
        });
        JRB4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose2(evt);
            }
        });

        buttongroup1.add(JRB1);
        buttongroup1.add(JRB2);
        buttongroup2.add(JRB3);
        buttongroup2.add(JRB4);
        JP1.setLayout(layout);
        JP1.add(JRB1);
        JP1.add(JRB2);
        JP2.setLayout(layout);
        JP2.add(JRB3);
        JP2.add(JRB4);

        ContentPane.add(JP1);
        ContentPane.add(JP2);
        ContentPane.add(JL1);
        ContentPane.add(JL2);
        
        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void choose1(java.awt.event.ItemEvent evt) {
        JRadioButton tmp = (JRadioButton) evt.getSource();
        JL1.setText("您選擇了" + tmp.getText() + "。");
    }

    public void choose2(java.awt.event.ItemEvent evt) {
        JRadioButton tmp = (JRadioButton) evt.getSource();
        JL2.setText("您選擇了" + tmp.getText() + "。");
    }

    public static void main(String[] args) {
        new Frame05_06選項鈕1();
    }
}
