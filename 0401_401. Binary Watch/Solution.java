class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<String>();
        this.dfsFindSolution(list, "", num);
        return list;
    }
    public void dfsFindSolution(List<String> list, String str, int num){
        if(str.length() == 10){
            int hour = 0;
            for(int i = 0; i < 4; i++){
                char c = str.charAt(i);
                int digit = c == '1' ? 1 : 0;
                hour <<= 1;
                hour |= digit;
            }
            int minute = 0;
            for(int i = 4; i < 10; i++){
                char c = str.charAt(i);
                int digit = c == '1' ? 1 : 0;
                minute <<= 1;
                minute |= digit;
            }
            if(hour <= 11 && minute <= 59){
                String item = String.valueOf(hour) + ":";
                if(minute < 10){
                    item += "0";
                }
                item += String.valueOf(minute);
                list.add(item);
                System.out.println(str);
            }
            return;
        }
        
        if(num > 0){
            this.dfsFindSolution(list, str + "1", num - 1);
            if(10 - str.length() > num){
                this.dfsFindSolution(list, str + "0", num);
            }
        }
        else{
            this.dfsFindSolution(list, str + "0", num);
        }
        
    }
}
