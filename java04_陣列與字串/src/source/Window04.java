package source;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Window04 extends javax.swing.JFrame {
    
    public ImageIcon[] ic = new ImageIcon[3];
    public JCheckBox[] chk;
    public JLabel[] lbl;
    
    public Window04() {
        initComponents();
        txtInput.setText("0");
        ic[0] = new ImageIcon(getClass().getResource("/pic/ani1.jpg"));
        ic[1] = new ImageIcon(getClass().getResource("/pic/ani2.jpg"));
        ic[2] = new ImageIcon(getClass().getResource("/pic/ani3.jpg"));
        
        chk = new JCheckBox[]{chk企鵝, chk小貓, chk小狗};
        lbl = new JLabel[]{lbl企鵝, lbl小貓, lbl小狗};
        
        for (int i = 0; i < lbl.length; i++) {
            lbl[i].setIcon(ic[i]);
            lbl[i].setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl答案 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        chk我愛你 = new javax.swing.JCheckBox();
        chk我恨你 = new javax.swing.JCheckBox();
        chk我喜歡你 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        lbl圖片 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rdo企鵝 = new javax.swing.JRadioButton();
        rdo小貓 = new javax.swing.JRadioButton();
        rdo小狗 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        chk企鵝 = new javax.swing.JCheckBox();
        chk小貓 = new javax.swing.JCheckBox();
        chk小狗 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        lbl企鵝 = new javax.swing.JLabel();
        lbl小貓 = new javax.swing.JLabel();
        lbl小狗 = new javax.swing.JLabel();
        jPane4 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("視窗練習");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        lbl答案.setBackground(new java.awt.Color(204, 255, 204));
        lbl答案.setOpaque(true);

        chk我愛你.setText("我愛你 (10)");
        chk我愛你.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                核取框事件(evt);
            }
        });

        chk我恨你.setText("我恨你 (20)");
        chk我恨你.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                核取框事件(evt);
            }
        });

        chk我喜歡你.setText("我喜歡你 (30)");
        chk我喜歡你.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                核取框事件(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk我喜歡你)
                    .addComponent(chk我恨你)
                    .addComponent(chk我愛你))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(chk我愛你)
                .addGap(18, 18, 18)
                .addComponent(chk我恨你)
                .addGap(18, 18, 18)
                .addComponent(chk我喜歡你)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl答案, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl答案, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("核取框", jPanel1);

        lbl圖片.setBackground(new java.awt.Color(255, 153, 0));
        lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani1.jpg"))); // NOI18N
        lbl圖片.setOpaque(true);

        buttonGroup2.add(rdo企鵝);
        rdo企鵝.setText("企鵝");
        rdo企鵝.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                選項鈕選圖片(evt);
            }
        });

        buttonGroup2.add(rdo小貓);
        rdo小貓.setText("小貓");
        rdo小貓.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                選項鈕選圖片(evt);
            }
        });

        buttonGroup2.add(rdo小狗);
        rdo小狗.setText("小狗");
        rdo小狗.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                選項鈕選圖片(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo小狗)
                    .addComponent(rdo小貓)
                    .addComponent(rdo企鵝))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rdo企鵝)
                .addGap(18, 18, 18)
                .addComponent(rdo小貓)
                .addGap(18, 18, 18)
                .addComponent(rdo小狗)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lbl圖片)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl圖片, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("圖片1", jPanel2);

        chk企鵝.setText("企鵝");
        chk企鵝.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框選圖片(evt);
            }
        });

        chk小貓.setText("小貓");
        chk小貓.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框選圖片(evt);
            }
        });

        chk小狗.setText("小狗");
        chk小狗.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框選圖片(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk小狗)
                    .addComponent(chk小貓)
                    .addComponent(chk企鵝))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chk企鵝)
                .addGap(18, 18, 18)
                .addComponent(chk小貓)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(chk小狗)
                .addContainerGap())
        );

        jPanel8.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        jPanel8.add(lbl企鵝);
        jPanel8.add(lbl小貓);
        jPanel8.add(lbl小狗);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("圖片2", jPanel3);

        txtInput.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N

        btn1.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });

        btn2.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });

        btn3.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        btndelete.setText("刪除<-");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                刪除(evt);
            }
        });

        javax.swing.GroupLayout jPane4Layout = new javax.swing.GroupLayout(jPane4);
        jPane4.setLayout(jPane4Layout);
        jPane4Layout.setHorizontalGroup(
            jPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane4Layout.createSequentialGroup()
                .addGroup(jPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndelete)
                            .addGroup(jPane4Layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addGap(18, 18, 18)
                                .addComponent(btn2)
                                .addGap(18, 18, 18)
                                .addComponent(btn3))))
                    .addGroup(jPane4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPane4Layout.setVerticalGroup(
            jPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addGap(42, 42, 42)
                .addComponent(btndelete)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("打字", jPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void 核取框事件(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_核取框事件
        
        StringBuilder str = new StringBuilder("");
        int[] ar1 = {10, 20, 30};
        int sum = 0;
        JCheckBox[] chk = {chk我愛你, chk我恨你, chk我喜歡你};

        //        if (chk我愛你.isSelected()) {
        //            str.append(chk我愛你.getText()).append(" ");
        //            sum=sum+ar1[0];
        //        }
        //        if (chk我恨你.isSelected()) {
        //            str.append(chk我恨你.getText()).append(" ");
        //             sum=sum+ar1[1];
        //        }
        //        if (chk我喜歡你.isSelected()) {
        //            str.append(chk我喜歡你.getText()).append(" ");
        //            sum=sum+ar1[2];
        //        }
        for (int i = 0; i < chk.length; i++) {
            
            if (chk[i].isSelected()) {
                str.append(chk[i].getText()).append(" ");
                sum = sum + ar1[i];
            }
        }
        lbl答案.setText(str.toString() + "==> 共 " + sum + " 元 ");
    }//GEN-LAST:event_核取框事件

    private void 數字(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_數字
        JButton btn = (JButton) evt.getSource();
        
        if (txtInput.getText().equals("0")) {
            txtInput.setText("");
        }
        
        txtInput.setText(txtInput.getText() + btn.getText());
    }//GEN-LAST:event_數字

    private void 刪除(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_刪除
        int len;
        len = txtInput.getText().length();
        
        if (len != 0) {
            String str = txtInput.getText().substring(0, len - 1);
            txtInput.setText(str);
            if (txtInput.getText().length() == 0) {
                txtInput.setText("0");
            }
        }
    }//GEN-LAST:event_刪除

    private void 選項鈕選圖片(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_選項鈕選圖片
        if (rdo企鵝.isSelected()) {
            lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani1.jpg"))); // NOI18N
        } else if (rdo小貓.isSelected()) {
            lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani2.jpg"))); // NOI18N
        } else {
            lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani3.jpg"))); // NOI18N
        }
    }//GEN-LAST:event_選項鈕選圖片

    private void 核取框選圖片(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_核取框選圖片
        for (int i = 0; i < chk.length; i++) {
            if (chk[i].isSelected()) {
                lbl[i].setVisible(true);
            } else {
                lbl[i].setVisible(false);
            }
        }
    }//GEN-LAST:event_核取框選圖片
    
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
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window04().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btndelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chk企鵝;
    private javax.swing.JCheckBox chk小狗;
    private javax.swing.JCheckBox chk小貓;
    private javax.swing.JCheckBox chk我喜歡你;
    private javax.swing.JCheckBox chk我恨你;
    private javax.swing.JCheckBox chk我愛你;
    private javax.swing.JPanel jPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl企鵝;
    private javax.swing.JLabel lbl圖片;
    private javax.swing.JLabel lbl小狗;
    private javax.swing.JLabel lbl小貓;
    private javax.swing.JLabel lbl答案;
    private javax.swing.JRadioButton rdo企鵝;
    private javax.swing.JRadioButton rdo小狗;
    private javax.swing.JRadioButton rdo小貓;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
