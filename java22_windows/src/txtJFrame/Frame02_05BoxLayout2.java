package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame02_05BoxLayout2 extends JFrame {
    public JPanel JP1, JP2, JP3, JP4;
    public Container ContentPane;
    public Frame02_05BoxLayout2() {
        initComponents();
    }
    private void initComponents() {
        ContentPane = this.getContentPane();
        BorderLayout layout = new BorderLayout();
        ContentPane.setLayout(layout);
        JP1 = new JPanel();
        JP2 = new JPanel();
        JP3 = new JPanel();
        JP4 = new JPanel();
        for (int i = 0; i < 5; i++) {
            JP1.add(new JButton("West " + i));
        }
        for (int i = 0; i < 5; i++) {
            JP2.add(new JButton("East " + i));
        }
        for (int i = 0; i < 5; i++) {
            JP3.add(new JButton("North " + i));
        }
        for (int i = 0; i < 5; i++) {
            JP4.add(new JButton("South " + i));
        }
        JP1.setLayout(new BoxLayout(JP1, BoxLayout.Y_AXIS));
        JP2.setLayout(new BoxLayout(JP2, BoxLayout.Y_AXIS));
        JP3.setLayout(new BoxLayout(JP3, BoxLayout.X_AXIS));
        JP4.setLayout(new BoxLayout(JP4, BoxLayout.X_AXIS));
        ContentPane.add(JP1, BorderLayout.WEST);
        ContentPane.add(JP2, BorderLayout.EAST);
        ContentPane.add(JP3, BorderLayout.NORTH);
        ContentPane.add(JP4, BorderLayout.SOUTH);
        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Frame02_05BoxLayout2();
    }
}
