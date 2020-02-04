package txtJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame05_09組合框3 extends JFrame {

    public JButton JB1, JB2, JB3;
    public JLabel JL1, JL2;
    public JComboBox JCB1;
    public JPanel JP1, JP2, JP3, cards;
    public Container ContentPane;

    public Frame05_09組合框3() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        CardLayout layout = new CardLayout();

        JB1 = new JButton("按鈕一");
        JB2 = new JButton("按鈕二");
        JB3 = new JButton("按鈕三");
        JL1 = new JLabel("標籤一");
        JL2 = new JLabel("標籤二");

        JP1 = new JPanel();
        JP2 = new JPanel();
        JP3 = new JPanel();
        cards = new JPanel();

        JCB1 = new JComboBox(new String[]{"按鈕卡片", "標籤卡片"});
        JCB1.setEditable(false);

        JCB1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });
        //組合框
        JP1.add(JCB1);
        // 第一組卡片
        JP2.add(JB1);
        JP2.add(JB2);
        JP2.add(JB3);
        // 第二組卡片
        JP3.add(JL1);
        JP3.add(JL2);

        cards.setLayout(layout);
        cards.add(JP2, "按鈕卡片");
        cards.add(JP3, "標籤卡片");

        ContentPane.add(JP1, BorderLayout.NORTH);
        ContentPane.add(cards, BorderLayout.SOUTH);

        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        this.setVisible(true);
    }

    public void choose(ItemEvent evt) {
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, (String) evt.getItem());
    }

    public static void main(String[] args) {
        new Frame05_09組合框3();
    }
}
