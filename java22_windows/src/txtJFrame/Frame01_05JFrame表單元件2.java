package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame01_05JFrame表單元件2 extends JFrame {

    public JTextField JT1;
    public JButton JB1;
    public Container ContentPane;

    public Frame01_05JFrame表單元件2() {
        initComponents();
    }

    private void initComponents() {
        
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("我愛你");
        JB1 = new JButton("我愛你");

        JT1.setBounds(100, 60, 90, 28);
        JB1.setBounds(100, 110, 90, 28);

        ContentPane.add(JT1);
        ContentPane.add(JB1);

        ContentPane.setBackground(Color.YELLOW);

        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame01_05JFrame表單元件2();
    }
}
