    /*
LeetCode #268 - Missing Number
Approach: Find the expected sum from 0 to n and subtract
the actual sum of the array.
Time Complexity: O(n)
Space Complexity: O(1)
*/


package Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return (int)(expectedSum - actualSum);
    }
}
