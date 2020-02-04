package txtJFrame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Frame06_04背景設定1 extends JFrame {

    public JPanel ContentPane;
    public JLayeredPane jlp;
    public JButton JB1;
    public JLabel background;
    public ImageIcon img;

    public Frame06_04背景設定1() {
        initComponents();
    }

    private void initComponents() {
        //opaque 不透明
        ContentPane = (JPanel) this.getContentPane();
        ContentPane.setOpaque(false);
        ContentPane.setLayout(null);
        jlp = this.getLayeredPane();

        background = new JLabel();
        JB1 = new JButton("按鈕");

        img = new ImageIcon(getClass().getResource("/pic/SunSet.jpg"));
        background.setIcon(img);
     
        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        JB1.setBounds(20, 20, 90, 28);
        //jlp.add(background,new Integer(Integer.MIN_VALUE));
        jlp.add(background);
        ContentPane.add(JB1);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, img.getIconWidth(), img.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame06_04背景設定1();
    }
}
