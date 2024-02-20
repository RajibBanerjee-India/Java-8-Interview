package com.rajib.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * How do you find the most repeated element in an array?
 */

public class Practice22 {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen",
                "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementCountMap = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        elementCountMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(freEle -> {
                    System.out.println("Most Frequent Element : " + freEle.getKey());
                    System.out.println("Count : " + freEle.getValue());
                });
    }
}
