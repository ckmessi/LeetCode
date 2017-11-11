class Solution {
    public boolean hasAlternatingBits(int n) {
        int bit = (n & 1) ^ 1;
        while(n > 0){
            int digit = n & 1;
            if((bit ^ digit) == 0){
                return false;
            }
            else{
                n = n >> 1;
                bit = bit ^ 1;
            }
        }
        return true;
    }
}
