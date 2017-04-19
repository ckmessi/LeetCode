public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        
        List<Integer> list = new ArrayList<Integer>();
        // if(input.length() == 0){
        //     return list;
        // }
        
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                List<Integer> pList = this.diffWaysToCompute(input.substring(0, i));
                List<Integer> qList = this.diffWaysToCompute(input.substring(i + 1));
                for(int p = 0; p < pList.size(); p++){
                    for(int q = 0; q < qList.size(); q++){
                        int res = 0;
                        if(c == '+'){
                            res = pList.get(p) + qList.get(q);
                        }
                        else if (c == '-'){
                            res = pList.get(p) - qList.get(q);
                        }
                        else{
                            res = pList.get(p) * qList.get(q);
                        }
                        list.add(res);
                    }
                }
            }
        }
        if(list.size() == 0){
            int res = Integer.parseInt(input);
            list.add(res);
        }
        return list;
    }
}
