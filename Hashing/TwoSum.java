/*
 * LeetCode 1: Two Sum
 *
 * Approach:
 * Use a HashMap to store each number and its index.
 * For each number, calculate its complement (target - nums[i]).
 * If the complement exists in the HashMap, return both indices.
 * Otherwise, store the current number and its index.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
package Hashing;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

}
