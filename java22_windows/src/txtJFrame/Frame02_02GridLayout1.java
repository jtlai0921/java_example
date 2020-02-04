package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame02_02GridLayout1 extends JFrame {

    public JButton JB1, JB2, JB3, JB4, JB5;
    public Container ContentPane;

    public Frame02_02GridLayout1() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        //GridLayout layout = new GridLayout(2, 0 );
        //GridLayout layout = new GridLayout(0, 2);
        // GridLayout layout = new GridLayout(3, 2);
        // 3: 水平切割欄數 2 : 垂直分割列數 10: 水平間距 15 : 垂直間距     
        GridLayout layout = new GridLayout(3, 2, 10, 15);
        ContentPane.setLayout(layout);

        JB1 = new JButton("ONE");
        JB2 = new JButton("TWO");
        JB3 = new JButton("THREE");
        JB4 = new JButton("FOUR");
        JB5 = new JButton("FIVE");

        ContentPane.add(JB1);
        ContentPane.add(JB2);
        ContentPane.add(JB3);
        ContentPane.add(JB4);
        ContentPane.add(JB5);

        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_02GridLayout1();
    }
}
