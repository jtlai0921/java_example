package txtJFrame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame01_01Frame表單架構 extends Frame {

    public TextField T1;
    public Button B1;
    public Label L1;

    public Frame01_01Frame表單架構() {
        //手動指定各元件的位置 Frame 的setLayout 方式
        this.setLayout(null);
        //元件產生區
        T1 = new TextField("我是文字方塊");  //1
        T1.setBounds(100, 60, 90, 28);  //2  
        this.add(T1);  //將 T1 加到 Frame 內  //4

        B1 = new Button("我是按鈕");  //1
        B1.setBounds(100, 110, 90, 28);  //2
        B1.addMouseListener(new myMouseListener()); //3
        this.add(B1);  //將 B1 加到 Frame 內  //4

        L1 = new Label("我是標籤");  //1
        L1.setBounds(100, 140, 90, 28);  //2   
        this.add(L1);  //將 L1 加到 Frame 內  //4
/////////////////////////////////////////////////////////
        this.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 300, 250);
        this.setVisible(true);
    }

    public class myMouseListener implements MouseListener {

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

        new Frame01_01Frame表單架構();

    }
}
