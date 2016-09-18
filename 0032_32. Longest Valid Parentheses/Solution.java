public class Solution {
    public int longestValidParentheses(String s) {
        
        if(s.length() == 0){
            return 0;
        }
        
        if(s.contains(")") == false){
            return 0;
        }
        
        boolean[] valid = new boolean[s.length()];
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }
            else{
                if(stack.empty() == false){
                    int top = stack.pop();
                    valid[top] = true;
                    valid[i] = true;
                }
            }
        }
        
        int curLength = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            if(valid[i] == true){
                curLength++;
                maxLength = Math.max(maxLength, curLength);
            }
            else{
                curLength = 0;
            }
        }
        
        return maxLength;
    }
}
