public class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> list = new ArrayList<List<String>>();
        if(s.length() == 0){
            return list;
        }
        
        // firstly, build the palindrome info
        boolean[][] palin = new boolean[s.length()][s.length()];
        for(int len = 1; len <= s.length(); len++){
            for(int i = 0; i < s.length() - len + 1; i++){
                int j = i + len - 1;
                if(i == j){
                    palin[i][j] =  true;
                }
                else if (j == i + 1){
                    palin[i][j] = s.charAt(i) == s.charAt(j);
                }
                else{
                    palin[i][j] = (s.charAt(i) == s.charAt(j)) && palin[i+1][j-1];
                }
            }
        }
        
        this.dfsFindSplit(list, s, palin, new ArrayList<String>(), 0);
        return list;
    }
    
    public void dfsFindSplit(List<List<String>> list, String s, boolean[][] palin, ArrayList<String> current, int pos){
        if(pos == s.length()){
            ArrayList<String> x = (ArrayList<String>)current.clone();
            list.add(x);
            return;
        }
        
        for(int i = pos; i < s.length(); i++){
            if(palin[pos][i] == true){
                current.add(s.substring(pos, i + 1));
                this.dfsFindSplit(list, s, palin, current, i + 1);
                current.remove(current.size() - 1);
            }
        }
        
    }
    
}
