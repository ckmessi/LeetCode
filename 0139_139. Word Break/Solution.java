public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < wordDict.size(); i++){
            set.add(wordDict.get(i));
        }
        
        boolean[] dp = new boolean[s.length() + 1];
        // target is dp[s.length()]
        // dp[0] = true
        
        dp[0] = true;
        for(int i = 0; i < s.length(); i++){
            if(dp[i] == false){
                continue;
            }
            for(int j = 1; j < s.length() - i + 1; j++){
                String sub = s.substring(i, i + j);
                if(set.contains(sub) == true){
                    dp[i + j] = true;
                }
            }
            if(dp[s.length()] == true){
                break;
            }
        }
        
        return dp[s.length()];
        
    }
}
