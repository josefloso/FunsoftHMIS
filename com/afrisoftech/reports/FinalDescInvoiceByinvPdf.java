//Author Charles Waweru

//Made to test Java support for Threads.

//Revision : Ver 1.0a

//import java.lang.*;

package com.afrisoftech.reports;
import java.awt.Point;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.*;


public class FinalDescInvoiceByinvPdf implements java.lang.Runnable {
    java.lang.String MNo = null;
    java.lang.String INV01 = null;
    java.lang.String INV02 = null;
    com.afrisoftech.lib.DBObject dbObject;
    
    java.lang.String beginDate = null;
    String ks;
    java.lang.String endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    //    double osBalance = 0.00;
    //   double current = 0.00;
    //  java.lang.String memNo2Use = null;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader11 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    
    com.lowagie.text.Font pFontHeader2 = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    //  public void FinalPatientInvoicePdf(java.sql.Connection connDb, java.lang.String begindate, java.lang.String endate, java.lang.String combox) {
    public void FinalDescInvoiceByinvPdf(java.sql.Connection connDb, java.lang.String inv1, java.lang.String inv2) {
        
        dbObject = new com.afrisoftech.lib.DBObject();
        connectDB = connDb;
        
        INV01 = inv1;
        
        INV02 = inv2;
        
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //		new MemberStatementPdf().MemberStatementPdf(args[0]);
        
    }
    
    
    public void run() {
        
        System.out.println("System has entered running mode");
        
        while (threadCheck) {
            
            System.out.println("O.K. see how we execute target program");
            
            this.generatePdf(MNo);
            
            try {
                
                System.out.println("Right, let's wait for task to complete of fail");
                
                java.lang.Thread.currentThread().sleep(100);
                
                System.out.println("It's time for us threads to get back to work after the nap");
                
            } catch(java.lang.InterruptedException IntExec) {
                
                System.out.println(IntExec.getMessage());
                
            }
            
            threadCheck = false;
            
            
            System.out.println("We shall be lucky to get back to start in one piece");
            
        }
        
        if (!threadCheck) {
            
            
            
            Thread.currentThread().stop();
            
        }
        
    }
    
