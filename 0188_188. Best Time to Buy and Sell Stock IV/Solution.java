public class Solution {
    public int maxProfit(int k, int[] prices) {
        if(k < 1){
            return 0;
        }   
        if(prices.length < 2){
            return 0;
        }
        if(prices.length <= k - 1){
            int profit = 0;
            for(int i = 1; i < prices.length; i++){
                profit += Math.max(0, prices[i] - prices[i-1]);
            }
            return profit;
        }
        
        int[][] dp = new int[k+1][prices.length];
        for(int i = 0; i <= k; i++){
            int tempMaxValue = -prices[0];
            for(int j = 1; j < prices.length; j++){
                if(i == 0){
                    dp[i][j] = 0;   
                }
                else{
                    tempMaxValue = Math.max(tempMaxValue, dp[i-1][j-1] - prices[j]);
                    dp[i][j] = Math.max(dp[i][j-1], tempMaxValue + prices[j]);
                }
            }
        }
        return dp[k][prices.length-1];
        
    }
}
