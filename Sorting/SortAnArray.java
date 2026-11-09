/*
LeetCode #912 - Sort an Array
Approach: Use Merge Sort to divide the array into two halves.
Recursively sort both halves and merge them.
Time Complexity: O(n log n)
Space Complexity: O(n)
*/

package Sorting;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Sort left half
        mergeSort(nums, low, mid);

        // Sort right half
        mergeSort(nums, mid + 1, high);

        // Merge both sorted halves
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Compare and merge elements
        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j <= high) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy sorted elements back
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}
