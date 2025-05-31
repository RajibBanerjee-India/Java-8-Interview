package com.rajib.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Reverse a list of elements using streams only.
 */
public class StreamPractice21 {

    public static void main(String[] args) {

        List<String> words = List.of("bella", "label", "roller");

        List<String> reversed = IntStream.range(0, words.size())
                .mapToObj(value -> words.get(words.size() - value - 1))
                .toList();

        /*List<String> oldWay = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            oldWay.add(words.get(words.size() - i - 1));
        }
        System.out.println("Reversed List OldWay --> " + oldWay);*/

        System.out.println("Reversed List --> " + reversed);
    }
}
