
/*
LeetCode #347 - Top K Frequent Elements
Approach: Use HashMap to count frequency of elements.
Use Min Heap (PriorityQueue) to maintain the K most frequent elements.
Time Complexity: O(n + m log k), where m is distinct elements.
Space Complexity: O(m + k)
*/
package Hashing;
import java.util.*;

public class TopKFrequentElements {


    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Maintain k frequent elements
        for (int num : map.keySet()) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int ans[] = new int[k];

        // Store answer
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}
