package winJFrame;

import javax.swing.table.AbstractTableModel;

public class Frame05_02表格2 extends javax.swing.JFrame {

    public MyTableModel myModel = new MyTableModel();

    public Frame05_02表格2() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("表格2");
        setBounds(new java.awt.Rectangle(100, 200, 500, 400));

        table1.setModel(myModel);
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setBounds(0, 0, 467, 374);
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
            java.util.logging.Logger.getLogger(Frame05_02表格2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame05_02表格2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame05_02表格2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame05_02表格2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame05_02表格2().setVisible(true);
            }
        });
    }

    // 模型類別
    public class MyTableModel extends AbstractTableModel {

        String[] colname = {"名稱", "價格", "日期"};
        String[][] data = {
            {"汽車", "1200", "10-01"},
            {"卡車", "2400", "10-05"},
            {"戰車", "3600", "10-06"},
            {"計程車", "2500", "10-10"},
            {"跑車", "2600", "10-11"},
            {"迷你車", "300", "10-12"},
            {"腳踏車", "800", "10-15"},
            {"三輪車", "600", "10-18"},
            {"飛機", "15000", "10-19"},
            {"直升機", "3500", "10-21"},
            {"火箭", "32800", "10-22"}
        };
        private int numColumns = colname.length;
        private int numRows = data.length;

        public MyTableModel() {
        }

        public int getRowCount() {
            return numRows;
        }

        public int getColumnCount() {
            return numColumns;
        }

        public Object getValueAt(int row, int column) {
            return data[row][column];
        }

        public String getColumnName(int column) {
            return colname[column];
        }

        public boolean isCellEditable(int row, int column) {
            return true;
        }

        public void setValueAt(Object value, int row, int column) {
            data[row][column] = (String) value;
            fireTableCellUpdated(row, column);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
