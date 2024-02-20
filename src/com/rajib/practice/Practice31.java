package com.rajib.practice;

import java.util.Arrays;
import java.util.List;

/**
 * How do you get last element of an array?
 */

public class Practice31 {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        listOfStrings.stream()
                .skip(listOfStrings.size() - 1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
