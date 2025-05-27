package com.rajib.ca.interview.amazon;

import java.util.*;

/**
 * Word Ladder (LeetCode 127) – BFS + Shortest Path (Java Solution)
 * Problem Statement:
 * Given a beginWord, endWord, and a wordList, find the length of the shortest transformation sequence from beginWord to endWord where:
 * <p>
 * Only one letter can be changed at a time.
 * <p>
 * Each transformed word must exist in wordList.
 * <p>
 * Example:
 * <p>
 * Input:
 * beginWord = "hit", endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * <p>
 * Output: 5 (Path: "hit" → "hot" → "dot" → "dog" → "cog")
 * <p>
 * Approach: BFS (Optimal for Shortest Path)
 * 1. Preprocess WordList:
 * <p>
 * Convert wordList to a set for O(1) lookups.
 * <p>
 * Check if endWord exists in wordList.
 * <p>
 * 2. BFS Initialization:
 * <p>
 * Use a queue to explore each level (transformation step).
 * <p>
 * Track visited words to avoid cycles.
 * <p>
 * 3. Generate Transformations:
 * <p>
 * For each word, change every character from 'a' to 'z'.
 * <p>
 * If the new word exists in wordList, add it to the queue.
 * <p>
 * 4. Terminate on Finding endWord:
 * <p>
 * The first time endWord is reached, return the current level (shortest path).
 * <p>
 * Time Complexity: O(M² × N)
 * <p>
 * M: Word length
 * <p>
 * N: Number of words in wordList
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;  // End word not in list

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;  // Start counting from beginWord

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                String currentWord = queue.poll();
                if (currentWord.equals(endWord)) {
                    return level;  // Return current level when endWord is found
                }
                // Generate all possible one-letter transformations
                char[] wordChars = currentWord.toCharArray();
                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;
                        wordChars[j] = c;
                        String newWord = new String(wordChars);
                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                    wordChars[j] = originalChar;  // Revert change
                }
            }
            level++;  // Increment after processing all words at current level
        }
        return 0;  // No path found

    }

    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();
        System.out.println("Ladder size - " + wordLadder.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog"))); // output = 5, Path: "hit" → "hot" → "dot" → "dog" → "cog"
        System.out.println("Ladder size - " + wordLadder.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log"))); // output = 0, "cog" is missing in wordList
        System.out.println("Ladder size - " + wordLadder.ladderLength("a", "b", List.of("b"))); // output = 2, Direct transformation: "a" → "b"
        // Below one is actually rotation - that differs from original - that needs extra handle
        // System.out.println("Ladder size - " + wordLadder.ladderLength("abcde", "bcdea", List.of("bcdea", "abcdz", "abcqz"))); // output = 2, Path: "abcde" → "bcdea"
    }
}
