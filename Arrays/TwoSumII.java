/*
 * LeetCode 167: Two Sum II - Input Array Is Sorted
 *
 * Approach:
 * Use two pointers at the beginning and end.
 * If the sum is smaller than target, move left forward.
 * If the sum is greater than target, move right backward.
 * Return 1-based indices when the target sum is found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Arrays;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}

