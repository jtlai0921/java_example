package txtJFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame06_02開新視窗1w extends javax.swing.JDialog {

    public String[] 資料1 = null;
    public Container ContentPane;
    public JLabel JL1, JL2;
    public JTextField JT1, JT2;
    public JButton JB1;

    public Frame06_02開新視窗1w(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();

    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JL1 = new JLabel("資料一");
        JT1 = new JTextField("");
        JL2 = new JLabel("資料二");
        JT2 = new JTextField("");
        JB1 = new JButton("確定");
        JL1.setBounds(50, 50, 90, 28);
        JT1.setBounds(100, 50, 90, 28);
        JL2.setBounds(50, 100, 90, 28);
        JT2.setBounds(100, 100, 90, 28);
        JB1.setBounds(50, 200, 90, 28);
        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                確定(evt);
            }
        });
        ContentPane.add(JL1);
        ContentPane.add(JT1);
        ContentPane.add(JL2);
        ContentPane.add(JT2);
        ContentPane.add(JB1);

        this.setTitle("新視窗");
        this.setSize(300, 300);
        this.setVisible(false);
    }

    public void 確定(java.awt.event.ActionEvent evt) {
        this.資料1 = new String[]{JT1.getText(), JT2.getText()};
        this.dispose();
    }

    public String[] 資料取得1() {
        return 資料1;
    }
}
