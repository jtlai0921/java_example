package winJFrame;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame06_07計算機 extends javax.swing.JFrame {

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T1 = new javax.swing.JTextField();
        JP1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("傳統計算機");
        setBounds(new java.awt.Rectangle(200, 100, 300, 300));

        JP1.setLayout(new java.awt.GridLayout(5, 4, 5, 5));

        B1.setText("1");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B1);

        B2.setText("2");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B2);

        B3.setText("3");
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B3);

        B11.setText("+");
        B11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                加減乘除(evt);
            }
        });
        JP1.add(B11);

        B4.setText("4");
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B4);

        B5.setText("5");
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B5);

        B6.setText("6");
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B6);

        B12.setText("-");
        B12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                加減乘除(evt);
            }
        });
        JP1.add(B12);

        B7.setText("7");
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B7);

        B8.setText("8");
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B8);

        B9.setText("9");
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B9);

        B13.setText("*");
        B13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                加減乘除(evt);
            }
        });
        JP1.add(B13);

        B10.setText("0");
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B10);

        B15.setText(".");
        B15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                數字按鈕(evt);
            }
        });
        JP1.add(B15);

        B16.setText("C");
        B16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                清除按鈕(evt);
            }
        });
        JP1.add(B16);

        B14.setText("/");
        B14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                加減乘除(evt);
            }
        });
        JP1.add(B14);

        B17.setText("+/-");
        B17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                正負號按鈕(evt);
            }
        });
        JP1.add(B17);

        B18.setText("<--");
        B18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                倒退鍵按鈕(evt);
            }
        });
        JP1.add(B18);

        B19.setText("=");
        B19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                等號按鈕(evt);
            }
        });
        JP1.add(B19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JP1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        setBounds(0, 0, 341, 327);
    }// </editor-fold>//GEN-END:initComponents

    private void 數字按鈕(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_數字按鈕
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
    }//GEN-LAST:event_數字按鈕

    private void 加減乘除(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_加減乘除
        JButton tmp = (JButton) evt.getSource();

        if (tmp == B11) {
            opId = 1;
            setTitle("傳統計算機 +");
        }
        if (tmp == B12) {
            opId = 2;
            setTitle("傳統計算機 -");
        }
        if (tmp == B13) {
            opId = 3;
            setTitle("傳統計算機 *");
        }
        if (tmp == B14) {
            opId = 4;
            setTitle("傳統計算機 /");
        }
        count();
        keyin = "";
    }//GEN-LAST:event_加減乘除

    private void 清除按鈕(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_清除按鈕
        opId = 0;
        tmp = 0;
        result = 0;
        T1.setText(keyin = "0");
        setTitle("傳統計算機");
    }//GEN-LAST:event_清除按鈕

    private void 正負號按鈕(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_正負號按鈕
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
    }//GEN-LAST:event_正負號按鈕

    private void 倒退鍵按鈕(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_倒退鍵按鈕
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
    }//GEN-LAST:event_倒退鍵按鈕

    private void 等號按鈕(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_等號按鈕
        keyin = count();
        opId = 0;
    }//GEN-LAST:event_等號按鈕
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
        System.out.println("opId = " + opId + " keyin =" + keyin); //用於測試
        if (!keyin.equals("")) //有輸入一個加、減、乘或除數
        {
            tmp = Double.parseDouble(keyin); //若無輸入則仍tmp=0
        }
        switch (opId) {      //作 + - * / 那一種運算  val op val action
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
                if (!keyin.equals("")) {   //有輸入除數
                    if (tmp == 0) //不可除 0
                    {
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

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame06_07計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame06_07計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame06_07計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame06_07計算機.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame06_07計算機().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B17;
    private javax.swing.JButton B18;
    private javax.swing.JButton B19;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JPanel JP1;
    private javax.swing.JTextField T1;
    // End of variables declaration//GEN-END:variables

}
