package com.rajib.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Print duplicate characters in a string?
 */
public class Practice26 {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        Set<String> uniqueChar = new HashSet<>();

        Set<String> duplicateChar = Arrays.stream(inputString.split(""))
                .filter(str -> !uniqueChar.add(str))
                .collect(Collectors.toSet());

        System.out.println(duplicateChar);
    }
}
