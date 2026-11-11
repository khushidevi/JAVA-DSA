/*
 * LeetCode: 75. Sort Colors
 * Approach: Dutch National Flag Algorithm (Three Pointers)
 *
 * 1. Use three pointers: low, mid, and high.
 * 2. Move 0s to the left using low and mid.
 * 3. Keep 1s in the middle by incrementing mid.
 * 4. Move 2s to the right using high.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
 
package Sorting;

public class SortColors {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                  temp=nums[low];
                  nums[low]=nums[mid];
                  nums[mid]=temp;
                  low++;
                  mid++;
            }
            else if(nums[mid]==1){
                   mid++;
            }
            else{
                 temp=nums[high];
                 nums[high]=nums[mid];
                 nums[mid]=temp;
                 high--;
            }
        }
    }
}
