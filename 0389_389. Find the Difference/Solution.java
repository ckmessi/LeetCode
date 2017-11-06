class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) == false){
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(map.containsKey(c) == false){
                return c;
            }
            else{
                int v = map.get(c);
                if(v == 0){
                    return c;
                }
                else{
                    map.put(c, v - 1);
                }
            }
        }
        return ' ';
    }
}
