package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame02_01BorderLayout1 extends JFrame {

    public JButton JB1, JB2, JB3, JB4, JB5;
    public Container ContentPane;

    public Frame02_01BorderLayout1() {
        initComponents();
    }

    private void initComponents() {
        
        ContentPane = this.getContentPane();
        //BorderLayout layout = new BorderLayout();
        //15=水平間距 , 10= 垂直間距
        BorderLayout layout = new BorderLayout(15, 10);
        ContentPane.setLayout(layout);

        JB1 = new JButton("NORTH");
        JB2 = new JButton("WEST");
        JB3 = new JButton("CENTER");
        JB4 = new JButton("EAST");
        JB5 = new JButton("SOUTH");
        
        ContentPane.add(JB1, BorderLayout.NORTH);
        ContentPane.add(JB2, BorderLayout.WEST);
        ContentPane.add(JB3, BorderLayout.CENTER);
        ContentPane.add(JB4, BorderLayout.EAST);
        ContentPane.add(JB5, BorderLayout.SOUTH);
      
        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_01BorderLayout1();
    }
}
