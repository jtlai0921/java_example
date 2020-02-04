package winJFrame;

public class Frame05_05核取框2 extends javax.swing.JFrame {
    
    public javax.swing.JCheckBox[] JCHK;  

    public Frame05_05核取框2() {
        
        initComponents();
        JCHK = new javax.swing.JCheckBox[]{JCH1, JCH2, JCH3, JCH4};
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP1 = new javax.swing.JPanel();
        JCH1 = new javax.swing.JCheckBox();
        JCH2 = new javax.swing.JCheckBox();
        JCH3 = new javax.swing.JCheckBox();
        JCH4 = new javax.swing.JCheckBox();
        JL1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("核取框");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        JP1.setBackground(new java.awt.Color(102, 255, 102));
        JP1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        JCH1.setText("汽車");
        JCH1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        JP1.add(JCH1);

        JCH2.setText("卡車");
        JCH2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        JP1.add(JCH2);

        JCH3.setText("機車");
        JCH3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        JP1.add(JCH3);

        JCH4.setText("腳踏車");
        JCH4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        JP1.add(JCH4);

        JL1.setBackground(new java.awt.Color(255, 255, 0));
        JL1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        setBounds(0, 0, 449, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choose

       StringBuilder str = new StringBuilder("");

        for (int i = 0; i < JCHK.length; i++) {
            if (JCHK[i].isSelected()) {
                str.append(JCHK[i].getText()).append(" ");
            }
        }
        JL1.setText(str.toString());
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
            java.util.logging.Logger.getLogger(Frame05_05核取框2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_05核取框2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_05核取框2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_05核取框2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_05核取框2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCH1;
    private javax.swing.JCheckBox JCH2;
    private javax.swing.JCheckBox JCH3;
    private javax.swing.JCheckBox JCH4;
    private javax.swing.JLabel JL1;
    private javax.swing.JPanel JP1;
    // End of variables declaration//GEN-END:variables
}
