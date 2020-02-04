package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame03_01實作事件 extends JFrame {

    public JTextField JT1;
    public JButton JB1;
    public Container ContentPane;

    public Frame03_01實作事件() {

        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("我愛你");
        JB1 = new JButton("click");

        JT1.setBounds(100, 60, 90, 28);
        JB1.setBounds(100, 110, 90, 28);
        
        JB1.addMouseListener(new myMouseListener());

        ContentPane.add(JT1);  
        ContentPane.add(JB1);  

        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 300, 250);
        this.addWindowListener(new myWindowListener());
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public class myMouseListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(JB1, JT1.getText().trim());
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }
    }

    public class myWindowListener implements WindowListener {

        public void windowActivated(WindowEvent e) {
        }

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        public void windowOpened(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowClosed(WindowEvent e) {
        }
    }

    public static void main(String[] args) {
        new Frame03_01實作事件();
    }
}
