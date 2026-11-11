/*
    LeetCode #121 - Best Time to Buy and Sell Stock
    Approach: Keep track of the minimum price seen so far and calculate the profit at each step.
    Time Complexity: O(n)
    Space Complexity: O(1)
    */


package Arrays;

public class BestTimeToBuyAndSellStock {
public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}