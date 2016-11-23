public class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0){
            return 0;
        }
        
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for(int i = 0; i < s.length(); i++){
            dp[i+1] = 0;
            char c2 = s.charAt(i);
            if(c2 != '0'){
                dp[i+1] += dp[i];
            }
            if(i > 0){
                String str = s.substring(i-1, i+1);
                int v = Integer.parseInt(str);
                if(v >= 10 && v <= 26){
                    dp[i+1] += dp[i-1];
                }
            }
        }
        
        return dp[s.length()];
    }
}

