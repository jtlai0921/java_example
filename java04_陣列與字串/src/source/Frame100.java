package source;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame100 extends JFrame {

    public JButton[] B = new JButton[5];   //Button 元件
    public Container ContentPane;

    public Frame100() {
        
        ContentPane = this.getContentPane();
        GridLayout layout = new GridLayout(2, 3);
        ContentPane.setLayout(layout);

        for (int i = 0; i < B.length; i++) {
            B[i] = new JButton(String.valueOf(i + 1));
            ContentPane.add(B[i]);
        }
      
        this.setBounds(200, 100, 250, 180);  //設定視窗的位置和大小
        this.setTitle("控制項陣列");   //設定此視窗的標題文字
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //關閉視窗
        this.setVisible(true); //要顯示此 Frame
    }

    public static void main(String[] args) {
        new Frame100();
    }
}
