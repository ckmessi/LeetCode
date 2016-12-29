public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            while(i < j){
                char c = s.charAt(i);
                if(Character.isDigit(c) || Character.isLetter(c)){
                    break;
                }
                else{
                    i++;
                }
            }
            while(j > i){
                char c = s.charAt(j);
                if(Character.isDigit(c) || Character.isLetter(c)){
                    break;
                }
                else{
                    j--;
                }
            }
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
