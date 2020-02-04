package window;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Win表格資料修改2 extends javax.swing.JFrame {

    public DefaultTableModel myModel;
    public JTextField[] JT;

    public Win表格資料修改2() {
        initComponents();
        myModel = (DefaultTableModel) table1.getModel();
        JT = new JTextField[]{txt編號, txt名稱, txt價格, txt日期};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        txt名稱 = new javax.swing.JTextField();
        txt價格 = new javax.swing.JTextField();
        txt日期 = new javax.swing.JTextField();
        btn編號新增 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn編號刪除 = new javax.swing.JButton();
        btn編號修改 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt編號 = new javax.swing.JTextField();
        btn選取刪除 = new javax.swing.JButton();
        btn選取修改 = new javax.swing.JButton();
        btn清除選取 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{
                {"01","汽車", "1200", "10-01"},
                {"02","卡車", "2400", "10-05"},
                {"03","戰車", "3600", "10-06"},
                {"04","計程車", "2500", "10-10"},
                {"05","跑車", "2600", "10-11"},
                {"06","迷你車", "300", "10-12"},
                {"07","腳踏車", "800", "10-15"},
                {"08","三輪車", "600", "10-18"},
                {"09","飛機", "15000", "10-19"},
                {"10","直升機", "3500", "10-21"},
                {"11","火箭", "32800", "10-22"}
            }, new String[]{"編號","名稱", "價格", "日期"}
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btn編號新增.setText("編號新增");
        btn編號新增.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn編號新增ActionPerformed(evt);
            }
        });

        jLabel1.setText("名稱");

        jLabel2.setText("價格");

        jLabel3.setText("日期");

        btn編號刪除.setText("編號刪除");
        btn編號刪除.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn編號刪除ActionPerformed(evt);
            }
        });

        btn編號修改.setText("編號修改");
        btn編號修改.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn編號修改ActionPerformed(evt);
            }
        });

        jLabel4.setText("編號");

        btn選取刪除.setText("選取刪除");
        btn選取刪除.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn選取刪除ActionPerformed(evt);
            }
        });

        btn選取修改.setText("選取修改");
        btn選取修改.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn選取修改ActionPerformed(evt);
            }
        });

        btn清除選取.setText("清除選取");
        btn清除選取.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn清除選取ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt編號, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt名稱, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt價格, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txt日期, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn編號刪除, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn編號修改, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn選取刪除, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btn選取修改, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn清除選取, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn編號新增, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt名稱, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt價格, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt日期, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt編號, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(btn編號新增)
                        .addGap(18, 18, 18)
                        .addComponent(btn編號刪除)
                        .addGap(13, 13, 13)
                        .addComponent(btn編號修改)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn清除選取, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn選取刪除, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn選取修改, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        setBounds(0, 0, 508, 399);
    }// </editor-fold>//GEN-END:initComponents

    private void btn編號刪除ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn編號刪除ActionPerformed

        for (int i = 0; i < myModel.getRowCount(); i++) {
            if (String.valueOf(myModel.getValueAt(i, 0)).equals(txt編號.getText())) {
                myModel.removeRow(i);
            }
        }
        clear();
    }//GEN-LAST:event_btn編號刪除ActionPerformed

    private void btn編號修改ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn編號修改ActionPerformed
        Object[] newData = {
            JT[1].getText(),
            JT[2].getText(),
            JT[3].getText()
        };
        for (int i = 0; i < myModel.getRowCount(); i++) {
            if (String.valueOf(myModel.getValueAt(i, 0)).equals(txt編號.getText())) {

                for (int j = 0; j < newData.length; j++) {
                    myModel.setValueAt(newData[j], i, j + 1); // 編號不改 , 從第 2 欄開始改
                }
            }
        }
        clear();
    }//GEN-LAST:event_btn編號修改ActionPerformed

    private void btn編號新增ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn編號新增ActionPerformed
        Object[] newRow = {
            JT[0].getText(),
            JT[1].getText(),
            JT[2].getText(),
            JT[3].getText()
        };

        myModel.addRow(newRow);
        clear();
    }//GEN-LAST:event_btn編號新增ActionPerformed

    private void btn選取刪除ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn選取刪除ActionPerformed
        int[] selRows = table1.getSelectedRows();

        if (selRows.length == 0) {
            return;
        }
        //依照選取列的索引值移除資料
        for (int i = selRows.length - 1; i >= 0; i--) {
            myModel.removeRow(selRows[i]);
            //必須從後面開始移除, 
            //因為移除一列資料時, 後面選取列的索引值將改變
            //從最後一列開始移除則可解決此問題
        }
    }//GEN-LAST:event_btn選取刪除ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int selRow = table1.getSelectedRow();

        if (selRow == -1) {
            return;
        }
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(table1.getValueAt(selRow, i).toString());
        }
    }//GEN-LAST:event_table1MouseClicked

    private void btn清除選取ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn清除選取ActionPerformed
        table1.clearSelection(); //清除選取
        clear();
    }//GEN-LAST:event_btn清除選取ActionPerformed

    private void btn選取修改ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn選取修改ActionPerformed
        Object[] newData = {
            JT[1].getText(),
            JT[2].getText(),
            JT[3].getText()
        };

        int selRow = table1.getSelectedRow();

        for (int i = 0; i < newData.length; i++) {
            myModel.setValueAt(newData[i], selRow, i + 1);
        }
    }//GEN-LAST:event_btn選取修改ActionPerformed

    public void clear() {
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText("");
        }
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
            java.util.logging.Logger.getLogger(Win表格資料修改2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win表格資料修改2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win表格資料修改2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win表格資料修改2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win表格資料修改2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn清除選取;
    private javax.swing.JButton btn編號修改;
    private javax.swing.JButton btn編號刪除;
    private javax.swing.JButton btn編號新增;
    private javax.swing.JButton btn選取修改;
    private javax.swing.JButton btn選取刪除;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txt價格;
    private javax.swing.JTextField txt名稱;
    private javax.swing.JTextField txt日期;
    private javax.swing.JTextField txt編號;
    // End of variables declaration//GEN-END:variables
}
