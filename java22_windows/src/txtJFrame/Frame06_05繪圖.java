package txtJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Frame06_05繪圖 extends JFrame {

    public int x1, x2, y1, y2;
    public Container ContentPane;

    public Frame06_05繪圖() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        ContentPane.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                paint1(evt);
            }
        });
        ContentPane.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                paint2(evt);
            }
        });

        this.setTitle(getClass().getName());
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint1(MouseEvent evt) {
        Graphics g = getGraphics();

        x2 = evt.getX(); // 取得拖曳滑鼠時的 x 座標
        y2 = evt.getY(); // 取得拖曳滑鼠時的 y 座標
        g.drawLine(x1, y1, x2, y2); // 繪出(x1,y1)到(x2,y2)的連線
        x1 = x2; // 更新繪圖起始點的 x 座標
        y1 = y2; // 更新繪圖起始點的 y 座標
    }

    public void paint2(MouseEvent evt) {
        x1 = evt.getX(); // 取得滑鼠按下時的 x 座標 (繪圖起始點的 x 座標)
        y1 = evt.getY(); // 取得滑鼠按下時的 y 座標 (繪圖起始點的 y 座標)
    }

    public static void main(String args[]) {
        new Frame06_05繪圖();
    }
}
