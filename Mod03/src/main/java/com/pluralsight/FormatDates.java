package com.pluralsight;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
//        EX 2 WB 3
//        09/05/2021
//        2021-09-05
//        September 5, 2021
//        Sunday, Sep 5, 2021 10:02 ß display in GMT time
//                CHALLENGE
//        5:02 on 05-Sep-2021 ß display in your local time zone

        //Date as MM/DD/YYY
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        String fromattedDate = today.format(formatter);
        System.out.println(fromattedDate);

        //Date as YYYY/MM/DD
        LocalDate normalDate = LocalDate.now();
        System.out.println(normalDate);

        //Date as Month DD YYYY
        Date dat = new Date();
        SimpleDateFormat dateFormat;

        // Month DD YYYY
        Date localTime = new Date();

        DateFormat s = new SimpleDateFormat("EEEE, MMM dd, YYYY"
                + " HH:mm:ss");
        s.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println("Time IN Gmt : "
                + s.format(localTime));

        //Challenge
        dateFormat = new SimpleDateFormat("kk:mm a, dd-MMM-YYYY");
        System.out.println(dateFormat.format(dat));
    }
}
