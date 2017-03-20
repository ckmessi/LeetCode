public class Solution {
    
    public class TrieNode{
        public boolean leaf;
        public TrieNode[] children;
        
        public TrieNode(){
            this.leaf = false;
            this.children = new TrieNode[26];
        }
        
        public void insert(String word){
            if(word.length() == 0){
                this.leaf = true;
            }
            else{
                char c = word.charAt(0);
                if(this.children[c - 'a'] == null){
                    this.children[c - 'a'] = new TrieNode();
                }
                this.children[c - 'a'].insert(word.substring(1));
            }
        }
        
        public int search(String word){
            if(word.length() == 0){
                if(this.leaf == true){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            else{
                char c = word.charAt(0);
                if(this.children[c - 'a'] == null){
                    return 0;
                }
                else{
                    return this.children[c - 'a'].search(word.substring(1));
                }
            }
        }
        
    }
    
    
    
    public List<String> findWords(char[][] board, String[] words) {
        
        List<String> list = new ArrayList<String>();
        if(words.length == 0){
            return list;
        }
        if(board.length == 0 || board[0].length == 0){
            return list;
        }
        
        TrieNode root = new Solution().new TrieNode();
        for(int i = 0; i < words.length; i++){
            root.insert(words[i]);
        }
        
        boolean[][] visit = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                visit[i][j] = false;
            }
        }
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                String curWord = String.valueOf(board[i][j]);
                int res = root.search(curWord);
                if(res == 2){
                    set.add(curWord);
                }
                if (res >= 1){
                    visit[i][j] = true;
                    this.dfsFind(root, board, curWord, i, j, visit, set);
                    visit[i][j] = false;
                }
            }
        }
        
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            list.add(iter.next());
        }
        
        return list;
        
    }
    
    public void dfsFind(TrieNode root, char[][] board, String curWord, int i, int j, boolean[][] visit, HashSet<String> set){
        for(int p = i - 1; p <= i + 1; p++){
            for(int q = j - 1; q <= j + 1; q++){
                if(p == i && q == j){
                    continue;
                }
                if(p != i && q != j){
                    continue;
                }
                if(p < 0 || p > board.length - 1 || q < 0 || q > board[0].length - 1){
                    continue;
                }
                if(visit[p][q] == true){
                    continue;
                }
                int res = root.search(curWord + board[p][q]);
                if(res == 2){
                    set.add(curWord + board[p][q]);
                }
                if (res >= 1){
                    visit[p][q] = true;
                    this.dfsFind(root, board, curWord + board[p][q], p, q, visit, set);
                    visit[p][q] = false;
                }
            }
        }
    }
    
    
}
