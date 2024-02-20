package com.rajib.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Find the age of a person in years if the birthday has given?
 */

public class Practice32 {

    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1995, 8, 27);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }
}
