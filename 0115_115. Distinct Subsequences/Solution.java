public class Solution {
    public int numDistinct(String s, String t) {
        if(s.length() < t.length()){
            return 0;
        }
        if(s.length() == 0){
            return 1;
        }
        
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for(int i = 0; i <= s.length(); i++){
            for(int j = 0; j <= t.length(); j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }
                else if (j == 0){
                    dp[i][j] = 0;
                }
                else {
                    if(j > i){
                        dp[i][j] = 0;
                    }
                    else{
                        dp[i][j] = 0;
                        if(s.charAt(i-1) == t.charAt(j-1)){
                            for(int k = j - 1; k <= i - 1; k++){
                                dp[i][j] += dp[k][j-1];       
                            }
                        }
                    }
                }
            }
        }
        
        int num = 0;
        for(int i = 0; i <= s.length(); i++){
            num += dp[i][t.length()];
        }
        
        return num;
    }
}
