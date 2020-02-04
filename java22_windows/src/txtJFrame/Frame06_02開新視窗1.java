package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Frame06_02開新視窗1 extends JFrame {

    public Container ContentPane;
    public JLabel JL1, JL2;
    public JTextField JT1, JT2;
    public JButton JB1;

    public JTabbedPane tabbedPane;
    public JPanel JP1;

    public Frame06_02開新視窗1() {

        initComponents();
        init();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(new BorderLayout());

        JP1 = new JPanel();
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("秀資料", JP1);
        JL1 = new JLabel("資料一");
        JT1 = new JTextField("");
        JL2 = new JLabel("資料二");
        JT2 = new JTextField("");
        JB1 = new JButton("資料輸入畫面");

        JT1.setEditable(false);
        JT2.setEditable(false);

        JL1.setBounds(50, 50, 90, 28);
        JT1.setBounds(100, 50, 90, 28);
        JL2.setBounds(50, 100, 90, 28);
        JT2.setBounds(100, 100, 90, 28);
        JB1.setBounds(50, 150, 150, 28);

        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                開新視窗(evt);
            }
        });

        JP1.setLayout(null);
        JP1.add(JL1);
        JP1.add(JT1);
        JP1.add(JL2);
        JP1.add(JT2);
        JP1.add(JB1);
        ContentPane.add(tabbedPane, BorderLayout.CENTER);

        this.setTitle(getClass().getName());
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);  //設定位置在螢幕中央   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void init() {
        
        ((JPanel) this.getContentPane()).setOpaque(false);

        ImageIcon img = new ImageIcon(getClass().getResource("/pic/SunSet.jpg"));
        JLabel background = new JLabel(img);

        this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
    }

    public void 開新視窗(java.awt.event.ActionEvent evt) {

        JTextField[] text = {JT1, JT2};

        Frame06_02開新視窗1w win2 = new Frame06_02開新視窗1w(this, true);
        win2.setLocationRelativeTo(null); //設定位置在螢幕中央        
        win2.setVisible(true);

        if (win2.資料取得1() != null) {

            for (int i = 0; i < text.length; i++) {
                text[i].setText(win2.資料取得1()[i]);
            }
        }
    }

    public static void main(String[] args) {

        new Frame06_02開新視窗1();

    }

}
