package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.queen.Queen;
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
public class BuilderTest {

    /**
     * 添加签署区域
     */
    @Test
    public void addSignature () {
        if (false) {
            Queen queen = new Queen();
            queen.setPort(40216);
            try {
                queen.connect();
                SignatureAreaPattern signatureAreaPattern = new SignatureAreaPattern();
                signatureAreaPattern.setImportant("zhangsan",
                        new BigDecimal(200),
                        new BigDecimal(200),
                        new BigDecimal(300),
                        new BigDecimal(300),
                        "pdf/contract1512031320171.pdf",
                        1
                        );
                if (signatureAreaPattern.chk()) {
                    String line = signatureAreaPattern.getEncoding();
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
