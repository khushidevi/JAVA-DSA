/*
 * LeetCode 344: Reverse String
 *
 * Approach:
 * Use two pointers at the beginning and end.
 * Swap their characters and move both pointers inward.
 * Stop when the pointers meet or cross.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Strings;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
