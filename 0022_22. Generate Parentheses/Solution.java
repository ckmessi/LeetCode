public class Solution {
    public List<String> list = new ArrayList<String>();
    
    public List<String> generateParenthesis(int n) {
        if(n == 0){
            return this.list;
        }    
        
        this.dfsGenerate(n, 0, 0, "");
        
        return this.list;
        
    }
    public void dfsGenerate(int n, int left, int right, String str){
        if(left == n && right == n){
            String x = new String(str);
            this.list.add(x);
            return;
        }
        
        if(left <= right){
            // assure the parenthesis legal
            this.dfsGenerate(n, left + 1, right, str + "(");
        }
        else{
            if(left < n){
                this.dfsGenerate(n, left + 1, right, str + "(");
            }
            this.dfsGenerate(n, left, right + 1, str + ")");
        }
    }
}

