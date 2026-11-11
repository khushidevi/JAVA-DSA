// LeetCode 448 - Find All Numbers Disappeared in an Array
// Problem: Find numbers from 1 to n missing in the array.
// Approach: In-place Negative Marking
// Time Complexity: O(n)
// Space Complexity: O(1) auxiliary space
// Note: Output list space is excluded; input array is modified.

package Arrays;
import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
