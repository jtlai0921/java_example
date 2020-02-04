package txtJFrame;

import java.awt.Container;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame05_13垂直水平捲軸2 extends JFrame {

    public JScrollBar scrollBar;
    public JScrollPane scrollPane;

    public JLabel lbl菜單圖片;
    public JTextField JT1;
    public JTextArea textArea;
    public Container ContentPane;

    public ImageIcon img;
    public String[] 菜單;
    StringBuilder str = new StringBuilder("");

    public Frame05_13垂直水平捲軸2() {

        initComponents();
        菜單();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        lbl菜單圖片 = new JLabel();
        lbl菜單圖片.setToolTipText("");
        lbl菜單圖片.setOpaque(true);
        JT1 = new JTextField();

        // (value extent , min , max )
        scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 1, 0, 1, 20);
        //scrollBar = new JScrollBar();
        //scrollBar.setMaximum(20);
        //scrollBar.setMinimum(1);
        //scrollBar.setValue(1);
        //scrollBar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        // scrollBar.setVisibleAmount(0);
        
        textArea = new JTextArea();
        textArea.setColumns(20);
        textArea.setRows(5);
        
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(textArea);

        lbl菜單圖片.setBounds(150, 10, 140, 100);
        JT1.setBounds(150, 150, 90, 28);
        scrollBar.setBounds(100, 200, 300, 28);

        lbl菜單圖片.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                選菜(evt);
            }
        });
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent evt) {
                蔡單展示(evt);
            }
        });

        ContentPane.add(lbl菜單圖片);
        ContentPane.add(JT1);
        ContentPane.add(scrollBar);
        scrollPane.setBounds(100, 250, 300, 200);
        ContentPane.add(scrollPane);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void 蔡單展示(AdjustmentEvent evt) {
        菜單();
    }

    public void 菜單() {
        JT1.setText("pic" + scrollBar.getValue() + ".jpg");
        img = new ImageIcon(getClass().getResource("/pic/pic" + scrollBar.getValue() + ".jpg"));
        lbl菜單圖片.setIcon(img);
    }

    public void 選菜(MouseEvent evt) {

        str.append(找品名價錢("pic" + scrollBar.getValue() + ".jpg")).append("\n");
        textArea.setText(str.toString());
    }

    public String 找品名價錢(String strx) {
        try {
            FileReader fr = new FileReader("menu.txt");
            BufferedReader br = new BufferedReader(fr);
            String[] str1;
            String data;
            while ((data = br.readLine()) != null) {
                str1 = data.split(",");

                if (str1[1].equals(strx)) {
                    return str1[1] + "," + str1[0] + "," + str1[2];
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return "";
    }

    public static void main(String args[]) {
        new Frame05_13垂直水平捲軸2();
    }
}
