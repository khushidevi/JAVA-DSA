/*
 * LeetCode 88: Merge Sorted Array
 *
 * Approach:
 * Use three pointers starting from the ends of both arrays.
 * Place the larger element at the end of nums1.
 * Continue until all elements of nums2 are merged.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

package Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
