/*
LeetCode #1365 - How Many Numbers Are Smaller Than the Current Number
Approach: For each element, compare it with every other element and count how many numbers are smaller.
Time Complexity: O(n²)
Space Complexity: O(n)
*/

package Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size= nums.length;
        int result[]= new int[size];
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(nums[i]>nums[j]){
                    count++;
                }

            }
            result[i]=count;
        }
        return result;
    }
}