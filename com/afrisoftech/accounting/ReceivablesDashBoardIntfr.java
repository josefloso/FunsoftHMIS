/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afrisoftech.accounting;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import org.jdesktop.swingx.decorator.ColorHighlighter;
import org.jdesktop.swingx.decorator.HighlightPredicate;
import org.jdesktop.swingx.decorator.Highlighter;
import org.jdesktop.swingx.decorator.ShadingColorHighlighter;

/**
 *
 * @author Charles
 */
public class ReceivablesDashBoardIntfr extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReceivablesDashBoardIntfr
     */
    java.sql.Connection connectDB = null;

    public ReceivablesDashBoardIntfr(java.sql.Connection connDB) {

        connectDB = connDB;

        initComponents();
        java.util.Vector<org.jdesktop.swingx.decorator.Highlighter> tableHighlighters = new java.util.Vector<org.jdesktop.swingx.decorator.Highlighter>(1, 1);
        //org.jdesktop.swingx.decorator.Highlighter tableHighlighterArray[] ;// = new org.jdesktop.swingx.decorator.Highlighter()[];
        com.afrisoftech.dbadmin.JXTable predicateTable = (com.afrisoftech.dbadmin.JXTable) receivablesDashboardTable;
        org.jdesktop.swingx.decorator.PatternPredicate patternPredicate = new org.jdesktop.swingx.decorator.PatternPredicate("true", 10, 10);
        ColorHighlighter magenta = new ColorHighlighter(patternPredicate, Color.YELLOW, null, Color.YELLOW, null);
        tableHighlighters.addElement(magenta);
        org.jdesktop.swingx.decorator.PatternPredicate patternPredicate1 = new org.jdesktop.swingx.decorator.PatternPredicate("true", 11, 11);
        ColorHighlighter pink = new ColorHighlighter(patternPredicate1, Color.PINK, null, Color.PINK, null);
        tableHighlighters.add(pink);
        org.jdesktop.swingx.decorator.PatternPredicate patternPredicate2 = new org.jdesktop.swingx.decorator.PatternPredicate("true", 12, 12);
        ColorHighlighter cyan = new ColorHighlighter(patternPredicate2, Color.CYAN, null, Color.CYAN, null);
        tableHighlighters.add(cyan);
        org.jdesktop.swingx.decorator.PatternPredicate patternPredicate3 = new org.jdesktop.swingx.decorator.PatternPredicate("true", 13, 13);
        ColorHighlighter orange = new ColorHighlighter(patternPredicate3, Color.ORANGE, null, Color.ORANGE, null);
        tableHighlighters.add(cyan);
        org.jdesktop.swingx.decorator.PatternPredicate patternPredicate4 = new org.jdesktop.swingx.decorator.PatternPredicate("true", 14, 14);
        ColorHighlighter green = new ColorHighlighter(patternPredicate4, Color.GREEN, null, Color.GREEN, null);
        tableHighlighters.add(green);
        org.jdesktop.swingx.decorator.PatternPredicate patternPredicate5 = new org.jdesktop.swingx.decorator.PatternPredicate("CANCELLED INV", 7);
        ColorHighlighter cancelled = new ColorHighlighter(patternPredicate5, Color.RED, null, Color.RED, null);
        tableHighlighters.add(cancelled);
        // Highlighter shading = new ShadingColorHighlighter(new HighlightPredicate.ColumnHighlightPredicate(6));
        ColorHighlighter tableHighlightersArray[] = new ColorHighlighter[]{magenta, cyan, green, pink, orange, cancelled};
        predicateTable.setHighlighterPipeline(predicateTable, tableHighlightersArray);
        // predicateTable.setHighlighters(magenta, cyan, green, pink, orange);
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

        dashBoardHeaderPanel = new javax.swing.JPanel();
        debtorAccountCmbx = new javax.swing.JComboBox();
        payerAcccountCmbx = new javax.swing.JComboBox();
        startDatePicker = new com.afrisoftech.lib.DatePicker();
        endDatePicker = new com.afrisoftech.lib.DatePicker();
        dashBoardBodyPanel = new javax.swing.JPanel();
        dashBoardScrollPane = new javax.swing.JScrollPane();
        receivablesDashboardTable = new com.afrisoftech.dbadmin.JXTable();
        dashBoardButtonPanel = new javax.swing.JPanel();
        refreshBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        spacerLbl = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("A/C Receivables Dashboard");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        dashBoardHeaderPanel.setLayout(new java.awt.GridBagLayout());

        debtorAccountCmbx.setModel(com.afrisoftech.lib.ComboBoxModel.ComboBoxModel(connectDB, "SELECT '-All-' UNION SELECT scheme_name FROM ac_schemes WHERE scheme_name != '' and scheme_name is not null ORDER BY 1"));
        debtorAccountCmbx.setBorder(javax.swing.BorderFactory.createTitledBorder("Scheme/Debtor Account"));
        debtorAccountCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtorAccountCmbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        dashBoardHeaderPanel.add(debtorAccountCmbx, gridBagConstraints);

        payerAcccountCmbx.setModel(com.afrisoftech.lib.ComboBoxModel.ComboBoxModel(connectDB, "SELECT '-All-' UNION SELECT DISTINCT payer_name FROM ac_schemes WHERE payer_name is not null and payer_name != '' ORDER BY 1"));
        payerAcccountCmbx.setBorder(javax.swing.BorderFactory.createTitledBorder("Payer Account"));
        payerAcccountCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerAcccountCmbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        dashBoardHeaderPanel.add(payerAcccountCmbx, gridBagConstraints);

        startDatePicker.setBorder(javax.swing.BorderFactory.createTitledBorder("Start Date"));

        this.startDatePicker.getDateEditor().addPropertyChangeListener(new java.beans.PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                changeDate();
            }
        });
        startDatePicker.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                startDatePickerInputMethodTextChanged(evt);
            }
        });
        startDatePicker.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                startDatePickerPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        dashBoardHeaderPanel.add(startDatePicker, gridBagConstraints);

        endDatePicker.setBorder(javax.swing.BorderFactory.createTitledBorder("End Date"));

        this.endDatePicker.getDateEditor().addPropertyChangeListener(new java.beans.PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                changeDate();
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        dashBoardHeaderPanel.add(endDatePicker, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        getContentPane().add(dashBoardHeaderPanel, gridBagConstraints);

        dashBoardBodyPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.table.TableModel tableModel = receivablesDashboardTable.getModel();

        tableModel.addTableModelListener(new javax.swing.event.TableModelListener() {

            public void tableChanged(javax.swing.event.TableModelEvent evt) {

                tableModelTableChanged(evt);

            }

        });
        receivablesDashboardTable.setAutoCreateRowSorter(true);
        receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no, admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE date between '"+startDatePicker.getDate()+"' and '"+endDatePicker.getDate()+"' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        dashBoardScrollPane.setViewportView(receivablesDashboardTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        dashBoardBodyPanel.add(dashBoardScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 100.0;
        getContentPane().add(dashBoardBodyPanel, gridBagConstraints);

        dashBoardButtonPanel.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(refreshBtn, "Refresh listing");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        dashBoardButtonPanel.add(refreshBtn, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(editBtn, "Edit information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        dashBoardButtonPanel.add(editBtn, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(clearBtn, "Clear form");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        dashBoardButtonPanel.add(clearBtn, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(closeBtn, "Close form");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        dashBoardButtonPanel.add(closeBtn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 200.0;
        gridBagConstraints.weighty = 1.0;
        dashBoardButtonPanel.add(spacerLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(dashBoardButtonPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_closeBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed

        this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no, admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        spacerLbl.setForeground(Color.BLUE);
        spacerLbl.setText("Total Value of Invoices : [" + com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(receivablesDashboardTable, 9)) + "]");
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void payerAcccountCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerAcccountCmbxActionPerformed

        debtorAccountCmbx.setModel(com.afrisoftech.lib.ComboBoxModel.ComboBoxModel(connectDB,
                "SELECT '-All-' UNION SELECT scheme_name FROM ac_schemes WHERE scheme_name != '' and scheme_name is not null ORDER BY 1"));
        if (payerAcccountCmbx.getSelectedItem().toString().equalsIgnoreCase("-All-")) {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no, admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no,  false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));

            debtorAccountCmbx.setModel(com.afrisoftech.lib.ComboBoxModel.ComboBoxModel(connectDB,
                    "SELECT '-All-' UNION SELECT scheme_name FROM ac_schemes WHERE scheme_name != '' and scheme_name is not null ORDER BY 1"));

        } else {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no, admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE dealer ilike '" + payerAcccountCmbx.getSelectedItem().toString() + "' AND date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));

            debtorAccountCmbx.setModel(com.afrisoftech.lib.ComboBoxModel.ComboBoxModel(connectDB,
                    "SELECT '-All-' UNION SELECT payee FROM ac_debtors WHERE dealer ilike '" + payerAcccountCmbx.getSelectedItem() + "' and payee is not null ORDER BY 1"));
        }
        spacerLbl.setForeground(Color.BLUE);
        spacerLbl.setText("Total Value of Invoices : [" + com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(receivablesDashboardTable, 9)) + "]");
        // TODO add your handling code here:
    }//GEN-LAST:event_payerAcccountCmbxActionPerformed

    private void debtorAccountCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtorAccountCmbxActionPerformed
        if (debtorAccountCmbx.getSelectedItem().toString().equalsIgnoreCase("-All-")) {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,  admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        } else {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,  admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE dealer ilike '" + debtorAccountCmbx.getSelectedItem().toString() + "' AND date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        }
                spacerLbl.setForeground(Color.BLUE);
        spacerLbl.setText("Total Value of Invoices : [" + com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(receivablesDashboardTable, 9)) + "]");
        // TODO add your handling code here:
    }//GEN-LAST:event_debtorAccountCmbxActionPerformed

    private void startDatePickerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_startDatePickerPropertyChange
        if (debtorAccountCmbx.getSelectedItem().toString().equalsIgnoreCase("-All-")) {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,   admission_no as patient_no,  (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        } else {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,   admission_no as patient_no,  (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE dealer ilike '" + debtorAccountCmbx.getSelectedItem().toString() + "' AND date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        }
        spacerLbl.setForeground(Color.BLUE);
        spacerLbl.setText("Total Value of Invoices : [" + com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(receivablesDashboardTable, 9)) + "]");
        // TODO add your handling code here:
    }//GEN-LAST:event_startDatePickerPropertyChange

    private void startDatePickerInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_startDatePickerInputMethodTextChanged
        if (debtorAccountCmbx.getSelectedItem().toString().equalsIgnoreCase("-All-")) {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,  admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no,  false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        } else {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,  admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE dealer ilike '" + debtorAccountCmbx.getSelectedItem().toString() + "' AND date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        } 
                spacerLbl.setForeground(Color.BLUE);
        spacerLbl.setText("Total Value of Invoices : [" + com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(receivablesDashboardTable, 9)) + "]");
        // TODO add your handling code here:
    }//GEN-LAST:event_startDatePickerInputMethodTextChanged
    void changeDate() {
        if (debtorAccountCmbx.getSelectedItem().toString().equalsIgnoreCase("-All-")) {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,  admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        } else {
            this.receivablesDashboardTable.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT date, invoice_no,  admission_no as patient_no, (SELECT DISTINCT claim_no FROM hp_patient_discharge WHERE hp_patient_discharge.inv_no = ac_debtors.invoice_no ORDER BY 1 DESC LIMIT 1) as claim_no, user_name as originator, upper(dealer) as payer, upper(payee) as debtor, upper(account_no) as debtor_acc_no, upper(item) as client_name, sum(debit-credit) invoice_balance, dispatch_no, false as vetted, sent as dispatched, approved as confirmed, paid as settled FROM ac_debtors WHERE dealer ilike '" + debtorAccountCmbx.getSelectedItem().toString() + "' AND date between '" + startDatePicker.getDate() + "' and '" + endDatePicker.getDate() + "' GROUP BY 1,2,3,4,5,6,7,8,9,11,12,13,14,15 ORDER by 1"));
        }
        spacerLbl.setForeground(Color.BLUE);
        spacerLbl.setText("Total Value of Invoices : [" + com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(receivablesDashboardTable, 9)) + "]");
    }

    public void tableModelTableChanged(javax.swing.event.TableModelEvent evt) {
        spacerLbl.setForeground(Color.BLUE);
        spacerLbl.setText("Total Value of Invoices : [" + com.afrisoftech.lib.CurrencyFormatter.getFormattedDouble(com.afrisoftech.lib.TableColumnTotal.getTableColumnTotal(receivablesDashboardTable, 9)) + "]");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JPanel dashBoardBodyPanel;
    private javax.swing.JPanel dashBoardButtonPanel;
    private javax.swing.JPanel dashBoardHeaderPanel;
    private javax.swing.JScrollPane dashBoardScrollPane;
    private javax.swing.JComboBox debtorAccountCmbx;
    private javax.swing.JButton editBtn;
    private com.afrisoftech.lib.DatePicker endDatePicker;
    private javax.swing.JComboBox payerAcccountCmbx;
    private javax.swing.JTable receivablesDashboardTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel spacerLbl;
    private com.afrisoftech.lib.DatePicker startDatePicker;
    // End of variables declaration//GEN-END:variables
}
