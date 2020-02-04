package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame03_07滑鼠個別副程式事件 extends JFrame {

    public JTextField JT1;
    public JButton JB1, JB2, JB3;
    public Container ContentPane;
    public JPanel JP1;

    public Frame03_07滑鼠個別副程式事件() {
        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        GridLayout layout = new GridLayout(1, 0);
        layout.setHgap(15);

        JT1 = new JTextField();
        JP1 = new JPanel();
        JB1 = new JButton("我愛你");
        JB2 = new JButton("清除");
        JB3 = new JButton("結束");

        JT1.setBounds(170, 30, 100, 28);
        JP1.setBounds(20, 100, 400, 28);
        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JB1actionPerformed(evt);
            }
        });
        JB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                JB2actionPerformed(evt);
            }
        });
        JB3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JB3actionPerformed(evt);
            }
        });
        ContentPane.add(JT1);

        JP1.setLayout(layout);
        ContentPane.add(JP1);

        JP1.add(JB1);
        JP1.add(JB2);
        JP1.add(JB3);

        //===========================================
        ContentPane.setBackground(Color.PINK);
        this.setBounds(200, 100, 500, 200);
        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void JB1actionPerformed(ActionEvent evt) {
        JT1.setText("我愛你");
    }

    public void JB2actionPerformed(ActionEvent evt) {
        JT1.setText("");
    }

    public void JB3actionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new Frame03_07滑鼠個別副程式事件();
    }
}
