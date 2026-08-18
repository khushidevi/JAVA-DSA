/*
LeetCode #1 - Two Sum
Approach: Using Brute Force.Use nested loops to check every pair of elements and return the indices whose sum equals the target.
Time Complexity: O(n²)
Space Complexity: O(1)
*/

package Arrays;

public class TwoSumUsingBruteForce {
    public int[] twoSum(int[] nums, int target) {
        int size= nums.length;
        int index[]=new int[2];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i]+nums[j]==target){
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }
        }
        return index;
    }
}
