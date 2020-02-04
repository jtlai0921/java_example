package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame02_01BorderLayout2 extends JFrame {

    public JButton JB1, JB2, JB3, JB4, JB5;
    public JPanel JP;
    public Container ContentPane;

    public Frame02_01BorderLayout2() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        BorderLayout layout = new BorderLayout(15, 10);
        ContentPane.setLayout(null);

        JB1 = new JButton("NORTH");
        JB2 = new JButton("WEST");
        JB3 = new JButton("CENTER");
        JB4 = new JButton("EAST");
        JB5 = new JButton("SOUTH");

        JP = new JPanel();
        JP.setLayout(layout);
        JP.setBounds(10, 10, 300, 200);
        ContentPane.add(JP);

        JP.add(JB1, BorderLayout.NORTH);
        JP.add(JB2, BorderLayout.WEST);
        JP.add(JB3, BorderLayout.CENTER);
        JP.add(JB4, BorderLayout.EAST);
        JP.add(JB5, BorderLayout.SOUTH);

        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Frame02_01BorderLayout2();
    }
}
