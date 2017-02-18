public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        if(numerator == 0){
            return "0";
        }
        
        long numerator_l = (long)numerator;
        long denominator_l = (long)denominator;
        
        int flag = 1;
        if(numerator_l < 0){
            flag *= -1;
            numerator_l = -numerator_l;
        }
        if(denominator_l < 0){
            flag *= -1;
            denominator_l = -denominator_l;
        }
        
        String res = "";
        if(numerator_l >= denominator_l){
            res += String.valueOf(numerator_l / denominator_l);
            numerator_l = numerator_l % denominator_l;
            if(numerator_l > 0){
                res += ".";
            }
        }
        else{
            res += "0.";
        }
        
        List<Long> list = new ArrayList<Long>();
        HashMap<Long, Integer> indexMap = new HashMap<Long, Integer>();
        int loopStart = -1;
        while(numerator_l > 0){
            numerator_l *= 10;
            if(indexMap.containsKey(numerator_l) == true){
                loopStart = indexMap.get(numerator_l);
                break;
            }
            indexMap.put(numerator_l, list.size());
            long digit = numerator_l / denominator_l;
            list.add(digit);
            long remain = numerator_l % denominator_l;
            numerator_l = remain;
        }
        for(int i = 0; i < list.size(); i++){
            if(i == loopStart){
                res += "(";
            }
            res += list.get(i);
        }
        if(loopStart >= 0){
            res += ")";
        }
        
        if(flag == -1){
            res = "-" + res;
        }
        
        return res;
    }
}
