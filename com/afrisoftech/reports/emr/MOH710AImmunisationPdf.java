//Author Charles Waweru
//Made to test Java support for Threads.
//Revision : Ver 1.0a
//import java.lang.*;
package com.afrisoftech.reports.emr;

import com.afrisoftech.records.reports.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.text.ParseException;
import org.openide.util.Exceptions;
//import //java.awt.Desktop;

public class MOH710AImmunisationPdf implements java.lang.Runnable {

    java.util.Date beginDate = null;
    ////java.awt.Desktop deskTop = Desktop.getDesktop();
    java.util.Date endDate = null;
    int numberSeq = 0;
    java.lang.String Categ = null;
    java.lang.String ReportType = null;
    com.afrisoftech.lib.DBObject dbObject;
    public static java.sql.Connection connectDB = null;
    public java.lang.String dbUserName = null;
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    boolean threadCheck = true;
    String Gender = null;
    java.lang.Thread threadSample;
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.NORMAL);
    com.lowagie.text.Font pFontHeader11 = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.BOLD);
    com.lowagie.text.Font pFontHeader2 = FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD);
    com.lowagie.text.Font pFontHeader22 = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    java.lang.Process prThread;

    public void MOH710AImmunisationPdf(java.sql.Connection connDb, java.util.Date startDate, java.util.Date lastDate) {

        dbObject = new com.afrisoftech.lib.DBObject();

        connectDB = connDb;

        beginDate = startDate;

        endDate = lastDate;

        threadSample = new java.lang.Thread(this, "SampleThread");

        System.out.println("threadSample created");

        threadSample.start();

        System.out.println("threadSample fired");

    }

    public static void main(java.lang.String[] args) {
        //		new MemberListPdf().MemberListPdf();
    }

    public void run() {

        System.out.println("System has entered running mode");

        while (threadCheck) {

            System.out.println("O.K. see how we execute target program");

            this.generatePdf();

            try {

                System.out.println("Right, let's wait for task to complete of fail");

                java.lang.Thread.currentThread().sleep(200);

                System.out.println("It's time for us threads to get back to work after the nap");

            } catch (java.lang.InterruptedException IntExec) {

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

            year_now_strs = "200" + year_now_abs;

        } else {

            year_now_strs = "20" + year_now_abs;

        }

        switch (month_now_str) {

            case 0:
                month_now_strs = "JAN";

                break;

            case 1:
                month_now_strs = "FEB";

                break;

            case 2:
                month_now_strs = "MAR";

                break;

            case 3:
                month_now_strs = "APR";

                break;

            case 4:
                month_now_strs = "MAY";

                break;

            case 5:
                month_now_strs = "JUN";

                break;

            case 6:
                month_now_strs = "JUL";

                break;

            case 7:
                month_now_strs = "AUG";

                break;

            case 8:
                month_now_strs = "SEP";

                break;

            case 9:
                month_now_strs = "OCT";

                break;

            case 10:
                month_now_strs = "NOV";

                break;

            case 11:
                month_now_strs = "DEC";

                break;

            default:
                if (month_now_str < 10) {

                    month_now_strs = "0" + month_now_str;

                } else {

                    month_now_strs = "" + month_now_str;

                }

        }

        if (date_now_str < 10) {

            date_now_strs = "0" + date_now_str;

        } else {

            date_now_strs = "" + date_now_str;

        }

        if (minute_now_str < 10) {

            minute_now_strs = "0" + minute_now_str;

        } else {

            minute_now_strs = "" + minute_now_str;

        }

        if (hour_now_str < 10) {

            hour_now_strs = "0" + hour_now_str;

        } else {

            hour_now_strs = "" + hour_now_str;

        }

        date_label = date_now_strs + month_now_strs + year_now_strs + "@" + hour_now_strs + minute_now_strs;

        return date_label;

    }

    public void generatePdf() {

        java.lang.Process wait_for_Pdf2Show;

        java.util.Calendar cal = java.util.Calendar.getInstance();

        java.util.Date dateStampPdf = cal.getTime();

        java.lang.String pdfDateStamp = dateStampPdf.toString();


        try {

            java.io.File tempFile = java.io.File.createTempFile("REP" + this.getDateLable() + "_", ".pdf");

            tempFile.deleteOnExit();

            java.lang.Runtime rt = java.lang.Runtime.getRuntime();

            java.lang.String debitTotal = null;

            java.lang.String creditTotal = null;

            com.lowagie.text.Document docPdf = new com.lowagie.text.Document(PageSize.A2.rotate());

            try {
                Image img = Image.getInstance(com.afrisoftech.lib.CompanyLogo.getPath2Logo());

                //Image imgWaterMark = Image.getInstance(System.getProperty("company.watermark"));

                com.lowagie.text.pdf.PdfWriter.getInstance(docPdf, new java.io.FileOutputStream(tempFile));

                String compName = null;

                String District = null;

                String Region = null;

                String date = null;

                try {
                    java.sql.Statement st3 = connectDB.createStatement();
                    java.sql.Statement st4 = connectDB.createStatement();

                    java.sql.ResultSet rset2 = st3.executeQuery("SELECT hospital_name,district_branch from pb_hospitalprofile");
                    java.sql.ResultSet rset4 = st4.executeQuery("SELECT date('now') as Date");
                    while (rset2.next()) {
                        compName = rset2.getObject(1).toString();
                        District = rset2.getObject(2).toString();
                    }
                    while (rset4.next()) {
                        date = rset4.getObject(1).toString();
                    }
                    com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase("MINISTRY OF HEALTH : " + compName.toUpperCase()), false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));

                    headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);

                    headerFoter.setRight(5);

                    docPdf.setHeader(headerFoter);

                } catch (java.sql.SQLException SqlExec) {

                    SqlExec.printStackTrace();

                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());

                }

                com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("MOH - 710A : Immunisation Report : Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));

                docPdf.setFooter(footer);

                docPdf.open();
                try {
                    com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(36);

                    int headerwidths[] = {5, 10, 10, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

                    table.setWidths(headerwidths);

                    table.setWidthPercentage((100));

                    table.setHeaderRows(4);

                    table.getDefaultCell().setColspan(6);

                    Phrase phrase = new Phrase("", pFontHeader);

                    try {
                        try {
                            com.afrisoftech.lib.DateFormatter dateFormatters = null;
                            java.lang.String monthString = null;
                            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                            try {
                                java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());

                                java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());

                                com.afrisoftech.lib.DateFormatter dateFormatter = new com.afrisoftech.lib.DateFormatter(dateFormat.parse(endDate.toLocaleString()), "MMMM");

                                monthString = dateFormatter.getDateString();

                                dateFormatters = new com.afrisoftech.lib.DateFormatter(dateFormat.parse(endDate.toLocaleString()), "yyyy");
                            } catch (ParseException ex) {
                                Exceptions.printStackTrace(ex);
                            }

                            java.lang.String yearString = dateFormatters.getDateString();

                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setColspan(36);

                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            table.getDefaultCell().setFixedHeight(50);
                            table.addCell(Image.getInstance(com.afrisoftech.lib.CompanyLogo.getPath2Logo()));
                            table.getDefaultCell().setFixedHeight(-1);
                            table.getDefaultCell().setColspan(36);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);

                            phrase = new Phrase("DIVISION OF VACCINE AND IMMUNIZATION (DVI)", pFontHeader22);
                            table.addCell(phrase);
                            phrase = new Phrase("MOH 710A_INTEGRATED IMMUNIZATION, VITAMIN A, MALARIA, OPTHAMOLOGY AND EPI LOGISTICS REPORT", pFontHeader22);

                            table.addCell(phrase);



                            table.getDefaultCell().setColspan(8);
                            phrase = new Phrase("HEALTH FACILITY : " + compName, pFontHeader);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("AGENCY : " + compName, pFontHeader);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("CONSTITUENCY: " + compName, pFontHeader);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("SUB-COUNTY : " + compName, pFontHeader);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("COUNTY : " + compName, pFontHeader);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(4);
                            phrase = new Phrase("MONTH : " + monthString.toUpperCase(), pFontHeader);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(4);
                            phrase = new Phrase("YEAR : " + yearString.toUpperCase(), pFontHeader);
                            table.addCell(phrase);


                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);

                            table.getDefaultCell().setColspan(1);

                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);

                            table.getDefaultCell().setHorizontalAlignment(PdfCell.LEFT);

                            table.getDefaultCell().setColspan(2);

                            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("");
                            phrase = new Phrase("SECTION A\n\n ANTIGEN", pFontHeader11);

                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("AGE CATEGORY / DATE OF MONTH", pFontHeader11);

                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(i+1), pFontHeader11);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("Outreach/Mobile Data", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Grand Total", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("1", pFontHeader11);

                            table.addCell(phrase);

                            phrase = new Phrase("BCG", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "BCG01", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("2", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("OPV 0", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Birth dose(Within 2 weeks)", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "OPV0", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("3", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("OPV1", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "OPV1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "BCG01", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("4", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("OPV2", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "OPV2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "OPV2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("5", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("OPV3", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "OPV3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "OPV3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("5", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("DPT/Hep+HiB1", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "DPT1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "DPT1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("7", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("DPT/Hep+HiB2", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "DPT2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "DPT2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("8", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("DPT/Hep+HiB3", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "DPT3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "DPT3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("9", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("PCV 10(Pneumococcal) 1", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "PCV1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "PCV1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("10", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("PCV 10(Pneumococcal) 2", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "PCV2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "PCV2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("11", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("PCV 10(Pneumococcal) 3", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "PCV3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "PCV3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("12", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Rotavirus 1", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "ROTA1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "ROTA1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("13", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Rotavirus 2", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "ROTA2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "ROTA2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("14", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Rotavirus 3", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "ROTA3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "ROTA3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("15", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Measles", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "Measles1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "Measels1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("16", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Yellow fever", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "Yellow1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "Yellow1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("17", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Fully Immunized Children (FIC)", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "FIC", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "FIC", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("18", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Adverse Events Following Immunization (AEFI)", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "AEFI", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "AEFI", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("19", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Tetanus Toxoid for pregnant women", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("1st Dose", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "TTP1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("2nd Dose", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "TTP2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("TT3 Plus Dose", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "TTP3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("20", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Vitamin A (Prevention)", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year (100,000 IU)", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "VITAP1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Above 1 Year (200,000 UI)", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "VITAP2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Lactating mothers", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "VITAP3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("21", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Vitamin A (Therapeutic)", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("0 - 5 Months (50,000 IU)", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "VITAT1", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("6 - 11 Months (100,000 UI)", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "VITAT2", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("12 - 59 Months (200,000 UI)", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "VITAT3", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Adults e.g. in TB clinics, CCC (200,000 UI)", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getOverImmunisationCounts(connectDB, "VITAT4", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);


                            phrase = new Phrase("22", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Issued  with LLITN this visit", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "LLITN", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("23", pFontHeader1);

                            table.addCell(phrase);

                            phrase = new Phrase("Squint/White Eye reflection", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("Under 1 Year", pFontHeader1);
                            table.addCell(phrase);
                            for (int i = 0; i < 31; i++) {
                                phrase = new Phrase(String.valueOf(com.afrisoftech.lib.ImmunisationDates.getUnderImmunisationCounts(connectDB, "SQTEYE", beginDate, i)), pFontHeader1);
                                table.addCell(phrase);
                            }

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            phrase = new Phrase("", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(36);
                            phrase = new Phrase(" ", pFontHeader1);
                            table.addCell(phrase);
                            phrase = new Phrase(" ", pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase("Submitted by:", pFontHeader1);

                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(8);
                            phrase = new Phrase("_______________________________________________", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("Signature:", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("________________________", pFontHeader1);
                            table.addCell(phrase);


                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("Date:", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("________________________", pFontHeader1);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase(" ", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(36);
                            phrase = new Phrase(" ", pFontHeader1);
                            table.addCell(phrase);
                            phrase = new Phrase(" ", pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase("Received by:", pFontHeader1);

                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(8);
                            phrase = new Phrase("_______________________________________________", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("Signature:", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("________________________", pFontHeader1);
                            table.addCell(phrase);


                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("Date:", pFontHeader1);
                            table.addCell(phrase);

                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("________________________", pFontHeader1);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase(" ", pFontHeader1);
                            table.addCell(phrase);


                            docPdf.add(table);

                        } catch (java.sql.SQLException SqlExec) {

                            SqlExec.printStackTrace();

                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());

                        }

                    } catch (com.lowagie.text.BadElementException BadElExec) {

                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), BadElExec.getMessage());

                    }

                } catch (java.io.FileNotFoundException fnfExec) {

                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), fnfExec.getMessage());

                }
            } catch (com.lowagie.text.DocumentException lwDocexec) {

                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), lwDocexec.getMessage());

            }

            docPdf.close();

            com.afrisoftech.lib.PDFRenderer.renderPDF(tempFile);

        } catch (java.io.IOException IOexec) {

            IOexec.printStackTrace();

            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), IOexec.getMessage());

        }

    }
}
