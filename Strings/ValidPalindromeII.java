/*
 * LeetCode 680: Valid Palindrome II
 *
 * Approach:
 * Use two pointers to compare characters from both ends.
 * If a mismatch occurs, try skipping either the left or
 * the right character and check whether the remaining
 * substring is a palindrome.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Strings;

public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
