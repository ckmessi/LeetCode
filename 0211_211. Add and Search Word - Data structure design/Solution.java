public class WordDictionary {


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
        
        public boolean search(String word){
            if(word.length() == 0){
                return this.leaf;
            }
            else{
                char c = word.charAt(0);
                if(c == '.'){
                    for(int i = 0; i < 26; i++){
                        if(this.children[i] != null){
                            boolean res = this.children[i].search(word.substring(1));
                            if(res == true){
                                return true;
                            }
                        }
                    }
                    return false;
                }
                else{
                    if(this.children[c - 'a'] == null){
                        return false;
                    }
                    else{
                        return this.children[c - 'a'].search(word.substring(1));
                    }
                }
            }
        }
        
    }

    public TrieNode root;


    /** Initialize your data structure here. */
    public WordDictionary() {
        this.root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        this.root.insert(word);   
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return this.root.search(word);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
