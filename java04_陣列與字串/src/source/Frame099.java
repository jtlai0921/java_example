package source;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame099 extends JFrame {

    public JButton B1, B2, B3, B4, B5;
    public Container ContentPane; //內容桌布

    public Frame099() {

        ContentPane = this.getContentPane(); //取得內容桌布
        GridLayout layout = new GridLayout(2, 3);//取得版面配置
        ContentPane.setLayout(layout);//內容桌布設定版面配置

        B1 = new JButton("1");
        ContentPane.add(B1);//加入內容桌布
        B2 = new JButton("2");
        ContentPane.add(B2);
        B3 = new JButton("3");
        ContentPane.add(B3);
        B4 = new JButton("4");
        ContentPane.add(B4);
        B5 = new JButton("5");
        ContentPane.add(B5);

        this.setBounds(200, 100, 250, 180);
        this.setTitle("控制項陣列");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame099();
    }
}
