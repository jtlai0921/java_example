package txtJFrame;

import java.awt.Color;
import java.awt.Frame;

public class Frame01_02Frame空白表單2 {

    public static void main(String[] args) {
        Frame cp = new Frame();

        cp.setBackground(Color.PINK);
        cp.setTitle("空白表單");
        cp.setBounds(200, 100, 400, 250);        
        cp.setVisible(true);   
    } 
}
