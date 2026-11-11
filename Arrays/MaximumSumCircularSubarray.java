/*
LeetCode #918 - Maximum Sum Circular Subarray
Approach: Use Kadane's Algorithm to find maximum and minimum subarray sums.
Calculate circular maximum using totalSum - minSum.
Time Complexity: O(n)
Space Complexity: O(1)
*/

package Arrays;

public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int sum = nums[0];
        int MaxSum = nums[0];

        int min = nums[0];
        int minSum = nums[0];

        int totalSum = nums[0];

        for (int i = 1; i < n; i++) {

            // Maximum Kadane
            if (sum < 0) {
                sum = 0;
            }

            sum += nums[i];

            if (MaxSum < sum) {
                MaxSum = sum;
            }

            // Minimum Kadane
            if (min > 0) {
                min = 0;
            }

            min += nums[i];

            if (minSum > min) {
                minSum = min;
            }

            totalSum += nums[i];
        }

        // Handle all negative elements
        if (MaxSum < 0) {
            return MaxSum;
        }

        // Calculate circular maximum
        int circularSum = totalSum - minSum;

        if (MaxSum < circularSum) {
            MaxSum = circularSum;
        }

        return MaxSum;
    }
}
