package txtJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame05_05核取框1 extends JFrame {

    public JLabel JL1;
    public JCheckBox JCH1, JCH2;
    public JPanel JP1;
    public Container ContentPane;

    public Frame05_05核取框1() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        GridLayout layout = new GridLayout(1, 0);
        layout.setHgap(15);

        JL1 = new JLabel();
        JP1 = new JPanel();
        JCH1 = new JCheckBox("汽車");
        JCH2 = new JCheckBox("卡車");
        JL1.setBounds(10, 50, 300, 40);
        JL1.setBackground(Color.YELLOW);
        JL1.setOpaque(true);
        JP1.setBounds(10, 100, 300, 40);

        JCH1.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });
        JCH2.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });

        JP1.setLayout(layout);
        JP1.add(JCH1);
        JP1.add(JCH2);
        ContentPane.add(JL1);
        ContentPane.add(JP1);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 350, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ItemEvent evt) {
        JCheckBox tmp = (JCheckBox) evt.getSource();

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            JL1.setText("選擇了" + tmp.getText() + "。");
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            JL1.setText("放棄了" + tmp.getText() + "。");
        }

    }

    public static void main(String[] args) {
        new Frame05_05核取框1();
    }
}
