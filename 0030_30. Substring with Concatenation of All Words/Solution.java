public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> list = new ArrayList<Integer>();
        if(s.length() == 0 || words.length == 0){
            return list;
        }
        
        HashMap<String, Integer> answerMap = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++){
            if(answerMap.containsKey(words[i]) == true){
                int num = answerMap.get(words[i]);
                num++;
                answerMap.put(words[i], num);
            }
            else{
                answerMap.put(words[i], 1);
            }
        }
        
        int len = words[0].length();
        
        for(int i = 0; i < s.length() - len * words.length + 1; i++){
            HashMap<String, Integer> recordMap = new HashMap<String, Integer>();
            boolean conflict = false;
            for(int j = 0; j < words.length; j++){
                String str = s.substring(i + len * j, i + len * j + len);
                if(answerMap.containsKey(str) == false){
                    conflict = true;
                    break;
                }
                else{
                    if(recordMap.containsKey(str) == false){
                        recordMap.put(str, 1);
                    }
                    else{
                        int num = recordMap.get(str);
                        num++;
                        if(num > answerMap.get(str)){
                            conflict = true;
                            break;
                        }
                        else{
                            recordMap.put(str, num);
                        }
                    }
                }
            }
            if(conflict == false){
                list.add(i);
            }
        }
        
        return list;
    }
}
