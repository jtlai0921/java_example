package txtJFrame;

import java.awt.Color;
import java.awt.Frame;

public class Frame01_02Frame空白表單1 extends Frame {

    public Frame01_02Frame空白表單1() {
        this.setBackground(Color.PINK);
        this.setTitle(getClass().getName().toString());
        //距螢幕左邊緣200，距螢幕上邊緣100，寬300，高250。
        this.setBounds(200, 100, 400, 250);
        //令此視窗顯示在螢幕畫面上
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Frame01_02Frame空白表單1();
    }
}
