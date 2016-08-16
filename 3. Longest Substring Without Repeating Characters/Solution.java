public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() < 2){
            return s.length();
        }
        
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        int maxLength = 1;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charMap.containsKey(c) == true && charMap.get(c) >= left){
                left = charMap.get(c) + 1;
            }
            else{
                maxLength = Math.max(maxLength, i - left + 1);
            }
            charMap.put(c, i);
        }
        
        return maxLength;
        
    }
}
