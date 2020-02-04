package winJFrame;

import javax.swing.JMenuItem;

public class Frame05_11功能表1 extends javax.swing.JFrame {

    public Frame05_11功能表1() {

        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn1 = new javax.swing.JMenu();
        mi1 = new javax.swing.JMenuItem();
        mi2 = new javax.swing.JMenuItem();
        mn2 = new javax.swing.JMenu();
        mn3 = new javax.swing.JMenu();
        mi3 = new javax.swing.JMenuItem();
        mi4 = new javax.swing.JMenuItem();
        mn4 = new javax.swing.JMenu();
        mi5 = new javax.swing.JMenuItem();
        mi6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("功能表");
        setBackground(new java.awt.Color(204, 255, 204));
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        mn1.setText("主選項1");

        mi1.setText("汽車");
        mi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        mn1.add(mi1);

        mi2.setText("卡車");
        mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        mn1.add(mi2);

        jMenuBar1.add(mn1);

        mn2.setText("主選項2");

        mn3.setText("子選項1");

        mi3.setText("戰車");
        mi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        mn3.add(mi3);

        mi4.setText("計程車");
        mi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        mn3.add(mi4);

        mn2.add(mn3);

        mn4.setText("子選項2");

        mi5.setText("跑車");
        mi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        mn4.add(mi5);

        mi6.setText("迷你車");
        mi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose(evt);
            }
        });
        mn4.add(mi6);

        mn2.add(mn4);

        jMenuBar1.add(mn2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        setBounds(0, 0, 469, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose
        JMenuItem tmp = (JMenuItem) evt.getSource();
        String str = tmp.getText();
        JL1.setText("您選擇了" + str + "。");
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
            java.util.logging.Logger.getLogger(Frame05_11功能表1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_11功能表1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_11功能表1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_11功能表1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_11功能表1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mi1;
    private javax.swing.JMenuItem mi2;
    private javax.swing.JMenuItem mi3;
    private javax.swing.JMenuItem mi4;
    private javax.swing.JMenuItem mi5;
    private javax.swing.JMenuItem mi6;
    private javax.swing.JMenu mn1;
    private javax.swing.JMenu mn2;
    private javax.swing.JMenu mn3;
    private javax.swing.JMenu mn4;
    // End of variables declaration//GEN-END:variables
}
