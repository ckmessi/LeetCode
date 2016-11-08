public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || s.length() < t.length()){
            return "";
        }
        if(t.length() == 0){
            return "";
        }
        
        HashMap<Character, Integer> answer = new HashMap<Character,Integer>();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(answer.containsKey(c) == false){
                answer.put(c, 1);
            }
            else{
                answer.put(c, answer.get(c) + 1);
            }
        }
        
        int minLength = Integer.MAX_VALUE;
        String minStr = "";
        int left = -1;
        int right = -1;
        int correctCount = 0;
        HashMap<Character, Integer> current = new HashMap<Character, Integer>();
        while(right < s.length() - 1){
            // move right until satisfy
            while(right < s.length() - 1){
                right++;
                char c = s.charAt(right);
                if(answer.containsKey(c) == false){
                    continue;
                }
                else{
                    if(current.containsKey(c) == false){
                        current.put(c, 1);
                        correctCount++;
                    }
                    else{
                        current.put(c, current.get(c) + 1);
                        if(current.get(c) <= answer.get(c)){
                            correctCount++;
                        }
                    }
                }
                if(correctCount == t.length()){
                    break;
                }
            }
            if(correctCount < t.length()){
                break;
            }
            // move left until no satisfy
            while(left < right){
                left++;
                char c = s.charAt(left);
                if(answer.containsKey(c) == false){
                    continue;
                }
                else{
                    if(current.containsKey(c) == false){
                        // 理论上不可能
                    }
                    else{
                        current.put(c, current.get(c) - 1);
                        if(current.get(c) < answer.get(c)){
                            correctCount--;
                        }
                    }
                }
                if(correctCount < t.length()){
                    break;
                }
            }
            int len = right - left + 1;
            if(len < minLength){
                minStr = s.substring(left, right + 1);
                minLength = len;
            }
        }
        
        return minStr;
    }
}
