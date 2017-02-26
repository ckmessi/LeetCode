public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        
        int n = dungeon.length;
        if(n == 0){
            return 0;
        }
        int m = dungeon[0].length;
        if(m == 0){
            return 0;
        }
        int[][] dp = new int[n][m];
        
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(i == n - 1 && j == m - 1){
                    dp[i][j] = Math.max(0, -dungeon[i][j]) + 1;
                }        
                else if (i == n - 1){
                    dp[i][j] = Math.max(1, dp[i][j+1] - dungeon[i][j]);
                }
                else if (j == m - 1){
                    dp[i][j] = Math.max(1, dp[i+1][j] - dungeon[i][j]);
                }
                else {
                    int a = Math.max(1, dp[i+1][j] - dungeon[i][j]);
                    int b = Math.max(1, dp[i][j+1] - dungeon[i][j]);
                    dp[i][j] = Math.min(a, b);
                }
            }
        }
        return dp[0][0];
    }
}
