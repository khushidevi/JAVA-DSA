/*
LeetCode #485 - Max Consecutive Ones

Approach:
Use a count variable to keep track of the current consecutive 1s.
Whenever 0 is found, reset count to 0.
Keep updating max with the highest count found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                count++;

                if(count > max) {
                    max = count;
                }
            } 
            else {
                count = 0;
            }
        }

        return max;
    }
}
