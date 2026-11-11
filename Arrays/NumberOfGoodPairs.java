/*
LeetCode #1512 - Number of Good Pairs
Approach: Use nested loops to compare every pair and count pairs with equal values where i < j.
Time Complexity: O(n²)
Space Complexity: O(1)
*/

package Arrays;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int size= nums.length;
        int goodpairs=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(nums[i]==nums[j]&& i<j){
                    goodpairs++;
                }
            }
        }
        return goodpairs;
        
    }
}

