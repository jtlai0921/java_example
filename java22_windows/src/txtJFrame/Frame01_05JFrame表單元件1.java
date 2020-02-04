package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame01_05JFrame表單元件1 extends JFrame {

    public JTextField JT1;
    public JButton JB1;
    public Container ContentPane;

    public Frame01_05JFrame表單元件1() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("在這裡輸入");  //1
        JT1.setBounds(110, 60, 90, 28);   //2     
        ContentPane.add(JT1);//將 JT1 加到 JFrame 的 ContentPane 內  //4

        JB1 = new JButton("按鈕 1");  //1
        JB1.setBounds(110, 110, 90, 28);//2
        ContentPane.add(JB1);//將 JB1 加到 JFrame 的 ContentPane 內 //4

        //設定 ContentPane 背景顏色為黃色
        ContentPane.setBackground(Color.yellow);
        this.setBounds(200, 100, 400, 250);
        this.setTitle(getClass().getName().toString());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame01_05JFrame表單元件1();
    }
}
