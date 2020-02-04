package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame04_01控制項陣列2 extends JFrame {

    public int[] nums;
    public JPanel JP1;
    public JTextField JT1, JT2, JT3, JT4, JT5, JT6;
    public JButton JB1, JB2;
    public Container ContentPane;
    public JTextField[] JT;

    public Frame04_01控制項陣列2() {
        initComponents();

        JT = new JTextField[]{JT1, JT2, JT3, JT4, JT5, JT6};

        for (int i = 0; i < JT.length; i++) {
            JT[i].setEditable(false);
        }
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        GridLayout layout = new GridLayout(1, 0, 15, 0);

        JP1 = new JPanel();
        JT1 = new JTextField();
        JT2 = new JTextField();
        JT3 = new JTextField();
        JT4 = new JTextField();
        JT5 = new JTextField();
        JT6 = new JTextField();
        JB1 = new JButton("clear");
        JB2 = new JButton("select");

        JP1.setBounds(10, 35, 250, 28);
        JB1.setBounds(40, 80, 100, 28);
        JB2.setBounds(150, 80, 100, 28);

        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });
        JB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });

        JP1.setLayout(layout);

        JP1.add(JT1);
        JP1.add(JT2);
        JP1.add(JT3);
        JP1.add(JT4);
        JP1.add(JT5);
        JP1.add(JT6);                      

        ContentPane.add(JP1);
        ContentPane.add(JB1);
        ContentPane.add(JB2);

        ContentPane.setBackground(Color.PINK);
        this.setBounds(200, 100, 350, 300);
        this.setTitle(getClass().getName().toString());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {

        for (int i = 0; i < JT.length; i++) {
            JT[i].setText("");
        }
    }

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {

        nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 38) + 1;

            System.out.print(nums[i] + " ");

            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    i = i - 1;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(String.valueOf(nums[i]));
        }

    }

    public static void main(String[] args) {
        new Frame04_01控制項陣列2();
    }
}
