package txtJFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame06_06猜拳遊戲 extends JFrame {

    public JLabel lblCompute1, lblPerson1;
    public JLabel lblComputer2, lblPerson2;
    public JLabel message;
    public JButton btn0, btn1, btn2;

    public Container ContentPane;
    public ImageIcon MyImg;
    public String person;
    public String m;
    public String b;
    public int i;
    public int j;
    public String[] arr = new String[3];

    public Frame06_06猜拳遊戲() {
        initComponents();
    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        lblCompute1 = new JLabel("電腦出的是：");
        lblPerson1 = new JLabel("你出的是：");
        lblComputer2 = new JLabel();
        lblPerson2 = new JLabel();
        btn0 = new JButton("石頭");
        btn1 = new JButton("剪刀");
        btn2 = new JButton("布");
        message = new JLabel("");
        lblCompute1.setBounds(50, 50, 100, 50);
        lblComputer2.setBounds(150, 50, 100, 50);
        lblPerson1.setBounds(50, 120, 100, 50);
        lblPerson2.setBounds(150, 120, 100, 60);
        message.setBounds(150, 200, 100, 50);
        btn0.setBounds(280, 50, 60, 40);
        btn1.setBounds(280, 105, 60, 40);
        btn2.setBounds(280, 160, 60, 40);

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                choose(evt);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });
        ContentPane.add(lblCompute1);
        ContentPane.add(lblComputer2);
        ContentPane.add(lblPerson1);
        ContentPane.add(lblPerson2);
        ContentPane.add(message);
        ContentPane.add(btn0);
        ContentPane.add(btn1);
        ContentPane.add(btn2);

        this.setBounds(100, 100, 400, 300);
        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ActionEvent evt) {

        JButton tmp = (JButton) evt.getSource();

        if (tmp == btn0) {
            j = 0;
            b = btn0.getText();
        }
        if (tmp == btn1) {
            j = 1;
            b = btn1.getText();
        }
        if (tmp == btn2) {
            j = 2;
            b = btn2.getText();
        }

        lblPerson2.setText(b);
        lblPerson2.setIcon(new ImageIcon(getClass().getResource("/pic/" + j + ".jpg")));
        Win(person); //取電腦亂數
        lblComputer2.setIcon(new ImageIcon(getClass().getResource("/pic/" + i + ".jpg")));
        lblComputer2.setText(arr[i]);
        System.out.println(arr[i]);
    }

    public void Win(String person) {

        arr[0] = "石頭";
        arr[1] = "剪刀";
        arr[2] = "布";
        person = arr[j];
        i = (int) (Math.random() * 3);
        String computer = arr[i];

        //判斷输赢
        if (computer.equals(person)) {
            message.setText("平手");
        } else if (computer.equals("剪刀") && person.equals("石頭") || computer.equals("石頭") && person.equals("布") || computer.equals("布") && person.equals("剪刀")) {
            message.setText("你赢了");
        } else {
            message.setText("你輸了");
        }
    }

    public static void main(String[] args) {

        new Frame06_06猜拳遊戲();

    }
}