    public java.lang.String getDateLable() {
        
        java.lang.String date_label = null;
        
        java.lang.String month_now_strs = null;
        
        java.lang.String date_now_strs = null;
        
        java.lang.String year_now_strs = null;
        
        java.lang.String minute_now_strs = null;
        
        java.lang.String hour_now_strs = null;
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        java.util.Calendar calinst = java.util.Calendar.getInstance();
        
        java.util.Date date_now = calinst.getTime();
        
        int date_now_str = date_now.getDate();
        
        int month_now_str = date_now.getMonth();
        
        int year_now_str = date_now.getYear();
        
        int hour_now_str = date_now.getHours();
        
        int minute_now_str = date_now.getMinutes();
        
        int year_now_abs = year_now_str - 100;
        
        if (year_now_abs < 10) {
            
            year_now_strs = "200"+year_now_abs;
            
        } else {
            
            year_now_strs = "20"+year_now_abs;
            
        }
        
        switch (month_now_str) {
            
            case 0 : month_now_strs = "JAN";
            
            break;
            
            case 1 : month_now_strs = "FEB";
            
            break;
            
            case 2 : month_now_strs = "MAR";
            
            break;
            
            case 3 : month_now_strs = "APR";
            
            break;
            
            case 4 : month_now_strs = "MAY";
            
            break;
            
            case 5 : month_now_strs = "JUN";
            
            break;
            
            case 6 : month_now_strs = "JUL";
            
            break;
            
            case 7 : month_now_strs = "AUG";
            
            break;
            
            case 8 : month_now_strs = "SEP";
            
            break;
            
            case 9 : month_now_strs = "OCT";
            
            break;
            
            case 10 : month_now_strs = "NOV";
            
            break;
            
            case 11 : month_now_strs = "DEC";
            
            break;
            
            default :         if (month_now_str < 10){
                
                month_now_strs = "0"+month_now_str;
                
            } else {
                
                month_now_strs = ""+month_now_str;
                
            }
            
        }
        
        if (date_now_str < 10) {
            
            date_now_strs = "0"+date_now_str;
            
        } else {
            
            date_now_strs = ""+date_now_str;
            
        }
        
        if (minute_now_str < 10) {
            
            minute_now_strs = "0"+minute_now_str;
            
        } else {
            
            minute_now_strs = ""+minute_now_str;
            
        }
        
        if (hour_now_str < 10) {
            
            hour_now_strs = "0"+hour_now_str;
            
        } else {
            
            hour_now_strs = ""+hour_now_str;
            
        }
        
        date_label = date_now_strs+month_now_strs+year_now_strs+"@"+hour_now_strs+minute_now_strs;
        
        return date_label;
        
    }
    
    
    public void generatePdf(java.lang.String memNo) {
        
        java.lang.Process wait_for_Pdf2Show;
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        
        java.util.Date dateStampPdf = cal.getTime();
        
        java.lang.String pdfDateStamp = dateStampPdf.toString();
        
        
        try {
            
            java.io.File tempFile = java.io.File.createTempFile("REP"+this.getDateLable()+"_", ".pdf");
            
            tempFile.deleteOnExit();
            
            java.lang.Runtime rt = java.lang.Runtime.getRuntime();
            
            java.lang.String debitTotal = null;
            
            java.lang.String creditTotal = null;
            
            // com.lowagie.text.Document docPdf = new com.lowagie.text.Document();
            int titleFont = 0;
            int bodyFont = 0;
            float Widths = 0;
            float Heights = 0;
            float Margins = 0;
            
            try {
                connectDB.setAutoCommit(false);
                
                java.sql.Statement stm1 = connectDB.createStatement();
                java.sql.ResultSet rse1 = stm1.executeQuery("select header_font,body_font,width,height,margins from receipt_pref");
                while (rse1.next()){
                    titleFont = rse1.getInt(1);
                    bodyFont = rse1.getInt(2);
                    Widths = rse1.getFloat(3);
                    Heights = rse1.getFloat(4);
                    Margins = rse1.getFloat(5);
                }
            }catch(java.sql.SQLException sq){
                
                try {
                    connectDB.rollback();
                }catch (java.sql.SQLException sql){
                    //   javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                System.out.println(sq.getMessage());
                //   javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(), "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                
            }
            // com.lowagie.text.Font pFontHeader = FontFactory.getFont(System.getProperty("font_type_name"), java.lang.Float.parseFloat(System.getProperty("receiptFontSize")), Font.NORMAL);
            // com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(System.getProperty("font_type_name"), java.lang.Float.parseFloat(System.getProperty("receiptTitleFontSize")), Font.BOLD);
            com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, bodyFont, Font.NORMAL);
            com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, titleFont, Font.BOLD);
            
            
            com.lowagie.text.Document docPdf = new com.lowagie.text.Document();
            //com.lowagie.text.Document docPdf = new com.lowagie.text.Document(new Rectangle((Widths), Heights),Margins,Margins,Margins,Margins);
            
            
            
            
            try {
                
                try {
                    
                    com.lowagie.text.pdf.PdfWriter.getInstance(docPdf, new java.io.FileOutputStream(tempFile));
                    
                    
                    String Address = null;
                    String Tel = null;
                    String compName = null;
                    String Fax = null;
                    String Email = null;
                    String date = null;
                    
                    try {
                        
                        
                        java.sql.Statement st3 = connectDB.createStatement();
                        java.sql.Statement st4 = connectDB.createStatement();
                        java.sql.Statement st2x = connectDB.createStatement();
                        
                        java.sql.ResultSet rset2x = st2x.executeQuery("SELECT rep_currency from pb_hospitalprofile");
                        while(rset2x.next()){
                            ks = rset2x.getObject(1).toString();
                        }
                        java.sql.ResultSet rset2 = st3.executeQuery("select hospital_name,postal_code||' '||box_no||' '||town,main_telno||' '||other_telno,initcap(street),main_faxno,email||'   '||website,room_no from pb_hospitalprofile");
                        
                        // java.sql.ResultSet rset2 = st3.executeQuery("SELECT hospital_name from pb_hospitalprofile");
                        //   java.sql.ResultSet rset4 = st4.executeQuery("SELECT date('now') as Date");
                        while(rset2.next()){
                            compName = rset2.getObject(1).toString();
                            Address = rset2.getObject(2).toString();
                            Tel = rset2.getObject(3).toString();
                            Fax = rset2.getObject(5).toString();
                            Email = rset2.getObject(6).toString();
                        }
                        
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+"\n Address: "+Address+"\n Tel: "+Tel+" \n Fax: "+Fax+"\n Email: "+Email+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        
                        headerFoter.setRight(5);
                        docPdf.setHeader(headerFoter);
                        
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    
                    String Messg = null;
                    
                    try {
                        
                        
                        java.sql.Statement st3 = connectDB.createStatement();
                        java.sql.Statement st4 = connectDB.createStatement();
                        java.sql.ResultSet rset2 = st3.executeQuery("select name from pb_notice");
                        
                        while(rset2.next()){
                            Messg = rset2.getObject(1).toString();
                            com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase(""+Messg+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                            
                            docPdf.setFooter(footer);
                        }
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    
                    
                    
                    docPdf.open();
                    
                    
                    try {
                        
                        java.lang.Object listofStaffNos[] = this.getListofStaffNos();
                        
                        
                        for (int j = 0; j < listofStaffNos.length; j++) {
                            com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(6);
                            
                            int headerwidths[] = {20,35,15,15,15,15};
                            
                            table.setWidths(headerwidths);
                            
                            table.setWidthPercentage((100));
                            
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                            
                            table.getDefaultCell().setColspan(6);
                            
                            Phrase phrase = new Phrase();
                            
                            //  table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            System.out.println(listofStaffNos[j]);
                            try {
                                //-    for (int j = 0; j < listofStaffNos.length; j++) {
                                java.sql.Statement st311 = connectDB.createStatement();
                                java.sql.Statement st12 = connectDB.createStatement();
                                java.sql.Statement st6 = connectDB.createStatement();
                                java.sql.Statement st61 = connectDB.createStatement();
                                java.sql.Statement st11 = connectDB.createStatement();
                                java.sql.Statement st = connectDB.createStatement();
                                java.sql.Statement st1 = connectDB.createStatement();
                                java.sql.Statement st1d = connectDB.createStatement();
                                java.sql.Statement st2 = connectDB.createStatement();
                                java.sql.Statement st31 = connectDB.createStatement();
                                java.sql.Statement st4 = connectDB.createStatement();
                                java.sql.Statement st5 = connectDB.createStatement();
                                
                                java.sql.ResultSet rset311 = st311.executeQuery("select ap.payer_id from ac_debtors ac,ac_scheme_providers ap where ac.dealer = ap.scheme_manager AND ac.invoice_no = '"+listofStaffNos[j]+"'");
                                java.sql.ResultSet rset31 = st31.executeQuery("select pc.payee,sp.postal_code||' '||sp.address,sp.tel_main||' '||sp.other_tel,sp.main_fax from ac_schemes sp,ac_debtors pc where pc.payee = sp.scheme_name and pc.invoice_no = '"+listofStaffNos[j]+"'");
                                java.sql.ResultSet rset4 = st4.executeQuery("select dealer from ac_debtors where invoice_no = '"+listofStaffNos[j]+"'");
                                java.sql.ResultSet rset5 = st5.executeQuery("select pr.account_no,pr.member_name from hp_patient_register pr,ac_debtors db where db.invoice_no = '"+listofStaffNos[j]+"' and db.admission_no = pr.patient_no");
                                java.sql.ResultSet rset = st.executeQuery("select admission_no,initcap(item) from ac_debtors where invoice_no = '"+listofStaffNos[j]+"'");
                                java.sql.ResultSet rsetTotals = st2.executeQuery("select sum(credit) from hp_patient_card where invoice_no = '"+listofStaffNos[j]+"' AND paid = true");
                                java.sql.ResultSet rset12 = st12.executeQuery("select date from ac_debtors where invoice_no = '"+listofStaffNos[j]+"'");
                                java.sql.ResultSet rset11 = st11.executeQuery("select invoice_no from ac_debtors where invoice_no = '"+listofStaffNos[j]+"' and invoice_no IS NOT NULL");
                                java.sql.ResultSet rset1d = st1d.executeQuery("select date::date,initcap(service) as service,dosage,reference,debit-credit from hp_patient_card where invoice_no = '"+listofStaffNos[j]+"' AND paid = true AND transaction_type not ilike 'Invoice'  AND reference ILIKE 'C%'");
                                
                                double osBalance = 0.00;
                                double current = 0.00;
                                System.out.println(listofStaffNos[j]);
                                System.out.println("Step1 Complete");
                                while (rset4.next()){
                                    table.getDefaultCell().setColspan(3);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Payer Name: "+dbObject.getDBObject(rset4.getObject(1), "-"), pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setColspan(3);
                                    
                                    //  while (rset11.next()){
                                    //  table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(" ", pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setColspan(6);
                                    
                                    while (rset31.next()){
                                        
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                        phrase = new Phrase("Scheme Name: "+dbObject.getDBObject(rset31.getObject(1), "-"), pFontHeader1);
                                        table.addCell(phrase);
                                        
                                        table.getDefaultCell().setColspan(3);
                                        table.getDefaultCell().setColspan(3);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                        phrase = new Phrase("Address.: "+dbObject.getDBObject(rset31.getObject(2), "-"), pFontHeader);
                                        table.addCell(phrase);
                                        
                                        while (rset12.next()){
                                            table.getDefaultCell().setColspan(3);
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase("Invoice Date.: "+dbObject.getDBObject(rset12.getObject(1), "-"), pFontHeader);
                                            table.addCell(phrase);
                                            
                                            table.getDefaultCell().setColspan(6);
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase("Tel.: "+dbObject.getDBObject(rset31.getObject(3), "-"), pFontHeader);
                                            
                                            table.addCell(phrase);
                                            
                                            table.getDefaultCell().setColspan(3);
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase("Fax.: "+dbObject.getDBObject(rset31.getObject(4), "-"), pFontHeader);
                                            
                                            table.addCell(phrase);
                                            while (rset11.next()){
                                                //  table.getDefaultCell().setColspan(1);
                                                table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                                
                                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                                phrase = new Phrase("Invoice No.: "+dbObject.getDBObject(rset11.getObject(1), "-"), pFontHeader);
                                                
                                                table.addCell(phrase);
                                                
                                                table.getDefaultCell().setColspan(3);
                                                while (rset5.next()){
                                                    
                                                    table.getDefaultCell().setColspan(3);
                                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                                    // phrase = new Phrase("Member No.", pFontHeader);
                                                    
                                                    phrase = new Phrase("Member No.: "+dbObject.getDBObject(rset5.getObject(1), "-"), pFontHeader);
                                                    
                                                    table.addCell(phrase);
                                                    
                                                    System.out.println("Step4 Complete");
                                                    
                                                    
                                                    while (rset.next()){
                                                        
                                                        table.getDefaultCell().setColspan(3);
                                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                                        phrase = new Phrase("Patient Name.: "+dbObject.getDBObject(rset.getObject(2), "-"), pFontHeader);
                                                        table.addCell(phrase);
                                                        //       while (rset5.next()){
                                                        
                                                        table.getDefaultCell().setColspan(3);
                                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                                        phrase = new Phrase("Member Name.: "+dbObject.getDBObject(rset5.getObject(2), "-"), pFontHeader);
                                                        table.addCell(phrase);
                                                        
                                                        
                                                        
                                                        //          while (rset.next()){
                                                        table.getDefaultCell().setColspan(3);
                                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                                        //   phrase = new Phrase("Member Name  "+rset5.getString(2), pFontHeader);
                                                        phrase = new Phrase("Patient No.: "+dbObject.getDBObject(rset.getObject(1), "-"), pFontHeader);
                                                        
                                                        table.addCell(phrase);
                                                    }
                                                }
                                            }
                                        }
                                        
                                    }
                                    
                                }
                                
                                
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                table.getDefaultCell().setBorderWidth(Rectangle.TOP);
                                table.getDefaultCell().setColspan(1);
                                phrase = new Phrase("Date",pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(1);
                                phrase = new Phrase("Description",pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                
                                phrase = new Phrase("Qty",pFontHeader1);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                phrase = new Phrase("Ref",pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                table.getDefaultCell().setColspan(1);
                                phrase = new Phrase("Amount",pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(1);
                                phrase = new Phrase("Running "+ks,pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                java.lang.Object listofStaffNos1[] = this.getListofStaffNos1(listofStaffNos[j]);
                                
                                for (int k = 0; k < listofStaffNos1.length; k++) {
                                    double osBalance1 = 0.00;
                                    java.sql.ResultSet rset1 = st1.executeQuery("select date::date,initcap(service) as service,dosage::int,reference,debit-credit from hp_patient_card where invoice_no = '"+listofStaffNos[j]+"' AND paid = true and service not ilike 'Invoice' AND main_service ilike '"+listofStaffNos1[k]+"' AND reference NOT ILIKE 'C%'");
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    table.getDefaultCell().setColspan(6);
                                    phrase = new Phrase(listofStaffNos1[k].toString(),pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                    while (rset1.next()){
                                        
                                        
                                        table.getDefaultCell().setColspan(1);
                                        //  table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                        
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                        phrase = new Phrase(dbObject.getDBObject(rset1.getObject(1), "-"),pFontHeader);
                                        
                                        table.addCell(phrase);
                                        table.getDefaultCell().setColspan(1);
                                        
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                        phrase = new Phrase(dbObject.getDBObject(rset1.getObject(2), "-"), pFontHeader);
                                        
                                        table.addCell(phrase);
                                        table.getDefaultCell().setColspan(1);
                                       // table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                        
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                        int dos = 0;
                                        dos = rset1.getInt(3);
                                        
                                        phrase = new Phrase(java.lang.String.valueOf(dos), pFontHeader);
//    phrase = new Phrase(dbObject.getDBObject(rset1.getObject(3), "-"), pFontHeader);
                                        
                                        table.addCell(phrase);
                                        
                                        table.getDefaultCell().setColspan(1);
                                     //   table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                        phrase = new Phrase(dbObject.getDBObject(rset1.getObject(4), "-"), pFontHeader);
                                        
                                        table.addCell(phrase);
                                        
                                        table.getDefaultCell().setColspan(1);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(5)),pFontHeader);
                                        // osBalance = osBalance + rset.getDouble(5);
                                        table.addCell(phrase);
                                        osBalance = osBalance + rset1.getDouble(5);
                                        osBalance1 = osBalance1 + rset1.getDouble(5);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalance)), pFontHeader);
                                        //   current = current + osBalance;
                                        
                                        table.addCell(phrase);
                                        
                                        
                                        
                                    }
                                    
                                    table.getDefaultCell().setColspan(3);
                                    phrase = new Phrase("  ", pFontHeader);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    table.getDefaultCell().setColspan(1);
                                    phrase = new Phrase("Gross ",pFontHeader11);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    table.getDefaultCell().setColspan(1);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalance1)), pFontHeader11);
                                    
                                    table.addCell(phrase);
                                    phrase = new Phrase("  ", pFontHeader);
                                    
                                    table.addCell(phrase);
                                }
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase("", pFontHeader);
                                
                                table.addCell(phrase);
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                while (rsetTotals.next()) {
                                    
                                    table.getDefaultCell().setColspan(2);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Invoice Total.", pFontHeader11);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    phrase = new Phrase(" ", pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalance)), pFontHeader11);
                                    
                                    table.addCell(phrase);
                                    
                                    
                                }
                                
                                while (rset1d.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset1d.getObject(1), "-"),pFontHeader);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset1d.getObject(2), "-"), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset1d.getObject(3), "-"), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset1d.getObject(4), "-"), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1d.getString(5)),pFontHeader);
                                    table.addCell(phrase);
                                    osBalance = osBalance - rset1d.getDouble(5);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalance)), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    
                                }
                                
                                table.getDefaultCell().setColspan(3);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase("", pFontHeader);
                                
                                table.addCell(phrase);
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase("Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                
                                phrase = new Phrase(" ", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalance)), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                                
                                table.getDefaultCell().setColspan(36);
                                phrase = new Phrase(" ", pFontHeader);
                                
                                table.addCell(phrase);
                                table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                
                                table.getDefaultCell().setColspan(6);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                
                                phrase = new Phrase(" ", pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                
                                docPdf.add(table);
                                
                            } catch(java.sql.SQLException SqlExec) {
                                
                                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                                
                            }
                            boolean boolNewPage = docPdf.newPage();
                        }  // }
                        
                    } catch(com.lowagie.text.BadElementException BadElExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), BadElExec.getMessage());
                        
                    }
                    
                } catch(java.io.FileNotFoundException fnfExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), fnfExec.getMessage());
                    
                }
            } catch(com.lowagie.text.DocumentException lwDocexec) {
                
                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), lwDocexec.getMessage());
                
            }
            
