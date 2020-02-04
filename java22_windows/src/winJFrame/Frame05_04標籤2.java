package winJFrame;

import java.awt.Font;

public class Frame05_04標籤2 extends javax.swing.JFrame {

    
    public Frame05_04標籤2() {
        initComponents();
         Font font1 = new Font(Font.DIALOG, Font.BOLD, 35);
        word1.setFont(font1);
        Font font2 = new Font(Font.DIALOG_INPUT, Font.ITALIC, 35);
        word2.setFont(font2);
        Font font3 = new Font(Font.MONOSPACED, Font.PLAIN, 35);
        word3.setFont(font3);
        Font font4 = new Font(Font.SANS_SERIF, Font.PLAIN, 35);
        word4.setFont(font4);
        Font font5 = new Font(Font.SERIF, Font.PLAIN, 35);
        word5.setFont(font5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        word1 = new javax.swing.JLabel();
        word2 = new javax.swing.JLabel();
        word3 = new javax.swing.JLabel();
        word4 = new javax.swing.JLabel();
        word5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("標籤2");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));
        getContentPane().setLayout(new java.awt.GridLayout(5, 1));

        word1.setText("There is no spoon.");
        getContentPane().add(word1);

        word2.setText("There is no spoon.");
        getContentPane().add(word2);

        word3.setText("There is no spoon.");
        getContentPane().add(word3);

        word4.setText("There is no spoon.");
        getContentPane().add(word4);

        word5.setText("There is no spoon.");
        getContentPane().add(word5);

        setBounds(0, 0, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frame05_04標籤2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_04標籤2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_04標籤2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_04標籤2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_04標籤2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel word1;
    private javax.swing.JLabel word2;
    private javax.swing.JLabel word3;
    private javax.swing.JLabel word4;
    private javax.swing.JLabel word5;
    // End of variables declaration//GEN-END:variables

}
