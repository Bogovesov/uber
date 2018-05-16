package com.uber.main.service.passenger.route;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomCurrentDate {
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

    public static String getCurrentDate() {
        Date date = new Date();
        return dateFormat.format(date);
    }
}
