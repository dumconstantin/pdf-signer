package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import com.liumapp.pattern.exception.PatternPropertiesNumberNotEnough;
import com.liumapp.pattern.exception.WrongType;
import com.liumapp.pattern.sign.PdfPattern;
import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 11/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class Signer extends StandReadyWorker {

    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        try {
            PdfPattern pdfPattern = PdfPattern.parse(whatQueenSays);
            
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
