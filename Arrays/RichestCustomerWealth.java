/*
LeetCode #1672 - Richest Customer Wealth
Approach: Calculate each customer's total wealth and keep track of the maximum.
Time Complexity: O(m * n)
Space Complexity: O(1)
*/

package Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length; 
        int maxWealth = 0;
        for(int i = 0; i < m; i++) {
            int wealth = 0;
            for(int j = 0; j < n; j++) {
                wealth += accounts[i][j];
            }
            if(wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}