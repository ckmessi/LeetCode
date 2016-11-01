public class Solution {
    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int tmp1 = 1;
        int tmp2 = 2;
        int tmp3 = 0;
        for(int i = 3; i <= n; i++){
            tmp3 = tmp1 + tmp2;
            tmp1 = tmp2;
            tmp2 = tmp3;
        }
        
        return tmp3;
    }
}
