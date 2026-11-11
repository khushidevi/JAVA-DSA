/*
LeetCode #525 - Contiguous Array
Approach: Convert 0 into -1 and calculate Prefix Sum.
Use HashMap to store the first occurrence of each prefix sum.
Repeated prefix sums indicate a subarray with equal 0s and 1s.
Time Complexity: O(n)
Space Complexity: O(n)
*/

package Hashing;
import java.util.*;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int MaxLength = 0;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(prefix[i])) {
                int length = i - map.get(prefix[i]);

                if (MaxLength < length) {
                    MaxLength = length;
                }
            }
            else {
                map.put(prefix[i], i);
            }
        }

        return MaxLength;
    }
}
