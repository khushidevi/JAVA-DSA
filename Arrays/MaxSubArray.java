
/*
 * LeetCode 53: Maximum Subarray
 * Approach: Kadane's Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


package Arrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int MaxSum=nums[0];
        for(int i=1;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+nums[i];
            if(MaxSum<sum){
                MaxSum=sum;
            }
        }
        return MaxSum;
    }
}

