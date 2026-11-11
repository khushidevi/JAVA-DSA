/*
 * LeetCode 242: Valid Anagram
 *
 * Approach:
 * Check whether both strings have equal lengths.
 * Convert both strings into character arrays.
 * Sort both arrays and compare them.
 * If both arrays are equal, they are anagrams.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Hashing;
import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        // Step 1: Length different hai toh anagram nahi ho sakte
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Strings ko character arrays mein convert karo
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Step 3: Dono arrays ko sort karo
        Arrays.sort(a);
        Arrays.sort(b);

        // Step 4: Sorted arrays compare karo
        return Arrays.equals(a, b);
    }
}
