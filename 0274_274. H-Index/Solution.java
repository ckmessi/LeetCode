public class Solution {
    public int hIndex(int[] citations) {
        
        if(citations.length <= 0){
            return 0;
        }
        
        int[] citeNum = new int[citations.length + 1];
        for(int i = 0; i < citations.length; i++){
            if(citations[i] >= citations.length){
                citeNum[citations.length] += 1;
            }
            else{
                citeNum[citations[i]] += 1;
            }
        }
        
        int sum = 0;
        for(int i = citations.length; i >= 0; i--){
            sum += citeNum[i];
            if(sum >= i){
                return i;
            }
        }
        return 0;
    }
}
