package txtJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame05_11功能表1 extends JFrame {

    public JLabel JL1;
    public JMenuBar menubar;

    public JMenu mn1, mn2, mn3, mn4;
    public JMenuItem mi1, mi2, mi3, mi4, mi5, mi6;

    public Container ContentPane;
  
    public Frame05_11功能表1() {
        initComponents();       
    }

    private void initComponents() {
        ContentPane = this.getContentPane();

        JL1 = new JLabel("歡迎光臨。");
        
        mn1 = new JMenu("主選項1");
        mn2 = new JMenu("主選項2");
        mn3 = new JMenu("子選項1");
        mn4 = new JMenu("子選項2");

        mi1 = new JMenuItem("汽車");
        mi2 = new JMenuItem("卡車");
        mi3 = new JMenuItem("戰車");
        mi4 = new JMenuItem("計程車");
        mi5 = new JMenuItem("跑車");
        mi6 = new JMenuItem("迷你車");

        mn1.add(mi1);
        mn1.add(mi2);
        mn2.add(mn3);
        mn2.addSeparator();
        mn2.add(mn4);
        
        mn3.add(mi3);
        mn3.add(mi4);
        mn4.add(mi5);
        mn4.add(mi6);
        
        menubar = new JMenuBar();
        menubar.add(mn1);
        menubar.add(mn2);

        mi1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }

        });
        mi2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }

        });
        mi3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }

        });
        mi4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }

        });
        mi5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }

        });
        mi6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }

        });

        ContentPane.add(JL1, BorderLayout.CENTER);
        ContentPane.add(menubar, BorderLayout.NORTH);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ActionEvent evt) {
        JMenuItem tmp = (JMenuItem) evt.getSource();
        String str = tmp.getText();
        JL1.setText("您選擇了" + str + "。");
    }

    public static void main(String[] args) {
        new Frame05_11功能表1();
    }
}
