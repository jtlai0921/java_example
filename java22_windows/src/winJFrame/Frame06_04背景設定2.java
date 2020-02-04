package winJFrame;

import javax.swing.ImageIcon;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Frame06_04背景設定2 extends javax.swing.JFrame {

    public JPanel panel;
    public ImageIcon img;

    public Frame06_04背景設定2() {

        initComponents();

        panel = new JPanel();
        img = new ImageIcon(getClass().getResource("/pic/Sunset.jpg"));

        background.setIcon(img);
        panel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

        panel.add(background);

        //將jp放到最底層
        jlp.add(panel, JLayeredPane.DEFAULT_LAYER);
        //將jb放到高一層的地方
        jlp.add(JB1, JLayeredPane.MODAL_LAYER);
        this.setLayeredPane(jlp);
        this.setBounds(100, 100, img.getIconWidth(), img.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlp = new javax.swing.JLayeredPane();
        background = new javax.swing.JLabel();
        JB1 = new javax.swing.JButton();

        javax.swing.GroupLayout jlpLayout = new javax.swing.GroupLayout(jlp);
        jlp.setLayout(jlpLayout);
        jlpLayout.setHorizontalGroup(
            jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jlpLayout.setVerticalGroup(
            jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 200, 500, 600));

        JB1.setText("JB1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JB1)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JB1)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        setBounds(0, 0, 416, 396);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frame06_04背景設定2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame06_04背景設定2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame06_04背景設定2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame06_04背景設定2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame06_04背景設定2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JLabel background;
    private javax.swing.JLayeredPane jlp;
    // End of variables declaration//GEN-END:variables
}
