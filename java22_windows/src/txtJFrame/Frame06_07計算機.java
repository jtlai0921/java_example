package txtJFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame06_07計算機 extends JFrame {

    public JTextField T1;
    public JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B10,
            B11, B12, B13, B14, B15, B16, B17, B18, B19;
    public JPanel JP1;
    public Container ContentPane;

    public double result = 0, tmp = 0;
    public int opId = 0; //0:無,1:+,2:-,3:*,4:/
    public String keyin = "0"; //要在 T1 內顯示的內容 , 一開始先設為 0

    public Frame06_07計算機() {
        initComponents();

        T1.setHorizontalAlignment(JTextField.RIGHT);
        T1.setEditable(false);
        T1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLUE);
        B2.setForeground(Color.BLUE);
        B3.setForeground(Color.BLUE);
        B4.setForeground(Color.BLUE);
        B5.setForeground(Color.BLUE);
        B6.setForeground(Color.BLUE);
        B7.setForeground(Color.BLUE);
        B8.setForeground(Color.BLUE);
        B9.setForeground(Color.BLUE);
        B10.setForeground(Color.BLUE);
        B11.setForeground(Color.RED);
        B12.setForeground(Color.RED);
        B13.setForeground(Color.RED);
        B14.setForeground(Color.RED);
        B15.setForeground(Color.BLUE);
        B16.setForeground(Color.RED);
        B17.setForeground(Color.BLUE);
        B18.setForeground(Color.RED);
        B19.setForeground(Color.RED);

    }

    private void initComponents() {

        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);
        GridLayout layout = new GridLayout(5, 4, 5, 5);

        T1 = new JTextField(keyin);
        JP1 = new JPanel();

        B1 = new JButton("1");
        B2 = new JButton("2");
        B3 = new JButton("3");
        B4 = new JButton("4");
        B5 = new JButton("5");
        B6 = new JButton("6");
        B7 = new JButton("7");
        B8 = new JButton("8");
        B9 = new JButton("9");
        B10 = new JButton("0");
        B11 = new JButton("+");
        B12 = new JButton("-");
        B13 = new JButton("*");
        B14 = new JButton("/");
        B15 = new JButton(".");
        B16 = new JButton("C");
        B17 = new JButton("+/-");
        B18 = new JButton("<--");
        B19 = new JButton("=");

        T1.setBounds(20, 30, 250, 28);
        JP1.setBounds(20, 80, 250, 150);

        B1.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[1]
                數字按鈕(evt);
            }
        });
        B2.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[2]
                數字按鈕(evt);
            }
        });
        B3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[3]
                數字按鈕(evt);
            }
        });

        B4.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[4]
                數字按鈕(evt);
            }
        });

        B5.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[5]
                數字按鈕(evt);
            }
        });
        B6.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[6]
                數字按鈕(evt);
            }
        });
        B7.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[7]
                數字按鈕(evt);
            }
        });
        B8.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[8]
                數字按鈕(evt);
            }
        });
        B9.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[9]
                數字按鈕(evt);
            }
        });
        B10.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[0]
                數字按鈕(evt);
            }
        });
        B11.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[+]
                加減乘除(evt);
            }
        });
        B12.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[-]
                加減乘除(evt);
            }
        });
        B13.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[*]
                加減乘除(evt);
            }
        });
        B14.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[/]
                加減乘除(evt);
            }
        });
        B15.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[.]
                數字按鈕(evt);
            }
        });
        B16.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[C] 清除
                清除按鈕(evt);
            }
        });

        B17.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[+/-]，對結果值、或正在輸入的加(減、乘、除)數都有效
                正負號按鈕(evt);
            }
        });

        B18.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[←]倒退

                倒退鍵按鈕(evt);
            }
        });
        B19.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) { //按[=]
                等號按鈕(evt);

            }
        });

        JP1.setLayout(layout);
        JP1.add(B1);
        JP1.add(B2);
        JP1.add(B3);
        JP1.add(B11);
        JP1.add(B4);
        JP1.add(B5);
        JP1.add(B6);
        JP1.add(B12);
        JP1.add(B7);
        JP1.add(B8);
        JP1.add(B9);
        JP1.add(B13);
        JP1.add(B10);
        JP1.add(B15);
        JP1.add(B16);
        JP1.add(B14);
        JP1.add(B17);
        JP1.add(B18);
        JP1.add(B19);

        ContentPane.add(T1);
        ContentPane.add(JP1);

        this.setBounds(200, 100, 300, 300);
        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void 數字按鈕(java.awt.event.MouseEvent evt) {
        JButton tmp = (JButton) evt.getSource();

        if (tmp == B1) {
            setKeyin("1");
        }
        if (tmp == B2) {
            setKeyin("2");
        }
        if (tmp == B3) {
            setKeyin("3");
        }
        if (tmp == B4) {
            setKeyin("4");
        }
        if (tmp == B5) {
            setKeyin("5");
        }
        if (tmp == B6) {
            setKeyin("6");
        }
        if (tmp == B7) {
            setKeyin("7");
        }
        if (tmp == B8) {
            setKeyin("8");
        }
        if (tmp == B9) {
            setKeyin("9");
        }
        if (tmp == B10) {
            setKeyin("0");
        }
        if (tmp == B15) {
            setKeyin(".");
        }
    }

    private void 加減乘除(java.awt.event.MouseEvent evt) {
        JButton tmp = (JButton) evt.getSource();

        if (tmp == B11) {
            opId = 1;
            setTitle("計算機 +");
        }
        if (tmp == B12) {
            opId = 2;
            setTitle("計算機 -");
        }
        if (tmp == B13) {
            opId = 3;
            setTitle("計算機 *");
        }
        if (tmp == B14) {
            opId = 4;
            setTitle("計算機 /");
        }
        count();
        keyin = "";
    }

    private void 清除按鈕(java.awt.event.MouseEvent evt) {
        opId = 0;
        tmp = 0;
        result = 0;
        T1.setText(keyin = "0");
        setTitle("計算機");
    }

    private void 正負號按鈕(java.awt.event.MouseEvent evt) {
        if (keyin.equals("")) { //若按了[+]、[-]、[*]、[/]後尚未輸入數字就按[+/-]
            keyin = "0";
        } else {
            if (keyin.startsWith("-")) {
                keyin = keyin.substring(1); //去頭的 - 號 , 再按一次就把 - 號拿掉
            } else if (!keyin.equals("0")) {
                keyin = "-" + keyin; //頭加 - 號，"0" 除外
            }
        }
        T1.setText(keyin);
    }

    private void 倒退鍵按鈕(java.awt.event.MouseEvent evt) {
        if (keyin.equals("")) {
            return;  //此情況不提供倒退功能
        }           //按了[+][-][*][/]其中之一，但還未開始輸入數字

        keyin = T1.getText();
        if (!keyin.equals("0")) {
            if (keyin.length() > 2) {
                if (keyin.charAt(keyin.length() - 2) == 'E') //倒數第二字元是'E'，表示指數會被刪完
                {
                    keyin = keyin.substring(0, keyin.length() - 2);
                } //'E' 也要刪掉才行，故刪2字元
                else {
                    keyin = keyin.substring(0, keyin.length() - 1);
                }
            } else if (keyin.length() == 2) //剩2個字
            {
                if (keyin.startsWith("-")) {
                    keyin = "0";  //是個位負數，如：-5
                } else {
                    keyin = keyin.substring(0, keyin.length() - 1);
                }
                //刪後面一個字
            } else //剩1個字
            {
                keyin = "0";
            }

            T1.setText(keyin);
        }
    }

    private void 等號按鈕(java.awt.event.MouseEvent evt) {
        keyin = count();
        opId = 0;
    }

    public void setKeyin(String s) {

        if (s.equals(".")) {
            if (keyin.indexOf('.') != -1) {
                return; //已經有小數點
            }
            if (keyin.equals("")) {
                keyin = "0";
            }
        }

        if (keyin.equals("0")) {   //現在 keyin 為 0
            if (s.equals("0")) {
                return;  //原來的 keyin 已是 "0" 後面不能再加 "0"
            } else if (!s.equals(".")) {
                keyin = ""; //現在輸入的若不是"."，不能加在"0"之後 , 把原來的 0 清掉
            }
        }
        keyin = keyin + s; //將現在輸入的數字加在 keyin 之後
        T1.setText(keyin);
    }

    public String count() {

        String resultStr;
        System.out.println("opId = " + opId + " keyin =" + keyin);
        if (!keyin.equals("")) {
            tmp = Double.parseDouble(keyin);
        }
        switch (opId) {
            case 1: // +
                result = result + tmp;
                break;
            case 2: // -
                result = result - tmp;
                break;
            case 3: //*
                if (!keyin.equals("")) {
                    result = result * tmp;
                }
                break;
            case 4: // /
                if (!keyin.equals("")) {
                    if (tmp == 0) {
                        JOptionPane.showMessageDialog(null, "無法除零");
                    } else {
                        result = result / tmp;
                    }
                }
                break;
            case 0:
                result = tmp;

        }

        if (result == (long) result) {
            resultStr = String.valueOf((long) result);
        } else {
            resultStr = String.valueOf(result);
        }
        T1.setText(resultStr);
        tmp = 0;
        return resultStr;
    }

    public static void main(String[] args) {
        new Frame06_07計算機();
    }
}
