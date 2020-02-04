package winJFrame;


import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Frame05_02表格資料1 extends javax.swing.JFrame {

    public DefaultTableModel myModel;
    public JTextField[] JT;

    public Frame05_02表格資料1() {
        initComponents();
        myModel = (DefaultTableModel) table1.getModel();
        JT = new JTextField[]{JT1, JT2, JT3};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JT1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JT2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JT3 = new javax.swing.JTextField();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 200, 600, 500));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{
                {"汽車", "1200", "10-01"},
                {"卡車", "2400", "10-05"},
                {"戰車", "3600", "10-06"},
                {"計程車", "2500", "10-10"},
                {"跑車", "2600", "10-11"},
                {"迷你車", "300", "10-12"},
                {"腳踏車", "800", "10-15"},
                {"三輪車", "600", "10-18"},
                {"飛機", "15000", "10-19"},
                {"直升機", "3500", "10-21"},
                {"火箭", "32800", "10-22"}
            },
            new String[]{"名稱", "價格", "日期"}
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choose1(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel1.setText("名稱");

        jLabel2.setText("價格");

        jLabel3.setText("日期");

        JB1.setText("傳回儲存格的值整列的值");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose2(evt);
            }
        });

        JB2.setText("傳回儲存格的值單欄的值");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose3(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JB1)
                .addGap(36, 36, 36)
                .addComponent(JB2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB1)
                    .addComponent(JB2))
                .addGap(90, 90, 90))
        );

        setBounds(0, 0, 654, 505);
    }// </editor-fold>//GEN-END:initComponents

    private void choose1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose1
        int selRow = table1.getSelectedRow();
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(myModel.getValueAt(selRow, i).toString());
        }
    }//GEN-LAST:event_choose1

    private void choose2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose2
        StringBuilder ss = new StringBuilder();
        String str;

        int selRow = table1.getSelectedRow();
        int selColumn = table1.getSelectedColumn();

        if (selRow == -1) {
            return;
        }

        for (int i = 0; i < table1.getColumnCount(); i++) {
            str = (String) myModel.getValueAt(selRow, i);
            if (i < table1.getColumnCount() - 1) {
                ss.append(str).append(" , ");
            } else {
                ss.append(str);
            }
        }
        JOptionPane.showMessageDialog(null, ss);
    }//GEN-LAST:event_choose2

    private void choose3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose3
        StringBuilder ss = new StringBuilder();
        String str;

        int selRow = table1.getSelectedRow();
        int selColumn = table1.getSelectedColumn();

        if (selRow == -1) {
            return;
        }

        str = (String) myModel.getValueAt(selRow, selColumn);
        JOptionPane.showMessageDialog(null, str + " 在 " + selRow + "列" + selColumn + "欄");
    }//GEN-LAST:event_choose3

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
            java.util.logging.Logger.getLogger(Frame05_02表格資料1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_02表格資料1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_02表格資料1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_02表格資料1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_02表格資料1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT2;
    private javax.swing.JTextField JT3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
