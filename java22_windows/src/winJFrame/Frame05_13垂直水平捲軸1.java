package winJFrame;

public class Frame05_13垂直水平捲軸1 extends javax.swing.JFrame {

    public Frame05_13垂直水平捲軸1() {
        initComponents();
        this.setBounds(300, 300, 200, 200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vbar = new javax.swing.JScrollBar();
        hbar = new javax.swing.JScrollBar();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("垂直水平捲軸");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        vbar.setMaximum(300);
        vbar.setValue(30);
        vbar.setVisibleAmount(0);
        vbar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                choose(evt);
            }
        });
        getContentPane().add(vbar, java.awt.BorderLayout.EAST);

        hbar.setMaximum(300);
        hbar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        hbar.setUnitIncrement(2);
        hbar.setValue(30);
        hbar.setVisibleAmount(0);
        hbar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                choose(evt);
            }
        });
        getContentPane().add(hbar, java.awt.BorderLayout.SOUTH);
        getContentPane().add(label, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_choose
        label.setText("    New Value is " + evt.getValue() + "      ");
        repaint();
    }//GEN-LAST:event_choose

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
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_13垂直水平捲軸1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar hbar;
    private javax.swing.JLabel label;
    private javax.swing.JScrollBar vbar;
    // End of variables declaration//GEN-END:variables

}
