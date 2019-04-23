package org.agoncal.book.javaee7.chapter10.ex06;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainTest {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getDefault();
        System.out.println("TimeZone: " + tz);
        //TimeZone.setDefault(tz);

        Locale locale = Locale.getDefault();
        System.out.println("Locale: " + locale);

        Date currentDate = new Date();
        System.out.println("Date: " + currentDate);
    }
}
