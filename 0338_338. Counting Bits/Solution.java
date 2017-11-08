class Solution {
    public int[] countBits(int num) {

        int[] res = new int[num + 1];
        
        int base = 1;
        while(base <= num){
            // deal with [base, 2*base - 1]
            for(int i = base; i < 2 * base; i++){
                if(i > num){
                    break;
                }
                if(i - base < base / 2){
                    res[i] = res[i - base / 2];
                }
                else{
                    res[i] = res[i - base / 2] + 1;
                }
            }
            base *= 2;
        }
        return res;        
    }
}

