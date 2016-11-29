public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i <= s1.length(); i++){
            for(int j = 0; j <= s2.length(); j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                    continue;
                }
                dp[i][j] = false;
                char c = s3.charAt(i + j - 1);
                if(i > 0 && c == s1.charAt(i-1) && dp[i-1][j] == true){
                    dp[i][j] = true;
                }
                if(j > 0 && c == s2.charAt(j-1) && dp[i][j-1] == true){
                    dp[i][j] = true;
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }
}
