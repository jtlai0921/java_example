package txtJFrame;

import java.awt.*;
import javax.swing.*;

public class Frame05_03文字區1 extends JFrame {

    JTextArea resultArea;
    JScrollPane scrollArea;
    Container ContentPane;

    public Frame05_03文字區1() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(new BorderLayout());
       // resultArea = new JTextArea(6, 20);
        resultArea = new JTextArea();
        resultArea.setColumns(20);
        resultArea.setRows(6);
        resultArea.setText("Enter more text to see scrollbars\n");
        //scrollArea = new JScrollPane(resultArea);
        scrollArea = new JScrollPane();
        scrollArea.setViewportView(resultArea);
        ContentPane.add(scrollArea, BorderLayout.CENTER);

        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame05_03文字區1();
    }
}
