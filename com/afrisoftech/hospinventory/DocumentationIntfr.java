/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afrisoftech.hospinventory;

import com.afrisoftech.lib.SQLDateFormat;
import com.lowagie.text.DocumentException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;

/**
 *
 * @author saleem
 */
public class DocumentationIntfr extends javax.swing.JInternalFrame {

    /**
     * Creates new form DocumentationIntfr
     */
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    java.sql.Connection connectDB = null;
    private int row;
    private int col;
    private String ref;

    public DocumentationIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {

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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        detailsPane = new javax.swing.JTextArea();
        docNametxt = new javax.swing.JTextField();
        refNotxt = new javax.swing.JTextField();
        jButton34 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pathTofile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTbl = new com.afrisoftech.dbadmin.JTable();
        jLabel2 = new javax.swing.JLabel();
        keySearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        beginPckr = new com.afrisoftech.lib.DatePicker();
        endPckr = new com.afrisoftech.lib.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jPanel29.border.title"))); // NOI18N
        jPanel29.setLayout(new java.awt.GridBagLayout());

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32x32/pdf1.jpg"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton13, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jButton13.text")); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel29.add(jButton13, gridBagConstraints);

        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel30, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jLabel30.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel29.add(jLabel30, gridBagConstraints);

        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel32, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jLabel32.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel29.add(jLabel32, gridBagConstraints);

        detailsPane.setColumns(20);
        detailsPane.setRows(5);
        detailsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.detailsPane.border.title"))); // NOI18N
        jScrollPane15.setViewportView(detailsPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel29.add(jScrollPane15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel29.add(docNametxt, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel29.add(refNotxt, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jButton34, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jButton34.text")); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        jPanel29.add(jButton34, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel29.add(jLabel1, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        pathTofile.setEditable(false);
        pathTofile.setText(org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.pathTofile.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(pathTofile, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel29.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jPanel29, gridBagConstraints);

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jPanel3.setLayout(new java.awt.GridBagLayout());

        dataTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dataTblMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(dataTbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane1, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jLabel2.text")); // NOI18N
        jPanel3.add(jLabel2, new java.awt.GridBagConstraints());

        keySearch.setText(org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.keySearch.text")); // NOI18N
        keySearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keySearchMouseClicked(evt);
            }
        });
        keySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keySearchActionPerformed(evt);
            }
        });
        keySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keySearchKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(keySearch, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jPanel5.border.title"))); // NOI18N
        jPanel5.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(beginPckr, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(endPckr, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jLabel4, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton1, org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jRadioButton1.text")); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jPanel5, gridBagConstraints);

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(DocumentationIntfr.class, "DocumentationIntfr.jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTabbedPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            // TODO add your handling code here:

            File file = new File(pathTofile.getText());
            java.io.FileInputStream fis = null;
            try {
                fis = new java.io.FileInputStream(file);
            } catch (FileNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }

            PreparedStatement pst = connectDB.prepareStatement("INSERT INTO st_scm_docs(ref_no, document_name,  other_details,uploaded_file) VALUES (?, ?, ?, ? )");

            pst.setObject(1, refNotxt.getText());
            pst.setObject(2, docNametxt.getText());
            pst.setObject(3, detailsPane.getText());
            pst.setBinaryStream(4, fis, (int) file.length());

            pst.executeUpdate();

            connectDB.commit();
            JOptionPane.showMessageDialog(this, "Done");
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            } catch (SQLException ex1) {
                Exceptions.printStackTrace(ex1);
            }
        }


    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:

        if (!pathTofile.getText().contains("pathTofile")) {
            File file = new File(pathTofile.getText());

            com.afrisoftech.lib.PDFRenderer.renderPDF(file);

        } else {
            JOptionPane.showMessageDialog(this, pathTofile.getText() + "Not a valid filename");
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        com.afrisoftech.lib.ExampleFileFilter filter = new com.afrisoftech.lib.ExampleFileFilter();
        filter.addExtension("pdf");
        jFileChooser1.setFileFilter(filter);

        int returnVal = jFileChooser1.showOpenDialog(this);
        System.out.println("sasa hii" + returnVal);

        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {

            File doc = jFileChooser1.getSelectedFile();

            String pic = doc.getName();
            String picp = doc.getAbsolutePath();

            pathTofile.setText(picp.toString());

            System.out.println("umeupload" + pic.toString());

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void keySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keySearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_keySearchActionPerformed

    private void keySearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keySearchKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {

            dataTbl.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT DISTINCT ref_no,document_name,entered_by,input_date , FALSE AS Remove_Entry FROM st_scm_docs WHERE ref_no ilike '" + keySearch.getText() + "'"));
        }
    }//GEN-LAST:event_keySearchKeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        dataTbl.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT DISTINCT ref_no,document_name,entered_by,input_date , FALSE AS Remove_Entry "
                + "FROM st_scm_docs WHERE input_date::date BETWEEN  '" + SQLDateFormat.getSQLDate(beginPckr.getDate()) + "' AND '" + SQLDateFormat.getSQLDate(endPckr.getDate()) + "'"));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void dataTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTblMouseClicked
        // TODO add your handling code here:
        row = dataTbl.getSelectedRow();
        col = dataTbl.getSelectedColumn();

        if (col == 0 && dataTbl.getValueAt(row, 0) != null) {
            ref = dataTbl.getValueAt(row, 0).toString();

            File file = null;
            try {
                file = getStoredPDF(connectDB, ref);
            } catch (FileNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            } catch (DocumentException ex) {
                Exceptions.printStackTrace(ex);
            }

            if (file != null) {
                com.afrisoftech.lib.PDFRenderer.renderPDF(file);

            }

        }


    }//GEN-LAST:event_dataTblMouseClicked

    private void dataTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTblMousePressed
        // TODO add your handling code here:
        //     if (dataTbl.getSelectedColumn() == 4 && dataTbl.getValueAt(dataTbl.getSelectedRow(), 0) != null) {

        if (dataTbl.getSelectedColumn() == 4 || dataTbl.getValueAt(dataTbl.getSelectedRow(), 4) == Boolean.TRUE) {
            int exitOption = javax.swing.JOptionPane.showConfirmDialog(this, "Are you Sure To delete" + dataTbl.getValueAt(dataTbl.getSelectedRow(), 1) + "\n this action is irreversible", "CONFIRMATION", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
            if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
                try {
                    PreparedStatement pst = connectDB.prepareStatement("DELETE FROM st_scm_docs WHERE ref_no ilike '" + dataTbl.getValueAt(dataTbl.getSelectedRow(), 0) + "'");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Done");

                } catch (SQLException ex) {
                    Exceptions.printStackTrace(ex);
                }

            }
            //  }
        }
    }//GEN-LAST:event_dataTblMousePressed

    private void keySearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keySearchMouseClicked
        // TODO add your handling code here:
        if (keySearch.getText().contains("Type ref_no here and press enter...")) {
            keySearch.setText(null);
        }
    }//GEN-LAST:event_keySearchMouseClicked
    public java.io.File getStoredPDF(java.sql.Connection connDB, String documentRefNumber) throws FileNotFoundException, DocumentException {
        java.io.File tempFile = null;

        try {
            java.sql.PreparedStatement pstmtR = connectDB.prepareStatement("SELECT DISTINCT uploaded_file FROM st_scm_docs  WHERE ref_no = ?  LIMIT 1");
            pstmtR.setString(1, documentRefNumber);
            java.sql.ResultSet rs = pstmtR.executeQuery();
            while (rs.next()) {
                byte[] imgBytes = rs.getBytes(1);

                java.io.ByteArrayOutputStream byteaStream = new java.io.ByteArrayOutputStream();

                try {
                    byteaStream.write(imgBytes);

                } catch (IOException ex) {
                    ex.printStackTrace();

                }

                try {
                    tempFile = java.io.File.createTempFile("REP" + com.afrisoftech.lib.DateLables.getDateLabel() + "_", ".pdf");
                    tempFile.deleteOnExit();
                    java.io.OutputStream fileIS = null;
//                    fileIS.flush();
                    fileIS= new java.io.FileOutputStream(tempFile);
                    fileIS.write(imgBytes);
                    
                    fileIS.close();
                    System.out.println(tempFile.getPath());
                    // this is where i am trying to display the file
                    //  com.afrisoftech.lib.PDFRenderer.renderPDF(tempFile);
                } catch (IOException ex) {
                    ex.printStackTrace();

                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return tempFile;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.afrisoftech.lib.DatePicker beginPckr;
    private javax.swing.JTable dataTbl;
    private javax.swing.JTextArea detailsPane;
    private javax.swing.JTextField docNametxt;
    private com.afrisoftech.lib.DatePicker endPckr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton34;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField keySearch;
    private javax.swing.JTextField pathTofile;
    private javax.swing.JTextField refNotxt;
    // End of variables declaration//GEN-END:variables
}
