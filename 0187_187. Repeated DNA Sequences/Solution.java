public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashSet<String> validSequence = new HashSet<String>();
        HashSet<Integer> sequenceMap = new HashSet<Integer>();
        for(int i = 0; i < s.length() - 9; i++){
            String str = s.substring(i, i + 10);
            int code = this.decode(str);
            if(sequenceMap.contains(code) == true){
                validSequence.add(str);
            }
            else{
                sequenceMap.add(code);
            }
        }
        List<String> list = new ArrayList<String>();
        Iterator<String> iter = validSequence.iterator();
        while(iter.hasNext()){
            list.add(iter.next());
        }
        return list;
    }
    
    public int decode(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res = res << 2;
            char c = s.charAt(i);
            if(c == 'A'){
                res |= 0;
            }
            else if (c == 'C'){
                res |= 1;
            }
            else if (c == 'G'){
                res |= 2;
            }
            else{
                res |= 3;
            }
        }
        return res;
    }
}
