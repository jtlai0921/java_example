package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame02_07預設Layout extends JFrame {

    public JButton JB1;
    public Container ContentPane;

    public Frame02_07預設Layout() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        //預設使用的是 BorderLayout
        // this.setLayout(null);
        JB1 = new JButton("OK");
        JB1.setBounds(20, 80, 150, 30);
        ContentPane.add(JB1);  //沒指定位置， 預設是 CENTER
       
        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_07預設Layout();
    }
}
