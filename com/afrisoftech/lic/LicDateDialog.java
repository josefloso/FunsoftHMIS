/*
 * LicDateDialog.java
 *
 * Created on March 23, 2006, 1:11 PM
 */

package com.afrisoftech.lic;

/**
 *
 * @author  root
 */
public class LicDateDialog extends javax.swing.JDialog {
    
    /** Creates new form LicDateDialog */
    public LicDateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        licDatePicker = new com.afrisoftech.lib.DatePicker();
        setExpDateLbl = new javax.swing.JLabel();
        genLicenceBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Licence Expiry Date");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(licDatePicker, gridBagConstraints);

        setExpDateLbl.setText("Set Licence Expiry date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(setExpDateLbl, gridBagConstraints);

        genLicenceBtn.setText("Generate Licence");
        genLicenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genLicenceBtnActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(genLicenceBtn, gridBagConstraints);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(cancelBtn, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(400, 119));
        setLocation((screenSize.width-400)/2,(screenSize.height-119)/2);
    }//GEN-END:initComponents

    private void genLicenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genLicenceBtnActionPerformed

        com.afrisoftech.lic.GenerateLicence.licenceDate = licDatePicker.getDate();
        
        this.dispose();
       
        // Add your handling code here:
    }//GEN-LAST:event_genLicenceBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        this.dispose();
        // Add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new LicDateDialog(new javax.swing.JFrame(), true).setVisible(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.afrisoftech.lib.DatePicker licDatePicker;
    private javax.swing.JButton genLicenceBtn;
    private javax.swing.JLabel setExpDateLbl;
    protected static javax.swing.JButton cancelBtn;
    // End of variables declaration//GEN-END:variables
    
}
