class Solution {
    public int findComplement(int num) {
        int res = 0;
        int count = 0;
        while(num > 0){
            int digit = num & 1;
            res |= (digit ^ 1) << count;
            num = num >> 1;
            count++;
        }
        return res;
    }
}
