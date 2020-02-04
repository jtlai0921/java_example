package winJFrame;

import java.awt.Font;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;

public class Frame05_07選項鈕與核取框1 extends javax.swing.JFrame {

    public int n = 2; //向左
    //int bold = Font.BOLD, italic = Font.ITALIC;
    public int bold = 0, italic = 0;
    public int align = JTextField.LEFT, fonts = 14;

    public String name[] = {"14", "16", "18", "20"};

    public Frame05_07選項鈕與核取框1() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jCheckBox2 = new javax.swing.JCheckBox();
        JT1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        radioL = new javax.swing.JRadioButton();
        radioC = new javax.swing.JRadioButton();
        radioR = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        checkB = new javax.swing.JCheckBox();
        checkI = new javax.swing.JCheckBox();
        comboBox = new javax.swing.JComboBox(name);

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        JT1.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        JT1.setText("Just a font Tester");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        buttonGroup.add(radioL);
        radioL.setText("向左");
        radioL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        jPanel1.add(radioL);

        buttonGroup.add(radioC);
        radioC.setText("向右");
        radioC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        jPanel1.add(radioC);

        buttonGroup.add(radioR);
        radioR.setText("置中");
        radioR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        jPanel1.add(radioR);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        checkB.setText("粗體");
        checkB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        jPanel2.add(checkB);

        checkI.setText("斜體");
        checkI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });
        jPanel2.add(checkI);

        comboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choose(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setBounds(0, 0, 490, 382);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choose
         //選項鈕 靠左 , 置中 , 靠右
        //int n = 2;
        if (evt.getSource() == radioL) {
            n = JTextField.LEFT;
        } else if (evt.getSource() == radioR) {
            n = JTextField.RIGHT;
        } else if (evt.getSource() == radioC) {
            n = JTextField.CENTER;
        }
        JT1.setHorizontalAlignment(n);

        //核取框 粗體 , 斜體
        if (evt.getSource() == checkB) {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                bold = 1;
            } else {
                bold = 0;
            }
        }
        if (evt.getSource() == checkI) {
            if (evt.getStateChange()== ItemEvent.SELECTED) {
                italic = 2;
            } else {
                italic = 0;
            }
        }

        //字型
        String big = "14";
        if (evt.getSource() == comboBox) {
            big = (String) comboBox.getSelectedItem();
        }
        JT1.setFont(new Font("Serif", bold + italic, Integer.parseInt(big)));
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
            java.util.logging.Logger.getLogger(Frame05_07選項鈕與核取框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_07選項鈕與核取框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_07選項鈕與核取框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_07選項鈕與核取框1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_07選項鈕與核取框1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JT1;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JCheckBox checkB;
    private javax.swing.JCheckBox checkI;
    private javax.swing.JComboBox comboBox;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radioC;
    private javax.swing.JRadioButton radioL;
    private javax.swing.JRadioButton radioR;
    // End of variables declaration//GEN-END:variables

}
