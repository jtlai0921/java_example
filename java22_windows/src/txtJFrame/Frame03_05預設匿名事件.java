package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame03_05預設匿名事件 extends JFrame {

    public JTextField JT1;
    public JButton JB1;
    public Container ContentPane;

    public Frame03_05預設匿名事件() {
        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("我愛你");
        JB1 = new JButton("click");
        JT1.setBounds(100, 60, 90, 28);
        JB1.setBounds(100, 110, 90, 28);

        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JB1, JT1.getText().trim());
            }
        });
        
        

        ContentPane.add(JT1);
        ContentPane.add(JB1);

        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame03_05預設匿名事件();
    }
}
