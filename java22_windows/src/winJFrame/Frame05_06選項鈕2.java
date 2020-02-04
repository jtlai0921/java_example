package winJFrame;

import javax.swing.JRadioButton;

public class Frame05_06選項鈕2 extends javax.swing.JFrame {
    
    javax.swing.JRadioButton[] JRBX;
    javax.swing.JRadioButton[] JRBY;

    public Frame05_06選項鈕2() {
        initComponents();
        
        JRBX = new JRadioButton[]{JRB1, JRB2};
        JRBY = new JRadioButton[]{JRB3, JRB4};
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        JP1 = new javax.swing.JPanel();
        JRB1 = new javax.swing.JRadioButton();
        JRB2 = new javax.swing.JRadioButton();
        JP2 = new javax.swing.JPanel();
        JRB3 = new javax.swing.JRadioButton();
        JRB4 = new javax.swing.JRadioButton();
        JL1 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("選項鈕2");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        JP1.setBackground(new java.awt.Color(153, 255, 153));
        JP1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        buttonGroup1.add(JRB1);
        JRB1.setSelected(true);
        JRB1.setText("汽車");
        JRB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose1(evt);
            }
        });
        JP1.add(JRB1);

        buttonGroup1.add(JRB2);
        JRB2.setText("卡車");
        JRB2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose1(evt);
            }
        });
        JP1.add(JRB2);

        JP2.setBackground(new java.awt.Color(102, 204, 255));
        JP2.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        buttonGroup2.add(JRB3);
        JRB3.setSelected(true);
        JRB3.setText("電動");
        JRB3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose2(evt);
            }
        });
        JP2.add(JRB3);

        buttonGroup2.add(JRB4);
        JRB4.setText("汽油");
        JRB4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose2(evt);
            }
        });
        JP2.add(JRB4);

        JL1.setBackground(new java.awt.Color(255, 255, 0));
        JL1.setOpaque(true);

        JL2.setBackground(new java.awt.Color(255, 255, 0));
        JL2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setBounds(0, 0, 492, 347);
    }// </editor-fold>//GEN-END:initComponents

    private void choose1(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choose1
        for (int i = 0; i < JRBX.length; i++) {
            if (JRBX[i].isSelected()) {
                JL1.setText("您選擇了" + JRBX[i].getText());
            }
        }
    }//GEN-LAST:event_choose1
    private void choose2(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choose2
        for (int i = 0; i < JRBY.length; i++) {
            if (JRBY[i].isSelected()) {
                JL2.setText("您選擇了" + JRBY[i].getText());
            }
        }
    }//GEN-LAST:event_choose2
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
            java.util.logging.Logger.getLogger(Frame05_06選項鈕2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_06選項鈕2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_06選項鈕2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_06選項鈕2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_06選項鈕2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JPanel JP1;
    private javax.swing.JPanel JP2;
    private javax.swing.JRadioButton JRB1;
    private javax.swing.JRadioButton JRB2;
    private javax.swing.JRadioButton JRB3;
    private javax.swing.JRadioButton JRB4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    // End of variables declaration//GEN-END:variables
}
