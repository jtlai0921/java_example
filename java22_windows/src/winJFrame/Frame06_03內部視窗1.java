package winJFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class Frame06_03內部視窗1 extends javax.swing.JFrame {

    public static int count;
 

    public Frame06_03內部視窗1() {
        initComponents();           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn = new javax.swing.JButton();
        jdp = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("內部視窗");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        btn.setText("New Frame");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        getContentPane().add(btn, java.awt.BorderLayout.SOUTH);

        jdp.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout jdpLayout = new javax.swing.GroupLayout(jdp);
        jdp.setLayout(jdpLayout);
        jdpLayout.setHorizontalGroup(
            jdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpLayout.setVerticalGroup(
            jdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jdp, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose
        JInternalFrame jif;
        jif = new JInternalFrame("Frame " + (count++), true, true, true, true);
        Container icp = jif.getContentPane();

        JButton ibtn = new JButton("JInternalFrame Button");
        icp.add(ibtn, BorderLayout.SOUTH);
        jdp.add(jif);
        jif.setSize(200,200);
        jif.setVisible(true);
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
            java.util.logging.Logger.getLogger(Frame06_03內部視窗1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame06_03內部視窗1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame06_03內部視窗1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame06_03內部視窗1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame06_03內部視窗1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JDesktopPane jdp;
    // End of variables declaration//GEN-END:variables

}
