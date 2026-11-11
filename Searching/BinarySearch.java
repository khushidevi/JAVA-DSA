// LeetCode 704 - Binary Search
// Problem: Find the target element in a sorted array.
// Approach: Binary Search (Divide and Conquer)
// Time Complexity: O(log n)
// Space Complexity: O(1)

package Searching;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
