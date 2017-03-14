public class Trie {

    public class TrieNode {
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
                if(this.children[c - 'a'] == null){
                    return false;
                }
                else{
                    return this.children[c - 'a'].search(word.substring(1));
                }
            }
        }
        
        public boolean startWith(String prefix){
            if(prefix.length() == 0){
                return true;
            }
            else{
                char c = prefix.charAt(0);
                if(this.children[c - 'a'] == null){
                    return false;
                }
                else{
                    return this.children[c - 'a'].startWith(prefix.substring(1));
                }
            }
        }
    }
    
    public TrieNode root;


    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        this.root.insert(word);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return this.root.search(word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return this.root.startWith(prefix);   
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
