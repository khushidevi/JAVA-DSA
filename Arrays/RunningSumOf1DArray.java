/*
  LeetCode #1480 - Running Sum of 1D Array
  Approach:
   Traverse the array and keep adding each element to a running sum.
   Store the running sum at each index in the result array.

  Time Complexity: O(n)
  Space Complexity: O(n)
 */

package Arrays;

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int size= nums.length;
        int runningsum[]= new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
              sum+=nums[i];
              runningsum[i]=sum;
        } 
        return runningsum;
    }
}