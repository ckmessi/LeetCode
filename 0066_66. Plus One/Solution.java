public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0){
            return digits;
        }
        
        digits[digits.length - 1]++;
        int k = digits.length - 1;
        while(k > 0){
            if(digits[k] >= 10){
                digits[k-1] += digits[k] / 10;
                digits[k] = digits[k] % 10;
                k--;
            }
            else{
                break;
            }
        }
        if(k > 0){
            return digits;
        }
        else{
            if(digits[0] < 10){
                return digits;
            }
            else{
                int[] x = new int[digits.length+1];
                x[0] = digits[0] / 10;
                digits[0] = digits[0] % 10;
                for(int i = 0; i < digits.length; i++){
                    x[i+1] = digits[i];
                }
                return x;
            }
        }
        
    }
}
