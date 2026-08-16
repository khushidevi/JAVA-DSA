/*
LeetCode #1929 - Concatenation of Array
Approach: Create an array of twice the size and copy nums twice.
Time Complexity: O(n)
Space Complexity: O(n)
*/

package Arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int size1 = nums.length;
        int size2 = 2 * size1;
        
        int[] ans = new int[size2];
        
        for(int i = 0; i < size1; i++) {
            ans[i] = nums[i];
            ans[i + size1] = nums[i];
        }
        
        return ans;
    }
}
