package txtJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame05_07選項鈕與核取框1 extends JFrame {

    public JTextField JT1;
    public JCheckBox checkB, checkI;
    public JRadioButton radioL, radioC, radioR;
    public JComboBox comboBox;
    public ButtonGroup buttonGroup;
    public JPanel JP1, JP2;
    public Container ContentPane;

    public int n = 2; //向左
    //int bold = Font.BOLD, italic = Font.ITALIC;
    public int bold = 0, italic = 0;
    public int align = JTextField.LEFT, fonts = 14;
    
    public String name[] = {"14", "16", "18", "20"};

    public Frame05_07選項鈕與核取框1() {

        initComponents();
    }

    private void initComponents() {

        ContentPane = getContentPane();
        ContentPane.setLayout(null);

        GridLayout layout = new GridLayout(1, 0);
        layout.setHgap(15);

        JT1 = new JTextField("Just a font Tester");
        JT1.setFont(new Font("Serif", Font.PLAIN, 14));
        radioL = new JRadioButton("向左");
        radioC = new JRadioButton("置中");
        radioR = new JRadioButton("向右");
        checkB = new JCheckBox("粗体", false);
        checkI = new JCheckBox("斜体", false);
        comboBox = new JComboBox(name);
        comboBox.setMaximumRowCount(3);
        buttonGroup = new ButtonGroup();

        JP1 = new JPanel();
        JP2 = new JPanel();

        JT1.setBounds(30, 10, 250, 28);
        JP1.setBounds(30, 50, 250, 28);
        JP2.setBounds(30, 90, 250, 28);
        comboBox.setBounds(30, 150, 250, 28);

        checkB.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });
        checkI.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });
        radioL.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });
        radioC.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });
        radioR.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choose(evt);
            }
        });

        buttonGroup.add(radioL);
        buttonGroup.add(radioC);
        buttonGroup.add(radioR);

        JP1.setLayout(layout);
        JP1.add(radioL);
        JP1.add(radioR);
        JP1.add(radioC);

        JP2.setLayout(layout);
        JP2.add(checkB);
        JP2.add(checkI);

        ContentPane.add(JT1);
        ContentPane.add(JP1);
        ContentPane.add(JP2);
        ContentPane.add(comboBox);

        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 300);
        this.setVisible(true);
    }

    public void choose(ItemEvent evt) {
               
        //選項鈕 靠左 , 置中 , 靠右
        //int n = 2;
        if (evt.getSource() == radioL) {
            n = JTextField.LEFT;
        } else if (evt.getSource() == radioR) {
            n = JTextField.RIGHT;
        } else if (evt.getSource() == radioC) {
            n = JTextField.CENTER;
        }
        JT1.setHorizontalAlignment(n);

        //核取框 粗體 , 斜體
        if (evt.getSource() == checkB) {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                bold = 1;
            } else {
                bold = 0;
            }
        }
        if (evt.getSource() == checkI) {
            if (evt.getStateChange()== ItemEvent.SELECTED) {
                italic = 2;
            } else {
                italic = 0;
            }
        }

        //字型
        String big = "14";
        if (evt.getSource() == comboBox) {
            big = (String) comboBox.getSelectedItem();
        }
        JT1.setFont(new Font("Serif", bold + italic, Integer.parseInt(big)));
    }

    public static void main(String[] args) {
        new Frame05_07選項鈕與核取框1();
    }
}
