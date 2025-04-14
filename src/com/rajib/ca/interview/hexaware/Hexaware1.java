package com.rajib.ca.interview.hexaware;

import java.util.*;

/**
 * Given a list of strings, find the longest word with an odd length.
 * If there is no such word, return "Better luck next time".
 *
 * Sample Input & Output
 * Sample input 0:
 * 5   → ( number of strings )
 * Hello Good morning Welcome you
 * Sample output 0: morning
 * Explanation: First word that is picked by the computer is morning
 * Hello → 5
 * Good → 4
 * Morning → 7
 * Welcome → 7
 * You → 3
 *
 *
 * Sample input 1:
 * 3
 * Go to hell
 * Sample output 1: Better luck next time
 * Explanation: Here is no word with odd length so computer confuses and gives better luck next time
 *
 */
public class Hexaware1 {

    public static void main(String[] args) {
        String input = "Hello Good morning Welcome you";
        String result = findLongestOddLengthWord(input.length(), input);
        System.out.println(result);
    }

    private static String findLongestOddLengthWord(int length,
                                                   String input) {

        if (input == null)
            return "Better luck next time";

        List<String> inputList = Arrays.asList(input.split(" "));
        Optional<String> ret = inputList.stream()
                .filter(word -> word.length()%2 != 0)
                .max(Comparator.comparingInt(String::length));

        return ret.orElse("Better luck next time");
    }
}
