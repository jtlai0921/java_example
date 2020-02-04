package Homework;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class Homework07_點菜 extends javax.swing.JFrame {

    String[] colname = {
        "名稱", "數量", "單價"
    };
    Object[][] data = {};
    public DefaultTableModel myModel = null;

    public ImageIcon[] ic1 = new ImageIcon[3];
    public ImageIcon[] ic2 = new ImageIcon[3];
    public int[] ar1 = {150, 200, 100};
    public int[] ar2 = {30, 20, 50};
    JRadioButton[] rdo;
    JCheckBox[] chk;
    JLabel[] lbl;

    public Homework07_點菜() {
        initComponents();
        myModel = (DefaultTableModel) jTable1.getModel();

        ic1[0] = new ImageIcon(getClass().getResource("/Homework/pic/pic2.jpg"));
        ic1[1] = new ImageIcon(getClass().getResource("/Homework/pic/pic7.jpg"));
        ic1[2] = new ImageIcon(getClass().getResource("/Homework/pic/pic11.jpg"));
        ic2[0] = new ImageIcon(getClass().getResource("/Homework/pic/pic3.jpg"));
        ic2[1] = new ImageIcon(getClass().getResource("/Homework/pic/pic4.jpg"));
        ic2[2] = new ImageIcon(getClass().getResource("/Homework/pic/pic5.jpg"));
        rdo = new JRadioButton[]{rdo焗烤, rdo牛排, rdo雞腿排};
        chk = new JCheckBox[]{chk奶酪, chk紅豆湯, chk蛋糕};
        lbl = new JLabel[]{lbl奶酪, lbl紅豆湯, lbl蛋糕};

        for (int i = 0; i < lbl.length; i++) {
            lbl[i].setIcon(ic2[i]);
            lbl[i].setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rdo焗烤 = new javax.swing.JRadioButton();
        rdo牛排 = new javax.swing.JRadioButton();
        rdo雞腿排 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        chk奶酪 = new javax.swing.JCheckBox();
        chk紅豆湯 = new javax.swing.JCheckBox();
        chk蛋糕 = new javax.swing.JCheckBox();
        lbl圖片 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl奶酪 = new javax.swing.JLabel();
        lbl紅豆湯 = new javax.swing.JLabel();
        lbl蛋糕 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl總金額 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("點菜");

        buttonGroup1.add(rdo焗烤);
        rdo焗烤.setText("焗烤 (150)");
        rdo焗烤.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s1(evt);
            }
        });

        buttonGroup1.add(rdo牛排);
        rdo牛排.setText("牛排 (200 )");
        rdo牛排.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s1(evt);
            }
        });

        buttonGroup1.add(rdo雞腿排);
        rdo雞腿排.setText("雞腿排 (100)");
        rdo雞腿排.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s1(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo牛排)
                    .addComponent(rdo雞腿排)
                    .addComponent(rdo焗烤))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rdo焗烤)
                .addGap(18, 18, 18)
                .addComponent(rdo牛排)
                .addGap(18, 18, 18)
                .addComponent(rdo雞腿排)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        chk奶酪.setText("奶烙 (30)");
        chk奶酪.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s1(evt);
            }
        });

        chk紅豆湯.setText("紅豆湯 (20)");
        chk紅豆湯.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s1(evt);
            }
        });

        chk蛋糕.setText("蛋糕 (50)");
        chk蛋糕.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s1(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk蛋糕)
                    .addComponent(chk紅豆湯)
                    .addComponent(chk奶酪))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(chk奶酪)
                .addGap(18, 18, 18)
                .addComponent(chk紅豆湯)
                .addGap(26, 26, 26)
                .addComponent(chk蛋糕)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new java.awt.GridLayout(3, 0, 10, 20));
        jPanel1.add(lbl奶酪);

        lbl紅豆湯.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(lbl紅豆湯);
        jPanel1.add(lbl蛋糕);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            colname
        ));
        jScrollPane1.setViewportView(jTable1);

        lbl總金額.setBackground(new java.awt.Color(255, 255, 0));
        lbl總金額.setFont(new java.awt.Font("標楷體", 1, 36)); // NOI18N
        lbl總金額.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl圖片, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl總金額, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(lbl總金額, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl圖片, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        setBounds(0, 0, 881, 548);
    }// </editor-fold>//GEN-END:initComponents

    private void s1(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s1
        myModel.setRowCount(0);
        int total = 0;

        for (int i = 0; i < rdo.length; i++) {
            if (rdo[i].isSelected()) {
                String 名稱 = rdo[i].getText();
                int 數量 = 1;
                int 單價 = ar1[i];
                Object[] newRow = {名稱, 數量, 單價};
                total += ar1[i];
                lbl圖片.setIcon(ic1[i]);
                myModel.addRow(newRow);
            }
        }
        for (int i = 0; i < chk.length; i++) {

            if (chk[i].isSelected()) {
                String 名稱 = chk[i].getText();
                int 數量 = 1;
                int 單價 = ar2[i];
                Object[] newRow = {名稱, 數量, 單價};
                total += ar2[i];
                myModel.addRow(newRow);
                lbl[i].setVisible(true);
            } else {
                lbl[i].setVisible(false);
            }
        }
        lbl總金額.setText("總金額=" + String.valueOf(total) + " 元");
        //  lbl2.setText(str.toString() + " " + String.valueOf(total) + " 元");
    }//GEN-LAST:event_s1

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Homework07_點菜.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homework07_點菜.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homework07_點菜.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homework07_點菜.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homework07_點菜().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk奶酪;
    private javax.swing.JCheckBox chk紅豆湯;
    private javax.swing.JCheckBox chk蛋糕;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl圖片;
    private javax.swing.JLabel lbl奶酪;
    private javax.swing.JLabel lbl紅豆湯;
    private javax.swing.JLabel lbl總金額;
    private javax.swing.JLabel lbl蛋糕;
    private javax.swing.JRadioButton rdo焗烤;
    private javax.swing.JRadioButton rdo牛排;
    private javax.swing.JRadioButton rdo雞腿排;
    // End of variables declaration//GEN-END:variables
}
