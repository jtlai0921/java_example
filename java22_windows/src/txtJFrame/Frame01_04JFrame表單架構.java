package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame01_04JFrame表單架構 extends JFrame {
    public JTextField JT1;
    public JButton JB1;
    public JLabel JL1;
    public Container ContentPane;
    
    public Frame01_04JFrame表單架構() {
        
        //取回內容桌布
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JT1 = new JTextField("我是文字方塊");  //1
        JT1.setBounds(100, 60, 90, 28);  //2  
        ContentPane.add(JT1);  //將 JT1 加到 內容桌布內  //4

        JB1 = new JButton("我是按鈕");  //1
        JB1.setBounds(100, 110, 90, 28);  //2
        JB1.addMouseListener(new myMouseListener()); //3
        ContentPane.add(JB1);  //將 JB1 加到 內容桌布內  //4

        JL1 = new JLabel("我是標籤");  //1
        JL1.setBounds(100, 140, 90, 28);  //2   
        ContentPane.add(JL1);  //將 L1 加到 內容桌布內  //4

        ContentPane.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 300, 250);
        this.setVisible(true);
    }
    
    class myMouseListener implements MouseListener {
        
        public void mouseClicked(MouseEvent e) {
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
    public static void main(String[] args) {
        new Frame01_04JFrame表單架構();
    }
}
