/*
LeetCode #905 - Sort Array By Parity
Approach: Use two pointers. The left pointer looks for an odd number
and the right pointer looks for an even number. Swap them when found.
Time Complexity: O(n)
Space Complexity: O(1)
*/
package Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 == 0) {
                left++;
            }
            else if (nums[right] % 2 != 0) {
                right--;
            }
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        return nums;
    }
}
