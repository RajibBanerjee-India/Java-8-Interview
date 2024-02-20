package com.rajib.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * How do you find frequency of each element in an array or a list?
 */

public class Practice4 {

    public static void main(String[] args) {

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil",
                "Stapler", "Note Book", "Pencil");

        Map<String, Long> frequencyMap = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print
        System.out.println(frequencyMap);
    }
}
