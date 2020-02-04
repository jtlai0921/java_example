package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame01_06JFrame表單物件 {

    public static void main(String[] args) {
        JFrame cp = new JFrame();
        JTextField JT1;
        JButton JB1;

        Container ContentPane;
        ContentPane = cp.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("我愛你");  //1
        JT1.setBounds(100, 60, 90, 28);  //2       
        ContentPane.add(JT1);   //4

        JB1 = new JButton("Button");  //1
        JB1.setBounds(100, 110, 90, 28);  //2
        ContentPane.add(JB1);   //4

        ContentPane.setBackground(Color.PINK);      
        cp.setTitle("表單物件");
        cp.setBounds(200, 100, 300, 250);
        cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.setVisible(true);
    }
}
