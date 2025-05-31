package com.rajib.practice;

import java.util.List;

/**
 * List of names, return a list of uppercase names
 */
public class StreamPractice3 {

    public static void main(String[] args) {
        List<String> names = List.of("Rajib", "Raj", "Raju", "RAJA");

        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Upper case names --> " + uppercaseNames);
    }
}
