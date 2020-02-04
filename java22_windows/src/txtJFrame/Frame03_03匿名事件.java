package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame03_03匿名事件 extends JFrame {

    public JTextField JT1;
    public JButton JB1;
    public Container ContentPane;

    public Frame03_03匿名事件() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("我愛你");
        JB1 = new JButton("click");
        JT1.setBounds(100, 60, 90, 28);
        JB1.setBounds(100, 110, 90, 28);
        JB1.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(JB1, JT1.getText().trim());
            }
        });
      
        ContentPane.add(JT1);
        ContentPane.add(JB1);
        ////////////////////////////////////////////////////
        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 300, 250);

        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame03_03匿名事件();
    }
}