docPdf.close();  com.afrisoftech.lib.PDFRenderer.renderPDF(tempFile);
            
            
            
        } catch(java.io.IOException IOexec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), IOexec.getMessage());
        }
    }
    public java.lang.Object[] getListofStaffNos() {
        
        java.lang.Object[] listofStaffNos = null;
        
        java.util.Vector listStaffNoVector = new java.util.Vector(1,1);
        
        
        try {
            
            java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT invoice_no FROM ac_debtors WHERE invoice_no  BETWEEN ? AND ? AND transaction_type = ? AND payee != ? order by invoice_no");
            
            pSet1.setString(1,INV01);
            pSet1.setString(2,INV02);
            pSet1.setString(3,"Raise Invoice");
            pSet1.setString(4,"''");
            java.sql.ResultSet rSet1 = pSet1.executeQuery();
            
            // java.sql.Statement stmt1 = connectDB.createStatement();
            
            // java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT distinct patient_no FROM hp_patient_card WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND payment_mode = 'Scheme' order by patient_no");
            
            while (rSet1.next()) {
                
                listStaffNoVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofStaffNos = listStaffNoVector.toArray();
        System.out.println("Done list of Staff Nos ...");
        return listofStaffNos;
    }
    
    public java.lang.Object[] getListofStaffNos1(java.lang.Object InvoiceNo) {
        
        java.lang.Object[] listofStaffNos = null;
        
        java.util.Vector listStaffNoVector = new java.util.Vector(1,1);
        
        
        try {
            
            
            java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT distinct upper(main_service) FROM hp_patient_card WHERE invoice_no = '"+InvoiceNo+"' and debit <> 0 and main_service is not null and service not ilike 'invoice%' order by upper(main_service)");
            //  pSet1.setString(1,beginDate.toString());
            //  pSet1.setString(2,endDate.toString());
            java.sql.ResultSet rSet1 = pSet1.executeQuery();
            
            
            while (rSet1.next()) {
                
                listStaffNoVector.addElement(dbObject.getDBObject(rSet1.getObject(1).toString(), "-"));
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofStaffNos = listStaffNoVector.toArray();
        System.out.println("Done list of Staff Nos ...");
        return listofStaffNos;
    }
    
    
}





