public class Solution {
    public boolean isMatch(String s, String p) {
        
        if(p.length() == 0 && s.length() == 0){
            return true;
        }
        if(p.length() == 0){
            return false;
        }
        
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for(int i = 1; i <= s.length(); i++){
            dp[i][0] = false;
        }
        for(int j = 1; j <= p.length(); j++){
            if(p.charAt(j - 1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
            else{
                dp[0][j] = false;
            }
        }
        
        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= p.length(); j++){
                char cs = s.charAt(i - 1);
                char cp = p.charAt(j - 1);
                if(cp == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if (cp == '*'){
                    dp[i][j] = false;
                    for(int k = 0; k <= i; k++){
                        if(dp[k][j-1] == true){
                            dp[i][j] = true;
                        }
                    }
                }
                else{
                    dp[i][j] = (cs == cp) && dp[i - 1][j - 1];
                }
            }
        }
        
        return dp[s.length()][p.length()];
    }
}
