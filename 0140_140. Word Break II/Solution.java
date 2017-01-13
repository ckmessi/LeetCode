public class Solution {
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        boolean[] dp = new boolean[s.length() + 1];
        HashMap<Integer, List<Integer>> nextListMap = new HashMap<Integer, List<Integer>>();
        
        HashSet<String> wordSet = new HashSet<String>();
        for(int i = 0; i < wordDict.size(); i++){
            wordSet.add(wordDict.get(i));
        }
        
        dp[0] = true;
        for(int i = 0; i < s.length(); i++){
            if(dp[i] == false){
                continue;        
            }
            for(int len = 1; len < s.length() - i + 1; len++){
                String sub = s.substring(i, i + len);
                if(wordSet.contains(sub) == true){
                    dp[i + len] = true;
                    if(nextListMap.containsKey(i) == false){
                        nextListMap.put(i, new ArrayList<Integer>());
                    }
                    nextListMap.get(i).add(i + len);
                }
            }
        }

        List<String> list = new ArrayList<String>();
        if(dp[s.length()] == false){
            return list;
        }
        
        this.dfsFind(list, new ArrayList<String>(), s, nextListMap, 0);
        
        return list;
        
            
    }
    public void dfsFind(List<String> list, ArrayList<String> current, String s, HashMap<Integer, List<Integer>> nextListMap, int pos){
        
        if(pos == s.length()){
            String x = "";
            for(int i = 0; i < current.size(); i++){
                x += current.get(i);
                if(i < current.size() - 1){
                    x += " ";
                }
            }
            list.add(x);
            return;
        }
        
        if(nextListMap.containsKey(pos) == false){
            return;
        }
        for(int i = 0; i < nextListMap.get(pos).size(); i++){
            int endPos = nextListMap.get(pos).get(i);
            String sub = s.substring(pos, endPos);
            current.add(sub);
            this.dfsFind(list, current, s, nextListMap, endPos);
            current.remove(current.size() - 1);
        }
        
    }
}
