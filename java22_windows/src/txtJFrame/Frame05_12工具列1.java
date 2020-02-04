package txtJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame05_12工具列1 extends JFrame {

    public JLabel JL1;
    public JPanel JP1;
    public JButton JB1, JB2, JB3;

    public JToolBar toolBar;
    public ImageIcon[] ic = new ImageIcon[3];

    public Container ContentPane;

    public Frame05_12工具列1() {
        initComponents();
        
        JB1.setToolTipText("1號");
        JB2.setToolTipText("2號");
        JB3.setToolTipText("3號");
    }

    private void initComponents() {

        ContentPane = this.getContentPane();

        ic[0] = new ImageIcon(getClass().getResource("/pic/p1.jpg"));
        ic[1] = new ImageIcon(getClass().getResource("/pic/p2.jpg"));
        ic[2] = new ImageIcon(getClass().getResource("/pic/p3.jpg"));

        JP1 = new JPanel();
        JL1 = new JLabel("歡迎光臨。");
        JB1 = new JButton(ic[0]);
        JB2 = new JButton(ic[1]);
        JB3 = new JButton(ic[2]);
        toolBar = new JToolBar();

        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });

        JB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });

        JB3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });

        toolBar.add(JB1);
        toolBar.add(JB2);
        toolBar.addSeparator();
        toolBar.add(JB3);

        ContentPane.add(JL1, BorderLayout.SOUTH);
        ContentPane.add(JP1, BorderLayout.CENTER);
        ContentPane.add(toolBar, BorderLayout.NORTH);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ActionEvent evt) {
        int num = 0;
        JButton tmp = (JButton) evt.getSource();

        if (tmp == JB1) {
            num = 1;
        } else if (tmp == JB2) {
            num = 2;
        } else if (tmp == JB3) {
            num = 3;
        }
        JL1.setText("您選擇了" + num + " 號");
    }

    public static void main(String[] args) {
        new Frame05_12工具列1();
    }
}
