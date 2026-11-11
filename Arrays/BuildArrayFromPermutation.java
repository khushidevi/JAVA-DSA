/*
LeetCode #1920 - Build Array from Permutation

Approach:
Create a new array and for each index i, store nums[nums[i]]
in the result array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

package Arrays;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
