package winJFrame;

import javax.swing.JOptionPane;

public class Frame06_01訊息框1 extends javax.swing.JFrame {

    
    public Frame06_01訊息框1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();
        JB3 = new javax.swing.JButton();
        JB4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JB5 = new javax.swing.JButton();
        JB6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("訊息框對話框");
        setBounds(new java.awt.Rectangle(100, 200, 400, 250));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        JB1.setText("question");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });
        jPanel1.add(JB1);

        JB2.setText("information");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });
        jPanel1.add(JB2);

        JB3.setText("warning");
        JB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB3ActionPerformed(evt);
            }
        });
        jPanel1.add(JB3);

        JB4.setText("error");
        JB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB4ActionPerformed(evt);
            }
        });
        jPanel1.add(JB4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        JB5.setText("YES_NO_CANCEL");
        JB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB5ActionPerformed(evt);
            }
        });
        jPanel2.add(JB5);

        JB6.setText("OK_CANCEL");
        JB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB6ActionPerformed(evt);
            }
        });
        jPanel2.add(JB6);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 428, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed
      JOptionPane.showMessageDialog(getContentPane(), "qusetion", "question", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_JB1ActionPerformed

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed
        JOptionPane.showMessageDialog(getContentPane(), "information", "information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JB2ActionPerformed

    private void JB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB3ActionPerformed
         JOptionPane.showMessageDialog(getContentPane(), "warning", "warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_JB3ActionPerformed

    private void JB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB4ActionPerformed
        JOptionPane.showMessageDialog(getContentPane(), "error", "error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_JB4ActionPerformed

    private void JB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB5ActionPerformed
        int res = JOptionPane.showConfirmDialog(getContentPane(), "YES_NO_CANCEL", "YES_NO_CANCEL", JOptionPane.YES_NO_CANCEL_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(getContentPane(), "yes", "yes", JOptionPane.INFORMATION_MESSAGE);
                }
    }//GEN-LAST:event_JB5ActionPerformed

    private void JB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB6ActionPerformed
          int res = JOptionPane.showConfirmDialog(getContentPane(), "OK_CANCEL", "OK_CANCEL", JOptionPane.OK_CANCEL_OPTION);
                if (res == JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(getContentPane(), "ok", "ok", JOptionPane.INFORMATION_MESSAGE);
                }
    }//GEN-LAST:event_JB6ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame06_01訊息框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame06_01訊息框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame06_01訊息框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame06_01訊息框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame06_01訊息框1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JButton JB3;
    private javax.swing.JButton JB4;
    private javax.swing.JButton JB5;
    private javax.swing.JButton JB6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
