/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.afrisoftech.accounting;

/**
 *
 * @author System Partners
 */
public class InvoiceRegisterIntfr extends javax.swing.JInternalFrame {
java.sql.Connection connectDB = null;
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    /**
     * Creates new form InvoiceRegisterIntfr
     */
    public InvoiceRegisterIntfr(java.sql.Connection connDb) {

        connectDB = connDb;

      
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

        jSearchDialog4 = new javax.swing.JDialog();
        jSearchPanel5 = new javax.swing.JPanel();
        jTextField112 = new javax.swing.JTextField();
        jSearchScrollPane5 = new javax.swing.JScrollPane();
        jSearchTable4 = new com.afrisoftech.dbadmin.JTable();
        jButton45 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new com.afrisoftech.dbadmin.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtAmount1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        dealerNameTxt = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        txtcrno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoBtn2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtInvoiceNO = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        DatepickerReceiving = new com.afrisoftech.lib.DatePicker();
        Datepickerinvoice = new com.afrisoftech.lib.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        txtDeliveredBy = new javax.swing.JTextField();
        ledger = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jSearchDialog4.setModal(true);
        jSearchDialog4.setUndecorated(true);
        jSearchDialog4.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel5.setLayout(new java.awt.GridBagLayout());

        jTextField112.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField112CaretUpdate(evt);
            }
        });
        jTextField112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField112ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 300.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel5.add(jTextField112, gridBagConstraints);

        jSearchTable4.setToolTipText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jSearchTable4.toolTipText")); // NOI18N
        jSearchTable4.setShowHorizontalLines(false);
        /*javax.swing.table.TableColumn column = null;

        for (int i = 0; i < 4; i++) {

            column = jSearchTable.getColumnModel().getColumn(i);

            if (i == 1) {

                column.setPreferredWidth(400);
                //sport column is bigger
            } else {

                column.setPreferredWidth(200);

            }
        }
        */
        jSearchTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable4MouseClicked(evt);
            }
        });
        jSearchScrollPane5.setViewportView(jSearchTable4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel5.add(jSearchScrollPane5, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jButton45, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton45.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel5.add(jButton45, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jButton54, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton54.text")); // NOI18N
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel5.add(jButton54, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog4.getContentPane().add(jSearchPanel5, gridBagConstraints);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.title")); // NOI18N
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jPanel1.border.title"))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 8.0;
        jPanel1.add(jScrollPane3, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel8.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel8, gridBagConstraints);

        txtAmount1.setEditable(false);
        txtAmount1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAmount1.setText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.txtAmount1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 200);
        jPanel1.add(txtAmount1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jPanel2.border.title"))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel4, gridBagConstraints);

        jPanel61.setBackground(new java.awt.Color(204, 255, 204));
        jPanel61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel61.setMinimumSize(new java.awt.Dimension(84, 25));
        jPanel61.setPreferredSize(new java.awt.Dimension(59, 25));
        jPanel61.setLayout(new java.awt.GridBagLayout());

        dealerNameTxt.setEditable(false);
        dealerNameTxt.setBackground(new java.awt.Color(204, 255, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel61.add(dealerNameTxt, gridBagConstraints);

        searchButton.setBackground(new java.awt.Color(204, 255, 204));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif"))); // NOI18N
        searchButton.setToolTipText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.searchButton.toolTipText")); // NOI18N
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        jPanel61.add(searchButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jPanel61, gridBagConstraints);

        txtcrno.setEditable(false);
        txtcrno.setText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.txtcrno.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(txtcrno, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel6.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        jPanel2.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jPanel3.border.title"))); // NOI18N
        jPanel3.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel1, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel3, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(logoBtn2, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.logoBtn2.text")); // NOI18N
        logoBtn2.setToolTipText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.logoBtn2.toolTipText")); // NOI18N
        logoBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoBtn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(logoBtn2, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel5.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel5, gridBagConstraints);

        txtInvoiceNO.setText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.txtInvoiceNO.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtInvoiceNO, gridBagConstraints);

        txtAmount.setText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.txtAmount.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtAmount, gridBagConstraints);

        DatepickerReceiving.setDate(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(DatepickerReceiving, gridBagConstraints);

        Datepickerinvoice.setDate(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(Datepickerinvoice, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jLabel7.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel3.add(jLabel7, gridBagConstraints);

        txtDeliveredBy.setText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.txtDeliveredBy.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtDeliveredBy, gridBagConstraints);

        ledger.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        ledger.setForeground(new java.awt.Color(0, 0, 255));
        org.openide.awt.Mnemonics.setLocalizedText(ledger, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.ledger.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(ledger, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jSeparator1, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif"))); // NOI18N
        jButton1.setMnemonic('O');
        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton1.text")); // NOI18N
        jButton1.setToolTipText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton1.toolTipText")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jButton1, gridBagConstraints);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif"))); // NOI18N
        jButton6.setMnemonic('l');
        org.openide.awt.Mnemonics.setLocalizedText(jButton6, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton6.text")); // NOI18N
        jButton6.setToolTipText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton6.toolTipText")); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jButton6, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF"))); // NOI18N
        jButton4.setMnemonic('C');
        org.openide.awt.Mnemonics.setLocalizedText(jButton4, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton4.text")); // NOI18N
        jButton4.setToolTipText(org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jButton4.toolTipText")); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jButton4, gridBagConstraints);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton1, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jRadioButton1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jRadioButton1, gridBagConstraints);

        buttonGroup1.add(jRadioButton2);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton2, org.openide.util.NbBundle.getMessage(InvoiceRegisterIntfr.class, "InvoiceRegisterIntfr.jRadioButton2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jRadioButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchButton3Clicked();
        //        this.paymentRequestBtn.setEnabled(true);

        // Add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed
private void searchButton3Clicked() {

        System.out.println("Showing dialog");

        // java.awt.Point point = this.jComboBox1311.getLocationOnScreen();
        java.awt.Point point = this.dealerNameTxt.getLocationOnScreen();

        jSearchDialog4.setSize(350, 200);

        jSearchDialog4.setLocation(point);

        jSearchDialog4.setVisible(true);
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //search2();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField112CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField112CaretUpdate
        // TODO add your handling code here:
        jSearchTable4.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "select code,supplier_name as name from st_suppliers where supplier_name ILIKE '" + jTextField112.getText() + "%' order by supplier_name"));

        jSearchScrollPane5.setViewportView(jSearchTable4);
    }//GEN-LAST:event_jTextField112CaretUpdate

    private void jTextField112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField112ActionPerformed

    private void jSearchTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable4MouseClicked
        // TODO add your handling code here:
        dealerNameTxt.setText(jSearchTable4.getValueAt(jSearchTable4.getSelectedRow(), 1).toString());
        txtcrno.setText(jSearchTable4.getValueAt(jSearchTable4.getSelectedRow(), 0).toString());
        jSearchDialog4.dispose();
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        for (int k = 0; k < jTable1.getRowCount(); k++) {
            for (int r = 0; r < jTable1.getColumnCount(); r++) {
                jTable1.getModel().setValueAt(null, k, r);
            }
        }
        jTable1.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "select invoice_no,date_received,date_on_invoice,amount,delivered_by,username as received_by,doc_type from ac_creditor_invoice_register where code='"+txtcrno.getText()+"' and status=false order by 1"));
       txtAmount1.setText(com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(jTable1, 3)));
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_jSearchTable4MouseClicked

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
        this.jSearchDialog4.dispose();
    }//GEN-LAST:event_jButton54ActionPerformed

    private void logoBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoBtn2ActionPerformed
        // TODO add your handling code here:
        
//        upLoadToLedgerBtn.setEnabled(true);
//
//        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser(System.getProperty("Excel.dir"));
//
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files (*.xls)","xls");
//
//        fileChooser.setFileFilter(filter);
//
//        fileChooser.showOpenDialog(this);

        // logoPreviewLbl.setIcon(new javax.swing.ImageIcon(fileChooser.getSelectedFile().getPath()));
        //fileChooser.getSelectedFile().getParent()+"/"+

//        ledger.setText(fileChooser.getSelectedFile().getPath());
//
//        System.setProperty("Excel.dir", fileChooser.getSelectedFile().getParent());
    }//GEN-LAST:event_logoBtn2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String docType="";
            int k=0;
             if(jRadioButton1.isSelected()){
                          docType=jRadioButton1.getText(); 
                        }else if(jRadioButton2.isSelected()){
                           docType=jRadioButton2.getText(); 
                        }
            java.sql.Statement stmtf2 = connectDB.createStatement();
                java.sql.ResultSet rsetf2 = stmtf2.executeQuery("select count(*) from ac_creditor_invoice_register where code='"+txtcrno.getText()+"' and invoice_no='"+txtInvoiceNO.getText()+"' and doc_type='"+docType+"'");
                while (rsetf2.next()) {
                   k= rsetf2.getInt(1);
                }
            if(txtAmount.getText().length()<1 || dealerNameTxt.getText().length()<1 || txtcrno.getText().length()<1 || txtInvoiceNO.getText().length()<1 || txtDeliveredBy.getText().length()<1  || DatepickerReceiving.getDate()==null || Datepickerinvoice.getDate()==null ){
                    javax.swing.JOptionPane.showMessageDialog(this, "Some fields are missing ","Error Message",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else if (k>0){
                 javax.swing.JOptionPane.showMessageDialog(this, "The Invoice already exists  ","Error Message",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
                     connectDB.setAutoCommit(false);
                        java.sql.PreparedStatement pstmt1 = connectDB.prepareStatement("insert into ac_creditor_invoice_register "
                    + "(Supplier,code,invoice_no,date_received,date_on_invoice,delivered_by,amount,doc_type)"
                                + " values(?,?,?,?,?,?,?,?)");
                        pstmt1.setObject(1,dealerNameTxt.getText());
                        pstmt1.setObject(2,txtcrno.getText());
                       
                        pstmt1.setObject(4,com.afrisoftech.lib.SQLDateFormat.getSQLDate(DatepickerReceiving.getDate()));
                        pstmt1.setObject(5,com.afrisoftech.lib.SQLDateFormat.getSQLDate(Datepickerinvoice.getDate()));
                        pstmt1.setObject(6,txtDeliveredBy.getText());
                       
                        if(jRadioButton1.isSelected()){
                           pstmt1.setObject(8,jRadioButton1.getText()); 
                            pstmt1.setObject(3,txtInvoiceNO.getText());
                             pstmt1.setObject(7,Double.parseDouble(txtAmount.getText().replace(",","")));
                        }else if(jRadioButton2.isSelected()){
                             pstmt1.setObject(3,"CR:"+txtInvoiceNO.getText());
                           pstmt1.setObject(8,jRadioButton2.getText());
                            pstmt1.setObject(7,0-Double.parseDouble(txtAmount.getText().replace(",","")));
                        }
                        
                        pstmt1.executeUpdate();
            
            connectDB.commit();
            connectDB.setAutoCommit(true);
            javax.swing.JOptionPane.showMessageDialog(this, "Insert Done Successfully","Comfirmation",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            jTable1.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "select invoice_no,date_received,date_on_invoice,amount,delivered_by,username as received_by,doc_type from ac_creditor_invoice_register where code='"+txtcrno.getText()+"' and status=false order by 1"));
            txtAmount1.setText(com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(jTable1, 3))); 
            txtAmount.setText("0.0");
               txtDeliveredBy.setText("");
               txtInvoiceNO.setText("");
               DatepickerReceiving.setDate(null);
               Datepickerinvoice.setDate(null);
            }     
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            System.out.println(sq.getMessage());
           
        } // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        for (int k = 0; k < jTable1.getRowCount(); k++ ) {
            for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
                jTable1.getModel().setValueAt(null,k,r);
            }
        }
       txtAmount.setText("0.0");
               txtAmount1.setText("0.0");
               txtDeliveredBy.setText("");
               txtInvoiceNO.setText("");
               txtcrno.setText("");
               DatepickerReceiving.setDate(null);
               Datepickerinvoice.setDate(null);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.afrisoftech.lib.DatePicker DatepickerReceiving;
    private com.afrisoftech.lib.DatePicker Datepickerinvoice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dealerNameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jSearchDialog4;
    private javax.swing.JPanel jSearchPanel5;
    private javax.swing.JScrollPane jSearchScrollPane5;
    private javax.swing.JTable jSearchTable4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField112;
    private javax.swing.JLabel ledger;
    private javax.swing.JButton logoBtn2;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmount1;
    private javax.swing.JTextField txtDeliveredBy;
    private javax.swing.JTextField txtInvoiceNO;
    private javax.swing.JTextField txtcrno;
    // End of variables declaration//GEN-END:variables
}
