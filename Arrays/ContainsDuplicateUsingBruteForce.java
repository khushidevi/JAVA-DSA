/*
LeetCode #217 - Contains Duplicate Using Brute Force
Approach: Use nested loops to compare every pair of elements.
If two elements are equal, a duplicate exists.
Time Complexity: O(n²)
Space Complexity: O(1)
*/

package Arrays;

public class ContainsDuplicateUsingBruteForce {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;

        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
