package com.liumapp.signature.pdf.tmp;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import com.liumapp.signature.helper.utils.SignatureInfo;
import com.liumapp.signature.pdf.worker.Signer;

import java.io.*;

/**
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class test {

//    public static void main (String[] args) {
//        String fileName = "/usr/local/tomcat/project/working/pdf-signer/test.pdf";
//        String saveName = "/usr/local/tomcat/project/working/pdf-signer/result.pdf";
//        try {
//            PdfReader pdfReader = new PdfReader(fileName);
//            PdfStamper pdfStamper = new PdfStamper(pdfReader , new FileOutputStream(saveName));
//            pdfStamper.addSignature("sign2" , 1 , 200 , 200 , 300 , 300);
//
//            pdfStamper.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public static void main (String[] args) {
        try {
            String certName = "/usr/local/tomcat/project/working/pdf-signer/tmp.cer";
            Signer signer = new Signer();
            InputStream input = new FileInputStream(new File(certName));
            SignatureInfo signatureInfo = new SignatureInfo();
            signatureInfo.setReason("数字签名");
            signatureInfo.setLocation("sign2");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        signatureInfo.setChain();
    }
}
