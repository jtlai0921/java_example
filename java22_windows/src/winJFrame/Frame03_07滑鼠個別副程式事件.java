package winJFrame;

import java.awt.Container;

public class Frame03_07滑鼠個別副程式事件 extends javax.swing.JFrame {

    Container ContentPane;

    public Frame03_07滑鼠個別副程式事件() {
        initComponents();
        ContentPane = this.getContentPane();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JT1 = new javax.swing.JTextField();
        JP1 = new javax.swing.JPanel();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();
        JB3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 500, 400));

        JP1.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        JB1.setText("我愛你");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });
        JP1.add(JB1);

        JB2.setText("清除");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });
        JP1.add(JB2);

        JB3.setText("結束");
        JB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB3ActionPerformed(evt);
            }
        });
        JP1.add(JB3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        setBounds(0, 0, 472, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed
        JT1.setText("我愛你");
    }//GEN-LAST:event_JB1ActionPerformed

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed
        JT1.setText("");
    }//GEN-LAST:event_JB2ActionPerformed

    private void JB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JB3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame03_07滑鼠個別副程式事件.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame03_07滑鼠個別副程式事件.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame03_07滑鼠個別副程式事件.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame03_07滑鼠個別副程式事件.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame03_07滑鼠個別副程式事件().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JButton JB3;
    private javax.swing.JPanel JP1;
    private javax.swing.JTextField JT1;
    // End of variables declaration//GEN-END:variables
}
