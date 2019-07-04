class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> sortedMapEntryList = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());  
        Collections.sort(sortedMapEntryList, new Comparator<Map.Entry<Character, Integer>>() {  
            public int compare(Map.Entry<Character, Integer> o1,  
                    Map.Entry<Character, Integer> o2) {  
                return (o2.getValue() - o1.getValue()); 
            }  
        });  
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < sortedMapEntryList.size(); i++){
            char c = sortedMapEntryList.get(i).getKey();
            int v = sortedMapEntryList.get(i).getValue();
            for(int j = 0; j < v; j++){
                sb.append(String.valueOf(c));
            }
        }
        
        return sb.toString();
        
    }
}
