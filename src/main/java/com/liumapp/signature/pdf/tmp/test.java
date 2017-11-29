package com.liumapp.signature.pdf.tmp;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class test {

    public static void main (String[] args) {
        String fileName = "/usr/local/tomcat/project/working/pdf-signer/test.pdf";
        String saveName = "/usr/local/tomcat/project/working/pdf-signer/result.pdf";
        try {
            PdfReader pdfReader = new PdfReader(fileName);
            Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document , new FileOutputStream(saveName));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
