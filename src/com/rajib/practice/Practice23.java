package com.rajib.practice;

import java.util.stream.IntStream;

/**
 * Palindrome program using Java 8 streams
 */

public class Practice23 {

    public static void main(String[] args) {

        String str = "ROTATOR";

        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
