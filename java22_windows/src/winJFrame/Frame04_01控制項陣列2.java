package winJFrame;

import javax.swing.JTextField;

public class Frame04_01控制項陣列2 extends javax.swing.JFrame {
    
    int[] nums;
    JTextField[] JT;
    
    public Frame04_01控制項陣列2() {
        
        initComponents();
        
        JT = new JTextField[]{JT1, JT2, JT3, JT4, JT5, JT6};
        
        for (int i = 0; i < JT.length; i++) {
            JT[i].setEditable(false);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP1 = new javax.swing.JPanel();
        JT1 = new javax.swing.JTextField();
        JT2 = new javax.swing.JTextField();
        JT3 = new javax.swing.JTextField();
        JT4 = new javax.swing.JTextField();
        JT5 = new javax.swing.JTextField();
        JT6 = new javax.swing.JTextField();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("控制項陣列");
        setBounds(new java.awt.Rectangle(100, 200, 600, 500));

        JP1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        JP1.add(JT1);
        JP1.add(JT2);
        JP1.add(JT3);
        JP1.add(JT4);
        JP1.add(JT5);
        JP1.add(JT6);

        JB1.setText("CLEAR");
        JB1.setToolTipText("");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });

        JB2.setText("SELECT");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(JB1)
                        .addGap(57, 57, 57)
                        .addComponent(JB2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(JP1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB1)
                    .addComponent(JB2))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        setBounds(0, 0, 612, 446);
    }// </editor-fold>//GEN-END:initComponents

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText("");
        }
    }//GEN-LAST:event_JB1ActionPerformed

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed
        
        nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 38) + 1;
            
            System.out.print(nums[i] + " ");
            
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    i = i - 1;
                }
            }
        }
        System.out.println();
        
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(String.valueOf(nums[i]));
        }

    }//GEN-LAST:event_JB2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Frame04_01控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame04_01控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame04_01控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame04_01控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame04_01控制項陣列2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JPanel JP1;
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT2;
    private javax.swing.JTextField JT3;
    private javax.swing.JTextField JT4;
    private javax.swing.JTextField JT5;
    private javax.swing.JTextField JT6;
    // End of variables declaration//GEN-END:variables
}
