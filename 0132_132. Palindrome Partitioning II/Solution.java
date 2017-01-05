public class Solution {
    
    public int minCut(String s) {
        if(s.length() <= 1){
            return 0;
        }
        
        boolean[][] palin = new boolean[s.length()][s.length()];
        for(int len = 1; len <= s.length(); len++){
            for(int i = 0; i < s.length() - len + 1; i++){
                int j = i + len - 1;
                if(i == j){
                    palin[i][j] = true;
                }
                else if (j == i + 1){
                    palin[i][j] = s.charAt(i) == s.charAt(j);
                }
                else{
                    palin[i][j] = s.charAt(i) == s.charAt(j) && palin[i+1][j-1] == true;
                }
            }
        }
        
        int[] cut = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                cut[i] = 0;
            }
            else{
                if(palin[0][i] == true){
                    cut[i] = 0;
                }
                else{
                    cut[i] = Integer.MAX_VALUE;
                    for(int k = 1; k <= i; k++){
                        if(palin[k][i] == true){
                            cut[i] = Math.min(cut[i], cut[k-1] + 1);
                        }
                    }
                }
            }
        }
        
        return cut[s.length() - 1];
        
    }
}
