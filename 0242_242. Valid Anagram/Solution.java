public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> record = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(record.containsKey(c) == false){
                record.put(c, 1);
            }
            else{
                record.put(c, record.get(c) + 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(record.containsKey(c) == false){
                return false;
            }
            else{
                int num = record.get(c);
                if(num <= 0){
                    return false;
                }
                else{
                    record.put(c, record.get(c) - 1);
                }
            }
        }
        return true;
    }
}
