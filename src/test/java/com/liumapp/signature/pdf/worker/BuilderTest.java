package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.queen.Queen;
import com.liumapp.pattern.keystore.KeyStorePattern;

import java.io.IOException;
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
    public void addSignature () {
        if (false) {
            Queen queen = new Queen();
            queen.setPort(40216);
            try {
                queen.connect();

//                KeyStorePattern keyStorePattern = new KeyStorePattern();
//                keyStorePattern.setImportant("keystore.ks",
//                        "adminadmin",
//                        "123456",
//                        2048,
//                        "王五",
//                        "浙江",
//                        "杭州",
//                        "中国",
//                        "430388229353192",
//                        "123");
//                if (keyStorePattern.chk()) {
//                    String line = keyStorePattern.getEncoding();
//                    queen.say(line);
//                    System.out.println(queen.hear());
//                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
