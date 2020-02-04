package txtJFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame06_01訊息框1 extends JFrame {

    public JPanel JP1, JP2;
    public JButton JB1, JB2, JB3, JB4, JB5, JB6;
    public Container ContentPane;

    public Frame06_01訊息框1() {

        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();

        JP1 = new JPanel();
        JP2 = new JPanel();
        JB1 = new JButton("question");
        JB2 = new JButton("information");
        JB3 = new JButton("warning");
        JB4 = new JButton("error");
        JB5 = new JButton("YES_NO_CANCEL");
        JB6 = new JButton("OK_CANCEL");

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
        JB4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });
        JB5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });
        JB6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });
        JP1.setLayout(new GridLayout(1, 0 , 15,0));
        JP1.add(JB1);
        JP1.add(JB2);
        JP1.add(JB3);
        JP1.add(JB4);
        JP2.setLayout(new GridLayout(1, 0,15,0));
        JP2.add(JB5);
        JP2.add(JB6);
        ContentPane.add(JP1, BorderLayout.NORTH);
        ContentPane.add(JP2, BorderLayout.SOUTH);
        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ActionEvent evt) {

        JButton tmp = (JButton) evt.getSource();

        if (tmp == JB1) {
            JOptionPane.showMessageDialog(ContentPane, "qusetion", "question", JOptionPane.QUESTION_MESSAGE);
        }
        if (tmp == JB2) {
            JOptionPane.showMessageDialog(ContentPane, "information", "information", JOptionPane.INFORMATION_MESSAGE);
        }
        if (tmp == JB3) {
            JOptionPane.showMessageDialog(ContentPane, "warning", "warning", JOptionPane.WARNING_MESSAGE);
        }
        if (tmp == JB4) {
            JOptionPane.showMessageDialog(ContentPane, "error", "error", JOptionPane.ERROR_MESSAGE);
        }
        if (tmp == JB5) {
            int res = JOptionPane.showConfirmDialog(ContentPane, "YES_NO_CANCEL", "YES_NO_CANCEL", JOptionPane.YES_NO_CANCEL_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(ContentPane, "yes", "yes", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (tmp == JB6) {
            int res = JOptionPane.showConfirmDialog(ContentPane, "OK_CANCEL", "OK_CANCEL", JOptionPane.OK_CANCEL_OPTION);
            if (res == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(ContentPane, "ok", "ok", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Frame06_01訊息框1();
    }
}
