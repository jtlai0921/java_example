package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

public class Frame01_03Frame表單元件2 extends Frame {

    public TextField T1; 
    public Button B1;    

    public Frame01_03Frame表單元件2() {
        BorderLayout layout = new BorderLayout();
        this.setLayout(layout);

        T1 = new TextField("我愛你");  //1
        // T1.setBounds(100, 60, 90, 28);  //2      
        this.add(T1, BorderLayout.NORTH);  //將 T1 加到 Frame 內  //4

        B1 = new Button("Button");  //1
        // B1.setBounds(100, 110, 90, 28);  //2       
        this.add(B1, BorderLayout.SOUTH);  //將 B1 加到 Frame 內  //4

        this.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        this.setBounds(200, 100, 400, 250);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Frame01_03Frame表單元件2();
    }
}
