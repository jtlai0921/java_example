package winJFrame;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Frame05_04標籤1 extends javax.swing.JFrame {

    public int index = 0;
    public ImageIcon pic[];

    public Frame05_04標籤1() {

        initComponents();

        pic = new ImageIcon[4];
        pic[0] = new ImageIcon(getClass()
                .getResource("/pic/sp0.jpg"));
        pic[1] = new ImageIcon(getClass()
                .getResource("/pic/sp1.jpg"));
        pic[2] = new ImageIcon(getClass()
                .getResource("/pic/sp2.jpg"));
        pic[3] = new ImageIcon(getClass()
                .getResource("/pic/sp3.jpg"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();
        JL1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("標籤秀圖");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));
        setMinimumSize(new java.awt.Dimension(300, 235));
        setSize(new java.awt.Dimension(400, 350));

        JB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/left.gif"))); // NOI18N
        JB1.setText("前一張");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpic(evt);
            }
        });

        JB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/right.gif"))); // NOI18N
        JB2.setText("下一張");
        JB2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpic(evt);
            }
        });

        JL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/sp0.jpg"))); // NOI18N
        JL1.setText("sp0.jpg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(JL1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(JB1)
                        .addGap(43, 43, 43)
                        .addComponent(JB2)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB1)
                    .addComponent(JB2))
                .addGap(60, 60, 60)
                .addComponent(JL1)
                .addContainerGap())
        );

        setBounds(0, 0, 549, 391);
    }// </editor-fold>//GEN-END:initComponents

    private void showpic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpic
        JButton tmp = (JButton) evt.getSource();

        int num = pic.length;

        if (tmp == JB1 && index >= 0) {
            if (index == 0) {
                index = num;
            }
            index--;
        }
        if (tmp == JB2 && index <= num - 1) {

            if (index == num - 1) {
                index = -1;
            }
            index++;
        }
        JL1.setText("sp" + (index) + ".jpg");

        JL1.setIcon(pic[index]);

    }//GEN-LAST:event_showpic

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
            java.util.logging.Logger.getLogger(Frame05_04標籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_04標籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_04標籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_04標籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_04標籤1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JLabel JL1;
    // End of variables declaration//GEN-END:variables

}
