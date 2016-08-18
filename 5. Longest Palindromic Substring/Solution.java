public class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() <= 1){
            return s;
        }
        
        StringBuffer sb = new StringBuffer("");
        sb.append("$#");
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
            sb.append("#");
        }
        String str = sb.toString();
        
        int[] p = new int[str.length()];
        p[0] = 0;
        int idx = 0;
        
        int maxLength = 0;
        int maxLengthIndex = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(i < p[idx] + idx){
                p[i] = Math.min(p[2 * idx - i], p[idx] + idx - i);
            }
            else{
                p[i] = 1;
            }
            
            while(i + p[i] < str.length() && i - p[i] >= 0 && str.charAt(i+p[i]) == str.charAt(i-p[i])){
                p[i]++;
            }
            
            if(p[i] + i > p[idx] + idx){
                idx = i;
            }
            if(p[i] > maxLength){
                maxLength = p[i];
                maxLengthIndex = i;
            }
            
        }
        
        int centerIndex = maxLengthIndex / 2 - 1;
        int actualLength = maxLength - 1;
        int startIndex = 0;
        if(maxLengthIndex % 2 == 1){
            startIndex = centerIndex - actualLength / 2 + 1;
        }
        else{
            startIndex = centerIndex - actualLength / 2;
        }
        
        String res = s.substring(startIndex, startIndex + actualLength);
        
        return res;
        
        
    }
}
