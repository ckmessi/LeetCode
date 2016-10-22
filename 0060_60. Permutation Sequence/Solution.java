public class Solution {
    public String getPermutation(int n, int k) {
        
        boolean[] visit = new boolean[10];
        for(int i = 0; i < visit.length; i++){
            visit[i] = false;
        }
        
        int[] base = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0){
                base[i] = 1;
            }
            else{
                base[i] = i * base[i-1];
            }
        }
     
        
        String res = "";
        k = k - 1;
        for(int i = n-1; i >= 0; i--){
            int digit = k / base[i];
            int pos = 0;
            int count = 0;
            for(int j = 1; j <= n; j++){
                if(visit[j] == false){
                    if(count == digit){
                        pos = j;
                        break;
                    }
                    count++;
                }
            }
            visit[pos] = true;
            res += pos;
            k = k % base[i];
        }
        
        return res;
        
    }
}
