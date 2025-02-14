/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afrisoftech.lib;

import java.sql.SQLException;
import org.openide.util.Exceptions;

/**
 *
 * @author Charles
 */
public class ImmunisationDates {

    public static String getImmunisationDate(java.sql.Connection connectDB, String immunisationProcedureCode, String patientNo) {
        String dateofImmunisation = null;

        try {
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("SELECT date_part('day', date_of_visit) ||'-'||date_part('month', date_of_visit) ||'-'||date_part('year', date_of_visit) FROM rh.immunisation_register WHERE patient_no = ? AND immunisation_procedure = ?");

            pstmt.setString(1, patientNo);

            pstmt.setString(2, immunisationProcedureCode);

            java.sql.ResultSet rset = pstmt.executeQuery();

            while (rset.next()) {

                dateofImmunisation = rset.getString(1);

            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            Exceptions.printStackTrace(ex);
        }

        return dateofImmunisation;
    }

    //Get immunisation count for under 1 year
    public static int getUnderImmunisationCounts(java.sql.Connection connectDB, String immunisationProcedureCode, java.util.Date date, int iteration) {

        int immunisationCount = 0;

        try {
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("SELECT count(*) FROM rh.immunisation_register WHERE immunisation_procedure = ? AND date_of_visit = '"+date+"'::date + ?  AND age < 1");

            pstmt.setString(1, immunisationProcedureCode);

           // pstmt.setDate(2, com.afrisoftech.lib.SQLDateFormat.getSQLDate(date));

            pstmt.setInt(2, iteration);

            java.sql.ResultSet rset = pstmt.executeQuery();

            while (rset.next()) {

                immunisationCount = rset.getInt(1);

            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            Exceptions.printStackTrace(ex);
        }

        return immunisationCount;
    }

    //Get immunisation count for over 1 year
    public static int getOverImmunisationCounts(java.sql.Connection connectDB, String immunisationProcedureCode, java.util.Date date, int iteration) {

        int immunisationCount = 0;

        try {
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("SELECT count(*) FROM rh.immunisation_register WHERE immunisation_procedure = ? AND date_of_visit = '"+date+"'::date + ? AND age >= 1");

            pstmt.setString(1, immunisationProcedureCode);

           // pstmt.setDate(2, new java.sql.Date(date.getTime()));

            pstmt.setInt(2, iteration);

            java.sql.ResultSet rset = pstmt.executeQuery();

            while (rset.next()) {

                immunisationCount = rset.getInt(1);

            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            Exceptions.printStackTrace(ex);
        }

        return immunisationCount;
    }
}
