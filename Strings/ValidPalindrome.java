/*
 * LeetCode 125: Valid Palindrome
 *
 * Approach:
 * Use two pointers from both ends of the string.
 * Skip non-alphanumeric characters.
 * Compare characters without case sensitivity.
 * Return false if any pair does not match.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // Skip characters that are not letters or digits
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // Compare characters without case sensitivity
            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}

