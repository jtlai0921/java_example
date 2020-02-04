package txtJFrame;

import javax.swing.*;

public class Frame06_04背景設定2 extends JFrame {

    //創建一個JLayeredPane用於分層的。
    public JLayeredPane jlp;
    //創建一個Panel和一個Label用於存放圖片，作為背景。
    public JPanel panel;
    public JLabel background;    
    public ImageIcon img;
    public JButton JB1;

    public Frame06_04背景設定2() {

        initComponents();
    }

    private void initComponents() {
        
        jlp = new JLayeredPane();
        panel = new JPanel();
        background = new JLabel();
        JB1 = new JButton("測試按鈕");

        img = new ImageIcon(getClass().getResource("/pic/Sunset.jpg"));

        background.setIcon(img);
        panel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

        JB1.setBounds(20, 20, 90, 28);
        panel.add(background);
        //將jp放到最底層
        jlp.add(panel, JLayeredPane.DEFAULT_LAYER);
        //將jb放到高一層的地方
        jlp.add(JB1, JLayeredPane.MODAL_LAYER);

        this.setLayeredPane(jlp);
        
        
        this.setTitle(getClass().getName());
        this.setBounds(300, 300, img.getIconWidth(), img.getIconHeight());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Frame06_04背景設定2();
    }
}
