package winJFrame;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;


public class Frame05_13垂直水平捲軸2 extends javax.swing.JFrame {

    String[] 菜單;
    StringBuilder str = new StringBuilder("");

    public Frame05_13垂直水平捲軸2() {

        initComponents();
        菜單();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl菜單圖片 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        txt1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        lbl菜單圖片.setToolTipText("");
        lbl菜單圖片.setOpaque(true);
        lbl菜單圖片.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                選菜(evt);
            }
        });

        jScrollBar1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollBar1.setMaximum(20);
        jScrollBar1.setMinimum(1);
        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar1.setVisibleAmount(0);
        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                菜單展示(evt);
            }
        });

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane2.setViewportView(ta1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(lbl菜單圖片, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl菜單圖片, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setBounds(0, 0, 467, 495);
    }// </editor-fold>//GEN-END:initComponents

    private void 菜單展示(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_菜單展示
        菜單();
    }//GEN-LAST:event_菜單展示

    private void 選菜(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_選菜
 
        str.append(找品名價錢("pic" + jScrollBar1.getValue() + ".jpg")).append("\n");
     
        
        // str.append(txt1.getText()).append("\n");
        ta1.setText(str.toString());


    }//GEN-LAST:event_選菜
    public void 菜單() {

        txt1.setText("pic" + jScrollBar1.getValue() + ".jpg");
        lbl菜單圖片.setIcon(new ImageIcon(getClass().getResource("/pic/pic" + jScrollBar1.getValue() + ".jpg")));

    }

    public String 找品名價錢(String strx) {
        try {
           FileReader fr = new FileReader("menu.txt");           
            BufferedReader br = new BufferedReader(fr);
            String[] str1;
            String data;
            while ((data = br.readLine()) != null) {
                str1 = data.split(",");
               
                if (str1[1].equals(strx)) {
                    return str1[1] + "," + str1[0]+ "," + str1[2];
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return "";
    }

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
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_13垂直水平捲軸2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_13垂直水平捲軸2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl菜單圖片;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
