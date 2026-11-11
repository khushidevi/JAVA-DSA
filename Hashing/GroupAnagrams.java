/*
LeetCode #49 - Group Anagrams
Approach: Sort characters of each string and use the sorted string as a HashMap key.
Group strings having the same sorted key.
Time Complexity: O(n * k log k)
Space Complexity: O(n * k)
*/
package Hashing;
import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert string into character array
            char ch[] = str.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Create sorted key
            String key = new String(ch);

            // Create new group if key does not exist
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original string to group
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
