/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.afrisoftech.hospinventory;

/**
 *
 * @author MUGISPL
 */
public class FO58INFR extends javax.swing.JDialog {

    /**
     * Creates new form FO58INFR
     */
    
   static  java.sql.Connection connectDB = null;
   static org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
   
    public FO58INFR(java.awt.Frame parent, boolean modal,java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
      
        super(parent, modal);
          
        connectDB = connDb;

        pConnDB = pconnDB;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSearchDialog = new javax.swing.JDialog();
        jSearchPanel = new javax.swing.JPanel();
        jTextField111 = new javax.swing.JTextField();
        jSearchScrollPane = new javax.swing.JScrollPane();
        jSearchTable = new com.afrisoftech.dbadmin.JTable();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        disposalTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        postbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        viewGrndetails = new javax.swing.JButton();

        jSearchDialog.setModal(true);
        jSearchDialog.setUndecorated(true);
        jSearchDialog.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel.setLayout(new java.awt.GridBagLayout());

        jTextField111.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField111CaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jSearchPanel.add(jTextField111, gridBagConstraints);

        jSearchTable.setShowHorizontalLines(false);
        /*    try {
            searchRowSet.setCommand("select product,selling_price,gl_code FROM st_stock_prices WHERE department = 'Pharmacy' order by product");
            searchRowSet.setConnectionSource(pConnDB);

            searchRowSet.execute();

            // crset2.setExecuteOnLoad(true);
            jSearchTable.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("product", "Description", false),
                new org.netbeans.lib.sql.models.TableModel.Column("selling_price", "Amount", false),
                new org.netbeans.lib.sql.models.TableModel.Column("gl_code", "Gl_code", false)

            }));
            // jSearchScrollPane.setViewportView(jSearchTable);

        } catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            System.out.println(sqlex.getMessage());
        }
        */
        jSearchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTableMouseClicked(evt);
            }
        });
        jSearchScrollPane.setViewportView(jSearchTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel.add(jSearchScrollPane, gridBagConstraints);

        jButton9.setText("Dispose");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel.add(jButton9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog.getContentPane().add(jSearchPanel, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(null);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("REPORT OF BOARD OF SURVRY ON STORES (SERVICABLE AND SURPLUS TO REQUIREMENTS)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MINISTRY OF HEALTH");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NB- Columns No.s 1 to 7 to be completed by the Department prior to the assembly of the Board");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Station KNH");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jLabel7, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jComboBox1, gridBagConstraints);

        disposalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                " NO", "iTEM CODE", "(1) iTEM/ARTICLE", "(2) QTY", "(3) UNIT", "(4) PRICE", "(5) DATE OF PURCHASE", "(6) VALUE", "(7) UNSERVICABLE/SURPLUS", "(8) BOARDS REPORT ON CONDITION", "(9) RECOMMENDATION OF BOARD FOR DISPOSAL", "(10) ESTIMATED LOCAL SALEABLE", "(11) REMARKS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        disposalTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(disposalTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("F.O.58");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel1.add(jLabel8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        postbtn.setMnemonic('s');
        postbtn.setText("Generate GRN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(postbtn, gridBagConstraints);

        resetbtn.setMnemonic('s');
        resetbtn.setText("Save and print GRN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(resetbtn, gridBagConstraints);

        cancelbtn.setMnemonic('l');
        cancelbtn.setText("Clear entries");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(cancelbtn, gridBagConstraints);

        exitbtn.setMnemonic('c');
        exitbtn.setText("Close form");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(exitbtn, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jLabel5, gridBagConstraints);

        jButton1.setMnemonic('r');
        jButton1.setText("Remove row");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jButton1, gridBagConstraints);

        jButton2.setMnemonic('h');
        jButton2.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jButton2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel15, gridBagConstraints);

        viewGrndetails.setText("View GRN Details");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        jPanel3.add(viewGrndetails, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        this.setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_exitbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rows2Delete = disposalTable.getSelectedRowCount();

        int[] selectedRows = disposalTable.getSelectedRows();

        if (rows2Delete < 1) {

            java.awt.Toolkit.getDefaultToolkit().beep();

            javax.swing.JOptionPane.showMessageDialog(this, "There are no selected rows to delete!");

        } else {

            if (rows2Delete > 1) {

                for (int i = 0; i < selectedRows.length; i++) {

                    javax.swing.table.DefaultTableModel defTableModel = (javax.swing.table.DefaultTableModel) disposalTable.getModel();

                    defTableModel.removeRow(selectedRows[i]);

                }

            } else {

                javax.swing.table.DefaultTableModel defTableModel = (javax.swing.table.DefaultTableModel) disposalTable.getModel();

                defTableModel.removeRow(disposalTable.getSelectedRow());
            }
        }
       

        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField111CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField111CaretUpdate
        //if(this.jComboBox2.getSelectedItem().equals("GENERAL STORE")){
            if (this.jTextField111.getCaretPosition() < 1) {
                System.out.print("Nothing");
            } else {
                jSearchTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, ""
                    + "select DISTINCT item_code,description,strength,packaging,buying_price FROM stockitem WHERE description ILIKE '%" + jTextField111.getText() + "%' and department ilike '"+jComboBox1.getSelectedItem()+"' order by description"));
            ///jSearchTable.setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
            jSearchScrollPane.setViewportView(jSearchTable);
            System.out.println("Cannot sort out");

        }
        // Add your handling code here:
    }//GEN-LAST:event_jTextField111CaretUpdate

    private void jSearchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTableMouseClicked
               disposalTable.setValueAt(disposalTable.getSelectedRow()+1, disposalTable.getSelectedRow(), 0);
        disposalTable.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(), 0), disposalTable.getSelectedRow(), 1);
        disposalTable.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(), 1), disposalTable.getSelectedRow(), 2);
       // disposalTable.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(), 3), disposalTable.getSelectedRow(), 4);
        disposalTable.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(), 3), disposalTable.getSelectedRow(), 4);
         disposalTable.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(), 4), disposalTable.getSelectedRow(), 5);


        disposalTable.setValueAt(new java.lang.Double(0), disposalTable.getSelectedRow(), 5);
        disposalTable.setValueAt(new java.lang.Double(0), disposalTable.getSelectedRow(), 7);
        disposalTable.setValueAt(new java.lang.Double(0), disposalTable.getSelectedRow(), 6);
        disposalTable.setValueAt(new java.lang.Double(0), disposalTable.getSelectedRow(), 9);
        //  jTable1.setValueAt(new java.lang.Double(1), jTable1.getSelectedRow(), 2);
        int j = 0;


        try {
            java.sql.Statement pstmt = connectDB.createStatement();
            java.sql.Statement pstmt1 = connectDB.createStatement();

            java.sql.ResultSet rs1 = pstmt1.executeQuery("select count(product) from st_stock_prices sc where product = '" + jSearchTable.getValueAt(jSearchTable.getSelectedRow(), 0) + "'");
            while (rs1.next()) {
                j = rs1.getInt(1);
            }

        } catch (java.sql.SQLException sqlex) {
            sqlex.printStackTrace();
            System.out.println(sqlex.getMessage());
        }


        jSearchDialog.dispose();
        jTextField111.setText("");
    }//GEN-LAST:event_jSearchTableMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jSearchDialog.dispose();         // Add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(FO58INFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FO58INFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FO58INFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FO58INFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FO58INFR dialog = new FO58INFR(new javax.swing.JFrame(), true,connectDB, pConnDB);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTable disposalTable;
    public javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jSearchDialog;
    private javax.swing.JPanel jSearchPanel;
    private javax.swing.JScrollPane jSearchScrollPane;
    private javax.swing.JTable jSearchTable;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JButton postbtn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton viewGrndetails;
    // End of variables declaration//GEN-END:variables
}
