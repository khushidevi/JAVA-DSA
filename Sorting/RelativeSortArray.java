/*
 * LeetCode: 1122. Relative Sort Array
 * Approach: Frequency Array + Counting Sort
 *
 * 1. Create a frequency array to count occurrences of each element.
 * 2. Traverse arr2 and add elements to the result in the given order.
 * 3. Traverse the frequency array to add remaining elements.
 * 4. Remaining elements are automatically added in ascending order.
 *
 * Time Complexity: O(n + m + K)
 * Space Complexity: O(n + K)
 *
 * n = Length of arr1
 * m = Length of arr2
 * K = Maximum value range (1001)
 */

package Sorting;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for (int num : arr1) {
            freq[num]++;
        }
        int[] result = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            while (freq[num] > 0) {
                result[index++] = num;
                freq[num]--;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                result[index++] = i;
                freq[i]--;
            }
        }
        return result;
    }
}
