package com.rajib.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * How do you sort the given list of decimals in reverse order?
 */
public class Practice5 {

    public static void main(String[] args) {

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> sortedList = decimalList.stream().sorted(Comparator.reverseOrder()).toList();

        // Print
        System.out.println(sortedList);
    }
}
