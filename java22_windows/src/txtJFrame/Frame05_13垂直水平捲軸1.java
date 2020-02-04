package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.AdjustmentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

// 捲軸條的實際最大值是 maximum 減去 visible amount
// maximum 是 300，visible amount 是 60，所以實際最大值是 240。滾動條軌道的範圍是 0 - 300

public class Frame05_13垂直水平捲軸1 extends JFrame {

    public JLabel JL1;
    public JScrollBar hbar;
    public JScrollBar vbar;
    public Container ContentPanel;

    public Frame05_13垂直水平捲軸1() {
        initComponents();
    }

    private void initComponents() {
        ContentPanel = this.getContentPane();
        ContentPanel.setLayout(new BorderLayout());

        JL1 = new JLabel();

        hbar = new JScrollBar();
        hbar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        hbar.setMaximum(300);
        hbar.setValue(30);
        hbar.setUnitIncrement(2);       

        vbar = new JScrollBar();
        vbar.setOrientation(javax.swing.JScrollBar.VERTICAL);
        vbar.setMaximum(300);
        vbar.setValue(1);      
        vbar.setUnitIncrement(10);

        hbar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                choose(evt);
            }
        });

        vbar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                choose(evt);
            }
        });

        ContentPanel.add(hbar, BorderLayout.SOUTH);
        ContentPanel.add(vbar, BorderLayout.EAST);
        ContentPanel.add(JL1, BorderLayout.CENTER);

        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 350, 200);
        this.setVisible(true);
    }

    public void choose(AdjustmentEvent evt) {
        JL1.setText("    New Value is " + evt.getValue() + "      ");
        repaint();
    }

    public static void main(String s[]) {
        new Frame05_13垂直水平捲軸1();
    }
}
