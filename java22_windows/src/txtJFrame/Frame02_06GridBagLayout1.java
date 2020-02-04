package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame02_06GridBagLayout1 extends JFrame {

    public JButton[] JB = new JButton[5];
    public Container ContentPane;

    public Frame02_06GridBagLayout1() {
        initComponents();
    }
    private void initComponents() {
        ContentPane = this.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        ContentPane.setLayout(layout);
        GridBagConstraints g1 = new GridBagConstraints();
        g1.fill = GridBagConstraints.BOTH;// 當格子有剩餘空間時，填充空間      
        g1.gridx = 0;//元件在方格中的水平座標
        g1.gridy = 0;//元件在方格中的垂直座標
        g1.gridwidth = 3;//元件所佔水平區域大小
        g1.gridheight = 1;//元件所佔垂直區域大小
        g1.weightx = 1.0;//當視窗放大時，長度不變
        g1.weighty = 1.0;//當視窗放大時，高度不變 
        g1.insets=new Insets(6, 6, 6, 6);//組件彼此的間距
        JB[0] = new JButton("按鈕1");
        ContentPane.add(JB[0], g1);
        for (int i = 0; i <= 3; i++) {
            JB[i] = new JButton("按鈕 " + String.valueOf(i));
            g1.gridx = i;//元件在方格中的水平座標
            g1.gridy = 1;//元件在方格中的垂直座標
            g1.gridwidth = 1;//元件所佔水平區域大小
            g1.gridheight = 1;//元件所佔垂直區域大小        
            ContentPane.add(JB[i], g1);
        }      
        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_06GridBagLayout1();
    }
}
