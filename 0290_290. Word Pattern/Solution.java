public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] tokens = str.split(" ");
        if(pattern.length() != tokens.length){
            return false;
        }
        
        HashMap<Character, String> cMapS = new HashMap<Character, String>();
        HashMap<String, Character> sMapC = new HashMap<String, Character>();
        
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String s = tokens[i];
            if(cMapS.containsKey(c) == false){
                if(sMapC.containsKey(s) == false){
                    cMapS.put(c, s);
                    sMapC.put(s, c);
                }
                else{
                    return false;
                }
            }
            else{
                if(cMapS.get(c).equals(s) == false){
                    return false;
                }
                else{
                    if(sMapC.containsKey(s) == false){
                        return false;
                    }
                    else{
                        if(sMapC.get(s) != c){
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}
