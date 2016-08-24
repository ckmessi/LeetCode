public class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
        
        int copyx = x;
        int base = 1;
        while(copyx >= 10){
            base *= 10;
            copyx /= 10;
        }
        
        while(base > 0){
            int head = x / base;
            int tail = x % 10;
            if(head != tail){
                return false;
            }
            x = x % base;
            x = x / 10;
            base = base / 100;
        }
        
        return true;
    }
}
