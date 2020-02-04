package source;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JOptionPane;

public class WindowRowSet記錄移動book extends javax.swing.JFrame {

    private JdbcRowSet rowset = null;
    private String selectdbSQL = null;

    public WindowRowSet記錄移動book() {

        initComponents();
        dbConnection();
    }

    public void dbConnection() {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/abc?useUnicode=true&characterEncoding=UTF8";
        String user = "joyes";
        String password = "sun2000";
        selectdbSQL = "select * from book ";

        try {
            rowset = RowSetProvider.newFactory().createJdbcRowSet();           
            rowset.setUrl(url);
            rowset.setUsername(user);
            rowset.setPassword(password);
            rowset.setCommand(selectdbSQL);
            rowset.execute();
            rowset.first();
            showsingle();

        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }

    }

    public void showsingle() throws SQLException {

        JT1.setText(String.valueOf(rowset.getInt("id")));
        JT2.setText(rowset.getString("name"));
        JT3.setText(rowset.getString("author"));
        JT4.setText(String.valueOf(rowset.getInt("price")));
        JT5.setText(rowset.getString("note"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JT1 = new javax.swing.JTextField();
        JB2 = new javax.swing.JButton();
        JB1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JB4 = new javax.swing.JButton();
        JB3 = new javax.swing.JButton();
        JT2 = new javax.swing.JTextField();
        JT3 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JT4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JT5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("新細明體", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        JB2.setText("前一筆");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });

        JB1.setText("第一筆");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });

        jLabel3.setText("AUTHOR");

        jLabel2.setText("NAME");

        JB4.setText("最後一筆");
        JB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB4ActionPerformed(evt);
            }
        });

        JB3.setText("下一筆");
        JB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB3ActionPerformed(evt);
            }
        });

        btnAdd.setText("新增");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("修改");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("刪除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("清除資料");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel4.setText("PRICE");

        jLabel5.setText("NOTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JB1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB2)
                                .addGap(18, 18, 18)
                                .addComponent(JB3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JT2)
                                    .addComponent(JT1)
                                    .addComponent(JT3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(JT4)
                                    .addComponent(JT5))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB1)
                    .addComponent(JB2)
                    .addComponent(JB3)
                    .addComponent(JB4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed

        try {
            if (rowset.isFirst()) {
                JOptionPane.showMessageDialog(null, "已是第一筆");
            } else {
                rowset.previous();
            }
            showsingle();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SelectDB Exception :" + e.toString());
        }
    }//GEN-LAST:event_JB2ActionPerformed

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed

        try {
            rowset.first();
            showsingle();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SelectDB Exception :" + e.toString());
        }

    }//GEN-LAST:event_JB1ActionPerformed

    private void JB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB4ActionPerformed

        try {
            rowset.last();
            showsingle();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SelectDB Exception :" + e.toString());
        }
    }//GEN-LAST:event_JB4ActionPerformed

    private void JB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB3ActionPerformed

        try {
            if (rowset.isLast()) {
                JOptionPane.showMessageDialog(null, "已是最後一筆");
            } else {
                rowset.next();
            }

            showsingle();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SelectDB Exception :" + e.toString());
        }
    }//GEN-LAST:event_JB3ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            rowset.moveToInsertRow();
            rowset.updateInt(1, Integer.parseInt(JT1.getText()));
            rowset.updateString(2, JT2.getText());
            rowset.updateString(3, JT3.getText());
            rowset.updateString(4, JT4.getText());
            rowset.updateString(5, JT5.getText());
            rowset.insertRow();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        JOptionPane.showMessageDialog(null, "資料已新增完畢");
        JT1.setText("");
        JT2.setText("");
        JT3.setText("");
        JT4.setText("");
        JT5.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            rowset.beforeFirst();
            while (rowset.next()) {
                if (rowset.getString("id").equals(JT1.getText())) {
                    rowset.updateString(2, JT2.getText());
                    rowset.updateString(3, JT3.getText());
                    rowset.updateString(4, JT4.getText());
                    rowset.updateString(5, JT5.getText());
                    rowset.updateRow();
                }
            }
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        JOptionPane.showMessageDialog(null, "資料已更新完畢");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            rowset.beforeFirst();
            while (rowset.next()) {
                if (rowset.getString("id").equals(JT1.getText())) {
                    rowset.deleteRow();
                    break;
                }
            }
            rowset.next();
            showsingle();
        } catch (SQLException e) {
            System.out.println("SelectDB Exception :" + e.toString());
        }
        JOptionPane.showMessageDialog(null, "資料已刪除完畢");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        JT1.setText("");
        JT2.setText("");
        JT3.setText("");
        JT4.setText("");
        JT5.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(WindowRowSet記錄移動book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowRowSet記錄移動book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowRowSet記錄移動book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowRowSet記錄移動book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowRowSet記錄移動book().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JButton JB3;
    private javax.swing.JButton JB4;
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT2;
    private javax.swing.JTextField JT3;
    private javax.swing.JTextField JT4;
    private javax.swing.JTextField JT5;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
