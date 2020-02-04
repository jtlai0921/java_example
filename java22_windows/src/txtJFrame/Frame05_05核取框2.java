package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame05_05核取框2 extends JFrame {

    public JCheckBox JCH1;
    public JCheckBox JCH2;
    public JCheckBox JCH3;
    public JCheckBox JCH4;
    public JLabel JL1;
    public JPanel JP1;
    public Container ContentPane;

    public JCheckBox[] JCHK;

    public Frame05_05核取框2() {
        initComponents();

        JCHK = new javax.swing.JCheckBox[]{JCH1, JCH2, JCH3, JCH4};
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
        JCH3 = new JCheckBox("機車");
        JCH4 = new JCheckBox("腳踏車");

        JL1.setBounds(10, 50, 350, 28);
        JL1.setBackground(Color.yellow);
        JL1.setOpaque(true);
        JP1.setBounds(10, 100, 350, 28);
        JCH1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        JCH2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        JCH3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        JCH4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });

        JP1.setLayout(layout);
        JP1.add(JCH1);
        JP1.add(JCH2);
        JP1.add(JCH3);
        JP1.add(JCH4);

        ContentPane.add(JL1);
        ContentPane.add(JP1);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(java.awt.event.ItemEvent evt) {

        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < JCHK.length; i++) {
            if (JCHK[i].isSelected()) {
                str.append(JCHK[i].getText()).append(" ");
            }
        }
        JL1.setText(str.toString());
    }

    public static void main(String args[]) {

        new Frame05_05核取框2();

    }
}
