public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }
        
        int endPos = -1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                endPos = i;
                break;
            }
        }
        if(endPos == -1){
            return 0;
        }
        int startPos = -1;
        for(int i = endPos; i >= 0; i--){
            if(s.charAt(i) == ' '){
                startPos = i;
                break;
            }
        }
        
        int res = endPos - startPos;
        return res;
        
    }
}
