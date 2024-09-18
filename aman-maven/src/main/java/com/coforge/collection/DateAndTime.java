package com.coforge.collection;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        date = new Date(1);
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.of(2022,12,23);
        System.out.println(localDate1);

        LocalTime localTime1 = LocalTime.of(12,33,34);
        System.out.println(localTime1);

    }
}
