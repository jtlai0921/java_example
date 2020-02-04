package txtJFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame05_01按鈕1 extends JFrame {

    public Container ContentPane;
    public JButton JB1;

    public ImageIcon general;
    public ImageIcon rollover;
    public ImageIcon pressed;

    public Frame05_01按鈕1() {

        initComponents();
        
        //放到 專案 的根目錄
        //general = new ImageIcon("img4.gif");
        //rollover = new ImageIcon("img5.gif");
        //pressed = new ImageIcon("img6.gif");
        //放到 src 的根目錄
        //general = new ImageIcon(Frame05_01按鈕1.class.getResource("/pic/img4.gif"));
        //rollover = new ImageIcon(Frame05_01按鈕1.class.getResource("/pic/img5.gif"));
        // pressed = new ImageIcon(Frame05_01按鈕1.class.getResource("/pic/img6.gif"));
        general = new ImageIcon(getClass().getResource("/pic/img4.gif"));
        rollover = new ImageIcon(getClass().getResource("/pic/img5.gif"));
        pressed = new ImageIcon(getClass().getResource("/pic/img6.gif"));
        JB1.setRolloverEnabled(true);
        JB1.setIcon(general);
        JB1.setRolloverIcon(rollover);
        JB1.setPressedIcon(pressed);

    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(new FlowLayout());

        JB1 = new JButton("JButton");
        ContentPane.add(JB1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(getClass().getName().toString());
        this.setBounds(300, 300, 400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame05_01按鈕1();
    }
}
