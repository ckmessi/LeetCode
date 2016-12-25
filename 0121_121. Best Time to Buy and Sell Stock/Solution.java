public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        
        int preMinValue = 0;
        int maxProfitValue = 0;
        for(int i = 0; i < prices.length; i++){
            if(i == 0){
                preMinValue = prices[i];
            }
            else{
                if(prices[i] - preMinValue > maxProfitValue){
                    maxProfitValue = prices[i] - preMinValue;
                }
                if(prices[i] < preMinValue){
                    preMinValue = prices[i];
                }
            }
        }
        
        return maxProfitValue;
    }
}
