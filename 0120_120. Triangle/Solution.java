public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0){
            return 0;
        }
        
        int[] dp = new int[triangle.size()];
        for(int i = 0; i < triangle.size(); i++){
            int last = 0;
            for(int j = 0; j <= i; j++){
                int temp_save = dp[j];
                if(i == 0){
                    dp[j] = triangle.get(i).get(j);
                }
                else{
                    if(j == 0){
                        dp[j] = dp[j] + triangle.get(i).get(j);
                    }
                    else if (j == i){
                        dp[j] = last + triangle.get(i).get(j);
                    }
                    else{
                        dp[j] = Math.min(last, dp[j]) + triangle.get(i).get(j);
                    }
                    last = temp_save;
                }
            }
        }
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < triangle.size(); i++){
            minValue = Math.min(dp[i], minValue);
        }
        return minValue;
    }
    
}
