c class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(sMap.containsKey(cs) == false){
                if(tMap.containsKey(ct) == true){
                    return false;
                }
                else{
                    sMap.put(cs, ct);
                    tMap.put(ct, cs);
                }
            }
            else{
                if(sMap.get(cs) != ct){
                    return false;
                }
                else{
                    if(tMap.containsKey(ct) == false){
                        return false;
                    }
                    else{
                        if(tMap.get(ct) != cs){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
        
    }
}
