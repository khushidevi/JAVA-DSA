/*
 * LeetCode: 451. Sort Characters By Frequency
 * Approach: HashMap + Sorting + StringBuilder
 *
 * 1. Use a HashMap to count the frequency of each character.
 * 2. Store all unique characters in an ArrayList.
 * 3. Sort characters in descending order of frequency.
 * 4. Append each character according to its frequency.
 * 5. Return the resulting string.
 *
 * Time Complexity: O(n + k log k)
 * Space Complexity: O(n + k)
 *
 * n = Length of string
 * k = Number of distinct characters
 */

package Strings;
import java.util.*;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Store characters in a list
        List<Character> list = new ArrayList<>(map.keySet());

        // Sort according to frequency (descending)
        Collections.sort(list, (a, b) ->
            map.get(b) - map.get(a)
        );

        StringBuilder ans = new StringBuilder();

        // Append characters according to frequency
        for (int i = 0; i < list.size(); i++) {

            char ch = list.get(i);
            int freq = map.get(ch);

            for (int j = 0; j < freq; j++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
