package com.rajib.practice;

import java.util.Comparator;
import java.util.List;

/**
 * Sort a list of strings in descending (reverse alphabetical) order
 */
public class StreamPractice6 {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry", "date");

        List<String> descendingSortedFruits = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Descending order Strings --> " + descendingSortedFruits);
    }
}
