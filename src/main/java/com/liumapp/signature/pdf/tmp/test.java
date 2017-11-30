package com.liumapp.signature.pdf.tmp;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import com.liumapp.signature.helper.utils.SignatureInfo;
import com.liumapp.signature.pdf.worker.Signer;

import java.io.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

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
            String imgName = "/usr/local/tomcat/project/working/pdf-signer/sign.jpg";
            String keyStore = "/usr/local/tomcat/project/working/pdf-signer/keystore/keystore.ks";
            String alias = "430388229353192";
            Signer signer = new Signer();

            SignatureInfo signatureInfo = new SignatureInfo();
            signatureInfo.setReason("数字签名");
            signatureInfo.setLocation("sign2");

        } catch (Exception e) {
            e.printStackTrace();
        }
//        signatureInfo.setChain();
    }




}
