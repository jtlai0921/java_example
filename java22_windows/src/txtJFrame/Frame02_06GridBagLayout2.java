package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame02_06GridBagLayout2 extends JFrame {

    public Container ContentPane;
    public JLabel JL1, JL2, JL3;
    public JTextField JT1, JT2;
    public JButton JB1, JB2, JB3, JB4, JB5, JB6, JB7;
    public JButton[] JB;

    public Frame02_06GridBagLayout2() {
        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(new GridBagLayout());

        JL1 = new JLabel("Input");
        JL2 = new JLabel("Output");
        JL3 = new JLabel("hint...");
        JT1 = new JTextField();
        JT2 = new JTextField();

        JB1 = new JButton("New");
        JB2 = new JButton("Load");
        JB3 = new JButton("Save");
        JB4 = new JButton("Encode");
        JB5 = new JButton("Decode");
        JB6 = new JButton("Clear");
        JB7 = new JButton("Copy");

        //Input
        GridBagConstraints c0 = new GridBagConstraints();
        c0.gridx = 0;
        c0.gridy = 0;
        c0.gridwidth = 1;
        c0.gridheight = 1;
        c0.insets = new Insets(6, 6, 6, 6);
        ContentPane.add(JL1, c0);
        //Output
        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = 0;
        c1.gridy = 1;
        c1.gridwidth = 1;
        c1.gridheight = 1;
        c1.insets = new Insets(6, 6, 6, 6);
        ContentPane.add(JL2, c1);
        //hint...
        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 0;
        c2.gridy = 2;
        c2.gridwidth = 1;
        c2.gridheight = 1;
        c2.insets = new Insets(6, 6, 6, 6);
        ContentPane.add(JL3, c2);
        //Input 文字方塊
        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 1;
        c3.gridy = 0;
        c3.gridwidth = 6;
        c3.gridheight = 1;       
        c3.fill = GridBagConstraints.HORIZONTAL;
        c3.insets = new Insets(6, 6, 6, 6);
        ContentPane.add(JT1, c3);
        //Output文字方塊
        GridBagConstraints c4 = new GridBagConstraints();
        c4.gridx = 1;
        c4.gridy = 1;
        c4.gridwidth = 6;
        c4.gridheight = 1;       
        c4.fill = GridBagConstraints.HORIZONTAL;
        c4.insets = new Insets(6, 6, 6, 6);
        ContentPane.add(JT2, c4);
        //按鈕
        JB = new JButton[]{JB1, JB2, JB3, JB4, JB5, JB6, JB7};
        for (int i = 0; i < 7; i++) {
            GridBagConstraints c5 = new GridBagConstraints();
            c5.gridx = i;
            c5.gridy = 3;
            c5.gridwidth = 1;
            c5.gridheight = 1;
            c5.insets = new Insets(6, 6, 6, 6);
            ContentPane.add(JB[i], c5);
        }
        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 600, 160);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_06GridBagLayout2();

    }
}
