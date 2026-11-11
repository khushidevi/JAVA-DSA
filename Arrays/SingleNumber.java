/*
LeetCode #136 - Single Number

Approach:
Use XOR to find the element that appears only once.
Since a number XOR itself is 0 and a number XOR 0 is itself,
all duplicate numbers cancel each other out, leaving the single number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}
