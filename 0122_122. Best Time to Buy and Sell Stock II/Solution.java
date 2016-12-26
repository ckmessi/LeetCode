public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int profitValue = 0;
        for(int i = 0; i < prices.length; i++){
            if(i == 0){
                continue;
            }
            else{
                if(prices[i] > prices[i-1]){
                    profitValue += prices[i] - prices[i-1];
                }
            }
        }
        return profitValue;
    }
}
