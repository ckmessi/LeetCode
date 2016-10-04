public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == 0){
            return -1;
        }
        
        int index = this.kmp(haystack, needle);
        
        return index;
    }
    
    public int kmp(String haystack, String needle){
        
        int[] next = this.getNext(needle);
        
        int i = 0;
        int j = 0;
        while(i != haystack.length() && j != needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j == 0){
                    i++;
                }
                else{
                    j = next[j];
                }
            }
        }
        if(j == needle.length()){
            return i - j;
        }
        else{
            return -1;
        }
        
        
    }
    
    public int[] getNext(String needle){
        int[] next = new int[needle.length()];
        next[0] = -1;   // 什么值都可以
        int i = 1;
        int j = 0;
        while(i < needle.length() - 1){
            if(needle.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                next[i] = j;
            }
            else{
                if(j == 0){
                    i++;
                    next[i] = 0;
                }
                else{
                    j = next[j];
                }
            }
        }
        return next;
    }
}
