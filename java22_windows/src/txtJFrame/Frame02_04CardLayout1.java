package txtJFrame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame02_04CardLayout1 extends JFrame {

    public JButton JB1, JB2, JB3, JB4, JB5;
    public JButton btn1, btn2, btn3, btn4, btn5;
    public JButton btnfirst, btnprevious, btnnext, btnlast;
    public JPanel JP1, JP2, JP3;
    public Container ContentPane;
    public CardLayout layout1 = new CardLayout(15, 10);
    public GridLayout layout2 = new GridLayout(1, 0, 15, 10);

    public Frame02_04CardLayout1() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JP1 = new JPanel();
        JP2 = new JPanel();
        JP3 = new JPanel();
        JB1 = new JButton("ONE");
        JB2 = new JButton("TWO");
        JB3 = new JButton("THREE");
        JB4 = new JButton("FOUR");
        JB5 = new JButton("FIVE");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btnfirst = new JButton("First");
        btnprevious = new JButton("Previous");
        btnnext = new JButton("Next");
        btnlast = new JButton("Last");

        JP1.setLayout(layout1);
        JP2.setLayout(layout2);
        JP3.setLayout(layout2);

        JP1.setBounds(60, 50, 350, 50);
        JP2.setBounds(60, 150, 350, 50);
        JP3.setBounds(60, 250, 350, 50);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btnfirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprevious.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        ContentPane.add(JP1);
        ContentPane.add(JP2);
        ContentPane.add(JP3);

        JP1.add(JB1, "ONE");
        JP1.add(JB2, "TWO");
        JP1.add(JB3, "THREE");
        JP1.add(JB4, "FOUR");
        JP1.add(JB5, "FIVE");

        JP2.add(btn1);
        JP2.add(btn2);
        JP2.add(btn3);
        JP2.add(btn4);
        JP2.add(btn5);

        JP3.add(btnfirst);
        JP3.add(btnprevious);
        JP3.add(btnnext);
        JP3.add(btnlast);

        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 450, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.show(JP1, "ONE");
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.show(JP1, "TWO");
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.show(JP1, "THREE");
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.show(JP1, "FOUR");
    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.show(JP1, "FIVE");
    }

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.first(JP1);
    }

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.previous(JP1);
    }

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.next(JP1);
    }

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {
        layout1.last(JP1);
    }

    public static void main(String[] args) {
        new Frame02_04CardLayout1();
    }
}
