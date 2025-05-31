package com.rajib.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of sentences, count the frequency of each word (case-insensitive).
 */
public class StreamPractice13 {

    public static void main(String[] args) {

        List<String> sentences = List.of("Java is fun", "Streams are powerful", "Java is powerful");

        Map<String, Long> frequency = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\s+")))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Frequency of Words -> " + frequency);
    }
}
