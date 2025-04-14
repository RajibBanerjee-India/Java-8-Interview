package com.rajib.ca.interview.hexaware;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Calculate the maximum profit from stock prices over several days. You can only buy and sell once.
 *
 * Example 1:
 * Price = [ 1, 6, 2 ]
 * Ratan buys it on the first day and sells it on the second.
 * Example 2:
 * Price = [ 9, 8, 6 ]
 * The Price always went down, Ratan never bought it.
 *
 * Sample Input for Custom Testing
 *
 * Sample Input: 7, [ 1, 9, 2, 11, 1, 9, 2 ]
 * Sample Output:  10
 * Explanation: The maximum profit possible is when Ratan buys it in 1 rupee and sells it in 11.
 */
public class Hexaware2 {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfitEfficient(prices1.length, prices1)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfitEfficient(prices2.length, prices2)); // Output: 0
    }

    private static int maxProfitEfficient(int length,
                                          int[] prices) {

        if (prices == null || prices.length < 2)
            return 0;

        final int[] minPrice = {prices[0]};
        final int[] maxProfit = {0};
        AtomicInteger atomicInteger = new AtomicInteger(prices[0]);

        IntStream.range(1, prices.length)
                .forEach(i -> {
                    int currentProfit = prices[i] - minPrice[0];
                    maxProfit[0] = Math.max(maxProfit[0], currentProfit);
                    minPrice[0] = Math.min(minPrice[0], prices[i]);
                });

        return maxProfit[0];
    }
}
