package winJFrame;

import java.awt.Color;
import javax.swing.JColorChooser;

public class Frame05_15顏色對話框1 extends javax.swing.JFrame {
  
    public Color color;

    public Frame05_15顏色對話框1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("顏色對話方塊");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));
        setMinimumSize(new java.awt.Dimension(400, 300));

        btn.setText("Get Color");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        getContentPane().add(btn, java.awt.BorderLayout.SOUTH);

        setBounds(0, 0, 594, 384);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose
        jColorChooser1 = new JColorChooser();
        color = jColorChooser1.showDialog(rootPane, "JCOLORCHOOSER", Color.pink);
        getContentPane().setBackground(color);
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
            java.util.logging.Logger.getLogger(Frame05_15顏色對話框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_15顏色對話框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_15顏色對話框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_15顏色對話框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_15顏色對話框1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JColorChooser jColorChooser1;
    // End of variables declaration//GEN-END:variables

}
