package txtJFrame;

import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame05_14頁籤1 extends JFrame {

    public JTabbedPane tabbedPane;
    
    public JPanel JP1;
    public JPanel JP2;
    public JPanel JP3;

    public JButton btnCenter;
    public JButton btnEast;
    public JButton btnNorth;
    public JButton btnSouth;
    public JButton btnWest;
    public JLabel lblField1;
    public JLabel lblField2;
    public JLabel lblField3;
    public JLabel lblPassword;
    public JLabel lblUsername;
    public JScrollPane scrollPane1;
    public JScrollPane scrollPane2;
    public JScrollPane scrollPane3;

    public JTextArea txtArea1;
    public JTextArea txtArea2;
    public JTextArea txtArea3;
    public JPasswordField txtPassword;
    public JTextField txtUsername;
    public Container ContentPane;

    public Frame05_14頁籤1() {
        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane();
        JP1 = new JPanel();
        JP2 = new JPanel();
        JP3 = new JPanel();
        tabbedPane.addTab("Page 1", JP1);
        tabbedPane.addTab("Page 2", JP2);
        tabbedPane.addTab("Page 3", JP3);

        lblUsername = new JLabel("Username:");
        txtUsername = new JTextField();
        lblPassword = new JLabel("Password:");
        txtPassword = new JPasswordField();

        btnCenter = new JButton("Center");
        btnNorth = new JButton("North");
        btnSouth = new JButton("South");
        btnEast = new JButton("East");
        btnWest = new JButton("West");

        lblField1 = new JLabel("Field1");
        txtArea1 = new JTextArea();
        scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(txtArea1);

        lblField2 = new JLabel("Field2");
        txtArea2 = new JTextArea();
        scrollPane2 = new JScrollPane();
        scrollPane2.setViewportView(txtArea2);

        lblField3 = new JLabel("Field3");
        txtArea3 = new JTextArea();
        scrollPane3 = new JScrollPane();
        scrollPane3.setViewportView(txtArea3);
        ////////////////////////////////////
        lblUsername.setBounds(10, 15, 150, 20);
        lblPassword.setBounds(10, 60, 150, 20);
        txtUsername.setBounds(10, 35, 150, 20);
        txtPassword.setBounds(10, 80, 150, 20);

        JP1.setLayout(null);
        JP1.add(lblUsername);
        JP1.add(txtUsername);
        JP1.add(lblPassword);
        JP1.add(txtPassword);
        ////////////////////////////////////
        JP2.setLayout(new BorderLayout());
        JP2.add(btnNorth, BorderLayout.NORTH);
        JP2.add(btnSouth, BorderLayout.SOUTH);
        JP2.add(btnEast, BorderLayout.EAST);
        JP2.add(btnWest, BorderLayout.WEST);
        JP2.add(btnCenter, BorderLayout.CENTER);
        ////////////////////////////////////
        JP3.setLayout(new GridLayout(3, 2));
        JP3.add(lblField1);
        JP3.add(scrollPane1);
        JP3.add(lblField2);
        JP3.add(scrollPane2);
        JP3.add(lblField3);
        JP3.add(scrollPane3);

        ContentPane.add(tabbedPane, BorderLayout.CENTER);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String args[]) {

        new Frame05_14頁籤1();

    }
}
