package com.rajib.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of strings, sort them according to increasing order of their length?
 */

public class Practice15 {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
