package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame02_02GridLayout2 extends JFrame {

    public JButton JB1, JB2, JB3, JB4, JB5;
    public Container ContentPane;
    public JPanel JP;

    public Frame02_02GridLayout2() {
        initComponents();
    }
    private void initComponents() {
        
        ContentPane = this.getContentPane();
        GridLayout layout = new GridLayout(1, 0, 10, 15);

        JP = new JPanel();
        JB1 = new JButton("ONE");
        JB2 = new JButton("TWO");
        JB3 = new JButton("THREE");
        JB4 = new JButton("FOUR");
        JB5 = new JButton("FIVE");
        
        JP.setLayout(layout);
        ContentPane.add(JP, BorderLayout.SOUTH);
        
        JP.add(JB1);
        JP.add(JB2);
        JP.add(JB3);
        JP.add(JB4);
        JP.add(JB5);
    
        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_02GridLayout2();
    }
}
