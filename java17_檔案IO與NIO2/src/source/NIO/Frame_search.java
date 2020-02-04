package source.NIO;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame_search extends Frame {

    JTextField JT1, JT2, JT3;
    JButton JB1, JB2;
    JLabel JL1, JL2, JL3;
    public String mach;
    boolean ok = false;

    public Frame_search() {

        this.setLayout(null);

        JL1 = new JLabel("製品代號");
        JL1.setBounds(75, 60, 90, 28);
        this.add(JL1);

        JL2 = new JLabel("機種名稱");
        JL2.setBounds(75, 120, 90, 28);
        this.add(JL2);

        JL3 = new JLabel("國際條碼");
        JL3.setBounds(75, 180, 90, 28);
        this.add(JL3);

        JT1 = new JTextField("");
        JT1.setBounds(175, 60, 120, 28);
        JT1.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    search();
                }
            }
        });

        this.add(JT1);

        JT2 = new JTextField("");
        JT2.setBounds(175, 120, 120, 28);
        this.add(JT2);

        JT3 = new JTextField("");
        JT3.setBounds(175, 180, 120, 28);
        this.add(JT3);

        JB1 = new JButton("查詢資料");
        JB1.setBounds(75, 240, 90, 28);
        JB1.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                search();
            }
        });
        this.add(JB1);

        JB2 = new JButton("清除資料");
        JB2.setBounds(190, 240, 90, 28);
        JB2.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                JT1.setText("");
                JT2.setText("");
                JT3.setText("");
            }
        });
        this.add(JB2);

        this.setBackground(Color.yellow);
        this.setBounds(200, 100, 360, 360);
        this.setTitle("機種資料");
        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);   //結束系統
            }
        });
        
        JT1.requestFocus();
       // JT2.setEnabled(false);
       // JT3.setEnabled(false);
        
        this.setVisible(true);
    }
    public void search() {
        String[] z;

        mach = JT1.getText().trim().toUpperCase();

        try {
            File file = new File("條碼.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                z = data.split(",");
                //JOptionPane.showMessageDialog(JB1, mach + " " + z[1]);

                if (mach.equals(z[1].trim())) {

                    JT2.setText(z[0].trim());
                    JT3.setText(z[2].trim());
                    ok = true;
                    break;
                }
            }
        } catch (IOException ex) {
        }
        if (!ok) {
            JOptionPane.showMessageDialog(JB1, "製品代號不存在");
        }
    }
     public static void main(String[] args) {
         new Frame_search();
     }
}
