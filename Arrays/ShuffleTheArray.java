/*
LeetCode #1470 - Shuffle the Array
Approach: Take elements alternately from the first and second halves of the array.
Time Complexity: O(n)
Space Complexity: O(n)
*/

package Arrays;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] array = new int[size];
        for(int i = 0; i < n; i++) {
            array[2 * i] = nums[i];
            array[2 * i + 1] = nums[i + n];
        }
        return array;
    }
}