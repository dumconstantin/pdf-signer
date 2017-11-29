package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import com.liumapp.pattern.sign.SignatureAreaPattern;
import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class Builder extends StandReadyWorker {

    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        try {
            SignatureAreaPattern signatureAreaPattern = SignatureAreaPattern.parse(whatQueenSays);
            
            return "success";
        } catch (Exception e) {
            System.out.println("maybe not builder's job....");
            e.printStackTrace();
            return null;
        }
    }

}
