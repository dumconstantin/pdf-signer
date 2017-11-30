package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import com.liumapp.pattern.sign.PdfSignPattern;
import org.springframework.stereotype.Component;

/**
 * 在签署区域中应用用户证书
 * Created by liumapp on 11/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class Signer extends StandReadyWorker {

    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        try {
            PdfSignPattern pdfSignPattern = PdfSignPattern.parse(whatQueenSays);

            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
