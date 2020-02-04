package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Frame05_15顏色對話框1 extends JFrame {

    public JButton JB1;
    public JColorChooser jColorChooser1;
    public Color color;
    public Container ContentPane;

    public Frame05_15顏色對話框1() {

        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(new BorderLayout());

        JB1 = new JButton("Get Color");
        jColorChooser1 = new JColorChooser();
        
        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });

        ContentPane.add(JB1, BorderLayout.SOUTH);
        ContentPane.setBackground(Color.YELLOW);

        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 200);
        this.setVisible(true);
    }

    public void choose(ActionEvent evt) {
        color = jColorChooser1.showDialog(rootPane, "JCOLORCHOOSER", Color.pink);
        ContentPane.setBackground(color);
    }

    public static void main(String[] args) {
        new Frame05_15顏色對話框1();
    }
}
