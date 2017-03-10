public class Solution {
    public int countPrimes(int n) {
        
        boolean[] primeTable = new boolean[n];
        for(int i = 0; i < n; i++){
            primeTable[i] = true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            for(int j = i * i; j < n; j += i){
                primeTable[j] = false;
            }
        }
        
        int count = 0;
        for(int i = 2; i < n; i++){
            if(primeTable[i] == true){
                count++;
            }
        }
        
        return count;
        
    }
}
