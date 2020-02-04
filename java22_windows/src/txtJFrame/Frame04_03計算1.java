package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame04_03計算1 extends JFrame {

    public JTextField JT1, JT2, JT3;
    public JButton JB1, JB2, JB3, JB4;
    public JLabel JL1;
    public Container ContentPane;

    public Frame04_03計算1() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("");
        JT2 = new JTextField("");
        JT3 = new JTextField("");
        JL1 = new JLabel("=");
        JB1 = new JButton("+");
        JB2 = new JButton("-");
        JB3 = new JButton("*");
        JB4 = new JButton("/");
        JT1.setBounds(20, 60, 90, 28);
        JT2.setBounds(220, 60, 90, 28);
        JT3.setBounds(340, 60, 90, 28);
        JL1.setBounds(320, 60, 20, 28);
        JB1.setBounds(120, 60, 90, 28);
        JB2.setBounds(120, 108, 90, 28);
        JB3.setBounds(120, 156, 90, 28);
        JB4.setBounds(120, 204, 90, 28);
        
        JB1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                count(evt);
            }
        });
        JB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                count(evt);
            }
        });

        JB3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                count(evt);
            }
        });
        JB4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                count(evt);
            }
        });
        ContentPane.add(JT1);
        ContentPane.add(JT2);
        ContentPane.add(JL1);
        ContentPane.add(JT3);
        
        ContentPane.add(JB1);
        ContentPane.add(JB2);
        ContentPane.add(JB3);
        ContentPane.add(JB4);
        
        ContentPane.setBackground(Color.PINK);
        this.setBounds(200, 100, 450, 300);
        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void count(ActionEvent evt) {

        JButton tmp = (JButton) evt.getSource();
        int x = 0;
        String opt = tmp.getText();
        x = 四則運算(opt);
        JT3.setText(String.valueOf(x));
    }

    public int 四則運算(String op) {
        int x = 0;
        switch (op) {
            case "+":
                x = Integer.parseInt(JT1.getText()) + Integer.parseInt(JT2.getText());
                break;
            case "-":
                x = Integer.parseInt(JT1.getText()) - Integer.parseInt(JT2.getText());
                break;
            case "*":
                x = Integer.parseInt(JT1.getText()) * Integer.parseInt(JT2.getText());
                break;
            case "/":
                x = Integer.parseInt(JT1.getText()) / Integer.parseInt(JT2.getText());
                break;
        }
        return x;
    }

    public static void main(String[] args) {
        new Frame04_03計算1();
    }
}
