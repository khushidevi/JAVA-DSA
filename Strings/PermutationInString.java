/*
 * LeetCode: 567. Permutation in String
 * Approach: Sliding Window + Frequency Array
 *
 * 1. Check if s1 is longer than s2; if yes, return false.
 * 2. Create a frequency array to count characters in s1.
 * 3. Count character frequencies of the first window in s2.
 * 4. Compare both frequency arrays to check for a permutation.
 * 5. Slide the window by adding the new character and removing the old character.
 * 6. Compare frequencies for each window.
 * 7. Return true if any window matches; otherwise, return false.
 *
 * Time Complexity: O(26 * n) = O(n)
 * Space Complexity: O(26) = O(1)
 */

package Strings;

public class PermutationInString {
    static boolean compareFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int count1[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char currchar = s1.charAt(i);
            count1[currchar - 'a']++;
        }

        int windowlength = s1.length();
        int count2[] = new int[26];

        // First window
        for (int i = 0; i < windowlength; i++) {
            char ch = s2.charAt(i);
            count2[ch - 'a']++;
        }

        if (compareFreq(count1, count2)) {
            return true;
        }

        // Sliding window
        for (int i = 0; i < s2.length() - windowlength; i++) {

            // Add new character
            char newChar = s2.charAt(i + windowlength);
            count2[newChar - 'a']++;

            // Remove old character
            char oldChar = s2.charAt(i);
            count2[oldChar - 'a']--;

            if (compareFreq(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}
