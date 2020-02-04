package txtJFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame05_04標籤1 extends JFrame {

    public ImageIcon pic[];
    public ImageIcon imgleft;
    public ImageIcon imgright;
    public JButton JB1;
    public JButton JB2;
    public JLabel JL1;
    public Container ContentPane;
    public int index = 0;

    public Frame05_04標籤1() {
        
        pic = new ImageIcon[4];
        pic[0] = new ImageIcon(getClass()
                .getResource("/pic/sp0.jpg"));
        pic[1] = new ImageIcon(getClass()
                .getResource("/pic/sp1.jpg"));
        pic[2] = new ImageIcon(getClass()
                .getResource("/pic/sp2.jpg"));
        pic[3] = new ImageIcon(getClass()
                .getResource("/pic/sp3.jpg"));
        imgleft = new ImageIcon(getClass()
                .getResource("/pic/left.gif"));
        imgright = new ImageIcon(getClass()
                .getResource("/pic/right.gif"));
        
        initComponents();

        JB2.setHorizontalTextPosition(JButton.LEFT);
        JL1.setIcon(pic[0]);
        JL1.setText("sp0.jpg");
        JL1.setHorizontalAlignment(JLabel.CENTER);
        JL1.setVerticalAlignment(JLabel.BOTTOM);
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(new FlowLayout());

        JB1 = new JButton("前一張", imgleft);
        JB2 = new JButton("後一張", imgright);
        JL1 = new JLabel();

        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                showpic(evt);
            }
        });
        JB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                showpic(evt);
            }
        });

        ContentPane.add(JB1);
        ContentPane.add(JB2);
        ContentPane.add(JL1);

        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 350);
        this.setVisible(true);
    }

    public void showpic(ActionEvent evt) {

        JButton tmp = (JButton) evt.getSource();
        int num = pic.length;

        if (tmp == JB1 && index >= 0) {
            if (index == 0) {
                index = num;
            }
            index--;
        }
        if (tmp == JB2 && index <= num - 1) {

            if (index == num - 1) {
                index = -1;
            }
            index++;
        }
        JL1.setText("sp" + (index) + ".jpg");

        JL1.setIcon(pic[index]);
    }

    public static void main(String[] args) {
        new Frame05_04標籤1();
    }
}
