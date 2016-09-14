public class Solution {
    public int divide(int dividend, int divisor) {
        
        if(divisor == 0){
            return Integer.MAX_VALUE;
        }
        if(dividend == 0){
            return 0;
        }        
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        
        int flag = 1;
        long dividend_l = (long)dividend;
        long divisor_l = (long)divisor;
        if(dividend_l < 0){
            flag = -flag;
            dividend_l = -dividend_l;
        }
        if(divisor_l < 0){
            flag = -flag;
            divisor_l = -divisor_l;
        }
        
        long sum = 0;
        while(dividend_l >= divisor_l){
            long current = 1;
            long base = divisor_l;
            while(base + base <= dividend_l){
                base += base;
                current += current;
            }
            dividend_l -= base;
            sum += current;
        }
        
        if(flag == 1){
            if(sum > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else{
                return (int)sum;
            }
        }
        else{
            sum = -sum;
            if(sum < Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }
            else{
                return (int)sum;
            }
        }

    }
}
