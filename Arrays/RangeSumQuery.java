/*
LeetCode #303 - Range Sum Query - Immutable
Approach: Use Prefix Sum to store cumulative sums.
Calculate range sum by subtracting prefix[left] from prefix[right+1].
Time Complexity: O(n) preprocessing, O(1) per query
Space Complexity: O(n)
*/

package Arrays;

public class RangeSumQuery {
    int prefix[];

    public RangeSumQuery(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
