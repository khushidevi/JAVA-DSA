 /*
LeetCode #66 - Plus One
Approach: Start from the last digit. If it is less than 9, add 1 and return.
If it is 9, change it to 0 and carry 1 to the next digit.
Time Complexity: O(n)
Space Complexity: O(n)
*/

package Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[size + 1];
        result[0] = 1;
        return result;
    }
}
