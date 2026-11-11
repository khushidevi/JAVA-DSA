/*
LeetCode #1295 - Find Numbers with Even Number of Digits
Approach: Count the digits of each number using division by 10.
If the number of digits is even, increase the count.
Time Complexity: O(n * d)
Space Complexity: O(1)
*/

package Arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int size = nums.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            int num = nums[i];
            int digits = 0;
            while (num > 0) {
                num = num / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
