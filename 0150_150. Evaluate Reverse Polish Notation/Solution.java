public class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(this.isDigit(token) == true){
                int value = Integer.parseInt(token);
                stack.push(value);
            }
            else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = 0;
                if(token.equals("+") == true){
                    result = num1 + num2;
                }
                else if (token.equals("-") == true){
                    result = num1 - num2;
                }
                else if (token.equals("*") == true){
                    result = num1 * num2;
                }
                else if (token.equals("/") == true){
                    result = num1 / num2;
                }
                stack.push(result);
            }
        }
        return stack.peek();
        
    }
    
    public boolean isDigit(String token){
        if(token.equals("+") == true){
            return false;
        }
        else if (token.equals("-") == true){
            return false;
        }
        else if (token.equals("*") == true){
            return false;
        }
        else if (token.equals("/") == true){
            return false;
        }
        else{
            return true;
        }
    }
    
}
