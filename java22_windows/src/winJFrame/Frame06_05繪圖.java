package winJFrame;

import java.awt.Graphics;

public class Frame06_05繪圖 extends javax.swing.JFrame {

    public int x1, x2, y1, y2;

    public Frame06_05繪圖() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("繪圖");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paint1(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paint2(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBounds(0, 0, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void paint1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paint1
        Graphics g = getGraphics();

        x2 = evt.getX(); // 取得拖曳滑鼠時的 x 座標
        y2 = evt.getY(); // 取得拖曳滑鼠時的 y 座標
        g.drawLine(x1, y1, x2, y2); // 繪出(x1,y1)到(x2,y2)的連線
        x1 = x2; // 更新繪圖起始點的 x 座標
        y1 = y2; // 更新繪圖起始點的 y 座標
    }//GEN-LAST:event_paint1

    private void paint2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paint2
        x1 = evt.getX(); // 取得滑鼠按下時的 x 座標 (繪圖起始點的 x 座標)
        y1 = evt.getY(); // 取得滑鼠按下時的 y 座標 (繪圖起始點的 y 座標)
    }//GEN-LAST:event_paint2

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
            java.util.logging.Logger.getLogger(Frame06_05繪圖.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame06_05繪圖.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame06_05繪圖.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame06_05繪圖.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame06_05繪圖().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
