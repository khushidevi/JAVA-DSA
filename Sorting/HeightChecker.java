/*
 * LeetCode: 1051. Height Checker
 * Approach: Insertion Sort + Array Comparison
 *
 * 1. Create a copy of the original heights array.
 * 2. Sort the copied array using Insertion Sort.
 * 3. Compare both arrays element by element.
 * 4. Count the positions where elements differ.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

package Sorting;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int n =heights.length;
        int expected[]= new int[n];
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
        }

        for(int i=1;i<n;i++){
            int prev=i-1;
            int CurrValue=expected[i];
            while(prev>=0 && CurrValue<expected[prev]){
                expected[prev+1]=expected[prev];
                prev--;
            }
            expected[prev+1]=CurrValue;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(expected[i]==heights[i]){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
