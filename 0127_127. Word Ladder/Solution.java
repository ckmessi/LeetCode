public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        
        HashSet<String> curLevel = new HashSet<String>();
        HashSet<String> nextLevel = new HashSet<String>();
        curLevel.add(beginWord);
        int length = 1;
        boolean finish = false;
        while(curLevel.size() > 0 && finish == false){
            length++;
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
                        String x = copy.toString();
                        if(x.equals(endWord)){
                            finish = true;
                            nextLevel.add(endWord);
                            break;
                        }
                        else{
                            if(wordList.contains(x) == true){
                                nextLevel.add(x);
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
        
        if(finish == true){
            return length;
        }
        else{
            return 0;
        }
    }
}
