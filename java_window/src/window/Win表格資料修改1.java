package window;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Win表格資料修改1 extends javax.swing.JFrame {

    public DefaultTableModel myModel;
    public JTextField[] JT;

    public Win表格資料修改1() {

        initComponents();

        myModel = (DefaultTableModel) table1.getModel();

        JT = new JTextField[]{JT1, JT2, JT3};
        for (JTextField elm : JT) {
            elm.setEditable(false);
        }

        myModel = (DefaultTableModel) table1.getModel();
        //選取到第一列
        table1.setRowSelectionInterval(0, 0);
        //設定欄位的喜好寬度為100
        TableColumn colTitle = table1.getColumnModel().getColumn(0);
        colTitle.setPreferredWidth(100);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 200, 600, 500));

        jLabel1.setText("名稱");

        jLabel2.setText("價格");

        jLabel3.setText("日期");

        JB1.setText("新增");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                新增(evt);
            }
        });

        JB2.setText("修改");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                修改(evt);
            }
        });

        JB3.setText("刪除");
        JB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                刪除(evt);
            }
        });

        JB4.setText("取消");
        JB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                清除選取(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{
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
            },
            new String[]{"名稱", "價格", "日期"}
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choose(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JB3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB4)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
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
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB1)
                    .addComponent(JB2)
                    .addComponent(JB3)
                    .addComponent(JB4))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        setBounds(0, 0, 639, 495);
    }// </editor-fold>//GEN-END:initComponents

    private void choose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose
        int selRow = table1.getSelectedRow();

        if (selRow == -1) {
            return;
        }
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(table1.getValueAt(selRow, i).toString());
        }
    }//GEN-LAST:event_choose

    private void 新增(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_新增

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

            myModel.addRow(newRow);

            int newRowIndex = myModel.getRowCount() - 1;
            table1.setRowSelectionInterval(newRowIndex, newRowIndex);

            for (JTextField elm : JT) {
                elm.setEditable(false);
            }
            JB1.setText("新增");
            JB2.setEnabled(true);
            JB3.setEnabled(true);
            JB4.setEnabled(false);
        }

    }//GEN-LAST:event_新增

    private void 修改(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_修改

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

            int selRow = table1.getSelectedRow();

            for (int i = 0; i < JT.length; i++) {
                JT[i].setEditable(false);

                myModel.setValueAt(newData[i], selRow, i);
            }
            JB2.setText("修改");
            JB1.setEnabled(true);
            JB3.setEnabled(true);
            JB4.setEnabled(false);
        }
    }//GEN-LAST:event_修改

    private void 刪除(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_刪除
        int[] selRows = table1.getSelectedRows();

        if (selRows.length == 0) {
            return;
        }

        
        
        //依照選取列的索引值移除資料
        for (int i = selRows.length - 1; i >= 0; i--) {
            myModel.removeRow(selRows[i]);
            //必須從後面開始移除, 
            //因為移除一列資料時, 後面選取列的索引值將改變
            //從最後一列開始移除則可解決此問題
        }

        int rowCount = myModel.getRowCount();

        if (rowCount == 0) {

            for (JTextField elm : JT) {
                elm.setText(null);
            }
            return;
        }
        //刪除後索引值選第一列
        table1.setRowSelectionInterval(0, 0);
        int selRow = table1.getSelectedRow();
        for (int i = 0; i < JT.length; i++) {
            JT[i].setText(table1.getValueAt(selRow, i).toString());
        }
    }//GEN-LAST:event_刪除

    private void 清除選取(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_清除選取
        int selRow = table1.getSelectedRow();

        table1.clearSelection(); //清除選取
        table1.setRowSelectionInterval(selRow, selRow);
        //重設選取範圍

        //將文字欄設定為不可編輯
        for (JTextField elm : JT) {
            elm.setEditable(false);
        }
        JB4.setEnabled(false);
        //將取消按鈕設定為無效
        JB1.setText("新增");
        JB2.setText("修改");

        JB1.setEnabled(true);
        JB2.setEnabled(true);
        JB3.setEnabled(true);
    }//GEN-LAST:event_清除選取

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win表格資料修改1().setVisible(true);
            }
        });
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
