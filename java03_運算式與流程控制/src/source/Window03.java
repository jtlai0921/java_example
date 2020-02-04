package source;

import javax.swing.JRadioButton;

public class Window03 extends javax.swing.JFrame {

    public Window03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl通過 = new javax.swing.JLabel();
        btn檢核 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt使用者 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt密碼 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt分數 = new javax.swing.JTextField();
        lbl分數等級 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt數字1 = new javax.swing.JTextField();
        txt數字2 = new javax.swing.JTextField();
        btn等於 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        rdo加 = new javax.swing.JRadioButton();
        rdo減 = new javax.swing.JRadioButton();
        rdo乘 = new javax.swing.JRadioButton();
        rdo除 = new javax.swing.JRadioButton();
        lbl答案 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        lbl通過.setBackground(new java.awt.Color(255, 153, 153));
        lbl通過.setOpaque(true);

        btn檢核.setText("請按我");
        btn檢核.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn檢核ActionPerformed(evt);
            }
        });

        jPanel6.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel2.setText("使用者");
        jPanel6.add(jLabel2);
        jPanel6.add(txt使用者);

        jLabel3.setText("密碼");
        jPanel6.add(jLabel3);
        jPanel6.add(txt密碼);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn檢核)
                    .addComponent(lbl通過, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn檢核)
                .addGap(18, 18, 18)
                .addComponent(lbl通過, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("密碼檢核", jPanel1);

        jLabel4.setText("輸入分數");

        txt分數.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt分數ActionPerformed(evt);
            }
        });

        lbl分數等級.setBackground(new java.awt.Color(204, 255, 51));
        lbl分數等級.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt分數, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lbl分數等級, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt分數, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(lbl分數等級, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("分數等級", jPanel2);

        btn等於.setText("等於");
        btn等於.setActionCommand("");
        btn等於.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn等於ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo加);
        rdo加.setText("加");
        rdo加.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                四則運算共用事件(evt);
            }
        });

        buttonGroup1.add(rdo減);
        rdo減.setText("減");
        rdo減.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                四則運算共用事件(evt);
            }
        });

        buttonGroup1.add(rdo乘);
        rdo乘.setText("乘");
        rdo乘.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                四則運算共用事件(evt);
            }
        });

        buttonGroup1.add(rdo除);
        rdo除.setText("除");
        rdo除.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                四則運算共用事件(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo加)
                    .addComponent(rdo減)
                    .addComponent(rdo乘)
                    .addComponent(rdo除))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdo加)
                .addGap(18, 18, 18)
                .addComponent(rdo減)
                .addGap(18, 18, 18)
                .addComponent(rdo乘)
                .addGap(18, 18, 18)
                .addComponent(rdo除)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl答案.setBackground(new java.awt.Color(153, 255, 51));
        lbl答案.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt數字2)
                    .addComponent(txt數字1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn等於)
                .addGap(18, 18, 18)
                .addComponent(lbl答案, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt數字1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn等於)
                                .addComponent(lbl答案, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txt數字2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("四則運算", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn等於ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn等於ActionPerformed

        int x = Integer.parseInt(txt數字1.getText());
        int y = Integer.parseInt(txt數字2.getText());
        int sum = 0;

        if (rdo加.isSelected()) {
            sum = 四則運算(x, y, Count.加);
        }
        if (rdo減.isSelected()) {
            sum = 四則運算(x, y, Count.減);
        }
        if (rdo乘.isSelected()) {
            sum = 四則運算(x, y, Count.乘);
        }
        if (rdo除.isSelected()) {
            sum = 四則運算(x, y, Count.除);
        }
        lbl答案.setText(String.valueOf(sum));
    }//GEN-LAST:event_btn等於ActionPerformed

    private void 四則運算共用事件(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_四則運算共用事件
        //1.
        // btn等於ActionPerformed(evt);
        //2.
        JRadioButton tmp = (JRadioButton) evt.getSource();
        int x = Integer.parseInt(txt數字1.getText());
        int y = Integer.parseInt(txt數字2.getText());
        int sum = 0;

        if (tmp == rdo加) {
            sum = 四則運算(x, y, Count.加);
        }
        if (tmp == rdo減) {
            sum = 四則運算(x, y, Count.減);
        }
        if (tmp == rdo乘) {
            sum = 四則運算(x, y, Count.乘);
        }
        if (tmp == rdo除) {
            sum = 四則運算(x, y, Count.除);
        }
        lbl答案.setText(String.valueOf(sum));        
    }//GEN-LAST:event_四則運算共用事件

    public int 四則運算(int x, int y, Count op) {
        switch (op) {
            case 加:
                return x + y;
            case 減:
                return x - y;
            case 乘:
                return x * y;
            case 除:
                return x / y;
            default:
                return 0;
        }
    }
    private void txt分數ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt分數ActionPerformed
        int grade;
        grade = Integer.parseInt(txt分數.getText());

        if (grade > 100 || grade < 0) {
            lbl分數等級.setText("你的分數輸入錯誤");
            return;
        }

        switch (grade / 10) {
            case 10:
            case 9:
                lbl分數等級.setText("成績：優等");
                break;
            case 8:
                lbl分數等級.setText("成績：甲等");
                break;
            case 7:
                lbl分數等級.setText("成績：乙等");
                break;
            case 6:
                lbl分數等級.setText("成績：丙等");
                break;
            default:
                lbl分數等級.setText("成績：丁等 ");

        }
    }//GEN-LAST:event_txt分數ActionPerformed

    private void btn檢核ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn檢核ActionPerformed

        String userid, password;
        final String user = "sun2000", pass = "1234";

        userid = txt使用者.getText();
        password = txt密碼.getText();

        if (userid.equals(user) && password.equals(pass)) {
            lbl通過.setText("Pass");
        } else {
            lbl通過.setText("No Pass");
        }
    }//GEN-LAST:event_btn檢核ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Window03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window03().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn檢核;
    private javax.swing.JButton btn等於;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl分數等級;
    private javax.swing.JLabel lbl答案;
    private javax.swing.JLabel lbl通過;
    private javax.swing.JRadioButton rdo乘;
    private javax.swing.JRadioButton rdo加;
    private javax.swing.JRadioButton rdo減;
    private javax.swing.JRadioButton rdo除;
    private javax.swing.JTextField txt使用者;
    private javax.swing.JTextField txt分數;
    private javax.swing.JTextField txt密碼;
    private javax.swing.JTextField txt數字1;
    private javax.swing.JTextField txt數字2;
    // End of variables declaration//GEN-END:variables
}
