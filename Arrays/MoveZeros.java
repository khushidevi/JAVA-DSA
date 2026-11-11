// LeetCode 283 - Move Zeroes
// Problem: Move all zeroes to the end without changing non-zero order.
// Approach: Two Pointers + In-place Swapping
// Time Complexity: O(n)
// Space Complexity: O(1)

package Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if (nums[i] != 0) {
                i++;
                if (j <= i) {
                    j = i + 1;
                }
            }
            else {
                j++;
            }
        }
    }
}
