public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<List<String>>();
        if(strs.length == 0){
            return list;
        }
        
        HashMap<String, List<String>> anagramMap = new HashMap<String, List<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String anagram = String.valueOf(tmp);
            if(anagramMap.containsKey(anagram) == true){
                anagramMap.get(anagram).add(strs[i]);
            }
            else{
                List<String> x = new ArrayList<String>();
                x.add(strs[i]);
                anagramMap.put(anagram, x);
            }
        }
        
        Iterator iter = anagramMap.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            List<String> x = (List<String>)entry.getValue();
            list.add(x);
        }
        
        return list;
        
    }
}
