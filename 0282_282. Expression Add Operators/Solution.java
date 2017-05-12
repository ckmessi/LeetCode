public class Solution {
    
    public List<String> list = new ArrayList<String>();
    
    public List<String> addOperators(String num, int target) {
    
        if(num.length() == 0){
            return this.list;
        }
        
        this.dfsFind(num, target, "", 0, 0);
        return this.list;
    }
    
    public void dfsFind(String num, int target, String curExpression, long curValue, long preValue){
        if(num.length() == 0){
            if(curValue == target){
                String x = new String(curExpression);
                this.list.add(x);
            }
        }
        
        for(int i = 1; i <= num.length(); i++){
            String curNum = num.substring(0, i);
            if(i > 1 && curNum.charAt(0) == '0'){
                return;
            }
            Long curNumLong = Long.parseLong(curNum);
            String remainStr = num.substring(i);
            
            if(curExpression.equals("") == true){
                this.dfsFind(remainStr, target, curNum, curNumLong, curNumLong);
            }
            else{
                this.dfsFind(remainStr, target, curExpression + "+" + curNum, curValue + curNumLong, curNumLong);
                this.dfsFind(remainStr, target, curExpression + "-" + curNum, curValue - curNumLong, -curNumLong);
                this.dfsFind(remainStr, target, curExpression + "*" + curNum, curValue - preValue + preValue * curNumLong, preValue * curNumLong);
                
            }
        }
    }
}
