/*
 * LeetCode 219: Contains Duplicate II
 *
 * Approach:
 * Use a HashMap to store each number's last seen index.
 * If the number appears again, calculate the index difference.
 * Return true if the difference is at most k.
 * Otherwise, update the number's index and continue.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Hashing;
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // If number was seen before
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            // Store or update the last seen index
            map.put(nums[i], i);
        }

        return false;
    }
}
