package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class Frame03_10鍵盤預設事件 extends JFrame {

    public JTextField JT1;
    public JLabel JL1;
    public Container ContentPane;

    public Frame03_10鍵盤預設事件() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("");
        JL1 = new JLabel("");

        JT1.setBounds(100, 60, 90, 28);
        JL1.setBounds(100, 110, 90, 28);
        JL1.setBackground(Color.red);
        JL1.setOpaque(true);
        JT1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });
        ContentPane.add(JT1);
        ContentPane.add(JL1);

        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ActionEvent evt) {
        JL1.setText(JT1.getText());
    }

    public static void main(String[] args) {
        new Frame03_10鍵盤預設事件();
    }
}
