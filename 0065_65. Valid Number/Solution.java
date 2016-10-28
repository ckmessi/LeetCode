public class Solution {
    public boolean isNumber(String s) {
        
        if(s.length() == 0){
            return false;
        }
        
        // 去除空格
        s = s.trim();
        
        // 构建正则表达式
        String regEx = "";
        String s1 = "^";
        String s2 = "[+-]?";
        String s31 = "([0-9]*\\.?[0-9]+)";
        String s32 = "([0-9]+\\.?[0-9]*)";
        String s4 = "([Ee][+-]?[0-9]+)?";
        String s5 = "$";
        
        regEx = s1 + s2 + "(" + s31 + "|" + s32 + ")" + s4 + s5;
        if(s.matches(regEx) == true){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
