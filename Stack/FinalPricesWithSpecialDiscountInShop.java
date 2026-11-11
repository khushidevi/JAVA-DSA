/*
LeetCode #1475 - Final Prices With a Special Discount in a Shop
Approach: For each price, find the first price to its right that is less than or equal to it and subtract it as a discount.
Time Complexity: O(n²)
Space Complexity: O(n)
*/

package Stack;

public class FinalPricesWithSpecialDiscountInShop {
     public int[] finalPrices(int[] prices) {
        int size= prices.length;
        int answer[]=new int[size];
        for(int i = 0; i < size; i++) {
            answer[i] = prices[i];
            for(int j = i + 1; j < size; j++) {
                if(prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return answer;
    }
}
