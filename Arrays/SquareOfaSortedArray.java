 /*
LeetCode #977 - Squares of a Sorted Array
Approach: Use two pointers from both ends. Compare the absolute values,
place the larger square at the end of the result array, and move the pointer.
Time Complexity: O(n)
Space Complexity: O(n)
*/

package Arrays;

public class SquareOfaSortedArray {

    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        int left = 0;
        int right = size - 1;
        int index = size - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        return result;
    }

}
