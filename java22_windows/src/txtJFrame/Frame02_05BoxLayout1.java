package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame02_05BoxLayout1 extends JFrame {

    public JButton JB1, JB2, JB3, JB4, JB5;
    public Container ContentPane;

    public Frame02_05BoxLayout1() {
        initComponents();
    }
    private void initComponents() {
        ContentPane = this.getContentPane();
        // X.AXIS=由左到右 , Y.AXIS =由上到下
        BoxLayout layout = new BoxLayout(ContentPane, BoxLayout.X_AXIS);
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
        this.setBounds(200, 100, 350, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_05BoxLayout1();
    }
}
