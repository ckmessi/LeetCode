class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        for(int i = 0; i < secret.length(); i++){
            char sc = secret.charAt(i);
            char gc = guess.charAt(i);
            if(sc == gc){
                bull++;
            }
        }
        int cow = 0;
        HashMap<Character, Integer> record = new HashMap<Character, Integer>();
        for(int i = 0; i < secret.length(); i++){
            char c = secret.charAt(i);
            if(record.containsKey(c) == false){
                record.put(c, 1);
            }
            else{
                record.put(c, record.get(c) + 1);
            }
        }
        
        for(int i = 0; i < guess.length(); i++){
            char c = guess.charAt(i);
            if(record.containsKey(c) == false){
                continue;
            }
            else{
                if(record.get(c) > 0){
                    cow++;
                    record.put(c, record.get(c) - 1);
                }
            }
        }
        
        cow = cow - bull;
        String res = bull + "A" + cow + "B";
        return res;
        
    }
}
