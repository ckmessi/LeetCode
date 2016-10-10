public class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        
        long n_l = n;
        if(n_l < 0){
            x = 1 / x;
            n_l = -n_l;
        }
        
        double res = 1;
        while(n_l > 0){
            if(n_l % 2 == 1){
                res *= x;
            }
            x *= x;
            n_l = n_l / 2;
        }
        
        return res;
        
    }
}
