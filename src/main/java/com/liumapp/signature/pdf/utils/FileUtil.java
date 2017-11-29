package com.liumapp.signature.pdf.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class FileUtil {

    public String getTmpFileName () {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        Random random = new Random();

        String now = simpleDateFormat.format(date);
        int randerNum = (int) random.nextDouble() * 9999;

        String result = now + randerNum;
        return result;
    }

}
