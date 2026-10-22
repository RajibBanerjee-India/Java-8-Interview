package com.rajib.practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorPractice1 {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Raj", "Charlie", "Raju", "Bob", "Raj", "Ram", "Charlie", "Rajib");

        // Unique name
        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());
        System.out.println("Unique Names --> " + uniqueNames);

        // Joning Strings - Concatenated
        String concatenatedNames = names.stream()
                .collect(Collectors.joining());
        System.out.println("Concatenated Names --> " + concatenatedNames);

        // Joining Strings - Delimited
        String delimitedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Comma Delimited Names --> " + delimitedNames);

        // Joining Strings - Formatted
        String formattedNames = names.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Formatted Names --> " + formattedNames);

        // Counting
        Long counter = names.stream()
                .collect(Collectors.counting());
        System.out.println("Total Name count --> " + counter);

        // Summing Integer
        Integer sumOfLength = names.stream()
                .collect(Collectors.summingInt(String::length));
        System.out.println("Total length of the Names --> " + sumOfLength);

        // Averaging Integer
        Double averagingLength = names.stream()
                .collect(Collectors.averagingDouble(String::length));
        System.out.println("Average length of the Names --> " + averagingLength);

        // Summarizing Integer
        IntSummaryStatistics summary = names.stream()
                .collect(Collectors.summarizingInt(String::length));
        System.out.println("Summary of the Names --> " + summary);

        // Grouping Strings by Length
        Map<Integer, List<String>> grpByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by Name length --> " + grpByLength);

        // Grouping unique Strings by length
        Map<Integer, Set<String>> grpByLengthUnique = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println("Grouped by Unique Name length --> " + grpByLengthUnique);

        // Custom collector
        TreeMap<Integer, List<String>> customGrpByLength = names.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println("Grouped by Name length custom map --> " + customGrpByLength);

        // Partitioning Names even length
        Map<Boolean, List<String>> evenLengthPartitioned = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() % 2 == 0));
        System.out.println("Partitioned Even length names --> " + evenLengthPartitioned);

        // Custom collectors
        Collector<String, StringBuilder, String> concatenate = Collector.of(
                StringBuilder::new,
                (sb, str) -> sb.append(str).append("|"),
                StringBuilder::append,
                StringBuilder::toString
        );
        String result = names.stream().collect(concatenate);
        System.out.println("Concatenated Names with '|' --> " + result);
    }
}
