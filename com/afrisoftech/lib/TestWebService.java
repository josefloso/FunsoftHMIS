/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afrisoftech.lib;

/**
 *
 * @author Charles
 */
public class TestWebService extends javax.swing.JInternalFrame {

    /**
     * Creates new form TestWebService
     */
    public TestWebService() {
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

        applyWebServiceBtn = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(applyWebServiceBtn, org.openide.util.NbBundle.getMessage(TestWebService.class, "TestWebService.applyWebServiceBtn.text")); // NOI18N
        applyWebServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyWebServiceBtnActionPerformed(evt);
            }
        });
        getContentPane().add(applyWebServiceBtn, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applyWebServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyWebServiceBtnActionPerformed
//        com.afrisoftech.lib.ProcessCheckOutRequest requestBody = new com.afrisoftech.lib.ProcessCheckOutRequest();
//        requestBody.setAMOUNT(10.00);
//        processCheckOut(requestBody);

// TODO add your handling code here:
    }//GEN-LAST:event_applyWebServiceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyWebServiceBtn;
    // End of variables declaration//GEN-END:variables

//    private static ProcessCheckOutResponse processCheckOut(com.afrisoftech.lib.ProcessCheckOutRequest body) {
//        com.afrisoftech.lib.LnmoCheckoutService service = new com.afrisoftech.lib.LnmoCheckoutService();
//        com.afrisoftech.lib.LNMOPortType port = service.getLnmoCheckout();
//        return port.processCheckOut(body);
//    }
//
//    public static void main(String args[]) {
//        TestWebService testWebService = new TestWebService();
//        
//        testWebService.applyWebServiceBtn.doClick();
//    }
}
