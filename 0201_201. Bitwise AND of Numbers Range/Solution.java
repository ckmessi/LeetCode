public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int swift = 0;
        while(m != n){
            m = m >> 1;
            n = n >> 1;
            swift++;
        }
        int res = n << swift;
        return res;
    }
}
