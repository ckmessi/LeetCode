public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        
        int[] leftMax = new int[prices.length];
        int[] rightMax = new int[prices.length];
        
        // from left to right
        int currentMin = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            currentMin = Math.min(currentMin, prices[i]);
            if(i == 0){
                leftMax[i] = 0;
            }
            else{
                leftMax[i] = Math.max(leftMax[i-1], prices[i] - currentMin);
            }
        }
        // from right to left
        int currentMax = Integer.MIN_VALUE;
        for(int i = prices.length - 1; i >= 0; i--){
            currentMax = Math.max(currentMax, prices[i]);
            if(i == prices.length - 1){
                rightMax[i] = 0;
            }
            else{
                rightMax[i] = Math.max(rightMax[i+1], currentMax - prices[i]);
            }
        }
        
        // calculate the final plan 
        int finalProfit = 0;
        for(int i = 0; i < prices.length; i++){
            finalProfit = Math.max(finalProfit, leftMax[i] + rightMax[i]);
        }
        return finalProfit;
        
    }
}
