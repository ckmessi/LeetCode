public class Solution {
    public int reverse(int x) {
        
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        
        int flag = 1;
        if(x < 0){
            flag = -1;
            x = -x;
        }
        
        int sum = 0;
        while(x > 0){
            int digit = x % 10;
            if(flag == 1){
                if((Integer.MAX_VALUE - digit) / 10 < sum){
                    return 0;
                }
                else{
                    sum = sum * 10 + digit;
                }
            }
            else{
                if((Integer.MIN_VALUE + digit) / 10 > sum){
                    return 0;
                }
                else{
                    sum = sum * 10 - digit;
                }
            }
            x = x / 10;
        }
        
        return sum;
    }
}
