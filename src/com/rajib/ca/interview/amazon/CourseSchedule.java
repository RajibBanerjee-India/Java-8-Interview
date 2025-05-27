package com.rajib.ca.interview.amazon;

import java.util.*;

/**
 * Course Schedule (LeetCode 207) – Topological Sort (Cycle Detection) in Java
 * Problem Statement:
 * Given numCourses (labeled from 0 to numCourses-1) and an array prerequisites where prerequisites[i] = [a, b]
 * indicates you must take course b before a, determine if you can finish all courses (i.e., the graph is a DAG with no cycles).
 *
 * Approach: Topological Sort (Kahn's Algorithm)
 * 1. Build Adjacency List & In-Degree Count
 *
 * adjList: Maps each course to its dependent courses
 *
 * inDegree: Tracks how many prerequisites each course has
 *
 * 2. Initialize Queue with 0 In-Degree Nodes
 *
 * These are courses with no prerequisites
 *
 * 3. Process Nodes & Reduce In-Degree
 *
 * For each course completed, reduce in-degree of its dependents
 *
 * If a dependent's in-degree reaches 0, add to queue
 *
 * 4. Check if All Courses Were Taken
 *
 * If count == numCourses → no cycle (valid schedule)
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // 1. Build Adjacency List & In-Degree Count
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            int course = edge[0];
            int preReq = edge[1];
            adjList.get(preReq).add(course);
            inDegree[course]++;
        }

        // 2. Initialize Queue with 0 In-Degree Nodes
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int courseTaken = 0;

        // 3. Process Nodes & Reduce In-Degree
        while (!queue.isEmpty()) {
            int current = queue.poll();
            courseTaken++;

            for (int neighbor : adjList.get(current)) {
                if (--inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // 4. Check if All Courses Were Taken
        return courseTaken == numCourses;
    }

    public static void main(String[] args) {
        CourseSchedule sol = new CourseSchedule();
        System.out.println(sol.canFinish(2, new int[][]{})); // true (no prerequisites)
        System.out.println(sol.canFinish(3, new int[][]{{1, 0}, {2, 1}})); // true (linear)
        System.out.println(sol.canFinish(2, new int[][]{{0, 1}, {1, 0}})); // false (cycle)
        System.out.println(sol.canFinish(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}})); // true (multiple deps)
        System.out.println(sol.canFinish(4, new int[][]{{1, 0}, {3, 2}})); // true (disconnected)
    }
}
