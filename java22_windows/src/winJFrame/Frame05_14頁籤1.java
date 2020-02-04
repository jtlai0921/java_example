
package winJFrame;

public class Frame05_14頁籤1 extends javax.swing.JFrame {

 
    public Frame05_14頁籤1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        JP1 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();
        JP2 = new javax.swing.JPanel();
        btnCenter = new javax.swing.JButton();
        btnNorth = new javax.swing.JButton();
        btnSouth = new javax.swing.JButton();
        btnEast = new javax.swing.JButton();
        btnWest = new javax.swing.JButton();
        JP3 = new javax.swing.JPanel();
        lblField1 = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        txtArea1 = new javax.swing.JTextArea();
        lblField2 = new javax.swing.JLabel();
        scrollPane2 = new javax.swing.JScrollPane();
        txtArea2 = new javax.swing.JTextArea();
        lblField3 = new javax.swing.JLabel();
        scrollPane3 = new javax.swing.JScrollPane();
        txtArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("頁籤");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        tabbedPane.setName(""); // NOI18N

        lblUsername.setText("Username");
        lblUsername.setToolTipText("");

        lblPassword.setText("Password");

        txtPassWord.setText("jPasswordField1");

        javax.swing.GroupLayout JP1Layout = new javax.swing.GroupLayout(JP1);
        JP1.setLayout(JP1Layout);
        JP1Layout.setHorizontalGroup(
            JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        JP1Layout.setVerticalGroup(
            JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblPassword)
                .addGap(30, 30, 30)
                .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Page 1", JP1);

        JP2.setLayout(new java.awt.BorderLayout());

        btnCenter.setText("Center");
        JP2.add(btnCenter, java.awt.BorderLayout.CENTER);

        btnNorth.setText("North");
        JP2.add(btnNorth, java.awt.BorderLayout.PAGE_START);

        btnSouth.setText("South");
        JP2.add(btnSouth, java.awt.BorderLayout.PAGE_END);

        btnEast.setText("East");
        JP2.add(btnEast, java.awt.BorderLayout.LINE_END);

        btnWest.setText("West");
        JP2.add(btnWest, java.awt.BorderLayout.LINE_START);

        tabbedPane.addTab("Page 2", JP2);

        JP3.setLayout(new java.awt.GridLayout(3, 2, 5, 5));

        lblField1.setText("Field1");
        JP3.add(lblField1);

        txtArea1.setColumns(20);
        txtArea1.setRows(5);
        scrollPane1.setViewportView(txtArea1);

        JP3.add(scrollPane1);

        lblField2.setText("Field2");
        JP3.add(lblField2);

        txtArea2.setColumns(20);
        txtArea2.setRows(5);
        scrollPane2.setViewportView(txtArea2);

        JP3.add(scrollPane2);

        lblField3.setText("Field3");
        JP3.add(lblField3);

        txtArea3.setColumns(20);
        txtArea3.setRows(5);
        scrollPane3.setViewportView(txtArea3);

        JP3.add(scrollPane3);

        tabbedPane.addTab("Page 3", JP3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        setBounds(0, 0, 416, 378);
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
            java.util.logging.Logger.getLogger(Frame05_14頁籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_14頁籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_14頁籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_14頁籤1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_14頁籤1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP1;
    private javax.swing.JPanel JP2;
    private javax.swing.JPanel JP3;
    private javax.swing.JButton btnCenter;
    private javax.swing.JButton btnEast;
    private javax.swing.JButton btnNorth;
    private javax.swing.JButton btnSouth;
    private javax.swing.JButton btnWest;
    private javax.swing.JLabel lblField1;
    private javax.swing.JLabel lblField2;
    private javax.swing.JLabel lblField3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JScrollPane scrollPane3;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextArea txtArea1;
    private javax.swing.JTextArea txtArea2;
    private javax.swing.JTextArea txtArea3;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
