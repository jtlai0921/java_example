package winJFrame;

import javax.swing.JButton;

public class Frame05_12工具列1 extends javax.swing.JFrame {

    public Frame05_12工具列1() {
        initComponents();

        JB1.setToolTipText("1號");
        JB2.setToolTipText("2號");
        JB3.setToolTipText("3號");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        JB1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        JB2 = new javax.swing.JButton();
        JB3 = new javax.swing.JButton();
        JL1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("工具列");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        jToolBar1.setRollover(true);

        JB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/p1.jpg"))); // NOI18N
        JB1.setFocusable(false);
        JB1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        jToolBar1.add(JB1);
        jToolBar1.add(jSeparator1);

        JB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/p2.jpg"))); // NOI18N
        JB2.setFocusable(false);
        JB2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        jToolBar1.add(JB2);

        JB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/p3.jpg"))); // NOI18N
        JB3.setFocusable(false);
        JB3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        jToolBar1.add(JB3);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        JL1.setText("歡迎光臨");
        getContentPane().add(JL1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 416, 392);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose
        int num = 0;
        JButton tmp = (JButton) evt.getSource();

        if (tmp == JB1) {
            num = 1;
        } else if (tmp == JB2) {
            num = 2;
        } else if (tmp == JB3) {
            num = 3;
        }
        JL1.setText("您選擇了" + num + " 號");
    }//GEN-LAST:event_choose

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
            java.util.logging.Logger.getLogger(Frame05_12工具列1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_12工具列1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_12工具列1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_12工具列1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_12工具列1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JButton JB3;
    private javax.swing.JLabel JL1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
