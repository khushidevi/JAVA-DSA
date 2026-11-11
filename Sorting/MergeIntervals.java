/*
 * LeetCode: 56. Merge Intervals
 * Approach: Sorting + Greedy
 *
 * 1. Sort intervals based on their starting points.
 * 2. Compare the current interval with the last merged interval.
 * 3. If they overlap, merge them by updating the ending point.
 * 4. Otherwise, add the current interval as a new interval.
 * 5. Return the merged intervals.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Sorting;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        // Sort intervals according to starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] result = new int[intervals.length][2];
        int index = 0;

        result[index] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            // Check if intervals overlap
            if (intervals[i][0] <= result[index][1]) {

                // Merge overlapping intervals
                result[index][1] = Math.max(
                    result[index][1], intervals[i][1]
                );

            } else {

                // Add a new interval
                index++;
                result[index] = intervals[i];
            }
        }

        return Arrays.copyOf(result, index + 1);
    }
}
