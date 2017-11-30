package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.queen.Queen;
import com.liumapp.pattern.sign.PdfSignPattern;
import com.liumapp.pattern.sign.SignatureAreaPattern;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.UnknownHostException;

/**
 * Created by liumapp on 11/30/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SignerTest {

    @Test
    public void addSign () {
        if (false) {
            Queen queen = new Queen();
            queen.setPort(40216);
            try {
                queen.connect();
                PdfSignPattern pdfSignPattern = new PdfSignPattern();
                pdfSignPattern.setImportant("person/sign/1511163790980529601.jpg",
                        "pdf/contract1512031320171.pdf",
                        "430388229353192",
                        "123",
                        "zhangsan");
                if (pdfSignPattern.chk()) {
                    String line = pdfSignPattern.getEncoding();
                    queen.say(line);
                    System.out.println(queen.hear());
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
