//SELECT orderid ,sum(price) from orderdetail group by orderid
//SELECT orderdetail.orderid, orderdetail.cname, orderdetail.price, orderdetail.num, ordertitle.guest, ordertitle.orderdate FROM orderdetail, ordertitle where orderdetail.orderid = ordertitle.orderid;
//SELECT cname from orderdetail;
package source.window;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class WindowAccess資料庫 extends javax.swing.JFrame {

    public MyTableModel myModel;

    public WindowAccess資料庫() throws Exception {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        txtSQL = new javax.swing.JTextField();
        btn查詢 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Access資料庫");

        table1.setModel(new javax.swing.table.DefaultTableModel(

        ));
        jScrollPane1.setViewportView(table1);

        txtSQL.setBackground(new java.awt.Color(204, 255, 204));
        txtSQL.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        txtSQL.setText("select * from Orderdetail");

        btn查詢.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        btn查詢.setText("查詢");
        btn查詢.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn查詢ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel2.setText("SQL指令");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn查詢)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn查詢)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn查詢ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn查詢ActionPerformed

        try {

            String sql;
            sql = txtSQL.getText().trim();
            selectdata(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn查詢ActionPerformed

    private void selectdata(String sql) throws Exception {

        //String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
        // String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=ORDERSDB.mdb";
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        String url = "jdbc:ucanaccess://ORDERSDB.mdb";

        Class.forName(driver);

        String selectdbSQL = sql;

        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pst = conn.prepareStatement(selectdbSQL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = pst.executeQuery();
            myModel = new MyTableModel(rs);
            table1.setModel(myModel);
        }
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
            java.util.logging.Logger.getLogger(WindowAccess資料庫.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowAccess資料庫.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowAccess資料庫.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowAccess資料庫.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WindowAccess資料庫().setVisible(true);
                } catch (Exception e) {
                }

            }
        });
    }

    public class MyTableModel extends AbstractTableModel {

        Vector<String> colname;
        private Vector<Vector<String>> data;

        private int numColumns;
        private int numRows;

        public MyTableModel(ResultSet rs) {

            data = new Vector<Vector<String>>();
            colname = new Vector<String>();

            try {
                // 取得欄位數量
                ResultSetMetaData rm = rs.getMetaData();
                int cnum = rm.getColumnCount();
                // 取得欄位名稱
                for (int i = 1; i <= cnum; i++) {
                    colname.add(rm.getColumnName(i));
                }
                //取得每欄資料
                while (rs.next()) {
                    Vector<String> rowdata = new Vector<String>();
                    for (int i = 1; i <= cnum; i++) {
                        rowdata.add(String.valueOf(rs.getObject(i)));
                    }
                    data.add(rowdata);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public int getRowCount() {
            return data.size();
        }

        public int getColumnCount() {
            return colname.size();
        }

        public String getValueAt(int row, int column) {
            return data.get(row).get(column);
        }

        public String getColumnName(int column) {
            return (String) colname.get(column);
        }

        public boolean isCellEditable(int row, int column) {
            return true;
        }

        public void setValueAt(Object value, int row, int column) {
            data.get(row).set(column, (String) value);
            fireTableCellUpdated(row, column);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn查詢;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtSQL;
    // End of variables declaration//GEN-END:variables
}
