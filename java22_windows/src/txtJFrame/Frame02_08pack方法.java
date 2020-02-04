package txtJFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

//Window 類別 (class) 的 pack() 方法 (method) 用來將視窗中的各個元件，自動依版面配置作適當的排列
public class Frame02_08pack方法 extends JFrame {

    public JButton JB1;
    public JButton JB2;
    public JButton JB3;
    public JButton JB4;
    public JButton JB5;

    public Container ContentPane;

    public Frame02_08pack方法() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(new FlowLayout());

        JB1 = new JButton("b1");
        JB2 = new JButton("b2");
        JB3 = new JButton("b3");
        JB4 = new JButton("b4");
        JB5 = new JButton("b5");
        ContentPane.add(JB1);
        ContentPane.add(JB2);
        ContentPane.add(JB3);
        ContentPane.add(JB4);
        ContentPane.add(JB5);

        this.setTitle(getClass().getName().toString());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
         //this.setLocation(300, 300);
        // this.setSize(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame02_08pack方法();
    }
}
