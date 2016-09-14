public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0){
            return "";
        }
        
        int minLength = 0;
        for(int i = 0; i < strs.length; i++){
            if(i == 0){
                minLength = strs[i].length();
            }
            else{
                minLength = Math.min(minLength, strs[i].length());
            }
        }
        
        int validLength = 0;
        for(int k = 0; k < minLength; k++){
            char c = strs[0].charAt(k);
            boolean consist = true;
            for(int i = 1; i < strs.length; i++){
                char d = strs[i].charAt(k);
                if(d != c){
                    consist = false;
                    break;
                }
            }
            if(consist == false){
                break;
            }
            else{
                validLength++;
            }
        }
        
        return strs[0].substring(0, validLength);
    }
}
