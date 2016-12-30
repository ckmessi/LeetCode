public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        
        HashMap<String, List<String>> preWordMap = new HashMap<String, List<String>>();
        HashSet<String> curLevel = new HashSet<String>();
        HashSet<String> nextLevel = new HashSet<String>();
        
        curLevel.add(beginWord);
        boolean finish = false;
        while(curLevel.size() > 0 && finish == false){
            Iterator<String> iter = curLevel.iterator();
            while(iter.hasNext()){
                String cur = iter.next();
                for(int i = 0; i < cur.length(); i++){
                    StringBuffer copy = new StringBuffer(cur);
                    for(char k = 'a'; k <= 'z'; k++){
                        if(k == cur.charAt(i)){
                            continue;
                        }
                        copy.setCharAt(i, k);
                        if(copy.toString().equals(endWord)){
                            finish = true;
                            if(preWordMap.containsKey(endWord) == false){
                                preWordMap.put(endWord, new ArrayList<String>());
                            }
                            preWordMap.get(endWord).add(cur);
                        }
                        else{
                            if(wordList.contains(copy.toString()) == true){
                                if(preWordMap.containsKey(copy.toString()) == false){
                                    preWordMap.put(copy.toString(), new ArrayList<String>());
                                }
                                preWordMap.get(copy.toString()).add(cur);
                                nextLevel.add(copy.toString());
                            }
                        }
                    }
                }
            }
            curLevel.clear();
            curLevel.addAll(nextLevel);
            nextLevel.clear();
            
            Iterator<String> iter2 = curLevel.iterator();
            while(iter2.hasNext()){
                wordList.remove(iter2.next());
            }
        }
        
        List<List<String>> list = new ArrayList<List<String>>();
        if(finish == false){
            return list;
        }
        
        ArrayList<String> current = new ArrayList<String>();
        current.add(endWord);
        this.dfsFind(preWordMap, list, current, endWord, beginWord);
        
        return list;
        
    }
    
    public void dfsFind(HashMap<String, List<String>> preWordMap, List<List<String>> list, ArrayList<String> current, String currentWord, String targetWord) {
        
        if(currentWord.equals(targetWord) == true){
            ArrayList<String> x = (ArrayList<String>)current.clone();
            list.add(x);
            return;
        }
        
        if(preWordMap.containsKey(currentWord) == false){
            return;
        }
        for(int i = 0; i < preWordMap.get(currentWord).size(); i++){
            String preWord = preWordMap.get(currentWord).get(i);
            current.add(0, preWord);
            this.dfsFind(preWordMap, list, current, preWord, targetWord);
            current.remove(0);
        }
        
    }
}
