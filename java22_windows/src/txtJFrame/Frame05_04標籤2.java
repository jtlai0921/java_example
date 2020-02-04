package txtJFrame;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame05_04標籤2 extends JFrame {

    public Container ContentPane;
    public JLabel word1, word2, word3, word4, word5;

    public Frame05_04標籤2() {
        initComponents();
        
        Font font1 = new Font(Font.DIALOG, Font.BOLD, 35);
        word1.setFont(font1);
        Font font2 = new Font(Font.DIALOG_INPUT, Font.ITALIC, 35);
        word2.setFont(font2);
        Font font3 = new Font(Font.MONOSPACED, Font.PLAIN, 35);
        word3.setFont(font3);
        Font font4 = new Font(Font.SANS_SERIF, Font.PLAIN, 35);
        word4.setFont(font4);
        Font font5 = new Font(Font.SERIF, Font.PLAIN, 35);
        word5.setFont(font5);
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(new GridLayout(5, 1));

        word1 = new JLabel("There is no spoon.");
        word2 = new JLabel("There is no spoon.");
        word3 = new JLabel("There is no spoon.");
        word4 = new JLabel("There is no spoon.");
        word5 = new JLabel("There is no spoon.");

        ContentPane.add(word1);
        ContentPane.add(word2);
        ContentPane.add(word3);
        ContentPane.add(word4);
        ContentPane.add(word5);
        
        ContentPane.setBackground(Color.WHITE);        
        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame05_04標籤2();
    }
}
