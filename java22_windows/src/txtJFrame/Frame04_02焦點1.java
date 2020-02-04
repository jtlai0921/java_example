package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame04_02焦點1 extends JFrame {

    public JTextField JT1, JT2, JT3, JT4;
    public JButton JB1;
    public Container ContentPane;

    public Frame04_02焦點1() {
        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("");
        JT2 = new JTextField("");
        JT3 = new JTextField("");
        JT4 = new JTextField("");
        JB1 = new JButton("TRANS");
        JT1.setBounds(130, 60, 90, 28);
        JT2.setBounds(230, 148, 90, 28);
        JT3.setBounds(130, 232, 90, 28);
        JT4.setBounds(30, 148, 90, 28);
        JB1.setBounds(130, 148, 90, 28);

        JT1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                TextFocusGained(evt);
            }
        });
        JT1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });
        JT2.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                TextFocusGained(evt);
            }
        });
        JT2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });
        JT3.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                TextFocusGained(evt);
            }
        });
        JT3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });
        JT4.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                TextFocusGained(evt);
            }
        });
        JT4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });
        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });
        ContentPane.add(JT1);
        ContentPane.add(JT2);
        ContentPane.add(JT3);
        ContentPane.add(JT4);
        ContentPane.add(JB1);
     
        ContentPane.setBackground(Color.PINK);
        this.setBounds(200, 100, 360, 360);
        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void TextFocusGained(FocusEvent evt) {
        JTextField tmp = (JTextField) evt.getSource();

        if (tmp == JT1) {
            JT1.selectAll();
        }
        if (tmp == JT2) {
            JT2.selectAll();
        }
        if (tmp == JT3) {
            JT3.selectAll();
        }
        if (tmp == JT4) {
            JT4.selectAll();
        }
    }

    public void TextActionPerformed(ActionEvent evt) {
        JTextField tmp = (JTextField) evt.getSource();

        if (tmp == JT1) {
            JT2.requestFocus();
        }
        if (tmp == JT2) {
            JT3.requestFocus();
        }
        if (tmp == JT3) {
            JT4.requestFocus();
        }
        if (tmp == JT4) {
            JT1.requestFocus();
        }
    }

    public void JB1ActionPerformed(ActionEvent evt) {
        String up, right, bottom, left;
        up = JT1.getText();
        right = JT2.getText();
        bottom = JT3.getText();
        left = JT4.getText();
        JT1.setText(left);
        JT2.setText(up);
        JT3.setText(right);
        JT4.setText(bottom);
    }

    public static void main(String[] args) {
        new Frame04_02焦點1();
    }
}
