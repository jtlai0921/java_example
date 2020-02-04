package source.window;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import javax.swing.table.TableColumn;

public class Window資料庫維護_myTableModel extends javax.swing.JFrame {

    public MyTableModel myModel;
    public JTextField[] JT;

    public Window資料庫維護_myTableModel() throws Exception {

        initComponents();
        
        selectdata();

        JT = new JTextField[]{JT1, JT2, JT3};
        for (JTextField elm : JT) {
            elm.setEditable(false);
        }

        //選取到第一列       
        table1.setRowSelectionInterval(0, 0);
        //將第一列的值放到文字方塊
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(table1.getValueAt(0, i).toString());
        }     
        
        TableColumn colTitle = table1.getColumnModel().getColumn(0);
        colTitle.setPreferredWidth(100); //設定欄位的喜好寬度為100
        //新增
        JB1.setEnabled(true);
        //修改
        JB2.setEnabled(false);
        //刪除
        JB3.setEnabled(false);
        //取消
        JB4.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JT1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JT2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JT3 = new javax.swing.JTextField();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();
        JB3 = new javax.swing.JButton();
        JB4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table1.setModel(new javax.swing.table.DefaultTableModel(

        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 1, 14)); // NOI18N
        jLabel1.setText("id");

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 1, 14)); // NOI18N
        jLabel2.setText("姓名");

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 1, 14)); // NOI18N
        jLabel3.setText("密碼");

        JB1.setText("新增");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });

        JB2.setText("修改");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });

        JB3.setText("刪除");
        JB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB3ActionPerformed(evt);
            }
        });

        JB4.setText("取消");
        JB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB1)
                            .addComponent(JB2)
                            .addComponent(JB3)
                            .addComponent(JB4))))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed

        if (evt.getActionCommand().equals("新增")) {

            for (JTextField elm : JT) {
                elm.setEditable(true);
                elm.setText(null);
            }
            JB1.setText("儲存");
            JB2.setEnabled(false);
            JB3.setEnabled(false);
            JB4.setEnabled(true);

        } else if (evt.getActionCommand().equals("儲存")) {

            Object[] newRow = {
                JT1.getText(),
                JT2.getText(),
                JT3.getText()
            };

            //寫入資料庫
            try {
                insertdata(Integer.parseInt(JT1.getText()), JT2.getText(), JT3.getText());
                selectdata();
            } catch (Exception e) {
                e.printStackTrace();
            }

            int newRowIndex = myModel.getRowCount() - 1;
            table1.setRowSelectionInterval(newRowIndex, newRowIndex);

            JB1.setText("新增");
            JB2.setEnabled(false);
            JB3.setEnabled(false);
            JB4.setEnabled(false);

            for (JTextField elm : JT) {
                elm.setText(null);
            }
            for (JTextField elm : JT) {
                elm.setEditable(false);
            }

        }
    }//GEN-LAST:event_JB1ActionPerformed

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed

        if (evt.getActionCommand().equals("修改")) {
            //判斷是否選取不止一列, 是則設定僅選取第一列
            if (table1.getSelectedRows().length != 1) {
                int selRow = table1.getSelectedRow();
                //取得選取範圍的第一列
                table1.setRowSelectionInterval(selRow, selRow);
            }

            for (JTextField elm : JT) {
                elm.setEditable(true);
            }

            JB2.setText("儲存");
            JB1.setEnabled(false);
            JB3.setEnabled(false);
            JB4.setEnabled(true);

        } else if (evt.getActionCommand().equals("儲存")) {

            Object[] newData = {
                JT1.getText(),
                JT2.getText(),
                JT3.getText()
            };

            //更新回資料庫
            try {
                updateTable(Integer.parseInt(JT1.getText()), JT2.getText(), JT3.getText());
                selectdata();
            } catch (Exception e) {
                e.printStackTrace();
            }

            JB2.setText("修改");
            JB1.setEnabled(true);
            JB2.setEnabled(false);
            JB3.setEnabled(false);
            JB4.setEnabled(false);

            //將文字欄位清除
            for (JTextField elm : JT) {
                elm.setText(null);
            }
            //將文字欄設定為不可編輯
            for (JTextField elm : JT) {
                elm.setEditable(false);
            }

        }
    }//GEN-LAST:event_JB2ActionPerformed

    private void JB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB3ActionPerformed

        int[] selRows = table1.getSelectedRows();

        if (selRows.length == 0) {
            return;
        }
        try {
            deleteTable(Integer.parseInt(JT1.getText()));
            selectdata();
        } catch (Exception e) {
            e.printStackTrace();
        }

        JB1.setEnabled(true);
        JB2.setEnabled(false);
        JB3.setEnabled(false);
        JB4.setEnabled(false);

        //將文字欄位清除
        for (JTextField elm : JT) {
            elm.setText(null);
        }
        //將文字欄設定為不可編輯
        for (JTextField elm : JT) {
            elm.setEditable(false);
        }

    }//GEN-LAST:event_JB3ActionPerformed

    private void JB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB4ActionPerformed

        int selRow = table1.getSelectedRow();
        table1.clearSelection(); //清除選取

        //將取消按鈕設定為無效
        JB1.setText("新增");
        JB2.setText("修改");

        JB1.setEnabled(true);
        JB2.setEnabled(false);
        JB3.setEnabled(false);
        JB4.setEnabled(false);

        //將文字欄位清除
        for (JTextField elm : JT) {
            elm.setText(null);
        }
        //將文字欄設定為不可編輯
        for (JTextField elm : JT) {
            elm.setEditable(false);
        }
    }//GEN-LAST:event_JB4ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int selRow = table1.getSelectedRow();

        if (selRow == -1) {
            return;
        }
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(table1.getValueAt(selRow, i).toString());
        }
        //修改
        JB2.setEnabled(true);
        //刪除
        JB3.setEnabled(true);
        //取消
        JB4.setEnabled(true);
    }//GEN-LAST:event_table1MouseClicked

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
            java.util.logging.Logger.getLogger(Window資料庫維護_myTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window資料庫維護_myTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window資料庫維護_myTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window資料庫維護_myTableModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Window資料庫維護_myTableModel().setVisible(true);
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
                  Vector<String>  rowdata = new Vector<String>();
                    for (int i = 1; i <= cnum; i++) {
                        rowdata.add(rs.getObject(i).toString());
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

    public Connection dbConnection(String db) throws Exception {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF8";
        String user = "joyes";
        String password = "sun2000";

        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);

    }

    private void selectdata() throws Exception {

        Connection conn = dbConnection("test");

        String selectdbSQL = "select * from user order by id";

        try (PreparedStatement pst = conn.prepareStatement(selectdbSQL)) {
            ResultSet rs = pst.executeQuery();
            myModel = new MyTableModel(rs);
            table1.setModel(myModel);
        }

        if (conn != null) {
            conn.close();
        }

    }

    public void insertdata(int id, String name, String passwd) throws Exception {

        Connection conn = dbConnection("test");

        String insertdbSQL = "Insert into user "
                + " (id, name,passwd) values (?,?,? ) ";

        try (PreparedStatement pst = conn.prepareStatement(insertdbSQL)) {
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, passwd);
            pst.executeUpdate();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public void updateTable(int id, String name, String passwd) throws Exception {
        Connection conn = dbConnection("test");

        String updatedbSQL = "UPDATE user "
                + "SET name = ? , passwd=?  WHERE id = ?";

        try (PreparedStatement pst = conn.prepareStatement(updatedbSQL)) {
            pst.setString(1, name);
            pst.setString(2, passwd);
            pst.setInt(3, id);
            pst.executeUpdate();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public void deleteTable(int id) throws Exception {

        Connection conn = dbConnection("test");

        String deletedbSQL = "Delete  From user where id=?";
        try (PreparedStatement pst = conn.prepareStatement(deletedbSQL)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
        if (conn != null) {
            conn.close();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JButton JB3;
    private javax.swing.JButton JB4;
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT2;
    private javax.swing.JTextField JT3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
