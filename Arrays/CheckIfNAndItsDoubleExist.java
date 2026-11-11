/*
LeetCode #1346 - Check If N and Its Double Exist
Approach: Use nested loops to check every pair of different indices and determine if one number is double the other.
Time Complexity: O(n²)
Space Complexity: O(1)
*/

package Arrays;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int size= arr.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i!=j && arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
